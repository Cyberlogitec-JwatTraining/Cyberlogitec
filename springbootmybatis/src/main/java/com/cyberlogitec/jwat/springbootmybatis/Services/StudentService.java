package com.cyberlogitec.jwat.springbootmybatis.Services;

import com.cyberlogitec.jwat.springbootmybatis.Entities.StudentInfo;
import com.cyberlogitec.jwat.springbootmybatis.Mappers.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentService implements StudentMapper {

    @Autowired
    @Qualifier("MySQL") // can switch between MySQL / Oracle
    private StudentMapper studentMapper;

    @Override
    public List<StudentInfo> getStudentByName(String name) {
        return studentMapper.getStudentByName(name);
    }

    @Override
    public List<StudentInfo> getStudentByNameOrPhone(String name, String phone) {
        return studentMapper.getStudentByNameOrPhone(name, phone);
    }

    @Override
    public List<StudentInfo> getStudentByIds(String... ids) {
        return studentMapper.getStudentByIds(ids);
    }

    @Override
    public void insertStudent(StudentInfo... studentInfos) {
        studentMapper.insertStudent(studentInfos);
    }

    @Override
    public void updateStudent(String id, StudentInfo newStudentInfo) {
        studentMapper.updateStudent(id, newStudentInfo);
    }
}
