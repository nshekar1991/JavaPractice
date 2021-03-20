package javaStrings;

public class StringFormattingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		stringMethodsExample();

	}

	  public static void stringMethodsExample() {

		  String value = "I am learning Java Technology using Java V15";
		  String newvalue = " ";
		  
		  
		  
		  System.out.println(value.charAt(10));
		  System.out.println(value.concat(" and Selenium"));
		  System.out.println(value + " and Selenium");
		  System.out.println(value.contains("learn"));
		  System.out.println(value.endsWith("logy"));
		  System.out.println(value.equals(newvalue));
		  System.out.println(value.equalsIgnoreCase(newvalue));
		  System.out.println(value.hashCode());
		  System.out.println(newvalue.hashCode());
		  System.out.println(value.indexOf("Java"));
		  System.out.println(value.indexOf("h",14));
		  System.out.println(newvalue.isEmpty());
		  System.out.println(value.lastIndexOf("T"));
		  System.out.println(value.lastIndexOf("n",14));
		  System.out.println(value.length());
		  System.out.println(value.replace("Java", "Selenium"));
	      System.out.println(value.replaceFirst("Java", "Selenium"));
	      System.out.println(value.replaceAll("Java", "Python"));
	  
	  
	  
	  }
	  
	  
	
	
	
	
}
