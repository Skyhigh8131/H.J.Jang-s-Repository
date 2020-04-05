import java.util.Scanner;

public class DinosaurManager {
	
	Scanner input;
	
	DinosaurManager(Scanner input){
		this.input = input;
	}
	

	public static void feedDinosaur() {
		System.out.println("Select your dinosaur");
		
		Scanner input = new Scanner (System.in);
		String dinosaur = input.nextLine();
		
		System.out.printf("Your dinosaur is %s! \n", dinosaur);
		
		System.out.printf("Choose the meal of dinosaur. ");
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
