package JavaMethods;

public class JavaMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		purchaseItemsFromMarket(300, "Potato", "Apache180");
		purchaseItemsFromMarket(500, "Onion", "Pulsar");
		purchaseItemsFromMarket(400, "Tomato", "Scooty");
	}
         public static void purchaseItemsFromMarket(int money, String vegetable, String vehicleType)
         {
        	 System.out.println("********************************************************");
			 int expense = 200;
        	 System.out.println("I am going to market to bring: "+vegetable);
        	 System.out.println("I am going to Market by: "+vehicleType);
			 System.out.println("The total money I have: "+money);
			 int remainingAmount = money - expense;
			 System.out.println("The remaining amount i have: "+ remainingAmount);
		}
}
