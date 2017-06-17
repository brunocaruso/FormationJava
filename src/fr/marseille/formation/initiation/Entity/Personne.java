package fr.marseille.formation.initiation.Entity;

public class Personne {
	public String prenom;
	public String nom;
	public int anneeNaissance;
	public String metier;
	
	public Personne (String prenom, String nom, int anneNaissance, String metier) {
	}
		
	public Personne () { }
	
	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", anneeNaissance=" + anneeNaissance + ", metier="
				+ metier + "]";
	}

	public static void main(String[] args) {
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	
}
