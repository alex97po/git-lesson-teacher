import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {

    @Test
    public void noCitiesVisited() {
        assertEquals("Stockholm", Kata.conferencePicker(
                new String[] {},
                new String[] {"Stockholm","Paris","Melbourne"}));
    }

    @Test
    public void noNewCities() {
        assertEquals("No worthwhile conferences this year!", Kata.conferencePicker(
                new String[] {"London","Mexico City","Melbourne","Buenos Aires","Berlin","Hong Kong"},
                new String[] {"Berlin","Melbourne"}));
    }
}