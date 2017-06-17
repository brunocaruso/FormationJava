package fr.marseille.formation.initiation.exemples;

import java.util.Scanner;

/**
 * Saisie d'un nombre entier par l'utilisateur
 * 
 * @author Bruno Caruso
 *
 */
public class TestScannerClavier {
	
	public static void main(String[] args) {
		int n;
		System.out.println("Entrer un entier ?");
		// Attente de saisie utilisateur
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		// Affiche : 
		// Le nombre que vous avez renseigné est (n)
		System.out.println("Le nombre que vous avez renseigné est " + n);
		
		// Je ferme le scanner
		sc.close();
	}
}
