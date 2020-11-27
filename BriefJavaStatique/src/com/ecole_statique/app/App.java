package com.ecole_statique.app;
import java.util.ArrayList;

public class App {
	
	
	public static void main(String[] args) {
		
		//instanciation Etudiant 		
				Etudiant etudiant1 = new Etudiant("RANDI","ZAKARIA",23,123334);
				Etudiant etudiant2 = new Etudiant("ROUIKA","BESSAM",25,1233345);
				Etudiant etudiant3 = new Etudiant("KADIR","YASSER",23,1233346);
				
				//instanciation Professeur
				Professeur professeur1 = new Professeur("ATTAF","MAJ",23,12333402);
				Professeur professeur2 = new Professeur("MARROUA","ADIL",25,123334501);
				Professeur professeur3 = new Professeur("KADIR","IMAD",23,123334600);
				
				//instanciation Livre
				Livre  livre1 = new Livre("TRAG","L-001","2012",300);
				Livre  livre2 = new Livre("ETQUETTE","L-002","2015",330);
				Livre  livre3 = new Livre("007","L-003","2014",350);
				
				ArrayList<Livre> ListLivre = new ArrayList<Livre>();
				ArrayList<Etudiant> ListEtudiant = new ArrayList<Etudiant>();
				ArrayList<Professeur> ListProfesseur = new ArrayList<Professeur>();
				
				// ajouter un livre
				ListLivre.add(livre1);
				ListLivre.add(livre2);
				ListLivre.add(livre3);
				
				// ajouter etudiant
				ListEtudiant.add(etudiant1);
				ListEtudiant.add(etudiant2);
				ListEtudiant.add(etudiant3);
				
				//ajouter Professeur 
				ListProfesseur.add(professeur1);
				ListProfesseur.add(professeur2);
				ListProfesseur.add(professeur3);
				
				// affichage du arraylist Professeurs
				System.out.println("Listes Des Professeurs : ");
				for(int i = 0 ; i < ListProfesseur.size();i++) {
					System.out.println("\t Le professeur  "+(i+1)+":");
					System.out.println(ListProfesseur.get(i).toString());
				}
				System.out.println("  ");
								
				// affichage du arraylist Etudiants
				System.out.println("Listes Des Etudiants : ");
				for(int i = 0 ; i < ListEtudiant.size();i++) {
					System.out.println("\t L'étudiant "+(i+1)+":");
					System.out.println(ListEtudiant.get(i).toString());	
				}
				System.out.println("  ");
						
				// affichage du arraylist Livres
				System.out.println("Listes Des Livres : ");
				for(int i = 0 ; i < ListLivre.size();i++) {
					System.out.println("\t Le livre "+(i+1)+":");
					System.out.println(ListLivre.get(i).toString());
				}
				System.out.println("  ");
				
				
						
				// modification Professeur
				ListProfesseur.get(1).setAge(41);
				ListProfesseur.get(1).setSalaire(10001);
				
				// modification Etudiant 
				ListEtudiant.get(1).setAge(20);
				ListEtudiant.get(1).setMatriculeEtudiant(5555);
				
				// modification Livre
				ListLivre.get(0).setPrix(139);
				
				// supprimer Professeur 
				ListProfesseur.remove(professeur3);
				
				// supprimer Livre
				ListLivre.remove(livre2);

				//supprimer etudiant 
				ListEtudiant.remove(etudiant1);
				
				//affichage apres Les modifications 
				System.out.println(" ---------------------------------------Afiichage apres modification ");
				System.out.println("\n");
				// affichage du arraylist Professeurs
				System.out.println("Listes Des Professeurs : ");
				for(int i = 0 ; i < ListProfesseur.size();i++) {
					System.out.println("\t Le professeur  "+(i+1)+":");
					System.out.println(ListProfesseur.get(i));
				}
				System.out.println("  ");
						
				// affichage du arraylist Etudiants
				System.out.println("Listes Des Etudiants : ");
				for(int i = 0 ; i < ListEtudiant.size();i++) {
					System.out.println("\t L'étudiant "+(i+1)+":");
					System.out.println(ListEtudiant.get(i));	
				}
				System.out.println("  ");
				
				// affichage du arraylist Livres
				System.out.println("Listes Des Livres : ");
				for(int i = 0 ; i < ListLivre.size();i++) {
					System.out.println("\t Le livre "+(i+1)+":");
					System.out.println(ListLivre.get(i));
				}
				System.out.println("  ");
		
	
	}

}
