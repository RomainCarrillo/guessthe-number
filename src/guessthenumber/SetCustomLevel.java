package guessthenumber;
/**
 * <b>Mod�le pour d�finir un niveau personnalis�</b>
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
