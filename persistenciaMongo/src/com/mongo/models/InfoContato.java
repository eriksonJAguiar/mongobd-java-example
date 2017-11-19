package com.mongo.models;

import org.mongodb.morphia.annotations.Entity;


public class InfoContato {
	
	private String cidade;
	private String numFone;
	
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getNumFone() {
		return numFone;
	}
	public void setNumFone(String numFone) {
		this.numFone = numFone;
	}
	
	
}
