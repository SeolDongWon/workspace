package data.Net;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ApiExplorer {

	public static void main(String[] args) {
		try {
			new ApiExplorer().run();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void run() throws FileNotFoundException {
		// 1. 요청 url 생성 StringBuilder는 String의 기능을 좀 더 확장한 것
		// 자바는 문자set이 utf-16 tcp/ip 방식은 문자set이 utf-8 그래서 자바에서 api를 요청할 때 utf-8방식으로
		// 변환인코딩을 해아한다
		Properties properties = new Properties();
		FileInputStream fileInputStream = null;
		StringBuilder urlBuilder = new StringBuilder(
				"https://apis.data.go.kr/1611000/nsdi/IndvdLandPriceService/attr/getIndvdLandPriceAttr");
		try {
			fileInputStream = new FileInputStream("src/data/Net/apiTest.properties");
			properties.load(fileInputStream);
			String encoding = properties.getProperty("encoding");
			urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + encoding);
			urlBuilder.append(
					"&" + URLEncoder.encode("pnu", "UTF-8") + "=" + URLEncoder.encode("1111017700102110000", "UTF-8"));
			urlBuilder.append("&" + URLEncoder.encode("stdrYear", "UTF-8") + "=" + URLEncoder.encode("2015", "UTF-8"));
			urlBuilder.append("&" + URLEncoder.encode("format", "UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8"));
			urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8"));
			urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 2. connection객체 생성 (공공데이터서버 접속할 url 결정)
		URL url = null;
		HttpURLConnection conn = null;

		try {

			url = new URL(urlBuilder.toString());
			conn = (HttpURLConnection) url.openConnection(); // 접속요청
			conn.setRequestMethod("GET"); // ㅎㄸㅆ, ㅔㅐㅐㄴㅅ
			conn.setRequestProperty("Content-type", "application/json"); // json방식
			System.out.println("Response code: " + conn.getResponseCode()); // 200:성공 500:실패

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 3. 요청전송 및 응답 처리
		BufferedReader br = null;

		try {

			int statusCode = conn.getResponseCode();
			System.out.println(statusCode);
			if (statusCode >= 200 && statusCode <= 300) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream())); // 성능향상
			} else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream())); // 200 아니면 에러
			}

			// 4. xml 파일 방식을 문서방식으로 변환
			Document doc = parseXML(conn.getInputStream());

			// 5. 노드개념 => 객체개념 => 버튼(노드), 이미지(노드),태그(노드)
			// field 태그가 만약 50개라면 NodeList가 50개이다. field 태그객체가 존재한다
			// a. field 태그객체 목록으로 가져온다.
			NodeList descNodes = doc.getElementsByTagName("field");
			// b. Corona19Data List객체 생성
			List<LandPrice> list = new ArrayList<>();
			// c. 각 field 태그의 자식태그에서 정보 가져오기
			for (int i = 0; i < descNodes.getLength(); i++) {
				// item
				Node item = descNodes.item(i);
				LandPrice data = new LandPrice();
				// item 자식태그에 순차적으로 접근
				for (Node node = item.getFirstChild(); node != null; node = node.getNextSibling()) {
					System.out.println(node.getNodeName() + " : " + node.getTextContent());

					switch (node.getNodeName()) {
					case "seq":
						data.setSeq(Integer.parseInt(node.getTextContent()));
						break;
					case "pnu":
						data.setPnu(node.getTextContent());
						break;
					case "ldCode":
						data.setLdCode(node.getTextContent());
						break;
					case "regstrSeCode":
						data.setRegstrSeCode(Integer.parseInt(node.getTextContent()));
						break;
					case "regstrSeCodeNm":
						data.setRegstrSeCodeNm(node.getTextContent());
						break;
					case "mnnmSlno":
						data.setMnnmSlno(Integer.parseInt(node.getTextContent()));
						break;
					case "stdrYear":
						data.setStdrYear(Integer.parseInt(node.getTextContent()));
						break;
					case "stdrMt":
						data.setStdrMt(Integer.parseInt(node.getTextContent()));
						break;
					case "pblntfPclnd":
						data.setPblntfPclnd(Integer.parseInt(node.getTextContent()));
						break;
					case "pblntfDe":
						data.setPblntfDe(node.getTextContent());
						break;
					case "stdLandAt":
						data.setStdLandAt(node.getTextContent());
						break;
					case "lastUpdtDt":
						data.setLastUpdtDt(node.getTextContent());
						break;
					}
				}
				// d. List객체에 추가
				list.add(data);
			}
			// e.최종확인
			for (LandPrice d : list) {
				System.out.println(d);
			}
		} catch (

		IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// 4. 자원반환
		conn.disconnect();
	}

	private static Document parseXML(InputStream stream) {
		DocumentBuilderFactory objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder objDocumentBuilder = null;
		Document doc = null;
		try {
			objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();
			doc = objDocumentBuilder.parse(stream);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) { // Simple API for XML e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return doc;
	}
}
