package com.hackerrank.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.sample.Repository.SampleRepository;
import com.hackerrank.sample.dto.SampleEntity;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/endpoint")
public class SampleController {

@Autowired
private SampleRepository sampleRepository;


@PostMapping("/insert")
public ResponseEntity<SampleEntity> insert(@RequestBody SampleEntity sampleEntity){
	
	SampleEntity sample = sampleRepository.save(sampleEntity);
	
	return new ResponseEntity<SampleEntity>(sample,HttpStatus.CREATED);
}

@GetMapping("/select")
public ResponseEntity<List<SampleEntity>> select(){
	
	List<SampleEntity> sample = sampleRepository.findAllByOrderByIdAsc();
	
	return new ResponseEntity<List<SampleEntity>>(sample,HttpStatus.OK);
}


@GetMapping("/select/{id}")
public ResponseEntity<SampleEntity> select(@PathVariable Integer id){
	SampleEntity sample= new SampleEntity();
	 
	if(!sampleRepository.findById(id).isEmpty()) {
		sample = sampleRepository.findById(id).get();
	 return new ResponseEntity<SampleEntity>(sample,HttpStatus.OK);
	}else {
		return new ResponseEntity<SampleEntity>(sample,HttpStatus.NOT_FOUND);
	}
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<String> delete(@PathVariable Integer id){
	//ampleEntity sample= new SampleEntity();
	 //sample = sampleRepository.findById(id).get();
	 if(!sampleRepository.findById(id).isEmpty()) {
		sampleRepository.deleteById(id);
	 return new ResponseEntity<String>("",HttpStatus.OK);
	}else {
		return new ResponseEntity<String>("",HttpStatus.NOT_FOUND);
	}
}
  
}
