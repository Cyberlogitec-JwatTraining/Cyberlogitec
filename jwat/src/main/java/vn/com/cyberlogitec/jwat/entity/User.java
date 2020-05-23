package vn.com.cyberlogitec.jwat.entity;

public class User {
	private int id;
	private String email;
	private String password;
	
	public User() {};
	
	public User(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return getClass().getName() + " id " + id + " email " + email + " password " + password;
	}
}
