package org.gatech.cs6310.DAO;

import org.gatech.cs6310.DAO.entity.instructor.Instructor;
import org.gatech.cs6310.DAO.entity.instructor.InstructorRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest
public class InstructorRepositoryTests {

		
	   @Autowired
	    private InstructorRepository instructorRepository;
	   
	   @Test
	    public void testFindAll() {
		   
			for (Instructor instructor : instructorRepository.findAll()) {
				System.out.println(instructor);
			}
			
	     
	    }
	   
	   
}
