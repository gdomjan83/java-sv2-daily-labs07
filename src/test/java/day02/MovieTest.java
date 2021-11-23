package day02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

    @Test
    void testCreate() {
    Movie movie = new Movie("Joe Black", 1991, "Ricky Dicky");

    assertEquals("Joe Black",movie.getTitle());
    assertEquals(1991,movie.getYearOfRelease());
    assertEquals("Ricky Dicky",movie.getDirector());
    }
}
