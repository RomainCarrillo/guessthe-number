package guessthenumber;

/**
 * <b>Modèle pour définir un niveau de difficulté</b>
 * 
 * @author RomainCarrillo
 */
public class LevelDefinition {
	public String levelID;
	private int maxInterval;
	private final int miniInterval = 0;
	
	public LevelDefinition(String levelID, int maxInterval) {
		this.levelID = levelID;
		this.maxInterval = maxInterval;
	}
	public LevelDefinition(String levelID) {
		this.levelID = levelID;
	}
	
	public int getMaxInterval() {
		return maxInterval;
	}

	public int getMiniInterval() {
		return miniInterval;
	}
	
	public void getIntervalInfos() {
		System.out.println("Le chiffre est compris entre " + miniInterval + " et " + maxInterval);
	}
	
	public void setMaxInterval() {
		System.out.println("Saisissez la valeur maximale possible pour l'interval :");
		this.maxInterval = AskForNumber.askForNumber();
	}
}
