package com.mongo.db;

import com.mongodb.client.MongoDatabase;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI; 
 

public class ConnectToDB { 
   
   public Datastore connect(String collection) {  
	  
	  try {
		  MongoClient mongo = new MongoClient("localhost",27017);
		  Datastore datastore = new Morphia().createDatastore(mongo, collection);
		  	  
		  return datastore;
	  }
	  catch(Exception ex) {
		 System.out.println(ex.getMessage()); 
	  }
      
     return null;
   } 

}