package kivipaperisakset.test;

import static org.junit.jupiter.api.Assertions.*;

import kivipaperisakset.Pelaaja;
import org.junit.jupiter.api.Test;

class PelaajaTest {
    @Test
    public void testPelaajanValinta() {
        Pelaaja player = new Pelaaja();
        String choice = player.pelaajanValinta();
        assertTrue(choice.equals("kivi") || choice.equals("paperi") || choice.equals("sakset"));
    }

    @Test
    public void testIncrementVoitot() {
        Pelaaja player = new Pelaaja();
        player.incrementVoitot();
        assertEquals(1, player.getVoitot());
    }

}