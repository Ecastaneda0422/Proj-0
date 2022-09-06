//First Commit

import java.util.Scanner;

public class CoinFlip {
	public static void Flip (int flips, boolean thumb, int total) {
		int heads = 0;
		System.out.println();
		if(thumb == true) {
			for( int i = 0; i < flips; i++) {
				total++;
				String blank = "";
			if(Math.random() > .5) {
				System.out.println("Heads");
				blank += "heads";
			}
			else {
				System.out.println("Tails");
				blank += "tails";
			}
			System.out.println(" or ");
			if(Math.random() > .5) {
				System.out.println("Heads\n");
				blank += "heads";
			}
			else {
				System.out.println("Tails\n");
				blank += "tails";
			}
			if(blank.contains("heads")) {
				heads++;
			}
			}
			System.out.println("Total Flips: " + flips + ". Total Heads: " + heads );
		}
		else {
			for( int i = 0; i < flips; i++) {
				total++;
				Math.random();	
					if(Math.random() > .5) {
						System.out.println("Heads");
						heads++;
					}
					else {
						System.out.println("Tails");
					}					
				}
				System.out.println("Total Flips: " + flips + ". Total Heads: " + heads );
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int turn = 1;
		int storm = 0;
		int krarks = 0;
		Scanner scan;
		boolean flag = true;
		boolean thumb = false;
		int total = 0;
		String choice;
		scan = new Scanner(System.in);
		
		while(flag){
			System.out.println("Options: New turn, Krark triggers, Thumb, Storm count, Flip, Countered, Reverse, End total of coins flipped");
			choice = scan.nextLine();
			switch(choice) {
			case "n":
				turn++;
				System.out.println("Turn Number: " + turn);
				storm = 0;
				break;
			case "k":
				System.out.println("How many krark triggers per spell");
				krarks = scan.nextInt();
				break;
			case "t":
				if(thumb == false) {
					thumb = true;
					System.out.println("krark's thumb is now active");
				}
				else {
					thumb = false;
					System.out.println("krark's thumb is now unactive");
				}
				break;
			case "f":
				Flip (krarks, thumb, total);
				if(krarks > 0) {
				storm++;
				total = total + krarks;
				}
				break;
			case "q":
				System.out.println("\nProgram terminated by the user.");
				flag = false;
				break;
			case "s":
				System.out.println("Storm Count: " + storm);
				break;
			case "c":
				int c = scan.nextInt();
				int b = krarks;
				int a = b - c;
				Flip(a, thumb, total);
				break;
			case"r":
				storm--;
				break;
			case "e":
				System.out.println("Total Coin Flips this game: " + total);
				break;
			default:	
				//System.out.println("Invalid input, try again.");
				break;	
			}
		}
	}
}
