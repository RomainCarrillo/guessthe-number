package guessthenumber;

/**
 * <b>Modèle pour définir un niveau de difficulté</b>
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
	
	//TODO Créer méthode public static int getMaxInterval() {} 
	public int getMaxInterval() {
		return maxInterval;
	}
	//TODO Créer méthode public static int getMiniInterval() {} 
	public int getMiniInterval() {
		return miniInterval;
	}
	//TODO Créer méthode public static String getIntervalInfos() {}
	public void getIntervalInfos() {
		System.out.println("Le chiffre est compris entre " + miniInterval + " et " + maxInterval);
	}
}
