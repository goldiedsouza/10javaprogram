import java.io.*;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//storing 
		int n  = 4;
		
		String names[]
				= {"Rahul", "Goldie", "Riya",  "Poorva" };
		String temp;
		for (int i =  0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				
			//to compare one string with other strings
			if ( names[i].compareTo(names[j]) > 0) {
				//swapping
			temp = names[i];
			names[i] = names[j];
			names[j]=temp;
			}
		}
	}
		//print output array
		System.out.println(
				"This names in alphabetical order are: ");
		for (int i = 0; i < n; i++);
		}
}

