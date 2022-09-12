import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String superheroName;
        String civilianName;
        String superPower;
        boolean isHuman;
        int creationYear;
        double strengh;

        int userChoice;

        System.out.println("1. Create superhero. \n9. End program.");
        userChoice = sc.nextInt();
        sc.nextLine();

        if (userChoice == 1) {
            System.out.println("Type in superheroName:");
            superheroName = sc.nextLine();

            System.out.println("Type in civilianName:");
            civilianName = sc.nextLine();

            System.out.println("Type in superPower:");
            superPower = sc.nextLine();

            System.out.println("Is the superhero human? (true/false):");
            isHuman = sc.nextBoolean();

            System.out.println("Type in creationYear:");
            creationYear = sc.nextInt();

            System.out.println("Type in strengh value:");
            strengh = sc.nextDouble();

            Superhero hero1 = new Superhero(superheroName, civilianName, superPower, isHuman, creationYear, strengh);

            System.out.println();
            System.out.println(hero1);
        }





    }
}
