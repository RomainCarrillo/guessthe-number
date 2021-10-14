package guessthenumber;

/**
 * 
 * <b>Gestion du compteur de tentatives</b>
 * 
 * @author RomainCarrillo
 */
public class AttemptsCounter {
	private static int attemptsNumber;
	private static String message = "Nombre d'essais : ";
	
	/**
	 * Augmente la valeur de attemptsCounter à chaque appel
	 */
	public static void countAttempts() {
		attemptsNumber++;
	}
	
	/**
	 * Affiche le nombre de tentatives du joueur
	 */
	public static void getAttempsNumber() {
		System.out.println(message + attemptsNumber);
	}
}
