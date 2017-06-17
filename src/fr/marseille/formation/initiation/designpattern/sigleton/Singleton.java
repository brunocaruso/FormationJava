package fr.marseille.formation.initiation.designpattern.sigleton;

public class Singleton {
	private static Singleton INSTANCE = null;
	public static Integer nombre = 0;
	
	/**
	 * La pr�sence d'un constructeur priv� supprime
	 * le constructeur public par d�faut.
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
	
	// La m�thode getNombre doit aussi �tre en statique
	// comme l'attribut nombre
	// car c'est propre � cette classe
	public static void getNombre() {
		System.out.println("Nombre est " + nombre);
	}
}
