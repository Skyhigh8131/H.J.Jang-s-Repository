
import java.util.Scanner;

public class DinosaurManagementSystem {
	
	public static void main(String[] args) {	
		System.out.println(" *** Jurassic Park Dinosaur management! *** ");
		
		System.out.println("Input your ID");
		Scanner name = new Scanner (System.in);
		String ID = name.nextLine();
		System.out.printf("Good day, Nice meet you! , %s\n", ID);
		
		System.out.println("Select your dinasour:");
		Scanner dn = new Scanner(System.in);
		String Dinosaur = dn.nextLine();
		System.out.printf("You selected %s.\n", Dinosaur);
		
		Scanner input = new Scanner(System.in);
		int num = 5;
		while (num != 6) {
			System.out.printf("1. Feed to %s. \n", Dinosaur);
			System.out.printf("2. Make quarrel with anotehr dinasours. \n");
			System.out.printf("3. Administer euthanasia %s \n", Dinosaur);
			System.out.printf("4. Make sleep %s \n", Dinosaur);
			System.out.printf("5. Show a Menu. \n");
			System.out.printf("6. Exit. \n");
			System.out.println("Select one number between 1 ~ 6 ");
			num = input.nextInt();
			if (num == 1) {
				feedDinosaur();
			}
			else if (num == 2) {
				fightDinosaur();
			}
			else if (num == 6) {
				System.out.println("Good bye");
				break;
			}
			
		}
	}
	
	public static void feedDinosaur() {
		System.out.printf("Choose the meal of dinosaur. ");
		Scanner input = new Scanner(System.in);
		String meal = input.nextLine();
		System.out.printf("Its meal is %s \n", meal);
		
		
	}
	public static void fightDinosaur() {
		System.out.println("Select a dinosaur.");
		Scanner input = new Scanner (System.in);
		String dinosaur = input.nextLine();
		System.out.printf("%s will fight with your chosen dinosaur. \n", dinosaur);
	}

}
