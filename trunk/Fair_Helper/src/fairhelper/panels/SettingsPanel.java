
/*
 * SettingsPanel.java
 *
 * Created on 17.Kas.2009, 21:54:11
 */

package fairhelper.panels;

import fairhelper.Settings;
import fairhelper.language.Language;
import javax.swing.*;

/**
 *
 * @author Ethem Cem Ozkan
 * Email cemozkan89@hotmail.com
 * No 07110604
 */
public class SettingsPanel extends JPanel
{

    /** Creates new form SettingsPanel */
    public SettingsPanel()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        settingsPanelUserFileNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        settingsPanelHouseFileNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        settingsPanelHelpFileNameField = new javax.swing.JTextField();
        settingsPanelUpdateUserFileNameButton = new javax.swing.JButton();
        settingsPanelUpdateHouseFileNameButton = new javax.swing.JButton();
        settingsPanelUpdateHelpFileNameButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userFileNameLabel = new javax.swing.JLabel();
        houseFileNameLabel = new javax.swing.JLabel();
        helpFileNameLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(620, 480));

        jLabel1.setText("Kullanici Dosya adı:");

        jLabel2.setText("Hane Dosya adı: ");

        jLabel3.setText("Yardım Dosya adı:");

        settingsPanelUpdateUserFileNameButton.setText(Language.getText("updateButton"));
        settingsPanelUpdateUserFileNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsPanelUpdateUserFileNameButtonActionPerformed(evt);
            }
        });

        settingsPanelUpdateHouseFileNameButton.setText(Language.getText("updateButton"));
        settingsPanelUpdateHouseFileNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsPanelUpdateHouseFileNameButtonActionPerformed(evt);
            }
        });

        settingsPanelUpdateHelpFileNameButton.setText(Language.getText("updateButton"));
        settingsPanelUpdateHelpFileNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsPanelUpdateHelpFileNameButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Şu anki Dosya adları:");

        jLabel5.setText("Kullanici Dosya adi:");

        jLabel6.setText("Hane Dosya adı:");

        jLabel7.setText("Yardım Dosya adı");

        userFileNameLabel.setText(Settings.getUsersFileName());

        houseFileNameLabel.setText(Settings.getHouseFileName());

        helpFileNameLabel.setText(Settings.getHelpTypesFileName());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(settingsPanelHelpFileNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(settingsPanelUserFileNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(settingsPanelHouseFileNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(settingsPanelUpdateUserFileNameButton)
                            .addComponent(settingsPanelUpdateHouseFileNameButton)
                            .addComponent(settingsPanelUpdateHelpFileNameButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel4)))
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(houseFileNameLabel)
                    .addComponent(userFileNameLabel)
                    .addComponent(helpFileNameLabel))
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(settingsPanelUserFileNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingsPanelUpdateUserFileNameButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(settingsPanelHouseFileNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingsPanelUpdateHouseFileNameButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(settingsPanelHelpFileNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingsPanelUpdateHelpFileNameButton))
                .addGap(62, 62, 62)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(userFileNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseFileNameLabel)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helpFileNameLabel)
                    .addComponent(jLabel7))
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void settingsPanelUpdateUserFileNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsPanelUpdateUserFileNameButtonActionPerformed
	  Settings.setUsersFileName(settingsPanelUserFileNameField.getText());
	  userFileNameLabel.setText(Settings.getUsersFileName());

    }//GEN-LAST:event_settingsPanelUpdateUserFileNameButtonActionPerformed

    private void settingsPanelUpdateHouseFileNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsPanelUpdateHouseFileNameButtonActionPerformed
	  Settings.setHousesFileName(settingsPanelHouseFileNameField.getText());
	  houseFileNameLabel.setText(Settings.getHouseFileName());
    }//GEN-LAST:event_settingsPanelUpdateHouseFileNameButtonActionPerformed

    private void settingsPanelUpdateHelpFileNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsPanelUpdateHelpFileNameButtonActionPerformed
	  Settings.setHelpTypesFileName(settingsPanelHelpFileNameField.getText());
	  helpFileNameLabel.setText(Settings.getHelpTypesFileName());
    }//GEN-LAST:event_settingsPanelUpdateHelpFileNameButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel helpFileNameLabel;
    private javax.swing.JLabel houseFileNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField settingsPanelHelpFileNameField;
    private javax.swing.JTextField settingsPanelHouseFileNameField;
    private javax.swing.JButton settingsPanelUpdateHelpFileNameButton;
    private javax.swing.JButton settingsPanelUpdateHouseFileNameButton;
    private javax.swing.JButton settingsPanelUpdateUserFileNameButton;
    private javax.swing.JTextField settingsPanelUserFileNameField;
    private javax.swing.JLabel userFileNameLabel;
    // End of variables declaration//GEN-END:variables

}
