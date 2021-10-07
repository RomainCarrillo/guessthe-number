
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
 * @version 2.1
 *
 */

public class GuessTheNumber {
	/**
	 * 
	 * @param arg Non utilisé
	 */
	public static void main(String[] arg) {
		
		LevelDefinition selectedLevel;
		
		AvailableLevels.setAvailableLevels();
		
		selectedLevel = SelectDifficulty.selectDifficulty();
		// TODO afficher l'interval
		selectedLevel.getIntervalInfos();
		int numberToGuess = DefineNumberToGuess.defineNumber(selectedLevel.getMaxInterval(), selectedLevel.getMiniInterval());
		AskProposal.askProposal(numberToGuess);
		AttemptsCounter.getAttempsNumber();
	}
}