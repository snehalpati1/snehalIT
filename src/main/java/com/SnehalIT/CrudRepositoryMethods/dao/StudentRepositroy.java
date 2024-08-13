package com.SnehalIT.CrudRepositoryMethods.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SnehalIT.CrudRepositoryMethods.entity.Student;

@Repository
public interface StudentRepositroy  extends CrudRepository<Student,Integer>{
 
}
