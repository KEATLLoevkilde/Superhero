import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superheroes;



    public Database() {
        superheroes = new ArrayList<>();

    }

    public void addSuperhero(String superheroName, String civilianName, String superPower, String isHuman, int creationYear, double strengh) {
        superheroes.add(new Superhero(superheroName, civilianName, superPower, isHuman, creationYear, strengh));
    }

    public ArrayList<Superhero> getAllSuperheroes() {
        return superheroes;
    }


    public ArrayList<Superhero> searchSuperheroes (String name) {
        ArrayList<Superhero> searchResult = new ArrayList<>();
        for (Superhero i: superheroes) {
            if(i.getSuperheroName().contains(name)) {
                searchResult.add(i);
            }
        }
        return searchResult;
    }

}


