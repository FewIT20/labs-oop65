/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week11;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import utils.FewFont;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class StudentView {
    
    private JFrame frame;
    private JPanel panel1, panel2;
    private TextField text1, text2, text3;
    private JButton btn1, btn2;

    public StudentView() {
        frame = new JFrame("Student Bank's");
        panel1 = new JPanel(new GridLayout(3, 2));
        panel2 = new JPanel(new FlowLayout());
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        
        text1 = new TextField(10);
        text2 = new TextField(10);
        text3 = new TextField(10);
        
        text3.setEnabled(false);
        
        FewFont.addThaiFont(btn1, btn2);
        
        panel1.add(new JLabel(" ID : "));
        panel1.add(text1);
        panel1.add(new JLabel(" Name : "));
        panel1.add(text2);
        panel1.add(new JLabel(" Money : "));
        panel1.add(text3);
        
        panel2.add(btn1);
        panel2.add(btn2);
        
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public TextField getID() {
        return text1;
    }

    public void setID(TextField text1) {
        this.text1 = text1;
    }

    public TextField getName() {
        return text2;
    }

    public void setName(TextField text2) {
        this.text2 = text2;
    }

    public TextField getMoney() {
        return text3;
    }

    public void setMoney(TextField text3) {
        this.text3 = text3;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }
    
    
    
}
