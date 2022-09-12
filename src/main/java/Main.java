import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Database db = new Database();

        while (true){
            int userChoice;

            System.out.println("1. Create superhero. \n9. End program.");
            userChoice = sc.nextInt();


            if (userChoice == 1) {
                System.out.print("Type in superheroName: ");
                String superheroName = sc.next();

                System.out.print("Type in civilianName: ");
                String civilianName = sc.next();

                System.out.print("Type in superPower: ");
                String superPower = sc.next();

                System.out.print("Is the superhero human? (true/false): ");
                boolean isHuman = sc.nextBoolean();

                System.out.print("Type in creationYear: ");
                int creationYear = sc.nextInt();

                System.out.print("Type in strengh value: ");
                double strengh = sc.nextDouble();

                db.addSuperhero(superheroName, civilianName, superPower, isHuman, creationYear, strengh);

                System.out.println("\nSuperhero stored!");
                System.out.println('\n');

            } else {
                break;
            }
        }

//        System.out.println(db.getSuperhero(0));
//        System.out.println(db.getSuperhero(1));
//        System.out.println(db.getSuperhero(2));
//        System.out.println(db.getSuperhero(3));
//        System.out.println(db.getSuperhero(4));

    }
}
