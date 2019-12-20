package Quiz;

public class Quiz {

    /* Design og udvikl 3 nye java-klasser til en quiz-applikation: Sporgsmaal, Svar og Quiz.
       Lav en ny pakke, som hedder quiz. Nedenstående klasser skal oprettes i denne pakke.
       Svar.java skal indeholde en enkelt instansvariabel af typen String, som skal indeholde teksten af en svarmulighed.
       Sporgsmaal.java skal repræsentere spørgsmålene i quizzen.
       Klassen skal indeholde private instansvariabler svarende til teksten af spørgsmålet, en pointværdi, 2-4 svarmuligheder og en variable,
       der angiver, hvilket svar er det rigtige. Overvej, hvad er gode navne for disse variabler.
       Du skal via constructor eller setters sørge for, at følgende overholdes:
       Et spørgsmål må være maksimum 100 tegn langt.
       Spørgsmålene skal have nogle svarmuligheder tilknyttet af typen Svar.
       Objekterne skal indeholde information om, hvilket svar er det rigtige.
       Instansvariablerne skal være private, og du skal lave getters og setters således:
       Hvis brugeren indtaster en længere spørgsmål end 100 tegn, skal du smide en exception som f.eks.:
       throw new IllegalArgumentException("Spørgsmål må maks. være 100 tegn.");
       Hvis pointværdi er større eller mindre end forventet skal du også smide en tilsvarende exception.
       Den tredje klasse, som du skal udvikle, er Quiz.java, som skal indeholde et enkelt spørgsmåls-objekt med tilhørende svar.
       I denne klasse kan du i en main-metode bringe de andre klasser i spil.
       Tegn et klassediagram for ovenstående og implementer koden.

     */
}
