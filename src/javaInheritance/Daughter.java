package javaInheritance;

public class Daughter extends Father{

	int cash = 600000;
	
	public Daughter(String cars, String jewelleries){
		System.out.println("This property "+cars+" and "+jewelleries+" belongs to daughter");
	}
	
		
	public static void bunglow() {
		System.out.println("This bunglow belongs to Daughter");
		
	}	
	
	
}
