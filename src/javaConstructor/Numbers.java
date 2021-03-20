package javaConstructor;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   overallNumbersList();
		
	}

	    public static void overallNumbersList() {
	    	EvenNumbers evenNum = new EvenNumbers();
	    	evenNum.evenNumbersList();
	    	OddNumbers oddNum = new OddNumbers();
	    	oddNum.oddNumbersList();	  
	    	OddNumbers oddNum1 = new OddNumbers(23,35,"Odd");
	    	EvenNumbers evenNum1 = new EvenNumbers(24,68,"Even");
	    	
	    	
	    	
	    }
	
	
}
