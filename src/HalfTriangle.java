import java.util.Scanner;

public class HalfTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int loop = 0;
		
		while (loop != 1) {
			
			System.out.println("How many lines do you want to your half triangle?");
			
			if (sc.hasNextInt()) {
			
				int number = sc.nextInt();
				
				for (int x = 0; x <= number; x++) {
					
					for (int y = 0; y < x; y++) {
						
						System.out.print("*");
						
					}
					
					System.out.println("\n");
					
				}
				
				System.out.println("Do you want to enter another number?");
				System.out.println("Enter 0 to finish the program or enter another number to continue:");
				
				int finish = sc.nextInt();
				
				if (finish < 1) {
					
					loop = 1;
					
				}
				
			}
			
			else {
				
				System.out.println("Your answer is not valid, I need a number, not another character.");
				
				sc.nextLine();
				
			}
			
		}
		
		System.out.println("Thank you! Bye!");
		
	}
	
}