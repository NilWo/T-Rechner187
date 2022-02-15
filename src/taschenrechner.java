import java.util.Scanner;

public class taschenrechner {

    int anz;
    double ergebnis = 0;
    double zahl[];


    public void erfassung() {
        int nte;
        Scanner scannerVariable = new Scanner(System.in);
        System.out.println("Mit wie viel Zahlen möchtest du rechnen?");
        anz = scannerVariable.nextInt();
        zahl = new double[anz];
        for (int i = 0; i < anz; i++) {
            nte = i + 1;
            System.out.println("Zahl " + nte + "?");
            zahl[i] = scannerVariable.nextDouble();
        }
    }

    public void summe() {
        for (int i = 0; ; i++) {
            if (i >= anz) {
                System.out.print("=");
                break;
            } else {
                if (i < anz - 1) {
                    System.out.print(zahl[i] + "+");
                } else {
                    System.out.print(zahl[i]);
                }
            }
        }

        ergebnis = zahl[0];

        for (int i = 1; ; i++) {
            if (i > anz - 1)
                break;
            else
                ergebnis = ergebnis + zahl[i];
        }
        System.out.print(ergebnis);
    }

    public void subtraktion() {
        for (int i = 0; ; i++) {
            if (i >= anz) {
                System.out.print("=");
                break;
            } else {
                if (i < anz - 1) {
                    System.out.print(zahl[i] + "-");
                } else {
                    System.out.print(zahl[i]);
                }
            }
        }

        ergebnis = zahl[0];

        for (int i = 1; ; i++) {
            if (i > anz - 1)
                break;
            else
                ergebnis = ergebnis - zahl[i];
        }
        System.out.print(ergebnis);
    }

    public void multiplikation() {
        for (int i = 0; ; i++) {
            if (i >= anz) {
                System.out.print("=");
                break;
            } else {
                if (i < anz - 1) {
                    System.out.print(zahl[i] + "*");
                } else {
                    System.out.print(zahl[i]);
                }
            }
        }

        ergebnis = zahl[0];

        for (int i = 1; ; i++) {
            if (i > anz - 1)
                break;
            else
                ergebnis = ergebnis * zahl[i];
        }
        System.out.print(ergebnis);
    }

    public void division() {
        for (int i = 0; ; i++) {
            if (i >= anz) {
                System.out.print("=");
                break;
            } else {
                if (i < anz - 1) {
                    System.out.print(zahl[i] + ":");
                } else {
                    System.out.print(zahl[i]);
                }
            }
        }

        ergebnis = zahl[0];

        for (int i = 1; ; i++) {
            if (i > anz - 1)
                break;
            else
                ergebnis = ergebnis / zahl[i];
        }
        System.out.print(ergebnis);
    }

    public void potenz() {
        for (int i = 0; ; i++) {
            if (i >= anz) {
                System.out.print("=");
                break;
            } else {
                if (i < anz - 1) {
                    System.out.print(zahl[i] + "^");
                } else {
                    System.out.print(zahl[i]);
                }
            }

        }

        ergebnis = zahl[0];

        for (int i = 1; ; i++) {

            if (i > anz - 1)
                break;
            else
                ergebnis = Math.pow(ergebnis, zahl[i]);
        }
        System.out.print(ergebnis);
    }

    public void wurzel() {
        if (anz != 1)
        {
            System.out.print("Du darfst bei Wurzeln nur eine Zahl berechnen lassen!");
        }
        else
        {
            System.out.print("√" + zahl[0] + "=");

            ergebnis = Math.sqrt(zahl[0]);
            System.out.print(ergebnis);
        }
    }
}

