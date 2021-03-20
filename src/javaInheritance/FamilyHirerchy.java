package javaInheritance;

public class FamilyHirerchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		familyBusiness();
		
		
	}
 
    public static void familyBusiness() {
		
    	GrandFather grandFather = new GrandFather();
    	grandFather.cars();
    	grandFather.resort();
    	System.out.println(grandFather.jewelleries);
    	System.out.println(grandFather.money);
    	
    	Father father = new Father();
    	Son son = new Son("Audi", "Cognizant");
    	son.hotels();
    	son.cars();
    	System.out.println(son.cash);
    	System.out.println(son.jewelleries);
    	Daughter daughter = new Daughter("Jeep", "Diamonds");
	}






}


