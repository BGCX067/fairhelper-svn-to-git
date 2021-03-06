/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddUserPanel.java
 *
 * Created on 13.Kas.2009, 20:22:07
 */

package fairhelper.panels;

import fairhelper.Settings;
import fairhelper.User;
import fairhelper.UserManager;
import fairhelper.language.Language;
import fairhelper.theme.Theme;
import javax.swing.JOptionPane;

/**
 *
 * @author Feoran
 */
public class AddUserPanel extends javax.swing.JPanel {

    /** Creates new form AddUserPanel */
    public AddUserPanel() {
	  
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addUserNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addUserSurnameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addUserPassField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        addUserPassControlField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        addUserRoleField = new javax.swing.JComboBox();
        userAddButton = new javax.swing.JButton();
        userAddCleanButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        addUserUserNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(Theme.getColor("backgroundColor2"));
        setPreferredSize(new java.awt.Dimension(620, 480));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(Theme.getColor("labelColor1"));
        jLabel1.setText(Language.getText("firstNameField"));

        addUserNameField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addUserNameField.setForeground(Theme.getColor("fieldForegroundColor1"));
        addUserNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserNameFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(Theme.getColor("labelColor1"));
        jLabel2.setText(Language.getText("surnameField"));

        addUserSurnameField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addUserSurnameField.setForeground(Theme.getColor("fieldForegroundColor1"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setForeground(Theme.getColor("labelColor1"));
        jLabel3.setText(Language.getText("passwordLabel"));

        addUserPassField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addUserPassField.setForeground(Theme.getColor("fieldForegroundColor1"));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setForeground(Theme.getColor("labelColor1"));
        jLabel4.setText(Language.getText("passwordAgainLabel"));

        addUserPassControlField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addUserPassControlField.setForeground(Theme.getColor("fieldForegroundColor1"));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setForeground(Theme.getColor("labelColor1"));
        jLabel5.setText(Language.getText("roleLabel"));

        addUserRoleField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addUserRoleField.setForeground(Theme.getColor("fieldForegroundColor1"));
        new javax.swing.DefaultComboBoxModel(getUserPriviledgesNameArray());
        addUserRoleField.setModel(new javax.swing.DefaultComboBoxModel(getUserPriviledgesNameArray()));
        addUserRoleField.setSelectedIndex(addUserRoleField.getItemCount()-1);

        userAddButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        userAddButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        userAddButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        userAddButton.setText(Language.getText("addButton"));
        userAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAddButtonActionPerformed(evt);
            }
        });

        userAddCleanButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        userAddCleanButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        userAddCleanButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        userAddCleanButton.setText(Language.getText("cleanButton"));
        userAddCleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAddCleanButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setForeground(Theme.getColor("labelColor1"));
        jLabel6.setText(Language.getText("userNameLabel"));

        addUserUserNameField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addUserUserNameField.setForeground(Theme.getColor("fieldForegroundColor1"));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setForeground(Theme.getColor("labelColor1"));
        jLabel7.setText(Language.getText("addUserPanelMainLabel"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(userAddCleanButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addUserRoleField, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addUserPassControlField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addUserPassField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addUserSurnameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addUserNameField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addUserUserNameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                        .addContainerGap(218, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addUserUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addUserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addUserSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addUserPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addUserPassControlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addUserRoleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userAddButton)
                    .addComponent(userAddCleanButton))
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private String[] getUserPriviledgesNameArray() {
        String[] privilegesNameArray = UserManager.getPrivilegesNameArray(true);
        for (int i=0; i<privilegesNameArray.length; i++) {
            privilegesNameArray[i] = Language.getText("roleName" + privilegesNameArray[i]);
        }
        return privilegesNameArray;
    }

    private void addUserNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addUserNameFieldActionPerformed
/**
 * girilen bilgilere göre user oluşturur ve ekler
 * @param evt
 */
    private void userAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAddButtonActionPerformed
	 
	 String username = addUserUserNameField.getText();

         if (username.equals(""))
             JOptionPane.showMessageDialog(null, Language.getText("enterUserNameMessage"));
         else if (addUserNameField.getText().equals(""))
             JOptionPane.showMessageDialog(null, Language.getText("enterFirstNameMessage"));
         else if (addUserSurnameField.getText().equals(""))
             JOptionPane.showMessageDialog(null, Language.getText("enterSurnameMessage"));
         else if(new String(addUserPassField.getPassword()).equals(""))
             JOptionPane.showMessageDialog(null, Language.getText("enterPasswordMessage"));
         else if(new String(addUserPassControlField.getPassword()).equals(""))
             JOptionPane.showMessageDialog(null, Language.getText("enterPasswordControlMessage"));
         else {

             if(UserManager.userNameUnique(username))
             {
                 if(UserManager.userNameLegal(username))
                 {
                        String name=addUserNameField.getText();
                        String surname=addUserSurnameField.getText();
                        String password="";
                        if(new String(addUserPassField.getPassword()).equals(new String(addUserPassControlField.getPassword())))
                        {
                              password = new String(addUserPassField.getPassword());
                              if((UserManager.passwordLegal(password)) && (!password.equals("")))
                              {
                                int privilege = UserManager.getPrivileges(UserManager.getPrivilegesNameArray(true)[addUserRoleField.getSelectedIndex()]).getId();
                                User user=new User(username, password, name, surname, privilege);
                                UserManager.addUser(user);
                                JOptionPane.showMessageDialog(null, Language.getText("userAddedMessage"));
                                userAddCleanButtonActionPerformed(evt);
                              }
                              else
                                JOptionPane.showMessageDialog(null, Language.getText("passwordWrongCharsMessage"));
                              }
                        else {
                              JOptionPane.showMessageDialog(null, Language.getText("passwordWrongMessage"));
                        }
                        
                 }
                 else
                       JOptionPane.showMessageDialog(null, Language.getText("usernameWrongCharsMessage"));
             }
             else
                 JOptionPane.showMessageDialog(null, username+Language.getText("userAlreadyExistsMessage"));
         }

    }//GEN-LAST:event_userAddButtonActionPerformed

    private void userAddCleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAddCleanButtonActionPerformed
	 addUserNameField.setText("");
	 addUserUserNameField.setText("");
	 addUserSurnameField.setText("");
	 addUserPassField.setText("");
	 addUserPassControlField.setText("");
    }//GEN-LAST:event_userAddCleanButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addUserNameField;
    private javax.swing.JPasswordField addUserPassControlField;
    private javax.swing.JPasswordField addUserPassField;
    private javax.swing.JComboBox addUserRoleField;
    private javax.swing.JTextField addUserSurnameField;
    private javax.swing.JTextField addUserUserNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton userAddButton;
    private javax.swing.JButton userAddCleanButton;
    // End of variables declaration//GEN-END:variables
    	  
	  
}
