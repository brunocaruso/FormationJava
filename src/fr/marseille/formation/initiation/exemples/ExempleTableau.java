package fr.marseille.formation.initiation.exemples;

import java.util.Objects;

import fr.marseille.formation.initiation.Entity.Personne;

public class ExempleTableau {
	public static void main(String[] args) {
		// Exemples de tableaux par type
		int[] tableau1 = { 1, 2, 4, 10, 200};
		double[] tableau2 = { 2.08, 3.48, -4.5, 34};
		String[] tableau3 = { "1", "2", "Metallica", "Capitaine Type"};
		
		// Tableaux à 2 dimensions
		String[][] matrice = new String[3][2];
		
		// Les tableaux où on peut tout mettre dedans = type Objects
		// Object[] objects = new Objects[4];
		// objects[0] = "Hello"; // de type String
		// objects[1] = 1; // de type int
		// objects[2] = 'A';
		// objects[3] = "Ceci est une chaîne de caractères !";

		String prenoms = "Bruno;Nicolas;Donia";
		String[] tableauStrings = prenoms.split(";");
		System.out.println(tableauStrings[2]); // Affiche Donia
		
	}
}
