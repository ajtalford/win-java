public class NestingLoops {
	public static void main(String[] args) {
	
		// 1. The variable is controlled by the outer loop, but the inner loop (n) moves faster. After it cycles through it triggers the outer loop.
		for (int n = 1; n <= 3; n++) {
		// this is #1 - I'll call it "CN"
		// 2. With the "c" loop on the inside and the "n" loop on the outside the "n" (number) has a slower rate of change than "c"(char).
		for (char c = 'A'; c <= 'E'; c++) {
			
				System.out.println(c + " " + n);
			}
		}

		System.out.println("\n");
		for (int b = 1; b <= 3; b++) {
		// this is #2 - I'll call it "AB"
		
		for (int a = 1; a <= 3; a++) {
		// 3. When changed the second set of nested loops ("AB") from print to println one line prints for each iteration instead of one line for all
			System.out.print(a + "-" + b + " ");
		}
		// 4. Instead of 9 consecutive lines there are are 3 lines printed then 3 empty lines repeated 3 times.
		// * You will add a line of code here.
			System.out.println("\n");
		}

		System.out.println("\n");
	}
}

// 1. Look at the first set of nested loops ("CN"). Which variable changes faster? Is it the variable controlled by the outer loop (c) or the variable controlled by the inner loop (n)? Answer in a comment.

// The variable controlled by the outer loop but the inner loop (n) moves faster. After it cycles through it triggers the outer loop. 


// 2. Change the order of the loops so that the "c" loop is on the inside and the "n" loop is on the outside. How does the output change?

// With the "c" loop on the inside and the "n" loop on the outside the "n" (number) has a slower rate of change than "c"(char). 


// 3. Look at the second set of nested loops ("AB"). Change the print() statement to println(). How does the output change? (Then change it back to print().)

// When changed the second set of nested loops ("AB") from print to println it prints lines one line for each iteration instead of one line for all.


// 4. Add a System.out.println() statement after the close brace of the inner loop (the "b" loop), but still inside the outer loop. How does the output change?

// Instead of 9 consecutive lines there are be 3 lines print then 3 line breaks 3 times.  



