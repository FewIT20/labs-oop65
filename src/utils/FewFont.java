package utils;



import week8.*;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class FewFont {
    
    public static Font addThaiFont() {
        return new Font("TH SarabunPSK", Font.BOLD, 16);
    }

    public static void addThaiFont(int styleID, int size, JButton... buttons) {
        for (JButton btn : buttons) {
            btn.setFont(new Font("TH SarabunPSK", styleID, size));
        }
    }

    public static void addThaiFont(int size, JButton... buttons) {
        addThaiFont(Font.PLAIN, size, buttons);
    }

    public static void addThaiFont(JButton... buttons) {
        addThaiFont(Font.PLAIN, 16, buttons);
    }

    public static void addThaiFont(ArrayList<JButton> buttons) {
        for (JButton button : buttons) {
            addThaiFont(button);
        }
    }
}
