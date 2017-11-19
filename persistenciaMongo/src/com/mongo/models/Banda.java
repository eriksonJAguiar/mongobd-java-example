package com.mongo.models;

import java.awt.List;
import java.util.ArrayList;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;


@Entity("banda")
public class Banda {
	@Id
    private long id;

    private String name;

    private String genero;

    @Reference("musicas")
    private ArrayList<String> musicas;

    @Embedded
    private ArrayList<String> members;

    @Embedded("info")
    private InfoContato info;
    
    
    public Banda() {
    	musicas = new ArrayList<String>();
    	members = new ArrayList<String>();
    	id = 0;
    	name = "";
    	genero = "";
    	info = new InfoContato();
    }


	public long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<String> getMusicas() {
		return musicas;
	}


	public void setMusica(ArrayList<String> musicas) {
		this.musicas = musicas;
	}


	public ArrayList<String> getMembers() {
		return members;
	}


	public void setMembers(ArrayList<String> members) {
		this.members = members;
	}


	public InfoContato getInfo() {
		return info;
	}


	public void setInfo(InfoContato info) {
		this.info = info;
	}
    
    
    
}
