package model;

import java.util.Objects;

public class MEMBERVO {
	private int no; // 비디오 일련번호
	private String name; // 이름
	private String id; // 아이디
	private String passwd; // 비밀번호
	private String phone; // 핸드폰번호

	public MEMBERVO() {
		super();
	}

	

	public MEMBERVO(int no, String name, String id, String passwd, String phone) {
		super();
		this.no = no;
		this.name = name;
		this.id = id;
		this.passwd = passwd;
		this.phone = phone;
	}



	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPasswd() {
		return passwd;
	}



	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public int hashCode() {
		return Objects.hash(this.no, this.id);
	}

	@Override
	public boolean equals(Object obj) {
		MEMBERVO mbm = null;
		if (!(obj instanceof MEMBERVO)) {
			return false;
		}
		mbm = (MEMBERVO) obj;
		return this.no == mbm.no && this.id.equals(mbm.id);
	}

	@Override
	public String toString() {
		return "MemberVO [no=" + no + ", Id=" + id + ", Pw=" + passwd + ", name=" + name + ", Phone="
				+ phone + "]";
	}

}

