package JavaOperators;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculator(38,12);
		
		
	}

	
	  public static void calculator(int num1, int num2) {
		  
		  
		  int sum = num1 + num2;
		  int diff = num1 - num2;
		  int prod = num1 * num2;
		  int divide = num1/num2;
		  int mod = num1 % num2;
		  System.out.println("The Sum of Two Numbers are: "+sum);
		  System.out.println("The Difference of Two Numbers are: "+diff);
		  System.out.println("The Product of Two Numbers are: "+prod);
		  System.out.println("The Quotient of Two Numbers are: "+divide);
		  System.out.println("The Reminder of Two Numbers are: "+mod);
		    num1++;
		  System.out.println("The Increment of Two Numbers are: "+num1++);  
		    num2--;
		  System.out.println("The Decrement of Two Numbers are: "+num2--);
	  
	  }
	  
	  
	  
	
	
	
	
	
}
