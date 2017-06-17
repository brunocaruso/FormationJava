package fr.marseille.formation.initiation.designpattern.sigleton;

public class RunTimeSingleton {
	public static void main (String[] args) {
		// On ne peut pas acc�der au constructeur de Singleton car c'est en private
		// On passe donc par l'accesseur getInstance
		Singleton instance = Singleton.getInstance();
		instance.getNombre(); 
		// Fait une incr�mentation de nombre
		// Affiche : Nombre est 1
		
		Singleton instance2 = Singleton.getInstance();
		instance2.getNombre(); 
		// Ne fait pas d'incr�mentation de nombre
		// Affiche : Nombre est 1
	}
}
