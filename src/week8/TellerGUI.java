package week8;

import java.awt.*;

import javax.swing.*;

public class TellerGUI {

    private JFrame frame;
    private JPanel panel1, panel2;
    private JButton btn1, btn2, btn3;
    private JLabel label1, label2;
    private TextField text1, text2;

    private double balance = 6000;

    public TellerGUI() {
        registerButton();
        panel1 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel("Balance");
        label2 = new JLabel("Amount");
        text1 = new TextField(String.valueOf(balance));
        text2 = new TextField();
        text1.setEnabled(false);
        frame = new JFrame("Teller GUI");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 1));
        panel1.setLayout(new GridLayout(2, 2));
        panel1.add(label1);
        panel1.add(text1);
        panel1.add(label2);
        panel1.add(text2);
        frame.add(panel1);
        panel2.setLayout(new FlowLayout());
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        frame.add(panel2);
        frame.pack();
        frame.setVisible(true);
    }

    public void registerButton() {
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");

        FewFont.addThaiFont(btn1, btn2, btn3);
    }
}
