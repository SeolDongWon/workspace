package seoulApi;

public class CultureEventVO {
	private String CODENAME; // 분류
	private String GUNAME; // 자치구
	private String TITLE; // 공연/행사명
	private String EVENTDATE; // 날짜/시간
	private String PLACE; // 장소
	private String ORG_NAME; // 기관명
	private String USE_TRGT; // 이용대상
	private String USE_FEE; // 이용요금
	private String PLAYER; // 출연자정보
	private String PROGRAM; // 프로그램소개
	private String ETC_DESC; // 기타내용
	private String ORG_LINK; // 홈페이지 주소
	private String MAIN_IMG; // 대표이미지
	private String RGSTDATE; // 신청일
	private String TICKET; // 시민/기관
	private String STRTDATE; // 시작일
	private String END_DATE; // 종료일
	private String THEMECODE; // 테마분류
	private String LOT; // 위도(X좌표)
	private String LAT; // 경도(Y좌표)
	private String IS_FREE; // 유무료
	private String HMPG_ADDR; // 문화포털상세URL

	public CultureEventVO() {
		super();
	}

	public CultureEventVO(String cODENAME, String gUNAME, String tITLE, String eVENTDATE, String pLACE, String oRG_NAME,
			String uSE_TRGT, String uSE_FEE, String pLAYER, String pROGRAM, String eTC_DESC, String oRG_LINK,
			String mAIN_IMG, String rGSTDATE, String tICKET, String sTRTDATE, String eND_DATE, String tHEMECODE,
			String lOT, String lAT, String iS_FREE, String hMPG_ADDR) {
		super();
		CODENAME = cODENAME;
		GUNAME = gUNAME;
		TITLE = tITLE;
		EVENTDATE = eVENTDATE;
		PLACE = pLACE;
		ORG_NAME = oRG_NAME;
		USE_TRGT = uSE_TRGT;
		USE_FEE = uSE_FEE;
		PLAYER = pLAYER;
		PROGRAM = pROGRAM;
		ETC_DESC = eTC_DESC;
		ORG_LINK = oRG_LINK;
		MAIN_IMG = mAIN_IMG;
		RGSTDATE = rGSTDATE;
		TICKET = tICKET;
		STRTDATE = sTRTDATE;
		END_DATE = eND_DATE;
		THEMECODE = tHEMECODE;
		LOT = lOT;
		LAT = lAT;
		IS_FREE = iS_FREE;
		HMPG_ADDR = hMPG_ADDR;
	}

	public String getCODENAME() {
		return CODENAME;
	}

	public void setCODENAME(String cODENAME) {
		CODENAME = cODENAME;
	}

	public String getGUNAME() {
		return GUNAME;
	}

	public void setGUNAME(String gUNAME) {
		GUNAME = gUNAME;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getEVENTDATE() {
		return EVENTDATE;
	}

	public void setEVENTDATE(String eVENTDATE) {
		EVENTDATE = eVENTDATE;
	}

	public String getPLACE() {
		return PLACE;
	}

	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}

	public String getORG_NAME() {
		return ORG_NAME;
	}

	public void setORG_NAME(String oRG_NAME) {
		ORG_NAME = oRG_NAME;
	}

	public String getUSE_TRGT() {
		return USE_TRGT;
	}

	public void setUSE_TRGT(String uSE_TRGT) {
		USE_TRGT = uSE_TRGT;
	}

	public String getUSE_FEE() {
		return USE_FEE;
	}

	public void setUSE_FEE(String uSE_FEE) {
		USE_FEE = uSE_FEE;
	}

	public String getPLAYER() {
		return PLAYER;
	}

	public void setPLAYER(String pLAYER) {
		PLAYER = pLAYER;
	}

	public String getPROGRAM() {
		return PROGRAM;
	}

	public void setPROGRAM(String pROGRAM) {
		PROGRAM = pROGRAM;
	}

	public String getETC_DESC() {
		return ETC_DESC;
	}

	public void setETC_DESC(String eTC_DESC) {
		ETC_DESC = eTC_DESC;
	}

	public String getORG_LINK() {
		return ORG_LINK;
	}

	public void setORG_LINK(String oRG_LINK) {
		ORG_LINK = oRG_LINK;
	}

	public String getMAIN_IMG() {
		return MAIN_IMG;
	}

	public void setMAIN_IMG(String mAIN_IMG) {
		MAIN_IMG = mAIN_IMG;
	}

	public String getRGSTDATE() {
		return RGSTDATE;
	}

	public void setRGSTDATE(String rGSTDATE) {
		RGSTDATE = rGSTDATE;
	}

	public String getTICKET() {
		return TICKET;
	}

	public void setTICKET(String tICKET) {
		TICKET = tICKET;
	}

	public String getSTRTDATE() {
		return STRTDATE;
	}

	public void setSTRTDATE(String sTRTDATE) {
		STRTDATE = sTRTDATE;
	}

	public String getEND_DATE() {
		return END_DATE;
	}

	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}

	public String getTHEMECODE() {
		return THEMECODE;
	}

	public void setTHEMECODE(String tHEMECODE) {
		THEMECODE = tHEMECODE;
	}

	public String getLOT() {
		return LOT;
	}

	public void setLOT(String lOT) {
		LOT = lOT;
	}

	public String getLAT() {
		return LAT;
	}

	public void setLAT(String lAT) {
		LAT = lAT;
	}

	public String getIS_FREE() {
		return IS_FREE;
	}

	public void setIS_FREE(String iS_FREE) {
		IS_FREE = iS_FREE;
	}

	public String getHMPG_ADDR() {
		return HMPG_ADDR;
	}

	public void setHMPG_ADDR(String hMPG_ADDR) {
		HMPG_ADDR = hMPG_ADDR;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "CulturalVO [CODENAME=" + CODENAME + ", GUNAME=" + GUNAME + ", TITLE=" + TITLE + ", EVENTDATE="
				+ EVENTDATE + ", PLACE=" + PLACE + ", ORG_NAME=" + ORG_NAME + ", USE_TRGT=" + USE_TRGT + ", USE_FEE="
				+ USE_FEE + ", PLAYER=" + PLAYER + ", PROGRAM=" + PROGRAM + ", ETC_DESC=" + ETC_DESC + ", ORG_LINK="
				+ ORG_LINK + ", MAIN_IMG=" + MAIN_IMG + ", RGSTDATE=" + RGSTDATE + ", TICKET=" + TICKET + ", STRTDATE="
				+ STRTDATE + ", END_DATE=" + END_DATE + ", THEMECODE=" + THEMECODE + ", LOT=" + LOT + ", LAT=" + LAT
				+ ", IS_FREE=" + IS_FREE + ", HMPG_ADDR=" + HMPG_ADDR + "]";
	}

}
