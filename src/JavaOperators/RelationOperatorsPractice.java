package JavaOperators;

public class RelationOperatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		relationalOperators(56.76,179.56 );
		
		
	}

	    public static void relationalOperators(double num1, double num2) {
	    	boolean result = num1 == num2;
	    	System.out.println("The result of two number eqaul to " +result);
	    	result = num1 != num2;
	    	System.out.println("The result of two number not equal to " +result);
	        result = num1 > num2;
	        System.out.println("The result of two greater than " +result);
	        result = num1 < num2;
	        System.out.println("The result of two lesser than " +result);
	        result = num1 >= num2;
	        System.out.println("The result of two greater than or equal to " +result);
	        result = num1 <= num2;
	        System.out.println("The result of two lesser than or equal to " +result);
	        
	    
	    
	    
	    
	    
	    
	    
	    }
	    
	    
	
	
}
