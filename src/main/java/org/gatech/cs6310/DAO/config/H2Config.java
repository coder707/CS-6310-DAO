package org.gatech.cs6310.DAO.config;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

public class H2Config
{
	
	private static EmbeddedDatabase db;
	
	@Bean
	public DataSource dataSource()
	{
		EmbeddedDatabaseBuilder edb = new EmbeddedDatabaseBuilder();

			if (db != null)
			{
				db.shutdown();
			}
			
		edb
		.setType(H2)
		//.setName("SCHOOL")
		.setScriptEncoding("UTF-8")
		.ignoreFailedDrops(true);
		edb.addScript("tables.sql");
		edb.addScript("data.sql");
		db = edb.build();
		return db;
		
	}
	
	

}