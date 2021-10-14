package guessthenumber;
/**
 * <b>Modèle pour définir un niveau personnalisé</b>
 * 
 * @author RomainCarrillo
 */

public class SetCustomLevel {
	
	public static LevelDefinition setCustomLevel() {
		LevelDefinition customLevel = new LevelDefinition("P");
		customLevel.setMaxInterval();
		return customLevel;
	}
	
}
