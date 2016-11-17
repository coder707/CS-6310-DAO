package org.gatech.cs6310.DAO.service;

import org.gatech.cs6310.DAO.entity.Student;
import org.gatech.cs6310.DAO.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;




public class DAOServiceImpl implements DAOService {

	@Autowired
	private StudentRepository studentRepo;
	

	@Override
	public Student getStudentById(Integer Id) {
			return studentRepo.findById(Id);
	}

	
}
