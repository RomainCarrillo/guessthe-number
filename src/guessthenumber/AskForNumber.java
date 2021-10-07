
package guessthenumber;

import java.util.Scanner;
/**
 * <b>Classe utilis�e pour communiquer avec l'utilisateur via la console</b>
 * 
 * Cette classe v�rifie gr�ce � une expression r�guli�re si la saise de l'utilisateur est bien un chiffre.
 * Sinon on propose � nouveau de saisir un chiffre.
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
			String userInput;
			do {
				Scanner scanner = new Scanner(System.in);
				 userInput = scanner.next();
				 checkIfNumber = userInput.matches("\\d*");
				 if (! checkIfNumber) {
					 System.out.println("Merci de saisir un nombre en chiffres, sup�rieur ou �gale � 0");
				 }
			} while (! checkIfNumber);
			int number = Integer.parseInt(userInput);
			return number;
	}
}
