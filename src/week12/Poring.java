/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author admin
 */
public class Poring {
    
    private JFrame frame;
    private JLabel label;
    
    public Poring(int countable) {
        URL url = Poring.class.getResource("Poring.jfif");
        System.out.println(url.toString());
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        
        label = new JLabel(new ImageIcon(url));
        label.setText(countable+"");
        frame.add(label);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int)(Math.random()*(dimension.getWidth()-frame.getWidth())), (int)(Math.random()*(dimension.getHeight()-frame.getHeight())));
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        URL url = Poring.class.getResource("/resources/Poring.jfif");
        System.out.println(url);
    }
    
    
    
}
