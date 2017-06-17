package fr.marseille.formation.initiation.exemples;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Lit le fichier conf.properties
 * @author Bruno Caruso
 *
 */
public class RunConfProperties {		
	public static void main(String[] args)  {
		Properties prop = new Properties();
		FileInputStream input = null;
		
		try  {
			// Ne pas oublier de doubler les slashs (/) et d'indiquer le bon chemin 
			// o� se situe le fichier properties
			input = new FileInputStream("src//fr//marseille//formation//config//conf.properties");
			// Je charge le fichier properties
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();	
		} finally {
			try {
				// Je r�cup�re la valeur de la property site.title
				String title = prop.getProperty("site.title");
				System.out.println("site.titre vaut : " + title );
				// Affiche : site.titre vaut : Formation Java pour les utilisateurs
				
				// Je r�cup�re la valeur de la property site.meta
				String meta = prop.getProperty("site.meta");
				// La valeur �tant en faite plusieurs valeurs s�par�es par une virgule
				// (Formation,tutoriaux,tuto,tutos,exemples,support)
				// J'isole chaque occurence s�par�e par ,
				String[] tabMeta = meta.split(",");
				
				System.out.println("================");
				System.out.println("site.meta vaut " + meta);
				System.out.println("voici les meta en d�tail :");
				
				for (String metaFinal : tabMeta) {
					System.out.println("- " + metaFinal);
				}
				
				// Affiche : 
				// ================
				// site.meta vaut Formation,tutoriaux,tuto,tutos,exemples,support
				// voici les meta en d�tail :
				// - Formation
				// - tutoriaux
				// - tuto
				// - tutos
				// - exemples
				// - support

				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

