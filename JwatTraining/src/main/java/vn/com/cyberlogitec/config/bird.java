package vn.com.cyberlogitec.config;

import javax.annotation.PostConstruct;

public class bird implements Animal{
	@Override
	public String getname() {
		return "I'm bird";
	}
	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method bird after properties are set : ");
	}
}