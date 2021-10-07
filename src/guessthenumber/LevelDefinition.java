package guessthenumber;

/**
 * <b>Mod�le pour d�finir un niveau de difficult�</b>
 * 
 * @author RomainCarrillo
 * @version 1.1 
 */
public class LevelDefinition {
	public String levelID;
	private int maxInterval;
	private final int miniInterval = 0;
	
	public LevelDefinition(String levelID, int maxInterval) {
		this.levelID = levelID;
		this.maxInterval = maxInterval;
	}
	
	//TODO Cr�er m�thode public static int getMaxInterval() {} 
	public int getMaxInterval() {
		return maxInterval;
	}
	//TODO Cr�er m�thode public static int getMiniInterval() {} 
	public int getMiniInterval() {
		return miniInterval;
	}
	//TODO Cr�er m�thode public static String getIntervalInfos() {}
	public void getIntervalInfos() {
		System.out.println("Le chiffre est compris entre " + miniInterval + " et " + maxInterval);
	}
}
