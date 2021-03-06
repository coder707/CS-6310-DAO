package org.gatech.cs6310.DAO;

import org.gatech.cs6310.DAO.entity.student.Student;
import org.gatech.cs6310.DAO.entity.student.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest

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
