package vn.com.cyberlogitec.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import vn.com.cyberlogitec.config.AppConfig;
import vn.com.cyberlogitec.model.Student;
import vn.com.cyberlogitec.service.StudentService;

public class Test {
	public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService = (StudentService) context.getBean("studentService");
         
        // Khởi tạo dữ liệu bài toán
//        studentService.insertStudent(new Student("Nguyen Van A", "Java Dev", 95, 13256189, "Adev@gmail.com"));
//        studentService.insertStudent(new Student("Nguyen Van B", "Java Tester", 95, 64835973, "Btest@gmail.com"));
//        studentService.insertStudent(new Student("Nguyen Van C", "Java BA", 95, 43203983, "Cbav@gmail.com"));
//        studentService.insertStudent(new Student("Nguyen Van D", "Java Leader", 95, 97465310, "Dleader@gmail.com"));
     
        // Xem danh sách học sinh
        List<Student> listStudents = studentService.selectAllStudent();
        System.out.println("select all : ");
        for (Student student : listStudents) {
            System.out.println(student);
        }
        
        // Câu 1: Lấy thông tin sinh viên theo tên
        listStudents = studentService.selectStudentByName("Van A");
        System.out.println("1. select by name : ");
        for (Student student : listStudents) {
            System.out.println(student);
        }
        
        // Câu 2: Lấy thông tin sinh viên theo tên hoặc số điện thoại
        Student std = new Student();
        std.setPhone(97465310);
        listStudents = studentService.selectStudentByOption(std);
        System.out.println("2.1 select by phone : ");
        for (Student student : listStudents) {
            System.out.println(student);
        }
        
        std = new Student();
        std.setName("Van A");
        listStudents = studentService.selectStudentByOption(std);
        System.out.println("2.2 select by name : ");
        for (Student student : listStudents) {
            System.out.println(student);
        }
        
        // Câu 3: Láy thông tin student dựa trên khoảng id
        listStudents = studentService.selectMultipleStudentByIds(new int[] {1,2,5,6});
        System.out.println("3. select by id list : ");
        for (Student student : listStudents) {
            System.out.println(student);
        }
        
        // Câu 5: Cập nhật thông tin student theo Id
        std = new Student();
        std.setId(1);
        std.setName("Nguyen Van E");
        std.setEmail("Edev@gmail.com");
        studentService.updateStudentById(std);
        
        listStudents = studentService.selectAllStudent();
        System.out.println("select all after update: ");
        for (Student student : listStudents) {
            System.out.println(student);
        }
        
        context.close();
	}
}
