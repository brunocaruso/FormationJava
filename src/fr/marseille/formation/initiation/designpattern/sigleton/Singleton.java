package fr.marseille.formation.initiation.designpattern.sigleton;

public class Singleton {
	private static Singleton INSTANCE = null;
	public static Integer nombre = 0;
	
	/**
	 * La présence d'un constructeur privé supprime
	 * le constructeur public par défaut.
	 */
	private Singleton() {
		nombre++;
	}
	
	public synchronized static Singleton getInstance() {
		if ( INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
	
	// La méthode getNombre doit aussi être en statique
	// comme l'attribut nombre
	// car c'est propre à cette classe
	public static void getNombre() {
		System.out.println("Nombre est " + nombre);
	}
}
