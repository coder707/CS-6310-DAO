package org.gatech.cs6310.DAO;

import org.gatech.cs6310.DAO.entity.record.Record;
import org.gatech.cs6310.DAO.entity.record.RecordRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest

public class RecordRepositoryTests {

		
	   @Autowired
	    private RecordRepository recordRepository;
	   
	   @Test
	    public void testFindAll() {
		   
			for (Record record : recordRepository.findAll()) {
				System.out.println(record);
			}
			
	     
	    }
	   
	   
}
