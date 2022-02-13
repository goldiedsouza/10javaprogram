import java.util.Scanner;

public class Addingtwonumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reading input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Number: ");
				int input1 = scanner.nextInt();
		System.out.print("Enter Second Number: ");
				int input2 = scanner.nextInt();
		
		//summing two numbers
				int output = input1 + input2;
				
System.out.println("Scanner example to Sum of two Number (" + input1 + ", " + input2 + ") = " + output);
	
			
	}

}
