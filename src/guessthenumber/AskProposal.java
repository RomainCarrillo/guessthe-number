package guessthenumber;

/**
 * 
 * <b>Demande au joueur de faire une proposition et compare celle-ci au nombre à deviner</b>
 * 
 * @author RomainCarrillo
 * @version 1.1
 */

public class AskProposal {
	/**
	 * @param numberToGuess
	 * 	Le nombre aléatoire défini @see <a href="DefineNumberToGuess">DefineNumberToGuess</a>
	 */
	public static void askProposal(int numberToGuess) {
		System.out.println("Proposez un chiffre :");
		int proposal = AskForNumber.askForNumber();
		AttemptsCounter.countAttempts();
		if (CompareNumbers.compareNumbers(numberToGuess, proposal)) {
			System.out.println("Gagné la réponse est " + proposal + " !");
		} else {
			askProposal(numberToGuess);
		}
	}
}