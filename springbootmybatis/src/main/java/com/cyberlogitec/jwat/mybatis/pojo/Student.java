package com.cyberlogitec.jwat.mybatis.pojo;

import java.io.Serializable;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
*/
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//@Entity
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5603728729228683521L;

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//@Column(columnDefinition = "VARCHAR(100)")
	private String name;
	
	//@Column(columnDefinition = "VARCHAR(200)")
	private String branch;
	
	//@Column(columnDefinition = "int not null default 0 ")
	private int percentage;
	
	//@Column(columnDefinition = "int not null")
	private int phone;
	
	//@Column(columnDefinition = "VARCHAR(255)")
	private String email;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getName() + "[" + "id = " + id + ", name = " + name + ", branch = " + branch 
                + ", percentage = " + percentage  + ", phone = " + phone  + ", email = " + email + "]";
	}
}
