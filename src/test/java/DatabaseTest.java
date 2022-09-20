import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database superheroes;

    @BeforeEach
    public void setup(){
        superheroes = new Database();
    }


    @Test
    void addOneSuperhero(){
        //Arrange
        int expectedSize = 1;

        //Act
        superheroes.addSuperhero("s1", "c1", "p1", true, 1, 1);

        int size = superheroes.getAllSuperheroes().size();

        //Assert
        assertEquals(expectedSize, size);
    }

    @Test
    void addMultipleSuperheroes() {
        //Arrange
        int expectedSize = 3;

        //Act
        superheroes.addSuperhero("s1", "c1", "p1", true, 1, 1);
        superheroes.addSuperhero("s2", "c2", "p2", true, 2, 2);
        superheroes.addSuperhero("s3", "c3", "p3", true, 3, 3);

        int size = superheroes.getAllSuperheroes().size();

        //Assert
        assertEquals(expectedSize, size);
    }

    @Test
    void searchSuperheroesNoMatch(){
        //Arrange
        int expectedSize = 0;
        //Act
        superheroes.addSuperhero("s1", "c1", "p1", true, 1, 1);
        int size = superheroes.searchSuperheroes("WrongName").size();
        //Assert
        assertEquals(expectedSize, size);
    }

    @Test
    void searchSuperheroesOneMatch(){
        //Arrange
        int expectedSize = 1;
        //Act
        superheroes.addSuperhero("s1", "c1", "p1", true, 1, 1);
        int size = superheroes.searchSuperheroes("s1").size();
        //Assert
        assertEquals(expectedSize, size);
    }

    @Test
    void searchSuperheroesMultipleMatches(){
        //Arrange
        int expectedSize = 3;
        //Act
        superheroes.addSuperhero("sup1", "c1", "p1", true, 1, 1);
        superheroes.addSuperhero("sup2", "c2", "p2", true, 2, 2);
        superheroes.addSuperhero("sup3", "c3", "p3", true, 3, 3);
        int size = superheroes.searchSuperheroes("sup").size();
        //Assert
        assertEquals(expectedSize, size);
    }
}