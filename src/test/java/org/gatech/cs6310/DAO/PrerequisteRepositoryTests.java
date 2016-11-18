package org.gatech.cs6310.DAO;

import org.gatech.cs6310.DAO.entity.prerequisite.Prerequisite;
import org.gatech.cs6310.DAO.entity.prerequisite.PrerequisiteRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest

public class PrerequisteRepositoryTests {

		
	   @Autowired
	    private PrerequisiteRepository prerequisteRepository;
	   
	   @Test
	    public void testFindAll() {
		   
			for (Prerequisite prerequisite : prerequisteRepository.findAll()) {
				System.out.println(prerequisite);
			}
			
	     
	    }
	   
	   
}
