
package guessthenumber;

import java.util.Scanner;
/**
 * <b>Classe utilisée pour communiquer avec l'utilisateur via la console</b>
 * 
 * Cette classe vérifie grâce à une expression régulière si la saise de l'utilisateur est bien un chiffre.
 * Sinon on propose à nouveau de saisir un chiffre.
 * 
 * @author RomainCarrillo
 * @version 1.1
 */
public class AskForNumber {
	/**
	 * 
	 * @return number 
	 * 	Le nombre saisi par le joueur
	 */
	public static int askForNumber() {			
			boolean checkIfNumber;
			String saisie;
			do {
				Scanner scanner = new Scanner(System.in);
				 saisie = scanner.next();
				 checkIfNumber = saisie.matches("\\d*");
				 if (! checkIfNumber) {
					 System.out.println("Merci de saisir un nombre en chiffres, supérieur ou égale à 0");
				 }
			} while (! checkIfNumber);
			int number = Integer.parseInt(saisie);
			return number;
	}
}
