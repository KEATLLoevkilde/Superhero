import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database superheroes;

    @BeforeEach
    public void setup(){
        superheroes = new Database();
        superheroes.addSuperhero("s1", "c1", "p1", true, 1, 1);
        superheroes.addSuperhero("s2", "c2", "p2", true, 2, 2);
        superheroes.addSuperhero("s3", "c3", "p3", true, 3, 3);
    }


    @Test
    void addOneSuperhero(){
        //Arrange
        int expectedSize = 4;

        //Act
        superheroes.addSuperhero("s4", "c4", "p4", true, 4, 4);

        int actualSize = superheroes.getAllSuperheroes().size();

        //Assert
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void addMultipleSuperheroes() {
        //Arrange
        int expectedSize = 6;

        //Act
        superheroes.addSuperhero("s4", "c4", "p4", true, 4, 4);
        superheroes.addSuperhero("s5", "c5", "p5", true, 5, 5);
        superheroes.addSuperhero("s6", "c6", "p6", true, 6, 6);

        int actualSize = superheroes.getAllSuperheroes().size();

        //Assert
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void searchSuperheroesNoMatch(){
        //Arrange
        int expectedSize = 0;
        //Act
        int actualSize = superheroes.searchSuperheroes("WrongName").size();
        //Assert
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void searchSuperheroesOneMatch(){
        //Arrange
        int expectedSize = 1;
        //Act
        int actualSize = superheroes.searchSuperheroes("s1").size();
        //Assert
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void searchSuperheroesMultipleMatches(){
        //Arrange
        int expectedSize = 3;
        //Act
        int actualSize = superheroes.searchSuperheroes("s").size();
        //Assert
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void deleteSuperhero(){
        int expectedSize = 0;

        superheroes.deleteSuperhero("s1");

        int actualSize = superheroes.searchSuperheroes("s1").size();

        assertEquals(expectedSize, actualSize);
    }
}