package fr.marseille.formation.initiation.exemples;

import fr.marseille.formation.initiation.Entity.CompteCourant;

public class LancementCompteCourant {
	public static void main(String[] args) {
		CompteCourant monCompteCourant = new CompteCourant();
		System.out.println("Nb de Comptes Courants : " + monCompteCourant.nbComptesCourants);
	}
}
