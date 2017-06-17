package fr.marseille.formation.initiation.Entity;

public class Manager extends Employe {
	public Manager (String pNom, String pPrenom, int pId) {
		super(pNom, pPrenom, pId);
	}
		
	public Manager (String pNom, String pPrenom) {
		// Surcharge de constructeur
		this (pNom, pPrenom, 0);
	}
	
	public Manager () {
		// Surcharge de constructeur
		this ("durant", "richard", 0);
	}
	
	public void demanderFormation(String dateDebut, String dateFin) {
		super.demanderFormation (dateDebut, dateFin);
		// Pas nécessaire car déjà dans la classe parente Employe
		// System.out.println("Monsieur " + getPrenom() + " " + getNom() + " pose une formation du " + dateDebut + " au " +dateFin);
		System.out.println("Etant manager, il valide ses propres formations");
	}
}
