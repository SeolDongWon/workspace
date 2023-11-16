package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.RENTALVO;

public class RENTALDAO {
// 비디오 대여
	public void setRENTALRegiste(RENTALVO tvo) throws Exception {
		String sql = "insert into rental " + "(no, name, type )" + " values " + "(rental_seq.nextval, ?, ?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, tvo.getName());
			pstmt.setString(2, tvo.getType());
			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println("비디오 대여 신청 완료.");
				System.out.println("비디오 대여 신청 성공");
			} else {
				System.out.println("비디오 대여 신청 실패");
			}
		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			try {
// 데이터베이스와의 연결에 사용되었던 오브젝트를 해제 
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}
	}

// 비디오 반납 
	public void setRENTALDelete(int num) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from rental where no = ?");
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, num);
			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println("반납 완료.");
				System.out.println("반납 성공");
			} else {
				System.out.println("반납 실패");
			}
		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			try {
				// 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}
	}

	// 개인 대여 신청 전체 목록
	public void getRENTALTotalList(int no) throws Exception {
		String sql = "select * from rental";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		RENTALVO tVo = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			System.out.println("일련번호 \t\t비디오명\t장르");
			while (rs.next()) {
				tVo = new RENTALVO();
				tVo.setName(rs.getString("name"));
				tVo.setType(rs.getString("type"));
				System.out.println(
						tVo.getNo() +  "\t" + rs.getString("name")
								+ "\t" + rs.getString("type"));
			}
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
			}
		}
	}

	public void getRENTALTotalList() {
		// TODO Auto-generated method stub
		
	}

	

	

}
