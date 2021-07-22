package com.example.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training,Long>{
	
	@Query(value="select center_name from training",nativeQuery=true)
	public Optional<Training> getAllName();

}
