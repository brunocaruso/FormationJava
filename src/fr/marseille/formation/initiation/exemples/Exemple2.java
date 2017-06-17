package fr.marseille.formation.initiation.exemples;

import fr.marseille.formation.initiation.Entity.Personne;

public class Exemple2 {	
	public static void main(String[] args) {
		// Construction d'un tableau d'entiers
		int[] tab = new int[1000];		
		
		for (int i = 0; i < tab.length ; i++ ) {
			tab[i] = i + 1;
			System.out.println("le tableau vaut : " + tab[i]);
			// Affiche :
			// le tableau vaut : 1
			// ...
			// le tableau vaut : 1000
		}	
		
		// Avec String
		String s = "";
		for (int i = 0; i < tab.length; i++) {
			s += tab[i] + ", ";
		}
		System.out.println("le tableau vaut : " + s);
		// Affiche :
		// le tableau vaut : 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, .../..., 998, 999, 1000, 
		
		// Avec StringBuffer
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < tab.length ; i++ ) {
			buffer.append(tab[i]).append(", ");
		}		
		System.out.println( "Le tableau vaut : " + buffer);
		// Affiche :
		// le tableau vaut : 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, .../..., 998, 999, 1000, 
	
		Personne personne = new Personne();
		System.out.println( personne.toString());
		// Affiche :
		// fr.marseille.formation.initiation.Entity.Personne@15db9742			
	}
}
