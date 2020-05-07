package vn.com.cyberlogitec.config;

import javax.annotation.PostConstruct;

public class dog implements Animal{
	@Override
	public String getname() {
		return "I'm dog";
	}
	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method dog after properties are set : ");
	}
}