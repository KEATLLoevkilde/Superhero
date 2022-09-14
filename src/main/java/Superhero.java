public class Superhero {
    private String superheroName;
    private String civilianName;
    private String superPower;
    private String isHuman;
    private int creationYear;
    private double strengh;

    public Superhero(String superheroName, String civilianName, String superPower, String isHuman, int creationYear, double strengh) {
        this.superheroName = superheroName;
        this.civilianName = civilianName;
        this.superPower = superPower;
        this.isHuman = isHuman;
        this.creationYear = creationYear;
        this.strengh = strengh;

    }

    public Superhero(Superhero source) {
        this.superheroName = source.superheroName;
        this.civilianName = source.civilianName;
        this.superPower = source.superPower;
        this.isHuman = source.isHuman;
        this.creationYear = source.creationYear;
        this.strengh = source.strengh;
    }

    //Gettere
    public String getSuperheroName() {
        return superheroName;
    }

    public String getCivilianName() {
        return civilianName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String isHuman() {
        return isHuman;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public double getStrengh() {
        return strengh;
    }

    //Settere

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public void setCivilianName(String civilianName) {
        this.civilianName = civilianName;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public void setIsHuman(String isHuman) {
        this.isHuman = isHuman;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setStrengh(int strenght) {
        this.strengh = strenght;
    }

    // ToString
    public String toString() {
        String temp = "";
        temp += "Superhero name: " + superheroName + '\n';
        temp += "Civilian name: " + civilianName + '\n';
        temp += "Superpower: " + superPower + '\n';
        temp += "Is human: " + isHuman + '\n';
        temp += "Creation Year: " + creationYear + '\n';
        temp += "Strengh: " + strengh;
        return temp;
    }
}
