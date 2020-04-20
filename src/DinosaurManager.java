package assignment;

import java.util.Scanner;

public class DinosaurManager extends Dinosaur {
	
	Scanner input;
	DinosaurManager(Scanner input){
		this.input = input;
	}
	public static void information() {
		System.out.println("Select your dinosaur");
		String[] time = {"Triassic", "Jurassic", "Cretaceous"};
		String[] preference = {"Carnivor!", "Herbivorous!"};
		String[] size = {"Big one", "Small one"};
		Dinosaur dino = new Dinosaur();
		Scanner input = new Scanner(System.in);
		String dinosaur = input.nextLine();
		
		dino.printYesorNo();
		
		switch(dinosaur) {
		case "T Rex":
			System.out.println(time[2]);
			System.out.println(preference[0]);
			System.out.println(size[0]);
			break;
		case "Spinosaurus":
			System.out.println(time[2]);
			System.out.println(preference[0]);
			System.out.println(size[0]);
			break;
		case "Stegosaurus":
			System.out.println(time[1]);
			System.out.println(preference[1]);
			System.out.println(size[0]);
			break;
		case "Velociraptor":
			System.out.println(time[2]);
			System.out.println(preference[0]);
			System.out.println(size[1]);
			break;
		case "Triceratops":
			System.out.println(time[2]);
			System.out.println(preference[1]);
			System.out.println(size[0]);
			break;
		case "Brachiosaurus":
			System.out.println(time[1]);
			System.out.println(preference[1]);
			System.out.println(size[0]);
			break;
		case "Driosaurus":
			System.out.println(time[1]);
			System.out.println(preference[1]);
			System.out.println(size[1]);
			break;
		default:
			System.out.printf("%s is not in this park.\n", dinosaur);
			break;
		}
		
	}
	public static void feedDinosaur() {
		System.out.println("Select your dinosaur");
		
		Scanner input = new Scanner (System.in);
		String dinosaur = input.nextLine();
		Dinosaur dino = new Dinosaur();	
		
		dino.printYesorNo();
		
		System.out.printf("Your dinosaur is %s! \n", dinosaur);
		
		String[] preference = {"Carnivor!", "Herbivorous !"};
		String[] meal = {"Meat", "Haycock"};
		switch(dinosaur) {
		case ("T Rex"):
			System.out.printf("%s is %s, so %s will be given to %s. \n", dinosaur, preference[0], meal[0], dinosaur);
		    break;
		case ("Spinosaurus"):
			System.out.printf("%s is %s, so %s will be given to %s. \n", dinosaur, preference[0], meal[0], dinosaur);
		    break;
		case ("Stegosaurus"):
			System.out.printf("%s is %s, so %s will be given to %s. \n", dinosaur, preference[1], meal[1], dinosaur);
		    break;
		case ("Velociraptor"):
			System.out.printf("%s is %s, so %s will be given to %s. \n", dinosaur, preference[0], meal[0], dinosaur);
		    break;
		case ("Triceratops"):
			System.out.printf("%s is %s, so %s will be given to %s. \n", dinosaur, preference[1], meal[1], dinosaur);
	        break;
		case ("Brachiosaurus"):
			System.out.printf("%s is %s, so %s will be given to %s. \n", dinosaur, preference[1], meal[1], dinosaur);
            break;
		case ("Driosaurus"):
			System.out.printf("%s is %s, so %s will be given to %s. \n", dinosaur, preference[1], meal[1], dinosaur);
            break;
		default:
			System.out.printf("%s is not in this park.\n", dinosaur);
			break;
		}
		
	}
	public static void fightDinosaur() {
		
		System.out.println("Select a dinosaur.");
		
		Dinosaur dino1 = new Dinosaur();
		Dinosaur dino2 = new Dinosaur();
		
		Scanner d1 = new Scanner (System.in);
		String dinosaur1 = d1.nextLine();
		
		dino1.printYesorNo();
		
		System.out.println("Select another dinosaur.");
		
		Scanner d2 = new Scanner (System.in);
		String dinosaur2 = d2.nextLine();
		
		dino2.printYesorNo();
		
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
		
		Dinosaur dino = new Dinosaur();
		
		dino.printYesorNo();
		String[] size = {"Big one", "Small one"};
	    String dinosaur = input.nextLine();
	    
	    switch(dinosaur) {
	    case ("T Rex"):
	    	System.out.printf("%s is %s.\n", dinosaur, size[0]);
	        dino.printYesorNo();
	        break;
	    case ("Spinosaurus"):
	    	System.out.printf("%s is %s.\n", dinosaur, size[0]);
	        dino.printYesorNo();
	        break;
	    case ("Stegosaurus"):
	    	System.out.printf("%s is %s.\n", dinosaur, size[0]);
	        dino.printYesorNo();
            break;
	    case ("Velociraptor"):
	    	System.out.printf("%s is %s.\n", dinosaur, size[1]);
	        dino.printYesorNo();
	        break;
	    case ("Triceratops"):
	    	System.out.printf("%s is %s.\n", dinosaur, size[0]);
	        dino.printYesorNo();
	        break;
	    case ("Brachiosaurus"):
	    	System.out.printf("%s is %s.\n", dinosaur, size[0]);
	        dino.printYesorNo();
	        break;
	    case ("Driosaurus"):
	    	System.out.printf("%s is %s.\n", dinosaur, size[1]);
	        dino.printYesorNo();
	        break;
	    default:
			System.out.printf("%s is not in this park.\n", dinosaur);
			dino.printYesorNo();
			break;
	    }
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
