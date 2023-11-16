package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.MEMBERVO;

public class MEMBERDAO {
// 회원 등록 
	public void setMEMBERRegiste(MEMBERVO svo) throws Exception {
		String sql = "insert into member values  (member_seq.nextval, ?, ?, ?, ?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, svo.getId());
			pstmt.setString(2, svo.getPasswd());
			pstmt.setString(3, svo.getName());
			pstmt.setString(4, svo.getPhone());
			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println(svo.getName() + " 회원 등록 완료.");
				System.out.println("회원 등록 성공!!!");
			} else {
				System.out.println("회원 등록 실패!!!");
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

// 회원 정보 수정 
	public void setMEMBERUpdate(MEMBERVO svo) throws Exception {
		String sql = "update member set passwd=?, phone=? where id=?";
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, svo.getPasswd());
			pstmt.setString(2, svo.getPhone());
			pstmt.setString(3, svo.getId());
			System.out.println("*****************************");
			System.out.println(svo.toString());
			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println(svo.getNo() + " : 회원 정보 수정 완료.");
				System.out.println("회원 정보 수정 성공!!!");
			} else {
				System.out.println("회원 정보 수정 실패!!!");
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


// 회원 아이디 중복 체크 
	public boolean getMEMBERIdOverlap(String idOverlap) throws Exception {
		String sql = "select * from member where id = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean idOverlapResult = false;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, idOverlap);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				idOverlapResult = true; // 중복된 아이디가 있다.
			}
		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			try {
// 데이터베이스와의 연결에 사용되었던 오브젝트를 해제 
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}
		return idOverlapResult;
	}

	// 회원 로그인
	public boolean getMEMBERLogin(String id, String pw) throws Exception {
		String sql = "select * from member where id = ? and passwd = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean loginSuccess = false;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				loginSuccess = true; // 로그인 성공
			}
		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			try {
				// 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}
		return loginSuccess;
	}

	// 회원 정보
	public void getMEMBER(String id, String pw) throws Exception {
		String sql = "select * from member where id = ? and passwd = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MEMBERVO sVo = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			System.out.printf("%-5s %-10s %-10s %-10s %-10s \n", "일련번호", "이름","아이디", "비밀번호", "전화번호");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				sVo = new MEMBERVO();
				sVo.setNo(rs.getInt("no"));
				sVo.setName(rs.getString("name"));
				sVo.setId(rs.getString("id"));
				sVo.setPasswd(rs.getString("passwd"));
				sVo.setPhone(rs.getString("phone"));
				System.out.printf("%-5d  %-10s  %-10s  %-10s  %-10s\n", sVo.getNo(), sVo.getName(),sVo.getId(),
						sVo.getPasswd(), sVo.getPhone());
			}
		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			try {
				// 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}
	}

	// 회원 전체 목록
	public void getMEMBERTotalList() throws Exception {
		String sql = "select * from member order by no";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MEMBERVO sVo = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			System.out.printf("%-5s %-10s %-10s %-10s %-10s \n", "일련번호", "이름","아이디", "비밀번호", "전화번호");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				sVo = new MEMBERVO();
				sVo.setNo(rs.getInt("no"));
				sVo.setName(rs.getString("name"));
				sVo.setId(rs.getString("id"));
				sVo.setPasswd(rs.getString("passwd"));
				sVo.setPhone(rs.getString("phone"));
				System.out.printf("%-5d  %-10s  %-10s  %-10s  %-10s\n", sVo.getNo(), sVo.getName(),sVo.getId(),
						sVo.getPasswd(), sVo.getPhone());
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
}
