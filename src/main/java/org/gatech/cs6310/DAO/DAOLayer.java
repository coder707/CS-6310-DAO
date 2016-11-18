package org.gatech.cs6310.DAO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="org.gatech.cs6310.DAO.entity")
public class DAOLayer 
{


	  

    public static void main( String[] args )
    {
        System.out.println( "STARTING  DAO LAYER..!" );
        SpringApplication.run(DAOLayer.class);

        
    }
    

    
    
}
