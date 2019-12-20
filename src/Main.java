/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {

     /* Skriv en "Hello world!"-applikation i Java, klassenavnet skal være Main.
    Lav en hello(String navn) metode i klassen. Metoden skal returnere teksten "Hello András!", når man kalder den som: hello("András")
    Hvis man kalder metoden med en tom tekststreng hello(""), så skal den returnere "Hello World!” */

    public static void main(String[] args) {
        String greeting = hello("András");
        System.out.println(greeting);
    }
    public static String hello(String name) {
        if (name.isEmpty()) {
            name = "World!";
        }
        return ("Hello " + name);
    }

}
