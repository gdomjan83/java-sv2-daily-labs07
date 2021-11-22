package day01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HumanTest {

    @Test
    void testCreate(){
        Human human = new Human("Domján Gábor", 1983);
        assertEquals("Domján Gábor", human.getName());
        assertEquals(1983, human.getYearOfBirth());
    }

    @Test
    void testWrongName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("DomjánGábor", 1983));
    }
    @Test
    void testWrongAge() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("Domján Gábor", 1800));
    }


}
