package com.ecole_dynamique.app;


import java.util.ArrayList;
import java.util.Scanner;

public class App {
	//attributs 
	public static String libelle ;
	public static String isbn ;
	public static String annee ;
	public static int prix ;
	public static String nom ;
	public static String prenom ;
	public static int age ;
	public static int matriculeEtudiant;
	public static int salaire;
	
	// Caractere pour 
	public static int caractere=0;
	
	public static  Scanner  clavier = new Scanner(System.in);
	
	public static int positionLivre;
	public static String nouvelleValeurIsbn;
	public static String nouvelleValeurLibelle;
	public static String nouvelleValeurAnnee;
	public static int nouvelleValeurPrix;
	
	public static int positionProfesseur;
	public static String nouvelleValeurNomProfesseur;
	public static String nouvelleValeurPrenomProfesseur;
	public static int nouvelleValeurAgeProfesseur;
	public static int nouvelleValeurSalaire;
	
	public static int positionEtudiant;
	public static String nouvelleValeurNomEtudiant;
	public static String nouvelleValeurPrenomEtudiant;
	public static int nouvelleValeurAgeEtudiant;
	public static int nouvelleValeurMatricule;
	
	
	public static ArrayList<Livre> ListLivre = new ArrayList<Livre>();
	public static ArrayList<Etudiant> ListEtudiant = new ArrayList<Etudiant>();
	public static ArrayList<Professeur> ListProfesseur = new ArrayList<Professeur>();
	
	//affichage Menu 
	public static  int affichageMenu() {
		// ---------------Menu
		System.out.println("\n+---------------------------------MENU PRINCIPALE---------------------------------------+");
		System.out.println("\n-\t \t \t \t 1-Afficher livres \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 2-Afficher étudiants \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 3-Afficher professeurs \t \t \t \t-");
       	System.out.println("-\t \t \t \t 4-Ajouter livre \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 5-Ajouter étudiant \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 6-Ajouter professeur \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 7-Supprimer livre \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 8-Supprimer étudiant \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 9-Supprimer professeur \t \t \t \t-");
       	System.out.println("-\t \t \t \t 10-Modifier livre \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 11-Modifier étudiant \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 12-Modifier professeur \t \t \t \t-");
       	System.out.println("-\t \t \t \t 13-Quitter programme \t \t \t \t \t-");
       	System.out.print("Selectionnez votre choix :\t");
       	caractere = clavier.nextInt();
       	return caractere;
        
	}
	
	
	
	//Methode d'affichage Livre  
	public static  void affichageLivre(Livre livre,int position) {
			System.out.println("\t Le livre "+(position+1)+":");
			System.out.println(livre.toString());
	}
	
	//Methode d'affichage Professeur 
	public static void affichageProfesseur(Professeur professeur,int position) {
		System.out.println("\t Le professeur "+(position+1)+":");
		System.out.println(professeur.toString());
	}
	
	//Methode d'affichage Etudiant 
	public static void affichageEtudiant(Etudiant etudiant,int position) {
		System.out.println("\t L'etudiant "+(position+1)+":");
		System.out.println(etudiant.toString());
	}
	
	
	// Menu de Confirmation de retour au menu principale.
	public static  String affichageSousMenu() {
		
		String selectionSousMenu;
		Scanner inputSousMenu = new Scanner(System.in);

		System.out.println("Voulez-vous retourner au menu pricipale ");
	    System.out.println("n --NON / y---- YES");
	       
	    selectionSousMenu = inputSousMenu.nextLine();
	    return selectionSousMenu;
	}
		
	// Traitement des choix Menu Confirmation retour (y/n)
	public static void switchCondition() {
		switch(affichageSousMenu()) {
		case "y":
			//affichageMenu();
	        break;
		case "n":
			System.out.println("Fin!!");
			System.exit(-1);
			break;
		}
	}

	//Menu qu'affiche les noms des classes
	public static  int affichageObjets() {
		int selectionObjet;
		Scanner inputObjets = new Scanner(System.in);
			// ---------------Menu
		System.out.println("1-Livre ");
		System.out.println("2-Etudiant ");
		System.out.println("3-Professeur ");
	       
		selectionObjet = inputObjets.nextInt();
	    return selectionObjet;
	}
	
	//Pour afficher les noms des attribus de la classe Livre
	public static  int affichageAttLivre() {
		int selectionAttLivre;
		Scanner inputAttLivre = new Scanner(System.in);

		System.out.println("1-ISBN ");
		System.out.println("2-Libelle ");
		System.out.println("3-Annee");
		System.out.println("4-Prix");
	       
		selectionAttLivre =  inputAttLivre.nextInt();
	    return selectionAttLivre;
	}

	//Pour afficher les noms des attribus de la classe Etudiant
	public static  int affichageAttEtudiant() {
		int selectionAttEtudiant;
		Scanner inputAttEtudiant = new Scanner(System.in);
		
		System.out.println("1-Nom ");
		System.out.println("2-Prenom ");
		System.out.println("3-Age");
		System.out.println("4-Matricule");
		
	       
		selectionAttEtudiant = inputAttEtudiant.nextInt();
	    return selectionAttEtudiant;
	}
	
	//Pour afficher les noms des attribus de la classe Professeur
	public static  int affichageAttProfesseur() {
		int selectionAttProfesseur;
		Scanner inputAttProfesseur = new Scanner(System.in);
			
		System.out.println("1-Nom ");
		System.out.println("2-Prenom ");
		System.out.println("3-Age");
		System.out.println("4-Salaire");
	       
		selectionAttProfesseur = inputAttProfesseur.nextInt();
	    return selectionAttProfesseur;
	}
	
	
	// Traitement des attributs des classes au niveau de la modification 
	public static void switchModificationAtt() {
		switch(affichageObjets()) {
			case 1:
				affichageAttLivre();
		        break;
			case 2:
				affichageAttEtudiant();
		        break;
			case 3:
				affichageAttProfesseur();
		        break;
				
		}	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner  clavier1 = new Scanner(System.in);
		  
		do {
			switch(affichageMenu()) {
				case 1 :
					if(ListLivre.size() == 0) {
						System.out.println("Liste livres est vide !!!!! ");
					}
					else {
						System.out.println("Listes Des Livres : ");
						for(int i = 0 ; i < ListLivre.size();i++) {
			    			affichageLivre(ListLivre.get(i),i);
			    		}
					}
					
					switchCondition();
					
		    	break;
		    	// fin case 1
		    		
				case 2:
					if(ListEtudiant.size() == 0) {
						System.out.println("Liste etudiants est vide !!!!! ");
					}
					else {
						System.out.println("Liste Des Etudiants : ");
			    		for(int i = 0 ; i < ListEtudiant.size();i++) {
			    			affichageEtudiant(ListEtudiant.get(i),i);
			    		}
					}
		    		
		    		switchCondition();
		    		
		        break;
		    	// fin case 2
		    		
				case 3 :
					
					if(ListProfesseur.size() == 0) {
						System.out.println("Liste professeurs est vide !!!!! ");
					}
					else {
					System.out.println("Listes des professeurs : ");
		    		for(int i = 0 ; i < ListProfesseur.size();i++) {
		    			System.out.println("\t Le professeur "+(i+1)+":");
		    			affichageProfesseur(ListProfesseur.get(i),i);
		    		}
					}
					
		    		switchCondition();
		    		
		    		//fin case 3
		    		break;
					
				case 4 : 
					
					Scanner inputAjouterPrix = new Scanner(System.in);
					Scanner inputAjouterAnnee = new Scanner(System.in);
					Scanner inputAjouterLibelle= new Scanner(System.in);
					Scanner inputAjouterIsbn = new Scanner(System.in);
					
		        	System.out.println("Saisir isbn:");
		        	isbn = inputAjouterIsbn.nextLine();
		        	
		        	System.out.println("Saisir Libelle:");
		        	libelle = inputAjouterLibelle.nextLine();
		        	
		        	System.out.println("Saisir prix:");
		        	prix = inputAjouterPrix.nextInt();
		        	
		        	System.out.println("Saisir annee:");
		        	annee = inputAjouterAnnee.nextLine();
		        	
		        	
		        	Livre  livre = new Livre(isbn,libelle,annee,prix);
		        	ListLivre.add(livre);
		        	System.out.println("L'ajout de Livre fait avec succes ");
		        	
		        	switchCondition();
		        	
		        	//fin case 4
		        	break;
		        	
				case 5:
					
					Scanner inputAjouterNomEtudiant = new Scanner(System.in);
					Scanner inputAjouterPrenomEtudiant = new Scanner(System.in);
					Scanner inputAjouterAgeEtudiant= new Scanner(System.in);
					Scanner inputAjouterMatricule = new Scanner(System.in);
					
					System.out.println("Saisir nom: ");
		        	nom = inputAjouterNomEtudiant.nextLine();
		        	
		        	System.out.println("Saisir prenom:");
		        	prenom = inputAjouterPrenomEtudiant.nextLine();
		        	
		        	System.out.println("Saisir age:");
		        	age = inputAjouterAgeEtudiant.nextInt();
		        	
		        	System.out.println("Saisir matricule:");
		        	matriculeEtudiant = inputAjouterMatricule.nextInt();
		        	
		        	Etudiant  etudiant = new Etudiant(nom,prenom,age,matriculeEtudiant);
		        	ListEtudiant.add(etudiant);
		        	System.out.println("L'ajout d'etudiant fait avec succes");
		        	System.out.println("  ");
		        	
		        	switchCondition();
		        	
		        	//fin Case 5
		        	break;
		        	
				case 6 :
					
					Scanner inputAjouterNomProfosseur = new Scanner(System.in);
					Scanner inputAjouterPrenomProfesseur = new Scanner(System.in);
					Scanner inputAjouterAgePofesseur= new Scanner(System.in);
					Scanner inputAjouterSalaire = new Scanner(System.in);
					
					System.out.println("Saisir nom: ");
					nom = inputAjouterNomProfosseur.nextLine();
					
		        	System.out.println("Saisir prenom:");
		        	prenom = inputAjouterPrenomProfesseur .nextLine();
		        	
		        	System.out.println("Saisir age:");
		        	age = inputAjouterAgePofesseur.nextInt();
		        	
		        	System.out.println("Saisir salaire:");
		        	salaire = inputAjouterSalaire.nextInt();
		        	
		        	Professeur  professeur = new Professeur(nom,prenom,age,salaire);
		        	ListProfesseur.add(professeur);
		        	System.out.println("L'ajout du professeur fait avec succes");
		        	System.out.println("  ");
		        	
		        	switchCondition();
		        	
		        	//fin Case 6
		        	break;
		        	
				case 7:
					
					Scanner InputSuppressionLivre  = new Scanner(System.in);
					int postionSuppressionLivre = -1 ;
					
					System.out.println("Voulez-vous supprimer quelle livre (entrez la position):");
					
					postionSuppressionLivre = InputSuppressionLivre.nextInt();
					ListLivre.remove(ListLivre.get(postionSuppressionLivre));
					
					postionSuppressionLivre++;
					
					System.out.println("le"+(postionSuppressionLivre)+"éme livre a été supprimé");
					
					switchCondition();
					
				    break;
				    
				case 8:
					
					Scanner InputSuppressionEtudiant  = new Scanner(System.in);
					int postionSuppressionEtudiant = -1 ;
					
					System.out.println("Voulez-vous supprimer quel étudiant (entrez la position):");
					
					postionSuppressionEtudiant = InputSuppressionEtudiant.nextInt();
					ListEtudiant.remove(ListEtudiant.get(postionSuppressionEtudiant));
					postionSuppressionEtudiant++;
					System.out.println("le"+(postionSuppressionEtudiant)+" éme étudiant a été supprimé");
					
					switchCondition();
					
				    break;
				    
				case 9:
					
					Scanner InputSuppressionProfesseur = new Scanner(System.in);
					int positionSuppressionProfesseur = -1 ;
		
					System.out.println("Voulez-vous supprimer quel professeur (entrez la position):");
					
					positionSuppressionProfesseur = InputSuppressionProfesseur.nextInt();
					ListProfesseur.remove(ListProfesseur.get(positionSuppressionProfesseur));
					positionSuppressionProfesseur++;
					System.out.println("le"+(positionSuppressionProfesseur)+"éme professeur a été supprimé");
					
					switchCondition();
					
				    break;
				    
				case 10:
					System.out.println("Voulez-vous Modifier quel livre (entrez la position):");
					positionLivre = clavier.nextInt();
					
					switch(affichageAttLivre()) {
					case 1:
						Scanner inputModificationIsbn = new Scanner(System.in);
						System.out.println("Entrez la nouvelle valeur du ISBN:");
						nouvelleValeurIsbn  = inputModificationIsbn.nextLine();
						ListLivre.get(positionEtudiant).setIsbn(nouvelleValeurIsbn);
						System.out.println("Modification faite avec succes");
					    break;
					case 2:
						Scanner inputModificationLibelle = new Scanner(System.in);
						System.out.println("Entrez la nouvelle valeur du Libelle:");
						nouvelleValeurLibelle  = inputModificationLibelle.nextLine();
						ListLivre.get(positionEtudiant).setLibelle(nouvelleValeurLibelle);
						System.out.println("Modification faite avec succes");
					    break;
					case 3:
						Scanner inputModificationAnnee = new Scanner(System.in);
						System.out.println("Entrez la nouvelle valeur du Annee:");
						nouvelleValeurAnnee  = inputModificationAnnee.nextLine();
						ListLivre.get(positionEtudiant).setAnnee(nouvelleValeurAnnee);
						System.out.println("Modification faite avec succes");
					    break;
					case 4:
						Scanner inputModificationPrix = new Scanner(System.in);
						System.out.println("Entrez la nouvelle valeur du prix:");
						nouvelleValeurPrix  = inputModificationPrix.nextInt();
						ListLivre.get(positionEtudiant).setPrix(nouvelleValeurPrix);
						System.out.println("Modification faite avec succes");
					    break;
					}
					
					switchCondition();
					
					break;
				    
				case 11:
					System.out.println("Voulez-vous Modifier quel étudiant (entrez la position):");
					positionEtudiant = clavier.nextInt();
					
					switch(affichageAttLivre()) {
					case 1:
						Scanner inputModificationNomEtudiant = new Scanner(System.in);
						System.out.println("Entrez la nouvelle valeur du Nom:");
						nouvelleValeurNomEtudiant  = inputModificationNomEtudiant.nextLine();
						ListLivre.get(positionEtudiant).setIsbn(nouvelleValeurNomEtudiant);
						System.out.println("Modification faite avec succes");
					    break;
					    
					case 2:
						Scanner inputModificationPrenomEtudiant = new Scanner(System.in);
						System.out.println("Entrez la nouvelle valeur du Prenom:");
						nouvelleValeurPrenomEtudiant = inputModificationPrenomEtudiant.nextLine();
						ListLivre.get(positionEtudiant).setLibelle(nouvelleValeurPrenomEtudiant);
						System.out.println("Modification faite avec succes");
					    break;
					    
					case 3:
						Scanner inputModificationAgeEtudiant = new Scanner(System.in);
						System.out.println("Entrez la nouvelle valeur du Age:");
						nouvelleValeurAgeEtudiant   = inputModificationAgeEtudiant.nextInt();
						ListEtudiant.get(positionEtudiant).setAge(nouvelleValeurAgeEtudiant);
						System.out.println("Modification faite avec succes");
					    break;
					    
					case 4:
						Scanner inputModificationMatricule = new Scanner(System.in);
						System.out.println("Entrez la nouvelle valeur du matricule:");
						nouvelleValeurMatricule  = inputModificationMatricule.nextInt();
						ListLivre.get(positionEtudiant).setPrix(nouvelleValeurPrix);
						System.out.println("Modification faite avec succes");
					    break;
					}
					
					switchCondition();
					
				    break;
				    
				    
				case 12:
					
					System.out.println("Voulez-vous Modifier quel Professeur (entrez la position):");
					positionProfesseur = clavier.nextInt();
					
					switch(affichageAttLivre()) {
					
					case 1:
						
						Scanner inputModificationNomProfesseur = new Scanner(System.in);
						System.out.println("Entrez la nouvelle valeur du Nom du professeur:");
						nouvelleValeurNomProfesseur  =inputModificationNomProfesseur.nextLine();
						ListLivre.get(positionEtudiant).setIsbn(nouvelleValeurNomProfesseur);
						System.out.println("Modification faite avec succes");
					    break;
					    
					case 2:
						
						Scanner inputModificationPrenomProfesseur = new Scanner(System.in);
						System.out.println("Entrez la nouvelle valeur du Prenom du professeur:");
						nouvelleValeurPrenomProfesseur =inputModificationPrenomProfesseur.nextLine();
						ListLivre.get(positionEtudiant).setLibelle(nouvelleValeurPrenomProfesseur);
						System.out.println("Modification faite avec succes");
					    break;
					    
					case 3:
						
						Scanner inputModificationAgeProfesseur = new Scanner(System.in);
						System.out.println("Entrez la nouvelle valeur de l'age du professeur:");
						nouvelleValeurAgeProfesseur   = inputModificationAgeProfesseur.nextInt();
						ListProfesseur.get(positionProfesseur).setAge(nouvelleValeurAgeProfesseur);
						System.out.println("Modification faite avec succes");
					    break;
					    
					case 4:
						
						Scanner inputModificationSalaire = new Scanner(System.in);
						System.out.println("Entrez la nouvelle valeur de la salaire du professeurs:");
						nouvelleValeurSalaire  = inputModificationSalaire.nextInt();
						ListLivre.get(positionProfesseur).setPrix(nouvelleValeurPrix);
						System.out.println("Modification faite avec succes");
					    break;
					}
					
					switchCondition();
					
				    break;
				    
					
			}

			}while(caractere<13);
		}
		

        /*********************************************************/

        
       	
		

	

}

