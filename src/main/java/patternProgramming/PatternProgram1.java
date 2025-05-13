package patternProgramming;

public class PatternProgram1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) { // Outer loop for rows
			for(int j=1;j<=4;j++) { // Inner loop for column
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
//output
// ****
//****
//****