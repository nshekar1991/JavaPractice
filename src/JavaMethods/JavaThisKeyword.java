package JavaMethods;

public class JavaThisKeyword {
	
	   static int a = 40;
	   static int b = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       thisKeywordExample(60,90);
       
	}

	   public static void thisKeywordExample(int a, int b) 
	   {
           System.out.println("The value of a and b before this keyword usage is: "+ a +", "+ b );		
	        
		   System.out.println("The value of a and b after this keyword usage is: "+ a +", "+ b );
}

}