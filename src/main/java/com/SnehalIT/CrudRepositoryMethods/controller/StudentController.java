package com.SnehalIT.CrudRepositoryMethods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.SnehalIT.CrudRepositoryMethods.entity.Student;
import com.SnehalIT.CrudRepositoryMethods.service.StudentServiceI;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceI studentServiceI;

	public Student saveStudent(Student stu) {
		Student student = studentServiceI.saveStudent(stu);
		return student;
	}

	public List<Student> saveAllStudents(List<Student> students) {

		List<Student> saveAllStudents = studentServiceI.saveAllStudents(students);

		return saveAllStudents;
	}

	public List<Student> getAllStudent() {
		List<Student> allRecords = studentServiceI.getAllRecords();
		return allRecords;

	}

	public List<Student> getAllStudentMPK(List<Integer> ids) {

		List<Student> allStuMPK = studentServiceI.getAllStuMPK(ids);
		return allStuMPK;

	}

	public boolean existsRecord(Integer id) {
		boolean existsByIdStu = studentServiceI.existsByIdStu(id);
		return existsByIdStu;

	}

	public long countNoOfRecords() {

		long countNoOfRecords = studentServiceI.countNoOfRecords();
		return countNoOfRecords;

	}

	public Student getStuById(Integer id) {

		Student studentById = studentServiceI.getStudentById(id);
		return studentById;

	}

	public void deleteRecordById(Integer id) {
		studentServiceI.deleteRecordById(id);

	}

	public void deleteRecordByObject(Student stu) {
		studentServiceI.deleteRecordByObject(stu);

	}

	public void deleteStuByMPK(List<Integer> list) {
		studentServiceI.deleteStuByMPK(list);

	}

	public void deleteAllRecords() {
		studentServiceI.deleteAllRecords();

	}
}