package vn.com.cyberlogitec.exercise2.repository;

import org.springframework.stereotype.Component;

import vn.com.cyberlogitec.exercise2.model.Student;

public interface StudentRepository {
	Student addNewStudent(int id, String name);
}
