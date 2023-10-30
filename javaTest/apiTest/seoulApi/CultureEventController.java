package seoulApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CultureEventController {
	public static Scanner scan = new Scanner(System.in);
	private CultureEventDAO cEDAO = new CultureEventDAO();

	// 데이터 가져오기
	public void importData() throws Exception {
		List<CultureEventVO> list = null;
		int rowNum = 0;

		System.out.printf("가져올 레코드의 수 입력>>");
		rowNum = scan.nextInt();
		scan.nextLine();

		list = CultureEventApi.importDataApi(rowNum);

		cEDAO.truncate();
		for (CultureEventVO data : list) {
			cEDAO.importDataDAO(data);
		}
	}

	// 데이터 검색
	public void searchData() throws Exception {
		CultureEventVO cEVO = new CultureEventVO();
		int selectMenu = 0;
		String keyWord = null;
		boolean stopFlag = false;
		boolean firstSearchFlag = false;
		ArrayList<String> aList = new ArrayList<String>();

		StringBuilder searchEventSB = new StringBuilder("select * from culturalEventInfo");

		while (!stopFlag) {
			System.out.println("검색할 대상의 번호를 선택하세요");
			System.out.println("0검색시작 1분류 2지역 3행사명");
			selectMenu = scan.nextInt();
			scan.nextLine();

			if (selectMenu == 0) {
				break;
			} else if (selectMenu < 0 || 4 < selectMenu) {
				continue;
			}

			if (firstSearchFlag == false) {
				searchEventSB.append(" where ");
				firstSearchFlag = true;
			} else {
				searchEventSB.append(" and ");
			}

			System.out.println("검색 키워드 입력");
			keyWord = scan.nextLine();

			switch (selectMenu) {
			case 1:
				searchEventSB.append(" CODENAME = ? ");
				aList.add("CODENAME");
				cEVO.setCODENAME(keyWord);
				break;
			case 2:
				searchEventSB.append(" GUNAME = ? ");
				aList.add("GUNAME");
				cEVO.setGUNAME(keyWord);
				break;
			case 3:
				searchEventSB.append(" TITLE = ? ");
				aList.add("TITLE");
				cEVO.setTITLE(keyWord);
				break;
			case 4:
				searchEventSB.append(" EVENTDATE = ? ");
				cEVO.setEVENTDATE(keyWord);
				break;
			default:
			}
		}
		System.out.println(aList);
		System.out.println(searchEventSB);
		cEDAO.searchDataDAO(searchEventSB, cEVO, aList);
	}

}
