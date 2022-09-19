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
                    4. Edit superhero.
                    9. End program.
                    """);

            userChoice = readInt();

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

        } else if (userChoice == 4) {
            editSuperhero();
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
        int creationYear = readInt();

        System.out.print("Type in strengh value: ");
        double strengh = readDouble();

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

    public void searchSuperheroes(){
        System.out.println("Type in name of superhero you wish to find: ");
        String searchName = sc.nextLine();
        System.out.println();
        if(!db.searchSuperheroes(searchName).isEmpty()) {
            System.out.println("Superheroes found:\n");
            for (Superhero s: db.searchSuperheroes(searchName)) {
                System.out.println(s + "\n");
            }
        } else {
            System.out.println("No superhero found with the name: " + searchName);
        }
        System.out.println();

    }

    public void editSuperhero() {
        System.out.println("Type in name of superhero you wish to edit: ");
        String searchName = sc.nextLine();
        ArrayList<Superhero> seachResult = db.searchSuperheroes(searchName);
        if (!seachResult.isEmpty()) {
            System.out.println("Superheroes found\n\n");
            for (int i = 0; i < seachResult.size(); i++) {
                System.out.println(i + 1 + ".\n" + seachResult.get(i));
                System.out.println();
                }
            System.out.println("Type number of superhero you wish to edit");
            String heroNumber = sc.nextLine();
            Superhero editSuperhero = seachResult.get(Integer.parseInt(heroNumber) - 1);

            System.out.println("Type new data and press ENTER. If you do not wish to edit data press Enter.");

            System.out.println("Superhero name: " + editSuperhero.getSuperheroName());
            String newSuperheroName = sc.nextLine();
            if (!newSuperheroName.isEmpty()){
                editSuperhero.setSuperheroName(newSuperheroName);
            }

            System.out.println("Civilian name: " + editSuperhero.getCivilianName());
            String newCivilianName = sc.nextLine();
            if (!newCivilianName.isEmpty()){
                editSuperhero.setCivilianName(newCivilianName);
            }

            System.out.println("Superpower: " + editSuperhero.getSuperPower());
            String newSuperpower = sc.nextLine();
            if (!newSuperpower.isEmpty()){
                editSuperhero.setSuperPower(newSuperpower);
            }

            System.out.println("Is human: " + editSuperhero.getIsHuman());
            String newIsHuman = sc.nextLine();
            if (!newIsHuman.isEmpty()){
                editSuperhero.setIsHuman(newIsHuman);
            }

            System.out.println("Creation Year: " + editSuperhero.getCreationYear());
            String newCreationYear = sc.nextLine();
            if (!newCreationYear.isEmpty()){
                editSuperhero.setCreationYear(Integer.parseInt(newCreationYear));
            }

            System.out.println("Strengh: " + editSuperhero.getStrengh());
            String newStrengh = sc.nextLine();
            if (!newStrengh.isEmpty()){
                editSuperhero.setStrengh(Double.parseDouble(newStrengh));
            }

            System.out.println("Edit stored:");
            System.out.println();
            System.out.println(editSuperhero);
            System.out.println();

            } else {
                System.out.println("No superhero found with the name: " + searchName + "\n");
            }






    }

    public int readInt() {
        while(!sc.hasNextInt()) {
            String text = sc.nextLine();
            System.out.println();
            System.out.println(text + " is not an int. Please try again.");
            System.out.println();
        }
        int temp = sc.nextInt();
        sc.nextLine();
        return temp;
    }

    public double readDouble() {
        while(!sc.hasNextDouble()) {
            String text = sc.nextLine();
            System.out.println();
            System.out.println(text + " is not a decimal number. Please try again.");
            System.out.println();
        }
        double temp = sc.nextDouble();
        sc.nextLine();
        return temp;
    }


}
