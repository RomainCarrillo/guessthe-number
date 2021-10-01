package guessthenumber;

public class AttemptsCounter {
	private static int attemptsNumber;
	private static String message = "Nombre d'essais : ";
	
	public static void countAttempts() {
		attemptsNumber++;
	}
	
	public static void getAttempsNumber() {
		System.out.println(message + attemptsNumber);
	}
}
