package org.gatech.cs6310.DAO;

import org.gatech.cs6310.DAO.entity.Student;
import org.gatech.cs6310.DAO.repository.StudentRepository;
import org.gatech.cs6310.DAO.service.DAOService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest

public class StudentRepositoryTests {

		
	   @Autowired
	    private StudentRepository studentRepository;
	   
	   @Test
	    public void testFindAll() {
		   
			for (Student student : studentRepository.findAll()) {
				System.out.println(student);
			}
			
	     
	    }
	   
	   
}
