package learnJavaWeekTwoProject_v1;

public class Loops {

	public static void main(String[] args) {
		
		System.out.println("	Problem A: While Loop One");
		int currentNumber = 0; 
		
		while (currentNumber <= 100 ) {
			if (currentNumber % 2 == 0) {
				System.out.print(currentNumber + ", ");
			}
			if (currentNumber % 20 == 0 && currentNumber != 0) {
				System.out.println("");
			}
			currentNumber = currentNumber + 1; 
		}
		
		System.out.println("\n 	Problem B: While Loop Two");
		currentNumber = 100; 
		while (currentNumber >= 0 ) {
			if ((currentNumber - 1) % 3 == 0) {
				System.out.print(currentNumber + " ");
			}
			if (currentNumber % 51 == 0 && currentNumber != 0) {
				System.out.println("");
			}
			currentNumber = currentNumber - 1; 
		}
		
		System.out.println("");
		System.out.println("\n	Problem C: For Loop One");
		for (currentNumber = 1; currentNumber <= 100; currentNumber++) {
			if (currentNumber % 2 == 0) {
				System.out.print(currentNumber + ", ");
			}
			if (currentNumber % 26 == 0 && currentNumber != 0) {
				System.out.println("");
			}
		}
		
		System.out.println("");
		System.out.println("\n	Problem D: For Loop Two");
		for (currentNumber = 0; currentNumber <= 100; currentNumber++) {
			if (currentNumber % 3 == 0) {
				System.out.print("Hello ");
			}
			if (currentNumber % 5 == 0) {
				System.out.print("World!, ");
			}
			if ((currentNumber % 5 != 0) && (currentNumber % 3 != 0)) {
				System.out.print(currentNumber + ", ");
			}
			if (currentNumber % 10 == 0 && currentNumber != 0) {
				System.out.println("");
			}
		}
	}
}
	


