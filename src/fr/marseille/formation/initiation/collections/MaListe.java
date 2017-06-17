package fr.marseille.formation.initiation.collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class MaListe {
	public static void main(String[] args) {
		ArrayList listeDonnee = new ArrayList();
		listeDonnee.add(22); // Int
		listeDonnee.add("Je suis D�veloppeur Java"); //String
		listeDonnee.add (22.04f); // Float
		listeDonnee.add ('d'); // Caract�re
		
		for (int i = 0 ; i < listeDonnee.size() ; i++) {
			System.out.println("Donn�e Indice " + i + " = " + listeDonnee.get(i));
		}
		
		// Affiche :
		// Donn�e Indice 0 = 22
		// Donn�e Indice 1 = Je suis D�veloppeur Java
		// Donn�e Indice 2 = 22.04
		// Donn�e Indice 3 = d
		
		// Supprime l'indice [2]
		System.out.println("Je supprime l'�lement d'indice 2" + listeDonnee.remove(2));
		System.out.println("Maintenant l'�lement d'indice 2 est : " + listeDonnee.get(2));
		// Affiche : 
		// Je supprime l'�lement d'indice 222.04
		// Maintenant l'�lement d'indice 2 est : d (l'ancien [3])	

		// contains()
		System.out.println("Est-ce que la liste contient d ? : " + listeDonnee.contains('d'));
		System.out.println("Est-ce que la liste contient \"maison\" ? : " + listeDonnee.contains("maison"));
		System.out.println("Est-ce que la liste contient \"Je suis D�veloppeur Java\" ? : " + 
		listeDonnee.contains("Je suis D�veloppeur Java"));
		// Affiche : 
		// Est-ce que la liste contient d ? : true
		// Est-ce que la liste contient "maison" ? : false
		// Est-ce que la liste contient "Je suis D�veloppeur Java" ? : true
		
		//MAP => HashTable
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1,  "printemps");
		ht.put(10, "�t�");
		ht.put(12,  "automne");
		ht.put(45,  "hiver");
		
		Enumeration<String> e = ht.elements();
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}		
		// Affiche :
		// �t�
		// hiver
		// automne
		// printemps
	}
}
