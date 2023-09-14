package org.test;

import java.time.LocalDateTime;
import java.util.List;
import org.apache.commons.codec.digest.DigestUtils;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.test.entity.FruitEntity;
import org.test.entity.DummyEntity;

@Path("/database")
public class DatabaseOperation {

    @GET
    @Produces("application/json")
    @Transactional
    public List<FruitEntity> get() {
    	DummyEntity dummy = new DummyEntity();
    	int randNum = (int)(Math.random() * (1000 - 1 + 1) + 1);
    	String currentTime = LocalDateTime.now().toString();
    	String md5Hex = DigestUtils.md5Hex(currentTime + randNum).toUpperCase();
    	
    	dummy.setDummyCol1(md5Hex);
    	dummy.setDummyCol2("Test");
    	dummy.setDummyCol3("Test 2");
    	
    	// Create
    	dummy.persist();
    	
    	// Update
    	dummy.setDummyCol3("Test 3");
    	
    	// Delete
    	if(dummy.isPersistent()){
    		dummy.delete();
    	}
    	
    	// Read
        return FruitEntity.listAll();
    }
}