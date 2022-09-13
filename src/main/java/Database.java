import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superheroes = new ArrayList<>();



    public Superhero getSuperhero(int index) {
        return superheroes.get(index);
    }

    public void addSuperhero(String superheroName, String civilianName, String superPower, boolean isHuman, int creationYear, double strengh) {
        Superhero newHero = new Superhero(superheroName, civilianName, superPower, isHuman, creationYear, strengh);
        superheroes.add(newHero);
    }

    public ArrayList<Superhero> getAllSuperheroes() {
        return superheroes;
    }
}


