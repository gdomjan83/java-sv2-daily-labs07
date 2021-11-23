package day02;

import org.junit.jupiter.api.Test;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {
    @Test
    void testCreate() {
        MovieService service = new MovieService(Paths.get("src/test/resources/movies.csv"));

        assertEquals(5, service.getMovies().size());
        assertEquals("Titanic", service.getMovies().get(1).getTitle());
        assertEquals(2002, service.getMovies().get(3).getYearOfRelease());
        assertEquals("George Lucas", service.getMovies().get(2).getDirector());
    }

    @Test
    void testWrongFile() {
       IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
               () -> new MovieService(Paths.get("src/test/resources/12movies.csv")));
        assertEquals("Cannot read file.", iae.getMessage());
    }
}
