package loginWindow;

import addANewPersonWindow.addANewPersonWindow;
import registerWindow.registerWindow;
import javax.swing.*;
import java.awt.*;

public class loginWindow extends JDialog{
    private JTextField username;
    private JTextField password;
    private JButton Login;
    private JButton signup;
    private JPanel loginPanel;
//    public loginWindow(JFrame parent){
//        super(parent);
//        setTitle("Login");
//        setContentPane(loginPanel);
//        setMinimumSize(new Dimension(450, 474));
//        setModal(true);
//        setLocationRelativeTo(parent);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        setVisible(true);
//    }
    public static void main(String[] args){
        //loginWindow loginWindow = new loginWindow(null);
        //new registerWindow();
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new loginWindow().loginPanel);
        frame.setSize(450, 474);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
