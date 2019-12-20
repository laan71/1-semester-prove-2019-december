import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person {

    /*
    Noob Noobeson er din ny kollega fra Noobien. Han har kun lært datatypen String. Du skal hjælpe ham med at vælge de rette datatyper i klassen Person.

    Vis gerne et eksempel på typecasting i Person-klassens toString()- og main()-metoder.

     */

    // Datatyper rettet
    String navn; // Test Testesen
    int alder; // 18
    String by; // Næstved
    int postNummer; // 4700
    String vej; // Femøvej
    int husnummer; // 3B
    String nationalitet; // Dansk
    ArrayList fritidsStringeresser; // Snitning, LOL, strikke
    ArrayList smarthomeDevices; // Xbox, 3 Smartlamper, Køleskab m.m.
    double hojde; // 1.56 m    // kunne også være float
    int vaegt;  // 76 kg
    double karaktergennemsnit; // 5.33    // kunne også være float
    ArrayList eksamensKarakterer; // 7, 12, -3, 4, 2, 10
    Date opdateretDato; // Sun Jan 08 00:00:00 CET 1978

    // Eksempler på typecasting
    @Override
    public String toString() {

        return "Navn: " + navn + "By" + by;
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.navn = "Test Testesen";
        person.by = "Næstved";
        System.out.println();
    }

}

    /* Jeg forstår ikke opgavens anden del om typecasting.

    Eksempel på typecasting:
    String hojde = "1,56";
    double hojde2 = Double.parseDouble(hojde);

    Der er ikke nogen variabler i de metoder der er relevante at typecaste efter min mening.
     */