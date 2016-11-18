package org.gatech.cs6310.DAO;

import java.util.Arrays;

import javax.sql.DataSource;

import org.gatech.cs6310.DAO.entity.Student;
import org.gatech.cs6310.DAO.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.gatech.cs6310.DAO")
public class DAOLayer 
{


	  

    public static void main( String[] args )
    {
        System.out.println( "STARTING  DAO LAYER..!" );
        SpringApplication.run(DAOLayer.class);

        
    }
    

    
    
}
