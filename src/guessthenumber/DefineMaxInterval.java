package guessthenumber;

/**
 * <b>Définie la limite haute de l'interval</b>
 * 
 * Demande au joueur de saisir une valeur comme limite haute. 
 * Vérifie que la valeur proposée est bien supérieure ou égale à 1.
 * 
 * @author RomainCarrillo
 *
 */

public class DefineMaxInterval {
	/**
	 * 
	 * @param maxInteval
	 * 	La valeur saisie par le joueur comme limite haute pour l'interval
	 * @return
	 * 	La valeur saisie pour la limite haute
	 */
	public static int defineMaxInterval() {
		System.out.println("Entrez le maximum autorisé :");
		int maxInterval = AskForNumber.askForNumber();		
		while (maxInterval <= 0) {
			System.out.println("Le minimum doit être supérieur ou égal à 1");
			System.out.println("Entrez le maximum autorisé :");
			maxInterval = AskForNumber.askForNumber();
		}
		return maxInterval; 
	}
}