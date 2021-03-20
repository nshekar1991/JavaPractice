package javaConstructor;

public class OddNumbers {
	
	public OddNumbers() {
		System.out.println("This should display all odd numbers");
	}
	
	
	public OddNumbers(int num1, int num2, String message) {
		System.out.println("The numbers "+num1+" and "+num2+" are "+message+"");
	}
	

	public static void oddNumbersList() { 
		 int oddNumbers[] = {3,5,7,13,89};
		 for(int i=0; i<oddNumbers.length; i++) {
			 System.out.println(oddNumbers[i]); 	 
		 }
		 
		 System.out.println("***********");
		 
		 
	 }
}
