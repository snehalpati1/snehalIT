package com.SnehalIT.CrudRepositoryMethods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SnehalIT.CrudRepositoryMethods.dao.StudentRepositroy;
import com.SnehalIT.CrudRepositoryMethods.entity.Student;
@Service
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	private StudentRepositroy studentRepository;

	@Override
	public Student saveStudent(Student stu) {
		Student student=studentRepository.save(stu);
		return student;
	}

	@Override
	public List<Student> saveAllStudents(List<Student> students) {
		List<Student>saveAll=(List<Student>)studentRepository.saveAll(students);
		return saveAll;
	}
	
	@Override
	public List<Student> getAllRecords() {
		List<Student> all = (List<Student>) studentRepository.findAll();
		return all;
	}

	@Override
	public List<Student> getAllStuMPK(List<Integer> list) {
	List<Student> allById = (List<Student>) studentRepository.findAllById(list);
		return allById;
	}

	@Override
	public boolean existsByIdStu(Integer id) {
	boolean existsById = studentRepository.existsById(id);
		return existsById;
	}

	@Override
	public long countNoOfRecords() {
		long count = studentRepository.count();
		return count;
	}

	@Override
	public Student getStudentById(Integer id) {
	Student byId = studentRepository.findById(id).get();
		return byId;
	}

	@Override
	public void deleteRecordById(Integer id) {
	studentRepository.deleteById(id);
		
	}

	@Override
	public void deleteRecordByObject(Student stu) {
	studentRepository.delete(stu);
		
	}

	@Override
	public void deleteStuByMPK(List<Integer> list) {
	studentRepository.deleteAllById(list);
		
	}

	@Override
	public void deleteAllRecords() {
		studentRepository.deleteAll();
		
}
	//This is Witten by QA Team
	public TestingTeam() {
		System.out.println("THis is the QA tester team");
	}
	
	//This is Witten by QA Team
		public QATeam() {
			System.out.println("THis is the QA tester team");
		}
}
