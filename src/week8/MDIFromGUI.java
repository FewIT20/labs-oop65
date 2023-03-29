package week8;

import java.awt.*;

import javax.swing.*;

public class MDIFromGUI {

    private JFrame frame;
    private JDesktopPane desktopPane;
    private JInternalFrame internalFrame1, internalFrame2, internalFrame3;
    private JMenuBar navbar;
    private JMenu m1, m2, m3;
    private JMenu item1;
    private JMenuItem item2, item3, item4, item5, item6;

    public MDIFromGUI() {
        registerNavbar();
        frame = new JFrame("SubMenuItem Demo");
        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.black);
        desktopPane.add(createInternalFrame(internalFrame1));
        desktopPane.add(createInternalFrame(internalFrame2));
        desktopPane.add(createInternalFrame(internalFrame3));
        frame.setJMenuBar(navbar);
        frame.add(desktopPane, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setMinimumSize(new Dimension(300,300));
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    public void registerNavbar() {
        navbar = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");

        item1 = new JMenu("New");
        item2 = new JMenuItem("Open");
        item3 = new JMenuItem("Save");
        item4 = new JMenuItem("Exit");

        item5 = new JMenuItem("Windows");
        item6 = new JMenuItem("Message");

        item1.add(item5);
        item1.addSeparator();
        item1.add(item6);

        m1.add(item1);
        m1.add(item2);
        m1.addSeparator();
        m1.add(item3);
        m1.addSeparator();
        m1.add(item4);

        navbar.add(m1);
        navbar.add(m2);
        navbar.add(m3);
    }

    public JInternalFrame createInternalFrame(JInternalFrame internalFrame) {
        if (internalFrame == null) internalFrame = new JInternalFrame();
        internalFrame = new JInternalFrame("Application X", true, true, true, true);
        internalFrame.add(new JLabel("Frame 1 contents..."));
        internalFrame.setSize(new Dimension(500, 500));
        internalFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        internalFrame.pack();
        internalFrame.setVisible(true);

        int x = (int) (Math.random() * (internalFrame.getWidth()));
        int y = (int) (Math.random() * (internalFrame.getHeight()));

        internalFrame.setLocation(x, y);
        return internalFrame;
    }
}
