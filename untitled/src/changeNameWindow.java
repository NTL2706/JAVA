import settingForOneToOneWindow.settingForOneToOneWindow;

import javax.swing.*;
import java.awt.*;

public class changeNameWindow extends JDialog{
    private JTextField newName;
    private JPanel changeNamePanel;
    public changeNameWindow(JFrame parent){
        super(parent);
        setTitle("Change name");
        setContentPane(changeNamePanel);
        setMinimumSize(new Dimension(450, 100));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        changeNameWindow changeNameWindow = new changeNameWindow(null);
    }
}
