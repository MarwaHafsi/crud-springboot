package com.fst.srt.entities;

public class Etudiant {
private int id;
private String nom;
private String prenom;
private String adresse;
private String email;
public Etudiant(int id, String nom, String prenom, String adresse, String email) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.email = email;
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
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
