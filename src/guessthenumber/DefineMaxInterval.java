package guessthenumber;

/**
 * <b>D�finie la limite haute de l'interval</b>
 * 
 * Demande au joueur de saisir une valeur comme limite haute. 
 * V�rifie que la valeur propos�e est bien sup�rieure ou �gale � 1.
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
		System.out.println("Entrez le maximum autoris� :");
		int maxInterval = AskForNumber.askForNumber();		
		while (maxInterval <= 0) {
			System.out.println("Le minimum doit �tre sup�rieur ou �gal � 1");
			System.out.println("Entrez le maximum autoris� :");
			maxInterval = AskForNumber.askForNumber();
		}
		return maxInterval; 
	}
}