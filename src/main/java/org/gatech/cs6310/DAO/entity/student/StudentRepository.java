package org.gatech.cs6310.DAO.entity.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student ,Integer> {

	Student findById(Integer Id);
	List<Student> findAll();
	
	
}
