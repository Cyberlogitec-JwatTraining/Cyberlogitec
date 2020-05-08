package vn.com.cyberlogitec.day02;

public class Student {
	private String mssv;
	private String hoten;
	private String khoa;
	
	public Student(String mssv, String hoten) {
		super();
		this.mssv = mssv;
		this.hoten = hoten;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	
	public String toString() {
		return this.mssv + ": "+ this.hoten;
	}
}