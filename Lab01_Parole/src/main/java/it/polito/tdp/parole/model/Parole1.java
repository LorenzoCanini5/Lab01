package it.polito.tdp.parole.model;

import java.util.*;

public class Parole1 {
	
	private List<String> elenco;
		
	public Parole1() {
		this.elenco = new ArrayList<>();
	}
	
	public void addParola(String p) {
		this.elenco.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(this.elenco);
		return this.elenco;
	}
	
	public void reset() {
		this.elenco.removeAll(elenco);
	}
	
	public void cancella(String p) {
		this.elenco.remove(p);
	}

}
