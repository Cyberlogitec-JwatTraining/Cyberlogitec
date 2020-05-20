package mybatis.mapper;

import java.util.List;

import mybatis.mapper.entity.Student;

public interface StudentMapper {
    int insert(Student student);
    int update(Student student);
    List<Student> selectAll();
    Student selectById(int id);
}
