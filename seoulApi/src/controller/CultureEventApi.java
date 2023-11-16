package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
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

import model.CultureEventVO;

public class CultureEventApi {

	public static void main(String[] args) throws Exception {

		importDataApi(5);
	}

	public static List<CultureEventVO> importDataApi(int rowNum) throws Exception {
		// 1. 요청 url 생성
		Properties properties = new Properties();
		FileInputStream fIS = null;
		fIS = new FileInputStream("apiTest/seoulApi/seoulApiTest.properties");
		properties.load(fIS);
		String seoulEncoding = properties.getProperty("seoulEncoding");

		StringBuilder urlSB = new StringBuilder("http://openapi.seoul.go.kr:8088");
		urlSB.append("/" + URLEncoder.encode(seoulEncoding, "UTF-8"));
		urlSB.append("/" + URLEncoder.encode("xml", "UTF-8"));
		urlSB.append("/" + URLEncoder.encode("culturalEventInfo", "UTF-8"));
		urlSB.append("/" + URLEncoder.encode("1", "UTF-8"));
		urlSB.append("/" + URLEncoder.encode(Integer.toString(rowNum), "UTF-8"));

		// 2. connection객체를 생성하고 url접속
		URL url = null;
		HttpURLConnection conn = null;

		url = new URL(urlSB.toString());
		conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
//		conn.setRequestProperty("Content-type", "application/xml");
		System.out.println("Response code:" + conn.getResponseCode());

		// 3. 요청 전송 및 응답처리
		BufferedReader bufRead = null;

		int statusCode = conn.getResponseCode();
		if (200 <= statusCode && statusCode <= 300) {
			bufRead = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			bufRead = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}

		// 4. xml 파일 방식을 문서 방식으로 변환
		Document doc = parseXML(conn.getInputStream());

		// 5. 노드
		NodeList descNodes = doc.getElementsByTagName("row");
		List<CultureEventVO> list = new ArrayList<>();

		for (int i = 0; i < descNodes.getLength(); i++) {
			Node item = descNodes.item(i);
			CultureEventVO cultureEnventVO = new CultureEventVO();

			for (Node node = item.getFirstChild(); node != null; node = node.getNextSibling()) {
				if (node.getNodeName().equals("#text")) {
					continue;
				}
				System.out.println(node.getNodeName() + " : " + node.getTextContent());

				switch (node.getNodeName()) {
				case "CODENAME":
					cultureEnventVO.setCODENAME(node.getTextContent());
					break; // 분류
				case "GUNAME":
					cultureEnventVO.setGUNAME(node.getTextContent());
					break; // 자치구
				case "TITLE":
					cultureEnventVO.setTITLE(node.getTextContent());
					break; // 공연/행사명
				case "DATE":
					cultureEnventVO.setEVENTDATE(node.getTextContent());
					break; // 날짜/시간
				case "PLACE":
					cultureEnventVO.setPLACE(node.getTextContent());
					break; // 장소
				case "ORG_NAME":
					cultureEnventVO.setORG_NAME(node.getTextContent());
					break; // 기관명
				case "USE_TRGT":
					cultureEnventVO.setUSE_TRGT(node.getTextContent());
					break; // 이용대상
				case "USE_FEE":
					cultureEnventVO.setUSE_FEE(node.getTextContent());
					break; // 이용요금
				case "PLAYER":
					cultureEnventVO.setPLAYER(node.getTextContent());
					break; // 출연자정보
				case "PROGRAM":
					cultureEnventVO.setPROGRAM(node.getTextContent());
					break; // 프로그램소개
				case "ETC_DESC":
					cultureEnventVO.setETC_DESC(node.getTextContent());
					break; // 기타내용
				case "ORG_LINK":
					cultureEnventVO.setORG_LINK(node.getTextContent());
					break; // 홈페이지 주소
				case "MAIN_IMG":
					cultureEnventVO.setMAIN_IMG(node.getTextContent());
					break; // 대표이미지
				case "RGSTDATE":
					cultureEnventVO.setRGSTDATE(node.getTextContent());
					break; // 신청일
				case "TICKET":
					cultureEnventVO.setTICKET(node.getTextContent());
					break; // 시민/기관
				case "STRTDATE":
					cultureEnventVO.setSTRTDATE(node.getTextContent());
					break; // 시작일
				case "END_DATE":
					cultureEnventVO.setEND_DATE(node.getTextContent());
					break; // 종료일
				case "THEMECODE":
					cultureEnventVO.setTHEMECODE(node.getTextContent());
					break; // 테마분류
				case "LOT":
					cultureEnventVO.setLOT(node.getTextContent());
					break; // 위도(X좌표)
				case "LAT":
					cultureEnventVO.setLAT(node.getTextContent());
					break; // 경도(Y좌표)
				case "IS_FREE":
					cultureEnventVO.setIS_FREE(node.getTextContent());
					break; // 유무료
				case "HMPG_ADDR":
					cultureEnventVO.setHMPG_ADDR(node.getTextContent());
					break; // 문화포털상세URL
				}
			}
			list.add(cultureEnventVO);
		}
		for (CultureEventVO d : list) {
			System.out.println(d);
		}
		return list;
	}

	private static Document parseXML(InputStream inputStream) {
		Document doc = null;
		DocumentBuilder docBuild = null;
		DocumentBuilderFactory docBuildFac = DocumentBuilderFactory.newInstance();

		try {
			docBuild = docBuildFac.newDocumentBuilder();
			doc = docBuild.parse(inputStream);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return doc;
	}
}
