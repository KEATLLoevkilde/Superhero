public class Database {
    private Superhero[] superheroes = new Superhero[5];
    private int numberOfHeroes = 0;


    public Superhero getSuperhero(int heroNumber) {
        return superheroes[heroNumber];
    }

    public void addSuperhero(String superheroName, String civilianName, String superPower, boolean isHuman, int creationYear, double strengh) {
        Superhero newHero = new Superhero(superheroName, civilianName, superPower, isHuman, creationYear, strengh);
        superheroes[numberOfHeroes++] = newHero;
    }
}


