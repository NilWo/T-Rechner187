import java.util.Scanner;

public class choiceclass {

    String rechentyp;
    String rerun;
    public static taschenrechner rechner;

    public void choice() {
        for (;;) {
            rechner = new taschenrechner();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Wie möchtest du rechnen? Summe, Subtraktion, Multiplikation, Division, Potenz oder Wurzel?");
            rechentyp = scanner.nextLine();

            if (rechentyp.equals("Summe")) {
                rechner.erfassung();
                rechner.summe();
            } else if (rechentyp.equals("Subtraktion")) {
                rechner.erfassung();
                rechner.subtraktion();
            } else if (rechentyp.equals("Multiplikation")) {
                rechner.erfassung();
                rechner.multiplikation();
            } else if (rechentyp.equals("Division")) {
                rechner.erfassung();
                rechner.division();
            } else if (rechentyp.equals("Potenz")) {
                rechner.erfassung();
                rechner.potenz();
            } else if (rechentyp.equals("Wurzel")) {
                rechner.erfassung();
                rechner.wurzel();
            } else {
                System.out.println("Falsche Eingabe!");
            }

            System.out.println();
            System.out.println("Möchtest du noch eine Rechnung tätigen? y/n");
            rerun = scanner.nextLine();
            if (rerun.equals("y")) {
                System.out.println("Wunderbar!");
                System.out.println();
            } else if (rerun.equals("n")) {
                System.out.println("Schade marmelade!");
                break;
            } else {
                System.out.println("Falsche Eingabe!");
                break;
            }
        }
    }
}