package week9;

import utils.FewFont;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class CalculatorSample implements ActionListener {

    private JFrame frame;
    private JPanel panel1, panel2;
    private JButton btn1, btn2, btn3, btn4;
    private JButton btn5, btn6, btn7, btn8;
    private JButton btn9, btn10, btn11, btn12;
    private JButton btn13, btn14, btn15, btn16;
    private ArrayList<JButton> buttons;

    private TextField text;

    private double _num1;
    private double _num2;
    private String _operator;

    public CalculatorSample() {
        registerButton();
        text = new TextField();
        frame = new JFrame("My Calculator");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(text, BorderLayout.NORTH);
        panel2.setLayout(new GridLayout(4,4));
        addButtonToPanel();
        frame.setSize(1000, 1000);
        frame.add(panel1);
        frame.add(panel2);
        frame.pack();
        frame.setVisible(true);
    }

    public void addButtonToPanel() {
        for (JButton jButton : buttons) {
            panel2.add(jButton);
        }
    }

    private void registerButton() {
        panel1 = new JPanel();
        panel2 = new JPanel();

        btn1 = new JButton("7");
        btn2 = new JButton("8");
        btn3 = new JButton("9");
        btn4 = new JButton("+");
        btn5 = new JButton("4");
        btn6 = new JButton("5");
        btn7 = new JButton("6");
        btn8 = new JButton("-");
        btn9 = new JButton("1");
        btn10 = new JButton("2");
        btn11 = new JButton("3");
        btn12 = new JButton("x");
        btn13 = new JButton("0");
        btn14 = new JButton("c");
        btn15 = new JButton("=");
        btn16 = new JButton("/");

        buttons = new ArrayList<>(Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16));
        FewFont.addThaiFont(buttons);

        //Enable listener here
        for (JButton button : buttons) {
            button.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(btn4)) {
            _num1 = Double.parseDouble(text.getText());
            text.setText("");
            _operator = "+";
        } else if (source.equals(btn8)) {
            _num1 = Double.parseDouble(text.getText());
            text.setText("");
            _operator = "-";
        } else if (source.equals(btn12)) {
            _num1 = Double.parseDouble(text.getText());
            text.setText("");
            _operator = "*";
        } else if (source.equals(btn16)) {
            _num1 = Double.parseDouble(text.getText());
            if (_num1 == 0) {
                text.setText("0 หาร 0 ไม่ได้นะ");
            }
            _operator = "/";
        } else if (source.equals(btn14)) { //Clear state
            _num1 = 0;
            _num2 = 0;
            _operator = "";
            text.setText("");
        } else if (source.equals(btn15)) {
            String latest = text.getText();
            _num2 = Double.parseDouble(latest);
            switch (_operator) {
                case "+" -> text.setText(String.valueOf(_num1+_num2));
                case "-" -> text.setText(String.valueOf(_num1-_num2));
                case "*" -> text.setText(String.valueOf(_num1*_num2));
                case "/" -> text.setText(String.valueOf(_num1/_num2));
            }
        }

        String display = text.getText();
        display = (display != null ? display : "");
        switch (e.getActionCommand()) {
            case "0" -> text.setText(display + "0");
            case "1" -> text.setText(display + "1");
            case "2" -> text.setText(display + "2");
            case "3" -> text.setText(display + "3");
            case "4" -> text.setText(display + "4");
            case "5" -> text.setText(display + "5");
            case "6" -> text.setText(display + "6");
            case "7" -> text.setText(display + "7");
            case "8" -> text.setText(display + "8");
            case "9" -> text.setText(display + "9");
        }
    }
    
    public static void main(String[] args) {
        new CalculatorSample();
    }
}
