package javaConstructor;

public class EvenNumbers {
	
	public EvenNumbers() {
		System.out.println("This should display all even numbers");
		
	}
	
	 public EvenNumbers(int num1, int num2, String message) {
		 System.out.println("The numbers "+num1+" and "+num2+" are "+message+"");
		 
	 }
	 public static void evenNumbersList() { 
		 int evenNumbers[] = {2,6,8,12,88};
		 for(int i=0; i<evenNumbers.length; i++) {
			System.out.println(evenNumbers[i]); 
		 }
		 
		 System.out.println("***********");
	 }
	
}
