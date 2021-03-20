package javaEncapsulation;

public class CricketPlayers {

	
	private String batsman = "Virat Kohli";
	
	private String bowler = "Bumrah";
	
	private String allrounder = "Jadeja";
	
	private int runsScored = 8000;
	
	private int wickets = 270;
	
	private int catches = 60;
	
	String team = "India";
	
	int testranking = 2;

	public String getBatsman() {
		return batsman;
	}

	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}

	public String getBowler() {
		return bowler;
	}

	public void setBowler(String bowler) {
		this.bowler = bowler;
	}

	public String getAllrounder() {
		return allrounder;
	}

	public void setAllrounder(String allrounder) {
		this.allrounder = allrounder;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getCatches() {
		return catches;
	}

	public void setCatches(int catches) {
		this.catches = catches;
	}

}