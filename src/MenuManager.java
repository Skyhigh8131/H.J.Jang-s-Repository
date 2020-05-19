package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		System.out.println(" *** Jurassic Park Dinosaur management! *** ");
		System.out.println("Input your ID");
		try {
			Scanner c = new Scanner (System.in);
			String name = c.nextLine();
			Scanner p = new Scanner(System.in);
			String password = p.nextLine();
			
			char a = password.charAt(8);
			
			System.out.println("Have a nice day! " + name);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
		Scanner input = new Scanner(System.in);
		DinosaurManager dm = new DinosaurManager(input);
		int num = 8;
		while (num != 9) {
			System.out.println("Select one number between 1 ~ 7.");
			System.out.println("1. Information of your dinosaur.");
			System.out.println("2. Feed to dinosaur.");
			System.out.println("3. Make quarrel with anotehr dinasours. ");
			System.out.println("4. Administer euthanasia dinosaur.");
			System.out.println("5. Make sleep dinosaur.");
			System.out.println("6. Raise dinosaurs.");
			System.out.println("7. Turn on/off fence");
			System.out.println("8. Exit.");
			num = input.nextInt();
			if (num == 1) {
				dm.information();
			}
			else if (num == 2) {
				dm.feedDinosaur();
			}
			else if (num == 3) {
				dm.fightDinosaur();
			}
			else if (num == 4) {
				dm.killDinosaur();
			}
			else if (num == 5) {
				dm.Makesleep();
			}
			else if (num == 6) {
				dm.Raisedinosaur();
			}
			else if (num == 7) {
				Control c = new FenceControl();
				System.out.println("Do yo want to control fence in park?");
				Scanner sc = new Scanner(System.in);
				String answer = sc.nextLine();
				if(answer == "Yes") {
					c.turnOn();
					c.printInfo();
					System.out.println("The fence will be turned on");
				}
				else if(answer == "No") {
					c.turnOff();
					c.printInfo();
					System.out.println("The fence will be turned off");
				}
			}
			else if (num == 8) {
				System.out.println("Good bye.\n");
				break;
			}
		}
		
	}
}
