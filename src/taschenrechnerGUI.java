/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Scanner;

public class taschenrechnerGUI implements ActionListener {

    int anz;
    double ergebnis = 0;
    double zahl[];
    JFrame frame;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonplus;
    JButton buttonminus;
    JButton buttonmal;
    // JLabel label;
    JPanel panel;

    public void taschenrechnerGUI() {
        frame = new JFrame();

        // Zahlenbuttons
        button1 = new JButton("1");
        button1.addActionListener(this);

        button2 = new JButton("2");
        button2.addActionListener(this);

        button3 = new JButton("3");
        button3.addActionListener(this);

        button4 = new JButton("4");
        button4.addActionListener(this);

        button5 = new JButton("5");
        button5.addActionListener(this);

        button6 = new JButton("6");
        button6.addActionListener(this);

        button7 = new JButton ("7");
        button7.addActionListener(this);

        button8 = new JButton ("8");
        button8.addActionListener(this);

        button9 = new JButton("9");
        button9.addActionListener(this);

        buttonplus = new JButton("+");
        buttonplus.addActionListener(this);

        buttonminus = new JButton("-");
        buttonminus.addActionListener(this);

        buttonmal = new JButton("*");
        buttonmal.addActionListener(this);

        // label = new JLabel("Idfk");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel.setLayout(new GridLayout(4, 3));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonplus);
        panel.add(buttonminus);
        panel.add(buttonmal);

        // panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setTitle("Taschenrechner GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public void erfassungGUI() {
        ActionListener buttonListener = new ActionListener();
        int nte;
        Scanner scannerVariable = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Mit wie viel Zahlen möchtest du rechnen?");
        anz = scannerVariable.nextInt();
        zahl = new double[anz];

        for (int i = 0; i < anz; i++) {
            nte = i + 1;
            System.out.println("Zahl " + nte + "?");
        }
    }

    public void setUpButtonListeners() {
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            }
        }

    }
}
 */