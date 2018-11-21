package tokoemas;

import database.Controller;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import panels.*;

/**
 *
 * @author Xenon
 */
public class MyFrame extends JFrame {
    
    LeftMenu menu;
    JSplitPane splitPane;
    TransaksiPanel transaksiPanel;
    WelcomePanel welcomePanel;
    
    MyFrame(){
        welcomePanel = new WelcomePanel(this);
        add(welcomePanel);
        setPreferredSize(new Dimension(1280, 720));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    
    public static void main(String[] args) {
        Controller controller = new Controller();
        MyFrame frame = new MyFrame();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void changeContent() {
        welcomePanel.setVisible(false);
        splitPane = new JSplitPane();
        menu = new LeftMenu(splitPane);
        transaksiPanel = new TransaksiPanel(); //Ganti dengan Dashboard!

        splitPane.setDividerLocation(300);
        splitPane.setLeftComponent(menu);
        splitPane.setRightComponent(transaksiPanel);
        splitPane.remove(splitPane.getComponent(0));

        add(splitPane);
    }
}
