
package guessthenumber;

/**
 * <b>Petit jeu visant à deviner un nombre dans un interval.</b>
 *
 * Le programme se déroule en 5 étapes :
 * <ul>
 * <li>On demande au joueur la limie haute de l'interval</li>
 * <li>On demande au joueur la limite basse de l'interval @see <a href="DefineMiniInterval">DefineMiniInterval</a></li>
 * <li>Ces valeurs sont utilisées pour définir un nombre aléatoire compris en le maximum et le minimum @see <a href="DefineNumberToGuess">DefineNumberToGuess</a></li>
 * <li>On demande au joueur de proposer un chiffre @see <a href="AskProposal">AskProposal</a></li>
 * <li>On compare la proposition du joueur au chiffre à deviner @see <a href="CompareNumbers">CompareNumbers</a></li>
 * <li>Si le chiffre proposé est le bon, on lui affiche un message de succès.
 * Sinon on lui indique si le chiffre est inférieur ou supérieur, et on lui demande un nouveau chiffre. </li>
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
	 * @param arg Non utilisé
	 */
	public static void main(String[] arg) {
		System.out.println("Entrez le maximum autorisé :");
		int maxInterval = AskForNumber.askForNumber();
		int miniInterval = DefineMiniInterval.defineMiniInterval(maxInterval);
		int numberToGuess = DefineNumberToGuess.defineNumber(maxInterval, miniInterval);
		AskProposal.askProposal(numberToGuess);
		AttemptsCounter.getAttempsNumber();
	}
}