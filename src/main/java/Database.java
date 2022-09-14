import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superheroes = new ArrayList<>();



    public Superhero getSuperhero(int index) {
        return superheroes.get(index);
    }

    public void addSuperhero(String superheroName, String civilianName, String superPower, String isHuman, int creationYear, double strengh) {
        superheroes.add(new Superhero(superheroName, civilianName, superPower, isHuman, creationYear, strengh));
    }

    public ArrayList<Superhero> getAllSuperheroes() {
        return superheroes;
    }

    public Superhero searchSuperhero (String name) {
        Superhero tempSuper = null;
        for (Superhero i: superheroes) {
            if(i.getSuperheroName().equalsIgnoreCase(name) || i.getSuperheroName().contains(name)) {
                tempSuper = i;
                break;
            }
        }
        return tempSuper;
    }
}


