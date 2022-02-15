import java.util.Scanner;

public class choiceclass {

    String rechentyp;
    public static taschenrechner rechner2;

    public void choice() {
        rechner2=new taschenrechner();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie möchtest du rechnen? Summe, Subtraktion, Multiplikation, Division, Potenz oder Wurzel?");
        rechentyp = scanner.nextLine();

        if (rechentyp.equals("Summe")) {
            rechner2.erfassung();
            rechner2.summe();
        }

        else if (rechentyp.equals("Subtraktion")) {
            rechner2.erfassung();
            rechner2.subtraktion();
        }

        else if (rechentyp.equals("Multiplikation")) {
            rechner2.erfassung();
            rechner2.multiplikation();
        }

        else if (rechentyp.equals("Division")) {
            rechner2.erfassung();
            rechner2.division();
        }

        else if (rechentyp.equals("Potenz")) {
            rechner2.erfassung();
            rechner2.potenz();
        }

        else if (rechentyp.equals("Wurzel")) {
            rechner2.erfassung();
            rechner2.wurzel();
        }

        else{
        System.out.println("Falsche Eingabe!");
        }
    }
}
