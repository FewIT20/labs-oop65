/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week11;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import utils.FewFont;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class ChatDemoView {
    
    private JFrame fream;
    private JTextField chatbox;
    private JTextArea console;
    private JButton btn1, btn2;
    private JPanel panel1;

    public ChatDemoView() {
        fream = new JFrame("ChatDemo");
        chatbox = new JTextField(45);
        console = new JTextArea(20, 45);
        btn1 = new JButton("Submit");
        btn2 = new JButton("Reset");
        
        console.setFont(FewFont.addThaiFont());
        chatbox.setFont(FewFont.addThaiFont());
        
        panel1 = new JPanel();
        
        panel1.add(btn1);
        panel1.add(btn2);
        
        console.setEditable(false);
        
        fream.add(console, BorderLayout.NORTH);
        fream.add(chatbox, BorderLayout.CENTER);
        fream.add(panel1, BorderLayout.SOUTH);
        
        fream.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fream.pack();
        fream.setVisible(true);
    }

    /**
     * @return the fream
     */
    public JFrame getFream() {
        return fream;
    }

    /**
     * @param fream the fream to set
     */
    public void setFream(JFrame fream) {
        this.fream = fream;
    }

    /**
     * @return the chatbox
     */
    public JTextField getChatbox() {
        return chatbox;
    }

    /**
     * @param chatbox the chatbox to set
     */
    public void setChatbox(JTextField chatbox) {
        this.chatbox = chatbox;
    }

    /**
     * @return the console
     */
    public JTextArea getConsole() {
        return console;
    }

    /**
     * @param console the console to set
     */
    public void setConsole(JTextArea console) {
        this.console = console;
    }

    /**
     * @return the btn1
     */
    public JButton getBtn1() {
        return btn1;
    }

    /**
     * @param btn1 the btn1 to set
     */
    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    /**
     * @return the btn2
     */
    public JButton getBtn2() {
        return btn2;
    }

    /**
     * @param btn2 the btn2 to set
     */
    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    /**
     * @return the panel1
     */
    public JPanel getPanel1() {
        return panel1;
    }

    /**
     * @param panel1 the panel1 to set
     */
    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }
    
    
}
