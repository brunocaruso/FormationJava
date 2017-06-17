package fr.marseille.formation.initiation.exemples;

import fr.marseille.formation.initiation.Entity.Employe;
import fr.marseille.formation.initiation.Entity.Manager;

public class ExempleManager {
	 public static void main(String[] args) {
		Manager manager1 = new Manager();		
		manager1.setId(1);
		manager1.setPrenom("Bruno");
		manager1.setNom("CARUSO");
		manager1.demanderFormation("31/05/2017", "25/08/2017");
		// Affiche :
		// Monsieur Bruno CARUSO pose une formation du 31/05/2017 au 25/08/2017
		// Etant manager, il valide ses propres formations
		
		System.out.println(manager1);
		// Grâce à la méthode toString() de la classe parente (Employe)
		// Affiche : 
		// Employé : 1, Bruno, CARUSO
		
		Employe employe1 = new Employe();
		employe1.setId(2);
		employe1.setPrenom("Mario");
		employe1.setNom("BROSSE");
		employe1.demanderFormation("3/8/2017", "3/11/2017");	
		// Affiche :
		// Monsieur Mario BROSSE pose une formation du 3/8/2017 au 3/11/2017
		System.out.println(employe1);
		// Affiche :
		// Employé : 2, Mario, BROSSE
	}
}
