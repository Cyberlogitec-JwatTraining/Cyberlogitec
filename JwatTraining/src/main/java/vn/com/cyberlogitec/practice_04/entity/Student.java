package vn.com.cyberlogitec.practice_04.entity;

public class Student {

	private Integer ID;
	private String NAME;
	private String BRANCH;
	private Integer PERCENTAGE;
	private String PHONE;
	private String EMAIL;

	public Student() {
	}

	public Student(String NAME, String BRANCH, int PERCENTAGE, String PHONE, String EMAIL) {
		this.NAME = NAME;
		this.BRANCH = BRANCH;
		this.PERCENTAGE = PERCENTAGE;
		this.PHONE = PHONE;
		this.EMAIL = EMAIL;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getBRANCH() {
		return BRANCH;
	}

	public void setBRANCH(String bRANCH) {
		BRANCH = bRANCH;
	}

	public Integer getPERCENTAGE() {
		return PERCENTAGE;
	}

	public void setPERCENTAGE(Integer pERCENTAGE) {
		PERCENTAGE = pERCENTAGE;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", NAME=" + NAME + ", BRANCH=" + BRANCH + ", PERCENTAGE=" + PERCENTAGE + ", PHONE="
				+ PHONE + ", EMAIL=" + EMAIL + "]" + "\n\r";
	}
	
	
}
