import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		
		System.out.println(" *** Jurassic Park Dinosaur management! *** ");
		System.out.println("Input your ID");
		Scanner name = new Scanner (System.in);
		String ID = name.nextLine();
		System.out.printf("Have a good day, Mr. %s! \n", ID);
		
		Scanner input = new Scanner(System.in);
		DinosaurManager dm = new DinosaurManager(input);
		int num = 7;
		while (num != 8) {
			System.out.println("Select one number between 1 ~ 7.\n");
			System.out.println("1. Information of your dinosaur\n");
			System.out.println("2. Feed to dinosaur. \n");
			System.out.println("3. Make quarrel with anotehr dinasours. \n");
			System.out.println("4. Administer euthanasia dinosaur \n");
			System.out.println("5. Make sleep dinosaur \n");
			System.out.println("6. Raise dinosaurs. \n");
			System.out.println("7. Exit. \n");
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
				System.out.println("Good bye.\n");
			}
		}
	}
}
