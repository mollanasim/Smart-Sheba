package smartseba;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SmartSeba{

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        changeLookAndFeel();
        new UserInterface().setVisible(true);
    }
    
    public static void changeLookAndFeel(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
