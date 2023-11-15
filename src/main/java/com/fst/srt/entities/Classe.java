package com.fst.srt.entities;

public class Classe {
private int id;
private String nom;
public Classe(int id, String nom) {
	super();
	this.id = id;
	this.nom = nom;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
}
