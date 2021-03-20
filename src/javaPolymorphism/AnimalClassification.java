package javaPolymorphism;

public class AnimalClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       animalClassification();
	}

	
	public static void animalClassification() {
		
		
		Animal animal = new Animal(); //Animal object
			Animal tiger = new Tiger();
		    Animal wolf = new Wolf();
		    Tiger tiger1 = new Tiger();
		    Wolf wolf1 = new Wolf();
		    
		    animal.animalname();
		    tiger.animalname();
		    wolf.animalname();
		    tiger1.roar();
		    wolf1.howl();
		    
		
	}
	
	
}
