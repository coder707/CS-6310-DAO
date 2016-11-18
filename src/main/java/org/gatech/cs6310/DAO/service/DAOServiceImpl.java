package org.gatech.cs6310.DAO.service;

import java.util.List;

import org.gatech.cs6310.DAO.entity.Student;
import org.gatech.cs6310.DAO.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DAOServiceImpl implements DAOService {

	@Autowired
	private StudentRepository studentRepo;
	


	@Override
	public Student getStudentById(Integer Id) {
			return studentRepo.findById(Id);
	}

	@Override
	public List <Student> getAllStudents() {
		return studentRepo.findAll();
	}

	
}
