package learnJavaWeekTwoProject_v1;

public class summertimeStatus {

	public static void main(String[] args) {
		
		// Initializing variables. 
		boolean shouldBuyIcecream, willGoSwimming, isAGoodDay, willBuyMilk; 
		String responseToQuestion; 
		
		// Status of Day Conditions. 
		boolean isHotOutside = true; 
		boolean isWeekday = false; 
		boolean hasMoneyInPocket = false; 
		int thirstLevel = 9; 
		
		// Resources & Costs. 
		double costOfMilk = 2.19; 
		double moneyInWallet = 17.45; 
		
		// Should they buy icecream?  
		if (isHotOutside && hasMoneyInPocket) {
			shouldBuyIcecream = true; 
			responseToQuestion = "\n		Sure! It's hot and I've got enough dough.";
		}
		else {
			shouldBuyIcecream = false;
			responseToQuestion = "\n		Naw man, I don't like brainfreeze and I need my lactation pills."; 
		}
		System.out.println("\n What do you say we get some icecream?:   " + responseToQuestion);
		
		
		// Will they go swimming? 
		if (isHotOutside && !isWeekday) {
			willGoSwimming = true; 
			responseToQuestion = "\n		Sure! It's hot and I have nothing better to do. Plus it's good exercise.";
		} 
		else {
			willGoSwimming = false; 
			responseToQuestion = "\n		No, That sounds like a lot of work only to get cold and wet. ";
		}
		System.out.println("\n Want to go swimming?:  " + responseToQuestion);
				
		
		// Is it a good day? 
		if (hasMoneyInPocket && isHotOutside && !isWeekday) {
			isAGoodDay = true; 
			responseToQuestion =  "\n		That is " + isAGoodDay + ", it is a wonderful day.";
			
		}
		else {
			isAGoodDay = false; 
			responseToQuestion = "\n		That is " + isAGoodDay + ", it is NOT a wonderful day! ";
		} 
		System.out.println("\n Lovely day, isn't it?:   " + responseToQuestion);
		
		
		// Should we buy milk?  
			if (moneyInWallet >= (2 * costOfMilk ) && isHotOutside && thirstLevel >= 3 ) {
				willBuyMilk = true; 
				responseToQuestion =  "\n		Yes, conditions are ideal to consume some of that sweet cow nectar.";
			}
			else {
				willBuyMilk = false; 
				responseToQuestion = "\n		Naw man, no milk for me. Men drink Brawndo!"; 
			} 
			System.out.println("\n Should we pick up some milk?:   " + responseToQuestion);
			}
	}