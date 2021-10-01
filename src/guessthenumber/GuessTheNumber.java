
package guessthenumber;

/**
 * <b>Petit jeu visant � deviner un nombre dans un interval.</b>
 *
 * Le programme se d�roule en 5 �tapes :
 * <ul>
 * <li>On demande au joueur la limie haute de l'interval</li>
 * <li>On demande au joueur la limite basse de l'interval @see <a href="DefineMiniInterval">DefineMiniInterval</a></li>
 * <li>Ces valeurs sont utilis�es pour d�finir un nombre al�atoire compris en le maximum et le minimum @see <a href="DefineNumberToGuess">DefineNumberToGuess</a></li>
 * <li>On demande au joueur de proposer un chiffre @see <a href="AskProposal">AskProposal</a></li>
 * <li>On compare la proposition du joueur au chiffre � deviner @see <a href="CompareNumbers">CompareNumbers</a></li>
 * <li>Si le chiffre propos� est le bon, on lui affiche un message de succ�s.
 * Sinon on lui indique si le chiffre est inf�rieur ou sup�rieur, et on lui demande un nouveau chiffre. </li>
 * </ul>
 *
 * 
 * 
 * @author RomainCarrillo
 * @version 1.1git sat
 *
 */

public class GuessTheNumber {
	/**
	 * 
	 * @param arg Non utilis�
	 */
	public static void main(String[] arg) {
		System.out.println("Entrez le maximum autoris� :");
		int maxInterval = AskForNumber.askForNumber();
		int miniInterval = DefineMiniInterval.defineMiniInterval(maxInterval);
		int numberToGuess = DefineNumberToGuess.defineNumber(maxInterval, miniInterval);
		AskProposal.askProposal(numberToGuess);
		AttemptsCounter.getAttempsNumber();
	}
}