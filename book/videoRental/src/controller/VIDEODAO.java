package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.VIDEOVO;

public class VIDEODAO {
// 비디오 목록 
	public void getVIDEOTotalList() throws Exception {
		String sql = "select * from video order by no";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		VIDEOVO sVo = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println("번호\t비디오명\t장르");
			while (rs.next()) {
				sVo = new VIDEOVO();
				sVo.setNo(rs.getInt("no"));
				sVo.setName(rs.getString("name"));
				sVo.setType(rs.getString("type"));
				System.out.println(sVo.getNo() + "\t" + sVo.getName() + "\t" + sVo.getType());
//				System.out.println(sVo.toString());
//				System.out.println("=========");
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

// 비디오 등록 
	public void setVIDEORegistr(VIDEOVO svo) throws Exception {
		String sql = "insert into video(no,name, type) values (video_seq.nextval, ?, ?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection(); 
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, svo.getName()); 
			pstmt.setString(2, svo.getType());
			int i = pstmt.executeUpdate(); 
			if (i == 1) {
				System.out.println(svo.getName() + " 비디오 등록 완료.");
				System.out.println("비디오 등록 성공!!!");
			} else {
				System.out.println("비디오 등록 실패!!!");
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

// 비디오 수정 
	public void setVIDEOUpdate(VIDEOVO svo) throws Exception {
		String sql = "update video set name=?, type=? where no=?";
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, svo.getName());
			pstmt.setString(2, svo.getType());
			pstmt.setInt(3, svo.getNo());
			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println(svo.getName() + " 비디오 수정 완료.");
				System.out.println("비디오 수정 성공!!!");
			} else {
				System.out.println("비디오 수정 실패!!!");
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

// 비디오 삭제 
	public void setVIDEODelete(int no) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from video where no = ?");
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println("비디오 삭제 완료.");
				System.out.println("비디오 삭제 성공!!!");
			} else {
				System.out.println("비디오 삭제 실패!!!");
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
}
