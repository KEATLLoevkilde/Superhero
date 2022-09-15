import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    private Database db;
    Scanner sc;

    public UserInterface(){
        db = new Database();
        sc = new Scanner(System.in);
    }

    public void startProgram() {
        int userChoice;
        do {
            System.out.println("""
                    VELCOME TO THE SUPERHERO DATABASE
                    1. Create superhero.
                    2. Display all superheroes.
                    3. Search superhero.
                    9. End program.
                    """);

            userChoice = sc.nextInt();
            sc.nextLine();

            handleUserChoice(userChoice);

        }while (userChoice != 9);
    }

    public void handleUserChoice(int userChoice) {
        if (userChoice == 1) {
            createSuperhero();

        } else if (userChoice == 2) {
            displayAllSuperheroes();


        } else if (userChoice == 3) {
            searchSuperheroes();

        }
    }

    public void createSuperhero(){
        System.out.print("Type in superheroName: ");
        String superheroName = sc.nextLine();

        System.out.print("Type in civilianName: ");
        String civilianName = sc.nextLine();

        System.out.print("Type in superPower: ");
        String superPower = sc.nextLine();

        System.out.print("Is the superhero human? (Yes/No): ");
        String isHuman = sc.nextLine();

        System.out.print("Type in creationYear: ");
        String creationYear = sc.nextLine();

        System.out.print("Type in strengh value: ");
        String strengh = sc.nextLine();

        db.addSuperhero(superheroName, civilianName, superPower, isHuman, Integer.parseInt(creationYear), Double.parseDouble(strengh));

        System.out.println("\nSuperhero stored!");
        System.out.println('\n');
    }

    public void displayAllSuperheroes(){
        System.out.println("\nList of all superheroes:\n");
        for (Superhero i: db.getAllSuperheroes()) {
            System.out.println(i);
            System.out.println('\n');
        }
    }

    public void searchSuperheroes(){
        System.out.println("Type in name, or part of name, of the superhero you wish to find: ");
        String searchName = sc.nextLine();
        System.out.println();
        if(!db.searchSuperheroes(searchName).isEmpty()) {
            System.out.println("Superhero found:\n");
            for (Superhero s: db.searchSuperheroes(searchName)) {
                System.out.println(s + "\n");
            }
        } else {
            System.out.println("No superhero found with the name: " + searchName);
        }
        System.out.println();

    }

}
