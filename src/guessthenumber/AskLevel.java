package guessthenumber;

import java.util.Scanner;

public class AskLevel {
	
	private static String userInput;
	
	public static String askLevel() {
		//TODO Remplacer le message par une variable contenant les ID de chaque objet de type LevelDefinition
		System.out.println("Choisissez votre niveau de difficulté (1/2/3) ou choisissez un interval personnalisé (P):");
		Scanner scanner = new Scanner(System.in);
		userInput = scanner.next();
		return userInput;
	}

	
	public static boolean checkIfLevelSet(String input) {
		boolean levelIsSet = false;
		for (LevelDefinition level : AvailableLevels.getAvailaLevels()) {
			if (input.equals(level.levelID)) {
				levelIsSet = true;
			}
		}
		return levelIsSet;
	}


}
