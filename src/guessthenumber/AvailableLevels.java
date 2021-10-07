package guessthenumber;

import java.util.ArrayList;
import java.util.List;

public class AvailableLevels {
		
	static LevelDefinition easyLevel = new LevelDefinition("1", 5);
	static LevelDefinition moderateLevel = new LevelDefinition("2",10);
	static LevelDefinition hardLevel = new LevelDefinition("3",100);

	public static List<LevelDefinition> availableLevels = new ArrayList<LevelDefinition>() ;
	
	public static void setAvailableLevels() {		
		availableLevels.add(easyLevel);
		availableLevels.add(moderateLevel);
		availableLevels.add(hardLevel);
	}
	
	public static List<LevelDefinition> getAvailaLevels() {
		return availableLevels;
	}
	}

	