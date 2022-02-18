import java.util.Scanner;

public class choiceclass {

    String rechentyp;
    String rerun;
    public static taschenrechner rechner2;

    public void choice() {
        for (; ; ) {
            rechner2 = new taschenrechner();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Wie möchtest du rechnen? Summe, Subtraktion, Multiplikation, Division, Potenz oder Wurzel?");
            rechentyp = scanner.nextLine();

            if (rechentyp.equals("Summe")) {
                rechner2.erfassung();
                rechner2.summe();
            } else if (rechentyp.equals("Subtraktion")) {
                rechner2.erfassung();
                rechner2.subtraktion();
            } else if (rechentyp.equals("Multiplikation")) {
                rechner2.erfassung();
                rechner2.multiplikation();
            } else if (rechentyp.equals("Division")) {
                rechner2.erfassung();
                rechner2.division();
            } else if (rechentyp.equals("Potenz")) {
                rechner2.erfassung();
                rechner2.potenz();
            } else if (rechentyp.equals("Wurzel")) {
                rechner2.erfassung();
                rechner2.wurzel();
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