package assignment;

import java.util.Scanner;

public class Dinosaur {
	public void printYesorNo() {
		System.out.println("Is it your dinosaur?");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		switch(word) {
		case "Yes":
			System.out.println("Ok, sir.");
			break;
		case "No": 
			System.out.println("Select dinosaur again");
			break;
		default:
			break;
		}	
	}
}
