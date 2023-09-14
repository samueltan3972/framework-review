package com.example.restservice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {
	
	@RequestMapping(value="", method = RequestMethod.GET, produces = "application/json")
	public List<BigInteger> fibonacci() {
		BigInteger n1 = BigInteger.valueOf(0), n2 = BigInteger.valueOf(1), n3;
    	int i, count = 5000;    
  
    	List<BigInteger> result = new ArrayList<BigInteger>();
    	result.add(BigInteger.valueOf(0));
    	result.add(BigInteger.valueOf(1));
    	
    	for(i = 2; i < count; ++i) //loop starts from 2 because 0 and 1 are already printed    
    	{    
    		n3 = n1.add(n2);    
    		result.add(n3);    
    		n1 = n2;
    		n2 = n3;    
    	}   
    	 
    	return result;
	}
}
