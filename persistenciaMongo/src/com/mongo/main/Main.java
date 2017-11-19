package com.mongo.main;

import java.util.ArrayList;

import org.mongodb.morphia.Datastore;

import com.mongo.db.ConnectToDB;
import com.mongo.db.CrubBasic;
import com.mongo.models.Banda;
import com.mongo.models.InfoContato;


public class Main {

	public static void main(String[] args) {
		
		ConnectToDB con = new ConnectToDB();
		
		Datastore coll = con.connect("bandas-teste");
		
		CrubBasic database = new CrubBasic(coll);
		
		Banda banda = new Banda();
		
		banda.setId(12245455);
		banda.setGenero("Heavy Metal");
		banda.setName("Metallica");
		
		ArrayList<String> membros = new ArrayList<String>();
		membros.add("James Hetfield");
		membros.add("Lars Ulrich");
		membros.add("Kirk Hammett");
		banda.setMembers(membros);
		
		
		ArrayList<String> musicas = new ArrayList<String>();
		musicas.add("Nothing Else Matters");
		musicas.add("One");
		musicas.add("Enter Sandman");
		banda.setMusica(musicas);
		
		InfoContato info = new InfoContato();
		info.setCidade("Los Angeles");
		info.setNumFone("(00)0000-0000");
		banda.setInfo(info);
		
		
		database.create(banda);
		
		ArrayList<Banda> band = database.readAll();
		
		
		for(Banda b : band) {
		   System.out.println("Musica: "+b.getMusicas().get(0));
		   System.out.println("Musica: "+b.getMusicas().get(1));
		   System.out.println("Musica: "+b.getMusicas().get(2));
		}

	}

}
