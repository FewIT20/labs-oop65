/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class StudentController implements ActionListener, WindowListener {
    
    private StudentView view;
    private StudentModal modal;

    public StudentController() {
        view = new StudentView();
        modal = new StudentModal();
        
        view.getBtn1().addActionListener(this);
        view.getBtn2().addActionListener(this);
    
        view.getFrame().addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Student student = modal.getStudent();
        if (e.getSource().equals(view.getBtn1())) {
            student.setMoney(student.getMoney() + 100);
        } else if (e.getSource().equals(view.getBtn2())) {
            if (student.getMoney() <= 0) {
                student.setMoney(0);
            } else {
                student.setMoney(student.getMoney() - 100);
            }
        }
        view.getMoney().setText(String.valueOf(student.getMoney()));
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        Student data = modal.load();
        view.getID().setText(String.valueOf(data.getID()));
        view.getName().setText(data.getName());
        view.getMoney().setText(String.valueOf(data.getMoney()));
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        modal.getStudent().setID(Integer.valueOf(view.getID().getText()));
        modal.getStudent().setName(view.getName().getText());
        modal.getStudent().setMoney(Integer.valueOf(view.getMoney().getText()));
        modal.save();
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
