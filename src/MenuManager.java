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
		int num = 5;
		while (num != 6) {
			System.out.println("Select one number between 1 ~ 6 ");
			System.out.println("0. information of your dinosaur");
			System.out.printf("1. Feed to dinosaur. \n");
			System.out.printf("2. Make quarrel with anotehr dinasours. \n");
			System.out.printf("3. Administer euthanasia dinosaur \n");
			System.out.printf("4. Make sleep dinosaur \n");
			System.out.printf("5. Raise dinosaurs. \n");
			System.out.printf("6. Exit. \n");
			num = input.nextInt();
			if (num == 0) {
				dm.information();
			}
		    if (num == 1) {
				dm.feedDinosaur();
			}
			else if (num == 2) {
				dm.fightDinosaur();
			}
			else if (num == 3) {
				dm.killDinosaur();
			}
			else if (num == 4) {
				dm.Makesleep();
			}
			else if (num == 5) {
				dm.Raisedinosaur();
			}
			else if (num == 6) {
				System.out.println("Good bye");
			}
		}
	}
}
