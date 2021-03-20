package JavaOperators;

public class LogicalOperationalPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LogicalAndRelationalOperations(34,44);

	}

	   public static void LogicalAndRelationalOperations(int num1, int num2) {
		  boolean result1 = num1 > num2;
		  boolean result2 = num1 <= num2;
		  boolean output = result1 && result2;
		  System.out.println("The output of Logical AND Operations: + output");
		  output = result1 || result2;
		  
		   
		   
		   
	   }
	 
	      
	
	
	
}
