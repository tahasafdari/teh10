package kivipaperisakset.test;

import static org.junit.jupiter.api.Assertions.*;

import kivipaperisakset.Pelaaja;
import kivipaperisakset.Peli;
import org.junit.jupiter.api.Test;

class PeliTest {

    @Test
    public void testDetermineWinner() {
        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();
        Peli.determineWinner(p1, p2, "kivi", "sakset");
        assertEquals(1, p1.getVoitot());
        assertEquals(0, p2.getVoitot());

    }

}