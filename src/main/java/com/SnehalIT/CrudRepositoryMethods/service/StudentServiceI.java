package com.SnehalIT.CrudRepositoryMethods.service;

import java.util.List;

import com.SnehalIT.CrudRepositoryMethods.entity.Student;

public interface StudentServiceI {

	public Student saveStudent(Student stu);

	public List<Student> saveAllStudents(List<Student> students);

	public List<Student> getAllRecords();

	public List<Student> getAllStuMPK(List<Integer> list);

	public Student getStudentById(Integer id);

	public boolean existsByIdStu(Integer id);

	public long countNoOfRecords();

	public void deleteRecordById(Integer id);

	public void deleteRecordByObject(Student stu);

	public void deleteStuByMPK(List<Integer> list);

	public void deleteAllRecords();

}
