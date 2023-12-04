package kivipaperisakset;

/**
 * The main class for the rock-paper-scissors game.
 * Handles the game logic and the interaction between two players.
 */
public class Peli {

    /**
     * Entry point for the game.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        startGame();
    }

    /**
     * Starts the rock-paper-scissors game.
     */
    public static void startGame() {
        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();
        boolean peliLoppui = false;
        int pelatutPelit = 0;
        int tasapelit = 0;

        // Game loop
        do {
            System.out.println("Erä: " + pelatutPelit + " =====================\n");
            System.out.println("Tasapelien lukumäärä: " + tasapelit + "\n");

            String p1Valinta = p1.pelaajanValinta();
            System.out.println("Pelaaja 1: " + p1Valinta + "\n\t Pelaaja 1:llä koossa " + p1.getVoitot() + " voittoa.");

            String p2Valinta = p2.pelaajanValinta();
            System.out.println("Pelaaja 2: " + p2Valinta + "\n\t Pelaaja 2:lla koossa " + p2.getVoitot() + " voittoa.");

            determineWinner(p1, p2, p1Valinta, p2Valinta);
            if (p1Valinta.equals(p2Valinta)) {
                tasapelit++;
                System.out.println("\n\t\t\t Tasapeli \n");
            }

            pelatutPelit++;
            if ((p1.getVoitot() >= 3) || (p2.getVoitot() >= 3)) {
                peliLoppui = true;
                System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
            }
            System.out.println();
        } while (!peliLoppui);
    }

    /**
     * Determines the winner of the round.
     * @param p1 The first player.
     * @param p2 The second player.
     * @param p1Valinta The first player's choice.
     * @param p2Valinta The second player's choice.
     */
    public static void determineWinner(Pelaaja p1, Pelaaja p2, String p1Valinta, String p2Valinta) {
        if ((p1Valinta.equals("kivi") && p2Valinta.equals("sakset")) ||
                (p1Valinta.equals("paperi") && p2Valinta.equals("kivi")) ||
                (p1Valinta.equals("sakset") && p2Valinta.equals("paperi"))) {
            p1.incrementVoitot();
            System.out.println("Pelaaja 1 voittaa");
        } else if ((p2Valinta.equals("kivi") && p1Valinta.equals("sakset")) ||
                (p2Valinta.equals("paperi") && p1Valinta.equals("kivi")) ||
                (p2Valinta.equals("sakset") && p1Valinta.equals("paperi"))) {
            p2.incrementVoitot();
            System.out.println("Pelaaja 2 voittaa");
        }
    }
}
