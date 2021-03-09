package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	private List<String> elenco;
		
	public Parole() {
		this.elenco = new LinkedList<>();
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

}
