package org.gatech.cs6310.DAO;

import java.util.Arrays;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.gatech.cs6310.DAO")
public class DAOLayer 
{

	  
	@Bean
	public DataSource dataSource() {
	        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
	        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
	        //dataSourceBuilder.url("jdbc:sqlite:C:/Sandbox/CS-6310-DAO/CS-6310-DAO/database/school.db");
	        dataSourceBuilder.url("jdbc:sqlite:school.db");
	        return dataSourceBuilder.build();   
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ctx = SpringApplication.run(DAOLayer.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        //Student s = service.getStudentById(9);
        
    }
}
