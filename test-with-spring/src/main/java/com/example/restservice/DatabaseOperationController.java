package com.example.restservice;

import java.time.LocalDateTime;
import java.util.Collection;

import com.example.repository.DummyRepository;
import com.example.repository.FruitRepository;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Dummy;
import com.example.model.Fruit;

@RestController
@RequestMapping("/database")
public class DatabaseOperationController {
	@Autowired
	FruitRepository fruitRepository;
	
	@Autowired
	DummyRepository dummyRepository;
	
	@GetMapping("")
	public Collection<Fruit> database() {
		Dummy dummyobj = new Dummy();
		int randNum = (int)(Math.random() * (1000 - 1 + 1) + 1);
    	String currentTime = LocalDateTime.now().toString();
    	String md5Hex = DigestUtils.md5Hex(currentTime + randNum).toUpperCase();
    	
		dummyobj.setDummyCol1(md5Hex);
		dummyobj.setDummyCol2("Test");
		dummyobj.setDummyCol3("Test 2");
		
		dummyRepository.save(dummyobj);
		
		dummyobj.setDummyCol3("Test 3");
		
		dummyRepository.save(dummyobj);
		
		dummyRepository.delete(dummyobj);
		
		return fruitRepository.findAll();
	}
}
