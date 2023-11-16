package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.CultureEventVO;

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
		String searchName = "CODENAME";
//		StringBuilder searchEventSB = new StringBuilder(
//				"select * from culturalEventInfo where " + searchName + " like ? ");
		System.out.println("검색대상을 선택안하면 전체보기");

		while (!stopFlag) {
			System.out.println("검색할 컬럼의 번호를 선택하세요");
			System.out.println("0:이대로검색시작 1:분류 2:지역 3:행사명");
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
				searchEventSB.append(" CODENAME like ? ");
				aList.add("CODENAME");
				cEVO.setCODENAME(keyWord);
				break;
			case 2:
				searchEventSB.append(" GUNAME like ? ");
				aList.add("GUNAME");
				cEVO.setGUNAME(keyWord);
				break;
			case 3:
				searchEventSB.append(" TITLE like ? ");
				aList.add("TITLE");
				cEVO.setTITLE(keyWord);
				break;
			case 4:
				searchEventSB.append(" EVENTDATE like ? ");
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
