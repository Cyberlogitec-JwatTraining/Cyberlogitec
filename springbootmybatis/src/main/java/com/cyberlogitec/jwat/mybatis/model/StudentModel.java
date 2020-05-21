package com.cyberlogitec.jwat.mybatis.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentModel implements Serializable {
	
		/**
		 *
		 */
		private static final long serialVersionUID = -6765588597926599871L;

		private int id;

		private String name;

		private String branch;

		private int percentage;

		private int phone;

		private String email;
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return getClass().getName() + "[" + ", name = " + name + ", branch = " + branch 
	                + ", percentage = " + percentage  + ", phone = " + phone  + ", email = " + email + "]";
		}
}
