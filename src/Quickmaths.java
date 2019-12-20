import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths {

    /* Opret en lommeregner-klasse, som indlæser to tal fra brugeren via Scanner og udfører matematiske operationer på den.
    Klassenavn: QuickMaths.
    Klassen skal have 4 metoder:

gennemsnit(int a, int b), returnerer integer
sum(int a, int b), returnerer integer
start() - returnerer intet, men starter en løkke, der indlæser 2 tal, og viser både deres gennemsnit og sum, og starter forfra med at indlæse tal.
main-metoden (psvm) skal bringe det hele i spil.

Skriv unit tests til metodene gennemsnit(int a, int b) og sum(int a, int b). Start() skal ikke testes.

Tegn UML klassediagram til klassen, og gem den i UML mappen i dit projekt.
     */

    public static void main(String[] args) {

        // Her instantierer jeg startmetoden.
        start();

    }

    // Udregner gennemsnittet af 2 tal
    public static int gennemsnit(int a, int b) {
        int resultat = (a + b) / 2;
        return resultat;
    }

    // Udregner summen af 2 tal
    public static int sum(int a, int b) {
        int resultat = a + b;
        return resultat;
    }

    public static void start() {

        // Her laver jeg en uendelig løkke der altid er sand.
        while (1 == 1) {

            // Her instantierer jeg en scanner og får input fra brugeren.
            Scanner scanner = new Scanner(System.in);

            System.out.print("Indtast første tal: ");
            int num1 = scanner.nextInt();

            System.out.print("Indtast andet tal: ");
            int num2 = scanner.nextInt();

            // Her udskrives gennemsnittet af de 2 tal.
            System.out.println("Gennemsnit af " + num1 + " og " + num2 + " = " + gennemsnit(num1, num2));

            // Her udskrives summen af de 2 tal.
            System.out.println("Summen af " + num1 + " og " + num2 + " = " + sum(num1, num2));

        }

    }
}