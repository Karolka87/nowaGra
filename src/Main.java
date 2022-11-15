import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static final String KAMIEN = "kamien";
    public static final String NOZYCZKI = "nozyczki";
    public static final String SPOCK = "spock";
    public static final String PAPIER = "papier";
    public static final String JASZCZURKA = "jaszczurka";

    public static String wylosujWariant() {
        String pkn[] = {KAMIEN, PAPIER, NOZYCZKI, JASZCZURKA, SPOCK};
        int losowanie = ThreadLocalRandom.current().nextInt(pkn.length);
        String wylosowana = pkn[losowanie];
        return wylosowana;
    }

    public static void main(String[] args) {
        String player2Choice;
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj imię pierwszego gracza: ");
        String gracz1 = scan.nextLine();
        System.out.println("Podaj imię drugiego gracza: ");
        String gracz2 = scan.nextLine();

        System.out.println("Imię pierwszego gracza to: " + gracz1 + " , imię drugiego gracza to: " + gracz2 + ".");
        int wynik1gracza = 0;
        int wynik2gracza = 0;

        for (int i = 0; i <= 19; i++) {
            String player1Choice = wylosujWariant();
            System.out.println("Napisz co chcesz zagrac: ");
            player2Choice = scan.nextLine();
            System.out.println("Twoj wybor to: " + player2Choice);
            System.out.println("Wybór gracza komputerowego to: " + player1Choice);

            int wynik = silnikGry(player1Choice, player2Choice);

            if (wynik == 0) {
                System.out.println("Gra zakończyła się remisem");

            } else if (wynik == 1 ){
                wynik1gracza++;
            } else if (wynik == 2) {
                wynik2gracza++;
            }
            System.out.println("Gracz " + gracz1 + " wygrał " + wynik1gracza + " razy, gracz " + gracz2 + " wygrał: " + wynik2gracza + " razy.");

        }

        }

    public static int silnikGry(String player1Choice, String player2Choice) {
        if (player1Choice.equals(player2Choice)) {
            return 0;
        } else if (player1Choice.equals(NOZYCZKI) && player2Choice.equals(PAPIER)) {
            return 1;
        } else if (player1Choice.equals(NOZYCZKI) && player2Choice.equals(KAMIEN)) {
            return 2;
        } else if (player1Choice.equals(PAPIER) && player2Choice.equals(NOZYCZKI)) {
            return 2;
        } else if (player1Choice.equals(PAPIER) && player2Choice.equals(KAMIEN)) {
            return 1;
        } else if (player1Choice.equals(KAMIEN) && player2Choice.equals(NOZYCZKI)) {
            return 1;
        } else if (player1Choice.equals(KAMIEN) && player2Choice.equals(PAPIER)) {
            return 2;
        } else if (player1Choice.equals(SPOCK) && player2Choice.equals(KAMIEN)) {
            return 1;
        } else if (player1Choice.equals(PAPIER) && player2Choice.equals(SPOCK)) {
            return 1;
        } else if (player1Choice.equals(JASZCZURKA) && player2Choice.equals(PAPIER)) {
            return 1;
        } else if (player1Choice.equals(NOZYCZKI) && player2Choice.equals(JASZCZURKA)) {
            return 1;
        } else if (player1Choice.equals(SPOCK) && player2Choice.equals(NOZYCZKI)) {
            return 1;
        } else if (player1Choice.equals(KAMIEN) && player2Choice.equals(JASZCZURKA)) {
            return 1;
        } else if (player1Choice.equals(JASZCZURKA) && player2Choice.equals(SPOCK)) {
            return 1;
        } else if (player1Choice.equals(KAMIEN) && player2Choice.equals(SPOCK)) {
            return 2;
        } else if (player1Choice.equals(SPOCK) && player2Choice.equals(PAPIER)) {
            return 2;
        } else if (player1Choice.equals(PAPIER) && player2Choice.equals(JASZCZURKA)) {
            return 2;
        } else if (player1Choice.equals(JASZCZURKA) && player2Choice.equals(NOZYCZKI)) {
            return 2;
        } else if (player1Choice.equals(NOZYCZKI) && player2Choice.equals(SPOCK)) {
            return 2;
        } else if (player1Choice.equals(JASZCZURKA) && player2Choice.equals(KAMIEN)) {
            return 2;
        } else if (player1Choice.equals(SPOCK) && player2Choice.equals(JASZCZURKA)) {
            return 2;
        }

        return -1;
    }


}
