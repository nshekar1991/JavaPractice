package javaCollections;

import java.util.ArrayList;

//public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrayListExample();

	}

      public static void arrayListExample() {
    	  
    	  ArrayList<String> indianPlayers = new ArrayList<>();
    	  indianPlayers.add("Chahal");
    	  indianPlayers.add("Rohith Sharma");
    	  indianPlayers.add("Virat Kolhi");
    	  indianPlayers.add("Ishanth Sharma");
    	  
    	  
    	  ArrayList<String> reservedIndianPlayers = new ArrayList<>();
    	  reservedIndianPlayers.add("Siraj");
    	  reservedIndianPlayers.add("Dhawan");
    	  reservedIndianPlayers.add("Kuldeep");
    	  
    	  
    	  ArrayList<String> bowler = new ArrayList<>();
    	  bowler.add("Shami");
    	  bowler.add("Ashwin");
    	  bowler.add("Jadeja");
    	  
    	  
    	  reservedIndianPlayers.addAll(bowler);
    	  System.out.println(reservedIndianPlayers);
    	  System.out.println(indianPlayers.addAll(reservedIndianPlayers));
    	  System.out.println(indianPlayers);
    	  System.out.println(indianPlayers.removeAll(bowler));
    	  
    	  indianPlayers.add(0, "Pujara");
          System.out.println(indianPlayers.contains("Bumrah")); 	  
          System.out.println(indianPlayers.get(3));
    	  System.out.println(indianPlayers.isEmpty());
    	  System.out.println(indianPlayers.remove(2));
    	  System.out.println(indianPlayers.remove("Saha"));
    	  
    	  
          System.out.println("Before clear: "+indianPlayers.size());
    	  System.out.println("Before clear: "+indianPlayers);
    	  
		
	}	
	
	
	
	
	
	
	
	
	
}
