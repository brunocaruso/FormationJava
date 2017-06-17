package fr.marseille.formation.initiation.exemples;

import java.util.Scanner;

public class TestScannerClavier {
	
	public static void main(String[] args) {
		int n;
		System.out.println("Entrer un entier ?");
		// Attente de saisie utilisateur
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Le nombre que vous avez renseigné est " + n);
		// Affiche : Le nombre que vous avez renseigné est (n)
	}
	
	
	

}
