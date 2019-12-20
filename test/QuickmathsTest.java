import org.junit.Test;

import static org.junit.Assert.*;

public class QuickmathsTest {

    @Test
    public void testSum() {
        Quickmaths quickmaths = new Quickmaths();
        int x = 2;
        int y = 8;
        int result = quickmaths.sum(x, y);

        assertEquals(10, result);
    }

    @Test
    public void testGennemsnit() {
        Quickmaths quickmaths = new Quickmaths();
        int x = 2;
        int y = 8;
        int result = quickmaths.gennemsnit(x, y);

        assertEquals(5, result);

    }

}