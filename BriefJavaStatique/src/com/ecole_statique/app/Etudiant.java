package com.ecole_statique.app;


public class Etudiant extends Personne {
	private int matriculeEtudiant;
	
	public Etudiant(String nom, String prenom, int age,int matriculeEtudiant){
		super(nom,prenom,age);
		this.matriculeEtudiant = matriculeEtudiant;
	}
	
	public int getMatriculeEtudiant() {
		return matriculeEtudiant;	
	}
	
	public void setMatriculeEtudiant(int matriculeEtudiant) {
		this.matriculeEtudiant= matriculeEtudiant;
	}
	
	@Override
	public String toString() {
		String res=super.toString();
		res += " \t Numero d'immatriculation etudiant est: "+this.matriculeEtudiant;
		return res;
	}
}
