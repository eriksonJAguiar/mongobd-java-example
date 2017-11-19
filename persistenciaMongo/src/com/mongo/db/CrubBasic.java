package com.mongo.db;

import java.util.ArrayList;

import javax.management.Query;

import org.mongodb.morphia.Datastore;

import com.mongo.models.Banda;

public class CrubBasic {
	private Datastore datastore;
	
	public CrubBasic(Datastore datastore) {
		this.datastore = datastore;
	}
	
	public void create(Banda banda) {
		datastore.save(banda);
	}
	
	public ArrayList<Banda> readAll() {
		return (ArrayList<Banda>) datastore.createQuery(Banda.class).asList();
	}
	
	public Banda read(String name) {
		
		Banda band = datastore.createQuery(Banda.class).filter("name = ",name).get();
		
		return band;
		
	}
	
	public void delete(Banda banda) {
		datastore.delete(banda);
	}

}
