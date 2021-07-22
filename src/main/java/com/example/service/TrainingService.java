package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Training;
import com.example.repo.TrainingRepository;

@Service
public class TrainingService {
	
	@Autowired
	private TrainingRepository t;
	

	public Training createTrain(Training training)
	{
		return t.save(training);
	}


	
	
}
