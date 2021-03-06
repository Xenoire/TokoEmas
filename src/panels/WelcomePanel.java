package panels;

import POJO.User;
import database.Controller;
import java.awt.Color;
import java.awt.Dimension;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tokoemas.MyFrame;

/**
 *
 * @author Xenon
 */
public class WelcomePanel extends javax.swing.JPanel {

    /**
     * Creates new form WelcomePanel1
     */
    MyFrame frame;

    public WelcomePanel() {
        initComponents();

    }

    public WelcomePanel(MyFrame frame) {
        this.frame = frame;
        initComponents();
        Dimension dim = new Dimension(1280, 720);
        this.setSize(dim);
        this.setMinimumSize(dim);
        this.setMaximumSize(dim);
        this.setPreferredSize(dim);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        welcomeLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        tokoEmasLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 231, 192));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setBackground(new java.awt.Color(102, 0, 0));
        loginButton.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorder(null);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 83, 25));

        passwordField.setForeground(new java.awt.Color(102, 102, 102));
        passwordField.setText("password");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 243, 24));

        welcomeLabel.setFont(new java.awt.Font("Myriad Pro", 0, 36)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(102, 0, 0));
        welcomeLabel.setText("Selamat Datang");
        add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(102, 0, 0));
        passwordLabel.setText("Password");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        tokoEmasLabel.setFont(new java.awt.Font("Myriad Pro", 0, 36)); // NOI18N
        tokoEmasLabel.setForeground(new java.awt.Color(102, 0, 0));
        tokoEmasLabel.setText("TOKO EMAS");
        add(tokoEmasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setForeground(new java.awt.Color(102, 102, 102));
        usernameField.setText("Masukkan username.");
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 243, -1));

        usernameLabel.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(102, 0, 0));
        usernameLabel.setText("Username");
        add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            String passwordEncrypted = credAndPass(new String(passwordField.getPassword()));
            User user = Controller.getUserbyUsername(usernameField.getText());
            if (user != null) {
                if (user.getPassword().equals(passwordEncrypted)) {
                    frame.changeContent(user);
                } else {
                    JOptionPane.showMessageDialog(this, "Username atau Password salah.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Username atau Password salah.");
            }
        } catch (Exception ex) {
            Logger.getLogger(WelcomePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        char defaultPass[] = {'p', 'a', 's', 's', 'w', 'o', 'r', 'd'};
        char getPass[] = passwordField.getPassword();
        if (Arrays.equals(getPass, defaultPass)) {
            passwordField.setText("");
            passwordField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        if (passwordField.getPassword().length == 0) {
            passwordField.setText("password");
            passwordField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_passwordFieldFocusLost

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        if (usernameField.getText().equals("Masukkan username.")) {
            usernameField.setText("");
            usernameField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_usernameFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        if (usernameField.getText().equals("")) {
            usernameField.setText("Masukkan username.");
            usernameField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_usernameFieldFocusLost

    public static String credAndPass(String original) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(original.getBytes());
        byte[] digest = md.digest();
        // builder of String
        StringBuilder sb = new StringBuilder(32);
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }
        // Returns the result
        return sb.toString();
    }

    public static void main(String args[]) {
        Controller con = new Controller();
        JFrame a = new JFrame();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WelcomePanel panel = new WelcomePanel();
        //a.setPreferredSize(dialog.getPreferredSize());
        a.setSize(panel.getPreferredSize());
        a.setContentPane(panel);
        a.setVisible(true);
        System.out.println("Width : " + a.getWidth());
        System.out.println("Height : " + a.getHeight());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel tokoEmasLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
