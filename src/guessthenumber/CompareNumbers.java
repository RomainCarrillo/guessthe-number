package guessthenumber;
/**
 * <b>Compare la proposition du joueur avec le chiffre à deviner</b>
 * 
 * Le cas échéant, indique au joueur si le chiffre à deviner est plus petit ou plus grand.
 * 
 * @author RomainCarrillo
 *
 */
public class CompareNumbers {
	/**
	 * 
	 * @param numberToGuess 
	 * 	Le nombre à deviner @see <a href="DefineNumberToGuess">DefineNumberToGuess</a>
	 * @param proposal
	 * 	Le chiffre proposer par le joueur @see <a href="AskProposal">AskProposal</a>
	 * @return 
	 * 	Retourne false si les deux valeurs sont différentes et true si elles sont égales
	 */
	public static boolean compareNumbers(int numberToGuess, int proposal) {
		if (numberToGuess > proposal ) {
			System.out.println("C'est plus !");
			return false;
		} if ( numberToGuess < proposal) {
			System.out.println("C'est moins !");
			return false;
		} else {
			return true;
		}
	}
}
