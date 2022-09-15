import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superheroes = new ArrayList<>();
    private ArrayList<Superhero> searchResult = new ArrayList<>();



//    public Superhero getSuperhero(int index) {
//        return superheroes.get(index);
//    }

    public void addSuperhero(String superheroName, String civilianName, String superPower, String isHuman, int creationYear, double strengh) {
        superheroes.add(new Superhero(superheroName, civilianName, superPower, isHuman, creationYear, strengh));
    }

    public ArrayList<Superhero> getAllSuperheroes() {
        return superheroes;
    }

    public Superhero searchSuperhero (String name) {
        for (Superhero i: superheroes) {
            if(i.getSuperheroName().equalsIgnoreCase(name) || i.getSuperheroName().contains(name)) {
                return i;
            }
        }
        return null;
    }

    public ArrayList<Superhero> searchSuperheroesResult (String name) {
        for (Superhero i: superheroes) {
            if(i.getSuperheroName().equalsIgnoreCase(name) || i.getSuperheroName().contains(name)) {
                searchResult.add(i);
            }
        }
        return searchResult;
    }
}


