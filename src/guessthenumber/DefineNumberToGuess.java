
package guessthenumber;

/**
 * <b>D�fini un nombre al�atoire compris dans l'interval</b>
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
	 *                     l'interval Il est forc�ment inf�rieur � la limite
	 *                     maximale @see
	 *                     <a href="DefineMiniInterval">DefineMiniInterval</a>
	 * 
	 * @return numberToGuess Un nombre entier compris dans l'interval
	 */

	public static int defineNumber(int maxInterval, int miniInterval) {
		/*
		 * D�ifnition du nombre al�atoire : On utilise la m�thode Math.random() qui
		 * retourne un double sup�rieur ou �gal � 0 et inf�rieur � 1 On calcule la
		 * diff�rence entre les deux limites de l'interval pour avoir un chiffre compris
		 * entre 0 et la taille de l'interval On ajoute 1 � cette diff�rence, ce qui
		 * permettra d'inclure la limite haute dans les valeurs potentielles On
		 * multiplie cette diff�rence+1 avec la valeur retourn�e par Math.random() pour
		 * avoir une valeur comprise entre 0 et la taille de l'interval+1 On utilise le
		 * cast sur le r�sultat afin de l'interpr�ter comme un int. Permet au passage de
		 * supprimer les d�cimales On ajouter la limite basse de l'interval afin
		 * d'obtenir un r�sultat compris dans l'interval
		 */
		int numberToGuess = miniInterval + (int) (Math.random() * ((maxInterval - miniInterval) + 1));
		return numberToGuess;
	}
}
