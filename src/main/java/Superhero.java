public class Superhero {
    private String superheroName;
    private String civilianName;
    private String superPower;
    private boolean isHuman;
    private int creationYear;
    private double strengh;

    public Superhero(String superheroName, String civilianName, String superPower, boolean isHuman, int creationYear, double strengh) {
        this.superheroName = superheroName;
        this.civilianName = civilianName;
        this.superPower = superPower;
        this.isHuman = isHuman;
        this.creationYear = creationYear;
        this.strengh = strengh;

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

    public boolean isHuman() {
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

    public void setIsHuman(boolean isHuman) {
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
