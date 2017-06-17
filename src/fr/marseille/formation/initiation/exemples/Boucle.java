package fr.marseille.formation.initiation.exemples;

import java.util.ArrayList;

public class Boucle {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
			
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
