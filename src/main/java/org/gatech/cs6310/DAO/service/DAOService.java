package org.gatech.cs6310.DAO.service;

import java.util.List;

import org.gatech.cs6310.DAO.entity.student.Student;

public interface DAOService {

	 Student getStudentById(Integer id);
	 
	 List<Student> getAllStudents();
	 
}
