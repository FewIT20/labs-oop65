package week8;

import utils.FewFont;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorOneGUI implements ActionListener  {

    private JPanel panel;
    private JFrame frame;
    private JButton btn1, btn2, btn3, btn4;
    private TextField text1, text2, text3;

    public CalculatorOneGUI() {
        registerTextField();
        registerButton();
        panel = new JPanel();
        frame = new JFrame("เครื่องคิดเลข");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(4, 0));
        panel.setLayout(new FlowLayout());
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        frame.add(text1);
        frame.add(text2);
        frame.add(panel);
        frame.add(text3);
        frame.pack();
        frame.setVisible(true);
    }

    private void registerTextField() {
        text1 = new TextField();
        text2 = new TextField();
        text3 = new TextField();
    }

    private void registerButton() {
        btn1 = new JButton("บวก");
        btn2 = new JButton("ลบ");
        btn3 = new JButton("คูณ");
        btn4 = new JButton("หาร");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        FewFont.addThaiFont(btn1, btn2, btn3, btn4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = 0, num2 = 0;
        try {
            num1 = Double.parseDouble(text1.getText());
            num2 = Double.parseDouble(text2.getText());
        } catch (NumberFormatException ex) {
            text3.setText("เอาเลขเท่านั้นสิ จะเอาข้อความมาทำไม");
        }
        String total = "";
        if (e.getSource().equals(btn1)) {
            total += String.valueOf(num1+num2);
        } else if (e.getSource().equals(btn2)) {
            total += String.valueOf(num1-num2);
        } else if (e.getSource().equals(btn3)) {
            total += String.valueOf(num1*num2);
        } else if (e.getSource().equals(btn4)) {
            if (num1 == 0 || num2 == 0) {
                total += "0 หาร 0 ไม่ได้นะ";
            } else {
                total += String.valueOf(num1/num2);
            }
        }
        text3.setText(total);
    }
}
