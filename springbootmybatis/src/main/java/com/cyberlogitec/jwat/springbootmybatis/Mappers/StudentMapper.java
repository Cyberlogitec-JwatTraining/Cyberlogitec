package com.cyberlogitec.jwat.springbootmybatis.Mappers;

import com.cyberlogitec.jwat.springbootmybatis.Entities.StudentInfo;

import java.util.List;

public interface StudentMapper {
    public List<StudentInfo> getStudentByName(String name);
    public List<StudentInfo> getStudentByNameOrPhone(String name,String phone);
    public List<StudentInfo> getStudentByIds(String... ids);
    public void insertStudent(StudentInfo... studentInfos);
    public void updateStudent(String id,StudentInfo newStudentInfo);
}
