package com.ecole_dynamique.app;


public class Livre {
	private String  isbn;
	private String  libelle;
	private String  annee;
	private int prix ;
	
	
	public Livre(String isbn , String libelle ,String annee, int prix) {
		this.isbn  = isbn ;
		this.libelle = libelle ;
		this.annee = annee;
		this.prix = prix;
	}
	
	public String getIsbn() {
		return isbn;
		
	}
	public String getLibelle() {
		return libelle;
		
	}
	public String getAnnee() {
		return annee;
		
	}
	public int getPrix() {
		return prix;
		
	}
	
	public void setIsbn(String isbn) {
		this.isbn  = isbn ;
	}
	public void setLibelle(String libelle) {
		this.libelle  = libelle ;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public void setPrix(int prix) {
		this.prix= prix;
	}
	
	@Override
	public String toString() {
		 return "\t \t ISBN   : "+this.isbn +"\t"+"  LIBELLE:"+this.libelle+"\t"+"  PRIX: "+this.prix+"\t"+ "ANNEE DE PRODUCTION : "+this.annee+ " ";
	}

}

