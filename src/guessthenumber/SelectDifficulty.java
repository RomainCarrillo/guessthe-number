package guessthenumber;


/**
 * <b>Permet au joueur de sélectionner un niveau prédéfini ou un interval personnalisé</b>
 * 
 * @author RomainCarrillo
 */
public class SelectDifficulty {

	private static String userInput;
	private static LevelDefinition selectedLevel;
	
	public static LevelDefinition selectDifficulty() {
		userInput = AskLevel.askLevel();
		if (AskLevel.checkIfCustomLevel()) {
			LevelDefinition customLevel = SetCustomLevel.setCustomLevel();
			selectedLevel = customLevel;
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


