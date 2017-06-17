package fr.marseille.formation.initiation.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class MaListe {
	public static void main(String[] args) {
		ArrayList listeDonnee = new ArrayList();
		listeDonnee.add(22); // Int
		listeDonnee.add("Je suis Développeur Java"); //String
		listeDonnee.add (22.04f); // Float
		listeDonnee.add ('d'); // Caractère
		
		for (int i = 0 ; i < listeDonnee.size() ; i++) {
			System.out.println("Donnée Indice " + i + " = " + listeDonnee.get(i));
		}
		
		// Affiche :
		// Donnée Indice 0 = 22
		// Donnée Indice 1 = Je suis Développeur Java
		// Donnée Indice 2 = 22.04
		// Donnée Indice 3 = d
		
		// Supprime l'indice [2]
		System.out.println("Je supprime l'élement d'indice 2" + listeDonnee.remove(2));
		System.out.println("Maintenant l'élement d'indice 2 est : " + listeDonnee.get(2));
		// Affiche : 
		// Je supprime l'élement d'indice 222.04
		// Maintenant l'élement d'indice 2 est : d (l'ancien [3])	

		// contains()
		System.out.println("Est-ce que la liste contient d ? : " + listeDonnee.contains('d'));
		System.out.println("Est-ce que la liste contient \"maison\" ? : " + listeDonnee.contains("maison"));
		System.out.println("Est-ce que la liste contient \"Je suis Développeur Java\" ? : " + 
		listeDonnee.contains("Je suis Développeur Java"));
		// Affiche : 
		// Est-ce que la liste contient d ? : true
		// Est-ce que la liste contient "maison" ? : false
		// Est-ce que la liste contient "Je suis Développeur Java" ? : true
		
		//MAP => HashTable
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1,  "printemps");
		ht.put(10, "été");
		ht.put(12,  "automne");
		ht.put(45,  "hiver");
		
		Enumeration<String> e = ht.elements();
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}		
		// Affiche :
		// été
		// hiver
		// automne
		// printemps
	}
}
