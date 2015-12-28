
/*
 * LoginPanel.java
 *
 * Created on 09.Kas.2009, 11:54:54
 */

package fairhelper.panels;

import fairhelper.UserManager;
import fairhelper.language.Language;
import fairhelper.theme.Theme;
import javax.swing.*;

/**
 *
 * @author Ethem Cem Ozkan
 * Email cemozkan89@hotmail.com
 * No 07110604
 */
public class LoginPanel extends JPanel
{

    /** Creates new form LoginPanel */
    public LoginPanel()
    {
	  
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        userNameLabelBackPanel = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        passwordLabelBackPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        cleanButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        setBackground(Theme.getColor("fieldBackgroundColor1"));
        setForeground(Theme.getColor("fieldForegroundColor1"));
        setPreferredSize(new java.awt.Dimension(800, 480));

        jPanel1.setBackground(Theme.getColor("backgroundColor2"));

        loginButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 16));
        loginButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        loginButton.setText(Language.getText("loginButton"));

        userNameLabelBackPanel.setBackground(Theme.getColor("backgroundColor1"));

        userNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        userNameLabel.setForeground(Theme.getColor("labelColor1"));
        userNameLabel.setText(Language.getText("userNameLabel"));

        javax.swing.GroupLayout userNameLabelBackPanelLayout = new javax.swing.GroupLayout(userNameLabelBackPanel);
        userNameLabelBackPanel.setLayout(userNameLabelBackPanelLayout);
        userNameLabelBackPanelLayout.setHorizontalGroup(
            userNameLabelBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userNameLabelBackPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        userNameLabelBackPanelLayout.setVerticalGroup(
            userNameLabelBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userNameLabelBackPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userNameLabel)
                .addContainerGap())
        );

        passwordLabelBackPanel.setBackground(Theme.getColor("backgroundColor1"));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        passwordLabel.setForeground(Theme.getColor("labelColor1"));
        passwordLabel.setText(Language.getText("passwordLabel"));

        javax.swing.GroupLayout passwordLabelBackPanelLayout = new javax.swing.GroupLayout(passwordLabelBackPanel);
        passwordLabelBackPanel.setLayout(passwordLabelBackPanelLayout);
        passwordLabelBackPanelLayout.setHorizontalGroup(
            passwordLabelBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordLabelBackPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        passwordLabelBackPanelLayout.setVerticalGroup(
            passwordLabelBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordLabelBackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userNameField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        userNameField.setForeground(Theme.getColor("fieldForegroundColor1"));
        userNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameField.setCaretColor(Theme.getColor("fieldForegroundColor1"));

        cleanButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        cleanButton.setFont(new java.awt.Font("Tahoma", 1, 16));
        cleanButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        cleanButton.setText(Language.getText("cleanButton"));
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });

        passwordField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        passwordField.setForeground(Theme.getColor("fieldForegroundColor1"));
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setCaretColor(Theme.getColor("fieldForegroundColor1"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cleanButton, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(passwordLabelBackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userNameLabelBackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(userNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(228, 228, 228))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabelBackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordField)
                    .addComponent(passwordLabelBackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(684, 684, 684))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed
        cleanFields();
    }//GEN-LAST:event_cleanButtonActionPerformed

    public JButton getLoginButton() {
        return loginButton;
    }

    public JTextField getUserNameField() {
        return userNameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void cleanFields() {
        userNameField.setText("");
        passwordField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel passwordLabelBackPanel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JPanel userNameLabelBackPanel;
    // End of variables declaration//GEN-END:variables

}
