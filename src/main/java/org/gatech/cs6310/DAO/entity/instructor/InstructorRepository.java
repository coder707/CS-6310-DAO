package org.gatech.cs6310.DAO.entity.instructor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor ,Integer> {

	Instructor findById(Integer Id);
	List<Instructor> findAll();
	
	
}
