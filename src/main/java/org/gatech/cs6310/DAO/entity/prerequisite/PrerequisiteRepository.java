package org.gatech.cs6310.DAO.entity.prerequisite;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrerequisiteRepository extends JpaRepository<Prerequisite , PrerequisitePK> {


	List<Prerequisite> findAll();
	
	
}
