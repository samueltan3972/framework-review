package org.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/fibonacci")
public class Fibonacci {

    @GET
    @Produces("application/json")
    public List<BigInteger> fibonacci() {
    	BigInteger n1 = BigInteger.valueOf(0), n2 = BigInteger.valueOf(1), n3;
    	int i, count = 5000;    
    	//String result = n1 + " "+ n2; //printing 0 and 1    
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