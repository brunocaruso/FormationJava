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
		// D�clarations des attributs
		// sous la forme :
		// modificateur TypeAttribut nomAttribut [= valeurInitiale];
		int a = 2, b = 3, c = 4; // A la suite s�par�s par des virgules	

		Message monMessage = new Message();
		monMessage.setMessage( "Vous avez un nouveau courrier dans votre espace Abonn�.");
		
		Personne maPersonne = new Personne();
		maPersonne.setPrenom ("Bruno");
		maPersonne.setNom ("CARUSO");
		maPersonne.setAnneeNaissance(1979);
		maPersonne.setMetier("D�veloppeur Web");
		
		System.out.println("Bonjour " + maPersonne.getPrenom() + ' ' + maPersonne.getNom());
		System.out.println("Tu es n� en : " + maPersonne.getAnneeNaissance());
		System.out.println("Ton m�tier est : " + maPersonne.getMetier());
		System.out.println ("Message : " + monMessage.message);
		
		// Op�rateur ternaire
		int argent = -43;
		String ternaire = (argent < 0) ? "Solde n�gatif" : "Solde positif";
		System.out.println("ternaire = " + ternaire); // Affiche Solde n�gatif
		
		int argent2 = 4000;
		String ternaire2 = (argent2 < 0) ? "Solde n�gatif" : "Solde positif";
		System.out.println("ternaire = " + ternaire2); // Affiche Solde positif	
		
		System.out.println("===================");
		String variable = "Chaine de caract�re";
		System.out.println("La variable a une longueur de " + variable.length() + " caract�res");
		// Affiche La variable a une longueur de 19 caract�res
		
		// Extract de cha�ne
		System.out.println( variable.substring(1, 12)); // Affiche "haine de ca"
		
		// startsWith
		String variable2 = "Welcome to the Jungle";
		System.out.println( variable2.startsWith("Welcome")); // Affiche true
		System.out.println( variable2.startsWith("welcome")); // Affiche false
				
		// Comparaison de cha�ne
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
