package org.gatech.cs6310.DAO;

import org.gatech.cs6310.DAO.entity.assignment.Assignment;
import org.gatech.cs6310.DAO.entity.assignment.AssignmentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest

public class AssignmentRepositoryTests {

		
	   @Autowired
	    private AssignmentRepository assignmentRepository;
	   
	   @Test
	    public void testFindAll() {
		   
			for (Assignment assignment : assignmentRepository.findAll()) {
				System.out.println(assignment);
			}
			
	     
	    }
	   
	   
}
