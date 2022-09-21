import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superheroes;


    public Database() {
        superheroes = new ArrayList<>();
    }

    public void addSuperhero(String superheroName, String civilianName, String superPower, boolean isHuman, int creationYear, double strengh) {
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
    
    public void deleteSuperhero(String superheroName) {
        int foundIndex = - 1;
        for (int i = 0; i < superheroes.size(); i++) {
            if (superheroes.get(i).getSuperheroName().equals(superheroName)) {
                foundIndex = i;
            }
        }
        superheroes.remove(foundIndex);
    }
}


