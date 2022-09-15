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
            searchSuperhero();

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
        String isHuman = sc.next();

        System.out.print("Type in creationYear: ");
        int creationYear = sc.nextInt();

        System.out.print("Type in strengh value: ");
        double strengh = sc.nextDouble();

        db.addSuperhero(superheroName, civilianName, superPower, isHuman, creationYear, strengh);

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

    public void searchSuperhero(){
        System.out.println("Type in name, or part of name, of the superhero you wish to find: ");
        String searchName = sc.nextLine();
        System.out.println();
        if(db.searchSuperhero(searchName) != null) {
            System.out.println("Superhero found:\n\n" + db.searchSuperhero(searchName));
        } else {
            System.out.println("No superhero found with the name: " + searchName);
        }
        System.out.println();

    }

}
