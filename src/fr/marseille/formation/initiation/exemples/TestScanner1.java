package fr.marseille.formation.initiation.exemples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner1 {
	
	public static void main(String[] args)  {
	
		// On pr�cise le chemin complet o� se situe le fichier
		File file = new File ("src/fr/marseille/formation/initiation/exemples/fichier.txt");
		
		try {
			Scanner sc = new Scanner(file);
			
			// Pour parcourir un fichier
			// Affiche le fichier ligne par ligne
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Impossible de lire le fichier : " + e.getMessage());
			// Affiche Impossible de lire le fichier : fichier.txt (Le fichier sp�cifi� est introuvable)
		}
		
	}
}
