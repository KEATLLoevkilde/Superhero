import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Database db = new Database();

        while (true){
            int userChoice;

            System.out.println("""
                            VELCOME TO THE SUPERHERO DATABASE
                            1. Create superhero. 
                            2. Display all superheroes.
                            9. End program.
                            """);

            userChoice = sc.nextInt();
            sc.nextLine();


            if (userChoice == 1) {
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

            } else if (userChoice == 2) {
                System.out.println("\nList of all superheroes:");
                for (Superhero i: db.getAllSuperheroes()) {
                    System.out.println(i);
                    System.out.println('\n');
                }

            } else {
                System.exit(0);
            }
        }

    }
}
