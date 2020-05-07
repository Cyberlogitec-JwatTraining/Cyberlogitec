package vn.com.cyberlogitec.config;

import javax.annotation.PostConstruct;

public class cat implements Animal{
	@Override
	public String getname() {
		return "I'm cat";
	}
	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method cat after properties are set : ");
	}
}