package com.SnehalIT.CrudRepositoryMethods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SnehalIT.CrudRepositoryMethods.controller.StudentController;
import com.SnehalIT.CrudRepositoryMethods.entity.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentController studentController = context.getBean(StudentController.class);

		Student stu = new Student();
		stu.setRollno(1);
		stu.setName("Snehal");
		stu.setAddr("Hydrabad");
		stu.setPanNo("ACJPW3149H");

		Student student = studentController.saveStudent(stu);
		System.out.println(student);

		Student stu1 = new Student();
		stu1.setRollno(2);
		stu1.setName("Nikita");
		stu1.setAddr("pune");
		stu1.setPanNo("fGBH567l");

		Student stu2 = new Student();
		stu2.setRollno(3);
		stu2.setName("Neha");
		stu2.setAddr("Mumbai");
		stu2.setPanNo("fklM567l");

		Student stu3 = new Student();
		stu3.setRollno(4);
		stu3.setName("raj");
		stu3.setAddr("Bhadgaon");
		stu3.setPanNo("fklM567l");

		Student stu4 = new Student();
		stu4.setRollno(5);
		stu4.setName("Manisha");
		stu4.setAddr("Nashik");
		stu4.setPanNo("fklM09876");

		List<Student> list = new ArrayList();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);

		List<Student> saveAllStudent = studentController.saveAllStudents(list);
		System.out.println(saveAllStudent);
//
//		List<Student> allStudent = studentController.getAllStudent();
//		System.out.println(allStudent);

//		List<Integer> ids = new ArrayList();
//		ids.add(2);
//		ids.add(4);
//
//		List<Student> allStudentMPK = studentController.getAllStudentMPK(ids);
//		System.out.println(allStudentMPK);

//		boolean existsRecord = studentController.existsRecord(1);
//		System.out.println(existsRecord);
//
//		long countNoOfRecords = studentController.countNoOfRecords();
//		System.out.println(countNoOfRecords);
//
//		Student stuById = studentController.getStuById(4);
//		System.out.println(stuById);
//
//		studentController.deleteRecordById(4);
//
//		Student stu5 = new Student();
//		stu.setRollno(2);
//		studentController.deleteRecordByObject(stu);
//
//		List<Integer> ids1 = new ArrayList();
//		ids1.add(8);
//		ids1.add(3);
//		ids1.add(9);
//		studentController.deleteStuByMPK(ids1);
//
//		studentController.deleteAllRecords();
	}

}