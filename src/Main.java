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
        String player1Choice = wylosujWariant();
        String player2Choice;
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj imię pierwszego gracza: ");
        String gracz1 = scan.nextLine();
        System.out.println("Podaj imię drugiego gracza: ");
        String gracz2 = scan.nextLine();

        System.out.println("Imię pierwszego gracza to: " + gracz1 + " , imię drugiego gracza to: " + gracz2 + ".");
        for (int i = 0; i <= 19; i++) {
            System.out.println("Napisz co chcesz zagrac: ");
            player2Choice = scan.nextLine();
            System.out.println("Twoj wybor to: " + player2Choice);
            System.out.println("Wybór gracza komputerowego to: " + player1Choice);

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
            }else if (player1Choice.equals(SPOCK) && player2Choice.equals(KAMIEN)) {
                return 1;
            } else if (player1Choice.equals(PAPIER) && player2Choice.equals(SPOCK)) {
                return 1;
            } else if (player1Choice.equals(JASZCZURKA) && player2Choice.equals(PAPIER)) {
                return 1;
            }else if (player1Choice.equals(NOZYCZKI) && player2Choice.equals(JASZCZURKA)) {
                return 1;
            }else if (player1Choice.equals(SPOCK) && player2Choice.equals(NOZYCZKI)) {
                return 1;
            }else if (player1Choice.equals(KAMIEN) && player2Choice.equals(JASZCZURKA)) {
                return 1;
            }else if (player1Choice.equals(JASZCZURKA) && player2Choice.equals(SPOCK)) {
                return 1;
            }else if (player1Choice.equals(KAMIEN) && player2Choice.equals(SPOCK)) {
                return 2;
            } else if (player1Choice.equals(SPOCK) && player2Choice.equals(PAPIER)) {
                return 2;
            } else if (player1Choice.equals(PAPIER) && player2Choice.equals(JASZCZURKA)) {
                return 2;
            }else if (player1Choice.equals(JASZCZURKA) && player2Choice.equals(NOZYCZKI)) {
                return 2;
            }else if (player1Choice.equals(NOZYCZKI) && player2Choice.equals(SPOCK)) {
                return 2;
            }else if (player1Choice.equals(JASZCZURKA) && player2Choice.equals(KAMIEN)) {
                return 2;
            }else if (player1Choice.equals(SPOCK) && player2Choice.equals(JASZCZURKA)) {
                return 2;
            }

            return -1;
        }


        }




    }


    public static int wynikGry() {

        if


    }
}