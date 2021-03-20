package javaEncapsulation;

public class CricketAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		analysis();
		
	}

	
	public static void analysis() {
		
		CricketPlayers players = new CricketPlayers();
		System.out.println("The team is : "+players.team+"");
		System.out.println("The test ranking is : "+players.testranking);
		
		
		System.out.println("The batsman is: "+players.getBatsman());
		players.setBatsman("Rohith Sharma");
		System.out.println("The batsman is: "+players.getBatsman());
		
		
		System.out.println("The allrounder is:"+players.getAllrounder());
		players.setAllrounder("Suresh Raina");
		System.out.println("The allrounder is: "+players.getAllrounder());
		
		System.out.println("The bowler is:"+players.getBowler());
		players.setBowler("Siraj");
		System.out.println("The bowler is: "+players.getBowler());
		
		
		
	}
	
}
	
	

