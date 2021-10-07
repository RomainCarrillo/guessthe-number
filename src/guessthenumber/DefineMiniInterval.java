package guessthenumber;

/**
 * <b>D�finie la limite basse de l'interval</b>
 * 
 * Demande au joueur de saisir une valeur comme limite basse. 
 * V�rifie que la valeur propos�e est bien inf�rieure � la limite haute.
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
		System.out.println("Entrez le minimum autoris� :");
		int miniInterval = AskForNumber.askForNumber();		
		while (miniInterval >= maxInteval) {
			System.out.println("Le minimum doit �tre inf�rieur au maximum");
			System.out.println("Entrez le minimum autoris� :");
			miniInterval = AskForNumber.askForNumber();
		}
		return miniInterval; 
	}
}