package com.ecole_statique.app;


public class Professeur extends Personne {
	private int salaire;
	
	public Professeur(String nom, String prenom, int age,int salaire){
		super(nom,prenom,age);
		this.salaire = salaire;
	}
	
	public int getSalaire() {
		return salaire;	
	}
	
	public void setSalaire(int salaire) {
		this.salaire=salaire;
	}
	
	public String toString() {
		return super.toString()+" \t Salaire professeur est : "+this.salaire;
	}
}

