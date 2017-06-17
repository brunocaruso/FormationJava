package fr.marseille.formation.initiation.Entity;

public class CompteCourant {
	public int nbComptesCourants = 3000;
	public int numero;
	public String intitule;
	public double solde;
	public double montantDecouvertAutorise;
	
	public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
		this();
	}
		
	public CompteCourant() {
		super();
		this.nbComptesCourants++;
	}

	public int getNbComptesCourants() {
		return nbComptesCourants;
	}

	public void setNbComptesCourants(int nbComptesCourants) {
		this.nbComptesCourants = nbComptesCourants;
	}
	
	
}
