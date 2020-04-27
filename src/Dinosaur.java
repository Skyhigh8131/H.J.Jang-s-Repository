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
	public void NumDinosaur(int x, String y) {
		System.out.println("Ladis and Gentleman, There is new dinosaurus! They are " + x + y);		
	}
	public void NumDinosaur(int x, int y, String z) {
		System.out.println("There are " + (x - y) + " "+ z);
	}
}
