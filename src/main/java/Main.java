import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Database db = new Database();

    public static void main(String[] args) {



        while (true){
            int userChoice;


            System.out.println("""
                            VELCOME TO THE SUPERHERO DATABASE
                            1. Create superhero.
                            2. Display all superheroes.
                            3. Search superhero.
                            9. End program.
                            """);

            userChoice = sc.nextInt();
            sc.nextLine();


            if (userChoice == 1) {
                createSuperhero();

            } else if (userChoice == 2) {
                displayAllSuperheroes();


            } else if (userChoice == 3) {
                searchSuperhero();

            } else {
                System.exit(0);
            }
        }

    }

    public static void createSuperhero(){
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

    public static void displayAllSuperheroes(){
        System.out.println("\nList of all superheroes:");
        for (Superhero i: db.getAllSuperheroes()) {
            System.out.println(i);
            System.out.println('\n');
        }
    }

    public static void searchSuperhero(){
        System.out.println("Type in name, or part of name, of the superhero you wish to find: ");
        String searchName = sc.nextLine();
        System.out.println();
        Superhero tempSuperhero = new Superhero(db.searchSuperhero(searchName));

        if (tempSuperhero == null) { // TODO: 14-09-2022 Løs nullpointer exeption
            System.out.println("No superhero found with the name: " + searchName);
        } else {
            System.out.println("Superhero found:\n" + tempSuperhero);
        }
        System.out.println();
    }
}
