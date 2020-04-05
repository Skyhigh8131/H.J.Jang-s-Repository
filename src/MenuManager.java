
import java.util.Scanner;

public class DinosaurManagementSystem {
	
	public static void main(String[] args) {	
		System.out.println(" *** Jurassic Park Dinosaur management! *** ");
		
		System.out.println("Input your ID");
		Scanner name = new Scanner (System.in);
		String ID = name.nextLine();
		System.out.printf("Have a good day, Mr. %s! \n", ID);
		
		Scanner input = new Scanner(System.in);
		int num = 5;
		while (num != 6) {
			System.out.printf("1. Feed to dinosaur. \n");
			System.out.printf("2. Make quarrel with anotehr dinasours. \n");
			System.out.printf("3. Administer euthanasia dinosaur \n");
			System.out.printf("4. Make sleep dinosaur \n");
			System.out.printf("5. Raise dinosaurs. \n");
			System.out.printf("6. Exit. \n");
			System.out.println("Select one number between 1 ~ 6 ");
			num = input.nextInt();
			if (num == 1) {
				feedDinosaur();
			}
			else if (num == 2) {
				fightDinosaur();
			}
			else if (num == 3) {
				killDinosaur();
			}
			else if (num == 4) {
				Makesleep();
			}
			else if (num == 5) {
				Raisedinosaur();
			}
			else if (num == 6) {
				System.out.println("Good bye");
				break;
			}
			
		}
	}
	
	public static void feedDinosaur() {
		System.out.println("Select your dinosaur");
		Scanner some = new Scanner(System.in);
		String dinosaur = some.nextLine();
		System.out.printf("Your dinosaur is %s! \n", dinosaur);
		System.out.printf("Choose the meal of dinosaur. ");
		Scanner input = new Scanner(System.in);
		String meal = input.nextLine();
		System.out.printf("Its meal is %s \n", meal);
	}
	public static void fightDinosaur() {
		System.out.println("Select a dinosaur.");
		Scanner d1 = new Scanner (System.in);
		String dinosaur1 = d1.nextLine();
		System.out.println("Select another dinosaur.");
		Scanner d2 = new Scanner (System.in);
		String dinosaur2 = d2.nextLine();
		System.out.printf("%s will fight with %s. \n", dinosaur1, dinosaur2);
	}
	public static void killDinosaur() {
		System.out.println("Select a dinosaur.");
		Scanner input = new Scanner (System.in);
		String Dinosaur = input.nextLine();
		System.out.printf("%s has killed by Jurassic Park's guard, safelly. \n", Dinosaur);
	}
	public static void Makesleep() {
		System.out.println("Select a dinosaur.");
		Scanner input = new Scanner (System.in);
	    String dinosaur = input.nextLine();
	    System.out.printf("%s will fall asleep. \n", dinosaur);    
	}
	public static void Raisedinosaur() {
		System.out.println("Select a dinosaur.");
		Scanner input = new Scanner (System.in);
		String dinosaur = input.nextLine();
		System.out.println("How many dinosaurs do you want to raise?");
		int number;
		Scanner num = new Scanner (System.in);
		number  = num.nextInt();
		if (number == 1) {
			System.out.printf("%d %s is raising in hatchery. \n", number, dinosaur);
		}
		else if (number == 2) {
			System.out.printf("%d %s are raising in hatchery. \n", number, dinosaur);
		}
		else if (number == 3) {
			System.out.printf("%d %s are raising in hatchery. \n", number, dinosaur);
		}
		else if (number == 4) {
			System.out.printf("%d %s are raising in hatchery. \n", number, dinosaur);
		}
		else if (number == 5) {
			System.out.printf("%d %s are raising in hatchery. \n", number, dinosaur);
		}
		else if (number == 0) {
			System.out.println("Select the number! \n");
		}
	}

}
