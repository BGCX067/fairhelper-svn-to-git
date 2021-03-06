/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ManageUsersMainPanel.java
 *
 * Created on 17.Kas.2009, 21:11:23
 */

package fairhelper.panels;

import fairhelper.User;
import fairhelper.UserManager;
import fairhelper.language.Language;
import fairhelper.theme.Theme;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.text.Position.Bias;

/**
 *
 * @author Feoran
 */
public class ManageUsersMainPanel extends javax.swing.JPanel {

    /** Creates new form ManageUsersMainPanel */
    public ManageUsersMainPanel() {
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

        searchUserField = new javax.swing.JTextField();
        searchUserButton = new javax.swing.JButton();
        userListScroll = new javax.swing.JScrollPane();
        userList = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        userNameInfoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstNameInfoLabel = new javax.swing.JLabel();
        surnameInfoLabel = new javax.swing.JLabel();
        roleInfoLabel = new javax.swing.JLabel();
        userIdInfoLabel = new javax.swing.JLabel();
        deleteUserButton = new javax.swing.JButton();
        updateUserPanelButton = new javax.swing.JButton();

        setBackground(Theme.getColor("backgroundColor2"));
        setPreferredSize(new java.awt.Dimension(620, 480));

        searchUserField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        searchUserField.setForeground(Theme.getColor("fieldForegroundColor1"));

        searchUserButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        searchUserButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        searchUserButton.setText(Language.getText("searchUserButton"));
        searchUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserButtonActionPerformed(evt);
            }
        });

        userList.setBackground(Theme.getColor("fieldBackgroundColor1"));
        userList.setForeground(Theme.getColor("fieldForegroundColor1"));
        userList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = UserManager.getUserNameArray(true);
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        userList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        userList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                userListValueChanged(evt);
            }
        });
        userListScroll.setViewportView(userList);

        jPanel1.setBackground(Theme.getColor("backgroundColor2"));

        userNameInfoLabel.setForeground(Theme.getColor("labelColor1"));

        jLabel2.setForeground(Theme.getColor("labelColor1"));
        jLabel2.setText(Language.getText("userNameLabel"));

        jLabel3.setForeground(Theme.getColor("labelColor1"));
        jLabel3.setText(Language.getText("firstNameField"));

        jLabel4.setForeground(Theme.getColor("labelColor1"));
        jLabel4.setText(Language.getText("surnameField"));

        jLabel5.setForeground(Theme.getColor("labelColor1"));
        jLabel5.setText(Language.getText("roleLabel"));

        jLabel6.setForeground(Theme.getColor("labelColor1"));
        jLabel6.setText(Language.getText("userIdLabel"));

        firstNameInfoLabel.setForeground(Theme.getColor("labelColor1"));

        surnameInfoLabel.setForeground(Theme.getColor("labelColor1"));

        roleInfoLabel.setForeground(Theme.getColor("labelColor1"));

        userIdInfoLabel.setForeground(Theme.getColor("labelColor1"));

        deleteUserButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        deleteUserButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        deleteUserButton.setText(Language.getText("deleteUserButton"));
        deleteUserButton.setEnabled(!userList.isSelectionEmpty());
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });

        updateUserPanelButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        updateUserPanelButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        updateUserPanelButton.setText(Language.getText("updateUserPanelButton"));
        updateUserPanelButton.setEnabled(!userList.isSelectionEmpty());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(userIdInfoLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(roleInfoLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(surnameInfoLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(firstNameInfoLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(userNameInfoLabel)
                                .addGap(265, 265, 265))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(deleteUserButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateUserPanelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(167, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameInfoLabel)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(firstNameInfoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(surnameInfoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(roleInfoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(userIdInfoLabel))
                .addGap(18, 18, 18)
                .addComponent(deleteUserButton)
                .addGap(18, 18, 18)
                .addComponent(updateUserPanelButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(searchUserField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userListScroll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchUserButton)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchUserButton))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
/**
 * girilen bilgiye göreilgili kullanıcıyı bulur
 * @param evt
 */
    private void searchUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserButtonActionPerformed
            int index = userList.getNextMatch(searchUserField.getText(), 0, Bias.Forward);
            if (index != -1) {
                userList.setSelectedIndex(index);
                if (userListScroll.getVerticalScrollBar().getValue() != 0) {
                    int listHeight = userListScroll.getVerticalScrollBar().getMaximum();
                    int scrollHeight = userListScroll.getVerticalScrollBar().getVisibleAmount();
                    int newValue = ((listHeight - scrollHeight) / userList.getLastVisibleIndex()) * userList.getSelectedIndex();
                    userListScroll.getVerticalScrollBar().setValue(newValue);
                } 
            }
            else {
                JOptionPane.showMessageDialog(null, Language.getText("userCouldntFoundMessage"));
                searchUserField.setText("");
            }
    }//GEN-LAST:event_searchUserButtonActionPerformed

    private void userListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_userListValueChanged
        if (!userList.isSelectionEmpty()) {
            User selectedUser = UserManager.getUser((String)userList.getSelectedValue());
            userNameInfoLabel.setText(selectedUser.getUserName());
            firstNameInfoLabel.setText(selectedUser.getFirstName());
            surnameInfoLabel.setText(selectedUser.getSurname());
            roleInfoLabel.setText(Language.getText("roleName" + UserManager.getPrivileges(selectedUser.getPrivilegesId()).getPrivilegeName()));
            userIdInfoLabel.setText(Integer.toString(selectedUser.getId()));
            if (UserManager.getManageUserPrivilage(UserManager.getPrivileges(selectedUser.getPrivilegesId()).getPrivilegeName())) {
                deleteUserButton.setEnabled(true);
                updateUserPanelButton.setEnabled(true);
            }
            else {
                deleteUserButton.setEnabled(false);
                updateUserPanelButton.setEnabled(false);
            }
            
        }
        else {
            userNameInfoLabel.setText("");
            firstNameInfoLabel.setText("");
            surnameInfoLabel.setText("");
            roleInfoLabel.setText("");
            userIdInfoLabel.setText("");
            deleteUserButton.setEnabled(false);
            updateUserPanelButton.setEnabled(false);
        }
    }//GEN-LAST:event_userListValueChanged

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        String message = Language.getText("deleteUserMessage");
        int answer = JOptionPane.showConfirmDialog(null, message, "Kullanıcı Sil", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            UserManager.removeUser((String)userList.getSelectedValue());
            userList.clearSelection();
            userList.removeAll();
            userList.setListData(UserManager.getUserNameArray(true));
            userList.revalidate();
            userList.repaint();
            userListValueChanged(null);
        }
    }

    public JButton getUpdateUserPanelButton() {
        return updateUserPanelButton;
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    public String getSelectedUserName() {
        return (String)userList.getSelectedValue();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JLabel firstNameInfoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel roleInfoLabel;
    private javax.swing.JButton searchUserButton;
    private javax.swing.JTextField searchUserField;
    private javax.swing.JLabel surnameInfoLabel;
    private javax.swing.JButton updateUserPanelButton;
    private javax.swing.JLabel userIdInfoLabel;
    private javax.swing.JList userList;
    private javax.swing.JScrollPane userListScroll;
    private javax.swing.JLabel userNameInfoLabel;
    // End of variables declaration//GEN-END:variables

}
