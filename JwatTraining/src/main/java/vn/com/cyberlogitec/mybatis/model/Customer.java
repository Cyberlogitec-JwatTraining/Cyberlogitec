package vn.com.cyberlogitec.mybatis.model;
public class Customer {
	private int id;
	private String fname;
	private String username;
	private String pass;
	private String avatar;
	private boolean stt;
	private String phone;
	private String sex;
	private String email;
	private String addr;
	
	public Customer() {}
	
	public Customer(int id, String fname, String username, String pass, String avatar, boolean stt, String phone, String sex, String email, String addr ) {
		this.setId(id);
		this.setFname(fname);
		this.setUsername(username);
		this.setPass(pass);
		this.setAvatar(avatar);
		this.setStt(stt);
		this.setPhone(phone);
		this.setSex(sex);
		this.setEmail(email);
		this.setAddr(addr);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public boolean isStt() {
		return stt;
	}

	public void setStt(boolean stt) {
		this.stt = stt;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return getClass().getName() + ": " + getId()
				+ "\n -Name:" + getFname() 
				+ "\n -Address:" + getAddr() 
				+"\n -Email:" + getEmail() 
				+"\n ---------------------------------\n";
	}
}
