package fr.marseille.formation.initiation.Entity;

public class DemandeFormation {	
	String dateDebut;
	String dateDemande;
	String dateFin;
	String etatValidation;
	final static String REFUS = "Refusé";	
	final static String ACCORDE = "Accordé";
	final static String ATTENTE = "En attente";
	
	public DemandeFormation (String pDateDebut, String pDateFin, String pEtatValidation) {
		dateDebut = pDateDebut;
		dateFin = pDateFin;
		etatValidation = pEtatValidation;
	}
	
	public DemandeFormation (String pDateDebut, String pDateFin) {
		// Surcharge du constructeur
		this (pDateDebut, pDateFin, DemandeFormation.ATTENTE);
	}
	
	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getEtatValidation() {
		return etatValidation;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

	@Override
	public String toString() {
		return "DemandeFormation [dateDebut=" + dateDebut + ", dateDemande=" + dateDemande + ", dateFin=" + dateFin
				+ ", etatValidation=" + etatValidation + "]";
	}
	
	
	
}
