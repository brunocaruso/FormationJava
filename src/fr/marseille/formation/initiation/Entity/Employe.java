package fr.marseille.formation.initiation.Entity;

public class Employe extends Personne {	
	int Id;
	String prenom;
	String nom;
	
	public Employe (String pNom, String pPrenom, int pId) {
		prenom = pPrenom;
		nom = pNom;
		Id = pId;
	}
	
	public Employe (String pNom, String pPrenom) {
		// Surcharge avec le mot clé this
		this ( pNom, pPrenom, 0);
	}
	
	public Employe (String pNom) {
		// Surcharge avec le mot clé this
		this (pNom, "Default", 0);
	}
	
	public Employe () {
		// Surcharge avec le mot clé this
		this ("Default", "Default", 0);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public void demanderFormation(String dateDebut, String dateFin) {
		System.out.println("Monsieur " + getPrenom() + " " + getNom() + " pose une formation du " +
				dateDebut + " au " +dateFin);
	}
	
	public String toString() {
		return "Employé : " + Id + ", " + prenom + ", " + nom;
	}
}
