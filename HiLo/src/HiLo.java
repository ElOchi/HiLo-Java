import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		
		// Get ready for the player to use the keyboard
		Scanner scan = new Scanner(System.in);
		
		// Play again loop
		String playAgain = "";
		
		//  Game loop
		do {
				// Create a random number from 1-100
				int theNumber = (int)(Math.random()*100 + 1);
				
				int guess = 0;
				
				// Keep track of the number of tries
				int numberOfTries = 0;
				
				
				while( guess != theNumber ) {
					
					System.out.println("Guest a number between 1 and 100:");
					
					// Get the user's guest
					guess = scan.nextInt();
				
					// Add one to the number of tries
					numberOfTries++;
					
					if(guess < theNumber) 
						System.out.println(guess + " Is to low.  Try again.");
					else if (guess > theNumber)
						System.out.println(guess + " is to high. Try again.");
					else
						System.out.println(guess + " is correct! You win!");
					
				}	// End of while loop for guessing
				System.out.println("It only took you " + numberOfTries + " tries! Good!");
			// Ask for 'y' to play again 
				System.out.println("Would you like to play again(y/n)");
				playAgain = scan.next();
				
		} while(playAgain.equalsIgnoreCase("y"));
		// Thank the user for playing
		System.out.println("Thank you for playing! Goodbye. ");
	}

}
