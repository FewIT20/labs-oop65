/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class ChatDemoController implements ActionListener, WindowListener {
    
    private ChatDemoView view;
    private ChatDemoModal modal;

    public ChatDemoController() {
        view = new ChatDemoView();
        modal = new ChatDemoModal();
        
        view.getBtn1().addActionListener(this);
        view.getBtn2().addActionListener(this);
        view.getFream().addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.getBtn1())) {
            DateTimeFormatter date = DateTimeFormatter.BASIC_ISO_DATE.ofPattern("yyyy/MM/dd HH:mm:ss");
            view.getConsole().setText(view.getConsole().getText() + date.format(LocalDateTime.now()) + ": " + view.getChatbox().getText() + "\n");
            view.getChatbox().setText("");
        } else if (e.getSource().equals(view.getBtn2())) {
            view.getConsole().setText("");
            view.getChatbox().setText("");
        }
    }
    
     @Override
    public void windowOpened(WindowEvent e) {
        String message = modal.loadText();
        view.getConsole().setText(message);
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        String message = view.getConsole().getText();
        modal.saveText(message);
    }

    //Junk code 
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
}
