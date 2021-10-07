package guessthenumber;

/**
 * <b>Permet au joueur de sélectionner un niveau prédéfini ou un interval
 * personnalisé</b>
 * 
 * @author RomainCarrillo
 * @version 1.1
 */
public class SelectDifficulty {

	private static String userInput;
	private static LevelDefinition selectedLevel;
	
	public static LevelDefinition selectDifficulty() {
		userInput = AskLevel.askLevel();
		
		//TODO Remplacer "P" par une variable
		if (userInput.equalsIgnoreCase("P")) {
			int maxInterval = AskForNumber.askForNumber();
			LevelDefinition personnalLevel = new LevelDefinition("P", maxInterval);
			selectedLevel = personnalLevel;
		} else if (AskLevel.checkIfLevelSet(userInput)) {
			for (LevelDefinition level : AvailableLevels.availableLevels) {
				if (userInput.equals(level.levelID)) {
					selectedLevel = level;
				}
			}
		} else {
			AskLevel.askLevel();
		}
		return selectedLevel;
	}

	public LevelDefinition getSelectedLevel() {
		return selectedLevel;
	}

}


