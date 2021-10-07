package guessthenumber;

/**
 * <b>Définie la limite basse de l'interval</b>
 * 
 * Demande au joueur de saisir une valeur comme limite basse. 
 * Vérifie que la valeur proposée est bien inférieure à la limite haute.
 * 
 * @author RomainCarrillo
 *
 */

public class DefineMiniInterval {
	/**
	 * 
	 * @param maxInteval
	 * 	La valeur saisie par le joueur comme limite haute pour l'interval
	 * @return
	 * 	La valeur saisie pour la limite basse
	 */
	public static int defineMiniInterval(int maxInteval) {
		System.out.println("Entrez le minimum autorisé :");
		int miniInterval = AskForNumber.askForNumber();		
		while (miniInterval >= maxInteval) {
			System.out.println("Le minimum doit être inférieur au maximum");
			System.out.println("Entrez le minimum autorisé :");
			miniInterval = AskForNumber.askForNumber();
		}
		return miniInterval; 
	}
}