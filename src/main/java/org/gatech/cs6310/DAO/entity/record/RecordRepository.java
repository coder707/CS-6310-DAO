package org.gatech.cs6310.DAO.entity.record;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record ,RecordPK> {


	List<Record> findAll();
	
	
}
