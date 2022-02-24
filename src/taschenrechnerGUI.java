import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class taschenrechnerGUI implements ActionListener {

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


        // label = new JLabel("Idfk");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel.setLayout(new FlowLayout());
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        // panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Taschenrechner GUI");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // label.setText("kokain");
    }
}
