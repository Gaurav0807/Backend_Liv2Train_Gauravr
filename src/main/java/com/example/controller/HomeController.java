package com.example.controller;



import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.entity.Training;
import com.example.repo.TrainingRepository;
import com.example.service.TrainingService;

@RestController
public class HomeController {
	
	@Autowired
	private TrainingService tService;
	
	@Autowired
	private TrainingRepository t3;
	
	@PostMapping("/train")
	public ResponseEntity<Training> createTraining(@Valid @RequestBody Training t,BindingResult result)
	{
		
		Training t1 = tService.createTrain(t);
		return new ResponseEntity<Training>(t1,HttpStatus.CREATED);
	}
	
	@GetMapping("/name")
	public Training getCenterName()
	{
		Optional<Training> t2= t3.getAllName();
		return t2.get();
	}
	
//	@GetMapping("/{id}")
//	public Training getTraining(@PathVariable long id)
//	{
//		Optional<Training> op = t3.findById(id);
//		Training t6 = t3.getById(id);
//		return op.get();
//	}

}
