
package kivipaperisakset;

/**
 *
 * @author Ira Dook
 * @version 1.0
 * This class represents a player in the rock-paper-scissors game.
 * It keeps track of the number of victories a player has.
 */
public class Pelaaja {

    private int voitot;      // Number of victories

    /**
     * Generates a random selection of rock, paper, or scissors.
     * @return A string representing the player's choice.
     */
    public String pelaajanValinta() {
        String valinta = "";
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0:
                valinta = "kivi"; // "rock"
                break;
            case 1:
                valinta = "paperi"; // "paper"
                break;
            case 2:
                valinta = "sakset"; // "scissors"
                break;
        }
        return valinta;
    }

    /**
     * Increments and returns the total number of victories.
     */
    public void incrementVoitot() {
        voitot++;
    }

    /**
     * Returns the current number of victories.
     * @return The number of victories.
     */
    public int getVoitot() {
        return voitot;
    }
}
