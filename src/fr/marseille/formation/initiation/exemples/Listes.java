package fr.marseille.formation.initiation.exemples;

import java.util.LinkedList;

public class Listes {
	public static void main(String[] args) {
		// listString
		LinkedList<String> listString = new LinkedList<>();
		// <> veut dire que la liste doit-être typée (notation depuis JDK 1.7)
		
		// Evolution de la notation :
		// LinkedList<String> listString2 = new LinkedList<String>(); // Notation 1.5+
		// LinkedList listString3 = new LinkedList(); // Notation avant 1.5
		
		LinkedList<Object> l = new LinkedList<>();
		l.add(12);
		l.add("toto !");
		l.add(12.20f);
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println("Element à l'index " + i + " = " + l.get(i));
		}
		// Affiche :
		// Element à l'index 0 = 12
		// Element à l'index 1 = toto !
		// Element à l'index 2 = 12.2		
	}
}
