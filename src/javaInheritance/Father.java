package javaInheritance;

public class Father extends GrandFather{

	int stocks = 150000;
	String jewelleries = "Diamond";
	
	
	public Father(){
		System.out.println("This property belongs to Father");
	}
	
	
	public static void hotels() {
		System.out.println("This hotel belongs to Father");
	}
	
	public static void cars() {
		System.out.println("This BMW car belongs to Father");
		System.out.println("This Swift car belongs to Father");
	
	}
	
	public static void name() {
		System.out.println("This bunglowbelongs to Father");
	}
	
}
