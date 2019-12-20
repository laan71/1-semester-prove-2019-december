import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.reverse;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */

public class Loops {

    /*Skriv en metode, der hedder waitingFor0(). Metoden skal blive ved med at indlæse tal fra brugeren så længe, tallet ikke er 0.
    Brug en while-loop og Scanner til indlæsning af tal.
    Skriv en metode, der hedder printBrugereArr(). Metoden skal vise alle brugere fra brugere[] vha. et for loop.
    Skriv en metode, der hedder printBrugereReverseArr(). Metoden skal vise alle brugere fra brugere[] i omvendt rækkefølge.
     */

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {
        return brugere;
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

    /**
     * Viser en liste med brugere i konsollen vha en for løkke
     */
    public void printBrugereArr() {

        for (String user: brugere) {
            System.out.println(user);
        }
    }

    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge vha en for løkke
     */
    public void printBrugereReverseArr() {

        for (int count = brugere.length - 1; count >= 0; count--) {
            System.out.println(brugere[count]);
        }


    }

    // Indlæs tal så længe tallet ikke er 0 vha en while løkke

    public void waitingFor0() {

        int i = 25;
        while ( i != 0 ) {
            System.out.println("Venter på 0!");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Skriv et tal... ");
            i = scanner.nextInt();

            if ( i == 0 ) {
                System.out.println("Du har tastet 0. Så er det slut!");
            }
        }
 
    }
}
