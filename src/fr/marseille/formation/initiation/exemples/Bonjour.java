package fr.marseille.formation.initiation.exemples;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Character.Subset;

import fr.marseille.formation.initiation.Entity.Message;
import fr.marseille.formation.initiation.Entity.Personne;

public class Bonjour {
	static int nbInstances = 2 ; // Attribut statique
	static final int NB_MAX = 100; // Constantes en majuscule
	
	public static void main(String[] args) {
		// Déclarations des attributs
		// sous la forme :
		// modificateur TypeAttribut nomAttribut [= valeurInitiale];
		int a = 2, b = 3, c = 4; // A la suite séparés par des virgules	

		Message monMessage = new Message();
		monMessage.setMessage( "Vous avez un nouveau courrier dans votre espace Abonné.");
		
		Personne maPersonne = new Personne();
		maPersonne.setPrenom ("Bruno");
		maPersonne.setNom ("CARUSO");
		maPersonne.setAnneeNaissance(1979);
		maPersonne.setMetier("Développeur Web");
		
		System.out.println("Bonjour " + maPersonne.getPrenom() + ' ' + maPersonne.getNom());
		System.out.println("Tu es né en : " + maPersonne.getAnneeNaissance());
		System.out.println("Ton métier est : " + maPersonne.getMetier());
		System.out.println ("Message : " + monMessage.message);
		
		// Opérateur ternaire
		int argent = -43;
		String ternaire = (argent < 0) ? "Solde négatif" : "Solde positif";
		System.out.println("ternaire = " + ternaire); // Affiche Solde négatif
		
		int argent2 = 4000;
		String ternaire2 = (argent2 < 0) ? "Solde négatif" : "Solde positif";
		System.out.println("ternaire = " + ternaire2); // Affiche Solde positif	
		
		System.out.println("===================");
		String variable = "Chaine de caractère";
		System.out.println("La variable a une longueur de " + variable.length() + " caractères");
		// Affiche La variable a une longueur de 19 caractères
		
		// Extract de chaîne
		System.out.println( variable.substring(1, 12)); // Affiche "haine de ca"
		
		// startsWith
		String variable2 = "Welcome to the Jungle";
		System.out.println( variable2.startsWith("Welcome")); // Affiche true
		System.out.println( variable2.startsWith("welcome")); // Affiche false
				
		// Comparaison de chaîne
		String variable3 = "maison";
		String variable4 = "Maison";
		System.out.println(variable4.equals(variable3)); // false
		System.out.println(variable4.equalsIgnoreCase(variable3)); // true
		
		// Conversion de case
		String variable5 = "Welcome to the Jungle";
		System.out.println(variable5.toUpperCase()); // WELCOME TO THE JUNGLE
		System.out.println(variable5.toLowerCase()); // welcome to the jungle
		
		// Exceptions
		try {
			System.out.println(20 / 0 );
		} catch (ArithmeticException e) {
			System.out.println("Exception : Message d'erreur : " + e.getMessage());
			// Affiche : Exception : Message d'erreur : / by zero-
			System.out.println("dans la classe : " + e.getClass());
			// Affiche : dans la classe : class java.lang.ArithmeticException		
		}	
	}

}
