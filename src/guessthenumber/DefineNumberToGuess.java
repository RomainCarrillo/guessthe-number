
package guessthenumber;

/**
 * <b>Défini un nombre aléatoire compris dans l'interval</b>
 * 
 * 
 * 
 * @author RomainCarrillo
 * @version 1.1
 */

public class DefineNumberToGuess {
	/**
	 * @param maxInterval  Le nombre founi par le joueur comme limite haute de
	 *                     l'interval
	 * @param miniInterval Le nombre founi par le joueur comme limite basse de
	 *                     l'interval Il est forcément inférieur à la limite
	 *                     maximale @see
	 *                     <a href="DefineMiniInterval">DefineMiniInterval</a>
	 * 
	 * @return numberToGuess Un nombre entier compris dans l'interval
	 */

	public static int defineNumber(int maxInterval, int miniInterval) {
		/*
		 * Déifnition du nombre aléatoire : On utilise la méthode Math.random() qui
		 * retourne un double supérieur ou égal à 0 et inférieur à 1 On calcule la
		 * différence entre les deux limites de l'interval pour avoir un chiffre compris
		 * entre 0 et la taille de l'interval On ajoute 1 à cette différence, ce qui
		 * permettra d'inclure la limite haute dans les valeurs potentielles On
		 * multiplie cette différence+1 avec la valeur retournée par Math.random() pour
		 * avoir une valeur comprise entre 0 et la taille de l'interval+1 On utilise le
		 * cast sur le résultat afin de l'interpréter comme un int. Permet au passage de
		 * supprimer les décimales On ajouter la limite basse de l'interval afin
		 * d'obtenir un résultat compris dans l'interval
		 */
		int numberToGuess = miniInterval + (int) (Math.random() * ((maxInterval - miniInterval) + 1));
		return numberToGuess;
	}
}
