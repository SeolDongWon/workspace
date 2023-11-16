package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.CultureEventVO;

public class CultureEventDAO {

	// 레코드 전체 삭제
	public void truncate() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "truncate table culturaleventinfo";

		con = DBcon.getConnection();
		pstmt = con.prepareStatement(sql);

		int cnt = pstmt.executeUpdate();
		if (cnt >= 1) {
			System.out.println("쿼리 성공");
		} else {
			System.out.println("쿼리 실패");
		}
		if (pstmt != null) {
			pstmt.close();
		}
		if (con != null) {
			con.close();
		}
	}

	// 데이터 가져오기
	public void importDataDAO(CultureEventVO cultureEventVO) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "insert into culturaleventinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		con = DBcon.getConnection();
		pstmt = con.prepareStatement(sql);
		pstmt.setNString(1, cultureEventVO.getCODENAME());
		pstmt.setNString(2, cultureEventVO.getGUNAME());
		pstmt.setNString(3, cultureEventVO.getTITLE());
		pstmt.setNString(4, cultureEventVO.getEVENTDATE());
		pstmt.setNString(5, cultureEventVO.getPLACE());
		pstmt.setNString(6, cultureEventVO.getORG_NAME());
		pstmt.setNString(7, cultureEventVO.getUSE_TRGT());
		pstmt.setNString(8, cultureEventVO.getUSE_FEE());
		pstmt.setNString(9, cultureEventVO.getPLAYER());
		pstmt.setNString(10, cultureEventVO.getPROGRAM());
		pstmt.setNString(11, cultureEventVO.getETC_DESC());
		pstmt.setNString(12, cultureEventVO.getORG_LINK());
		pstmt.setNString(13, cultureEventVO.getMAIN_IMG());
		pstmt.setNString(14, cultureEventVO.getRGSTDATE());
		pstmt.setNString(15, cultureEventVO.getTICKET());
		pstmt.setNString(16, cultureEventVO.getSTRTDATE());
		pstmt.setNString(17, cultureEventVO.getEND_DATE());
		pstmt.setNString(18, cultureEventVO.getTHEMECODE());
		pstmt.setNString(19, cultureEventVO.getLOT());
		pstmt.setNString(20, cultureEventVO.getLAT());
		pstmt.setNString(21, cultureEventVO.getIS_FREE());
		pstmt.setNString(22, cultureEventVO.getHMPG_ADDR());

		int cnt = pstmt.executeUpdate();
		if (cnt >= 1) {
			System.out.println("쿼리 성공");
		} else {
			System.out.println("쿼리 실패");
		}
		if (pstmt != null) {
			pstmt.close();
		}
		if (con != null) {
			con.close();
		}
	}

	// 데이터 검색하기
	public void searchDataDAO(StringBuilder searchEventSB, CultureEventVO cEVO, ArrayList<String> aList)
			throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		con = DBcon.getConnection();
		pstmt = con.prepareStatement(searchEventSB.toString());

		if (aList != null) {
			if (cEVO.getCODENAME() != null) {
				pstmt.setNString(aList.indexOf("CODENAME") + 1, "%" + cEVO.getCODENAME() + "%");
			}
			if (cEVO.getGUNAME() != null) {
				pstmt.setNString(aList.indexOf("GUNAME") + 1, "%" + cEVO.getGUNAME() + "%");
			}
			if (cEVO.getTITLE() != null) {
				pstmt.setNString(aList.indexOf("TITLE") + 1, "%" + cEVO.getTITLE() + "%");
			}
		}

		rs = pstmt.executeQuery();

		System.out.printf("%-15s %-10s %-30s %-40s %-15s \n", "분류", "자치구", "행사기간", "행사장소", "행사명");
		System.out.printf("=====================================================================================");
		System.out.printf("=====================================================================================\n");

		while (rs.next()) {
			System.out.printf("%-15s %-10s %-30s %-40s %-15s \n", rs.getString("CODENAME"), rs.getString("GUNAME"),
					rs.getString("EVENTDATE"), rs.getString("PLACE"), rs.getString("TITLE"));
		}

		int cnt = pstmt.executeUpdate();
		if (cnt >= 1) {
			System.out.println("쿼리 성공");
		} else {
			System.out.println("쿼리 실패");
		}
		if (pstmt != null) {
			pstmt.close();
		}
		if (con != null) {
			con.close();
		}
		if (rs != null) {
			rs.close();
		}

	}
}
