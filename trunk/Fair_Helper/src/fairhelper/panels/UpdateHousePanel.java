/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateHousePanel.java
 *
 * Created on 19.Kas.2009, 19:06:44
 */

package fairhelper.panels;

import fairhelper.House;
import fairhelper.HouseManager;
import fairhelper.language.Language;
import fairhelper.theme.Theme;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Feoran
 */
public class UpdateHousePanel extends javax.swing.JPanel {

    private House house;

    /** Creates new form UpdateHousePanel */
    public UpdateHousePanel(House house) {
        this.house = house;
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

        updateHousePanelUpdateButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        updateHousePanelBackButton = new javax.swing.JButton();
        addHousePanelKiraCheck = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        addHousePanelIsınmaCombo = new javax.swing.JComboBox();
        addHousePanelGelirCombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addHousePanelKendiCheck = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addHousePanelHouseTypeCombo = new javax.swing.JComboBox();
        houseNameLabel = new javax.swing.JLabel();

        setBackground(Theme.getColor("backgroundColor2"));
        setPreferredSize(new java.awt.Dimension(620, 480));

        updateHousePanelUpdateButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        updateHousePanelUpdateButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateHousePanelUpdateButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        updateHousePanelUpdateButton.setText(Language.getText("saveChangesButton"));
        updateHousePanelUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateHousePanelUpdateButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setForeground(Theme.getColor("labelColor1"));
        jLabel3.setText(Language.getText("houseStateLabel"));

        updateHousePanelBackButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        updateHousePanelBackButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        updateHousePanelBackButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        updateHousePanelBackButton.setText(Language.getText("backButton"));

        addHousePanelKiraCheck.setBackground(Theme.getColor("backgroundColor2"));
        addHousePanelKiraCheck.setForeground(Theme.getColor("labelColor1"));
        addHousePanelKiraCheck.setText(Language.getText("addHouseRentalLabel"));
        addHousePanelKiraCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHousePanelKiraCheckActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setForeground(Theme.getColor("labelColor1"));
        jLabel6.setText(Language.getText("houseMonthlyIncomeLabel"));

        addHousePanelIsınmaCombo.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addHousePanelIsınmaCombo.setForeground(Theme.getColor("fieldForegroundColor1"));
        addHousePanelIsınmaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MERKEZİ SİSTEM", "KOMBİLİ SİSTEM", "SOBALI SİSTEM" }));

        addHousePanelGelirCombo.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addHousePanelGelirCombo.setForeground(Theme.getColor("fieldForegroundColor1"));
        addHousePanelGelirCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0 - 1000 TL", "1000 - 2000 TL", "2000 TL ve üzeri", "YOK" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setForeground(Theme.getColor("labelColor1"));
        jLabel4.setText(Language.getText("houseTypeLabel"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(Theme.getColor("labelColor1"));
        jLabel2.setText(Language.getText("updateHouseHeadingLabel"));

        addHousePanelKendiCheck.setBackground(Theme.getColor("backgroundColor2"));
        addHousePanelKendiCheck.setForeground(Theme.getColor("labelColor1"));
        addHousePanelKendiCheck.setText(Language.getText("addHouseOwnHouseLabel"));
        addHousePanelKendiCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHousePanelKendiCheckActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setForeground(Theme.getColor("labelColor1"));
        jLabel1.setText(Language.getText("houseNameLabel"));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setForeground(Theme.getColor("labelColor1"));
        jLabel5.setText(Language.getText("houseHeatTypeLabel"));

        addHousePanelHouseTypeCombo.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addHousePanelHouseTypeCombo.setForeground(Theme.getColor("fieldForegroundColor1"));
        addHousePanelHouseTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GECEKONDU", "APARTMAN", "MÜSTAKİL" }));

        houseNameLabel.setText(house.getSurname());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateHousePanelUpdateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(houseNameLabel)
                            .addComponent(addHousePanelKiraCheck)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addHousePanelGelirCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addHousePanelHouseTypeCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addHousePanelIsınmaCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 149, Short.MAX_VALUE)
                                    .addComponent(addHousePanelKendiCheck)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(updateHousePanelBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))))
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(houseNameLabel))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addHousePanelKiraCheck)
                    .addComponent(addHousePanelKendiCheck))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addHousePanelHouseTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addHousePanelIsınmaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addHousePanelGelirCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateHousePanelUpdateButton)
                    .addComponent(updateHousePanelBackButton))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getUpdateHousePanelBackButton() {
        return updateHousePanelBackButton;
    }

    private void updateHousePanelUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateHousePanelUpdateButtonActionPerformed

        String houseName = house.getSurname();
        if (!addHousePanelKendiCheck.isSelected() && !addHousePanelKiraCheck.isSelected())
            JOptionPane.showMessageDialog(null, Language.getText("selectHouseStateMessage"));
        else {
            House hane=new House(houseName);
            int point=0;
            if(addHousePanelKiraCheck.isSelected())
                point=point+5;
            if(addHousePanelKendiCheck.isSelected())
                point=point+15;
            int index=addHousePanelHouseTypeCombo.getSelectedIndex();
            if(index==0)
                point=point+10;//gecekondu
            else if(index==1)
                point=point+20;//apartman
            else if(index==2)
                point=point+30;//müstakil
            index=addHousePanelIsınmaCombo.getSelectedIndex();
            if(index==0)
                point=point+15;//merkezi
            else if(index==1)
                point=point+10;//kombili
            else if(index==2)
                point=point+5;//soba
            index=addHousePanelGelirCombo.getSelectedIndex();
            if(index==0)
                point=point+5;//0-1000
            else if(index==1)
                point=point+10;//1000-2000
            else if(index==2)
                point=point+15;//2000-üzeri
            else if(index==3)
                point=point+1;//yok
            hane.setHelpPoint(point);
            HouseManager.update(house,hane);
            JOptionPane.showMessageDialog(null, Language.getText("houseUpdatedMessage"));
            addHousePanelKendiCheck.setSelected(false);
            addHousePanelKiraCheck.setSelected(false);
        }
}//GEN-LAST:event_updateHousePanelUpdateButtonActionPerformed

    private void addHousePanelKiraCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHousePanelKiraCheckActionPerformed
        addHousePanelKendiCheck.setSelected(false);
}//GEN-LAST:event_addHousePanelKiraCheckActionPerformed

    private void addHousePanelKendiCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHousePanelKendiCheckActionPerformed
        addHousePanelKiraCheck.setSelected(false);
}//GEN-LAST:event_addHousePanelKendiCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox addHousePanelGelirCombo;
    private javax.swing.JComboBox addHousePanelHouseTypeCombo;
    private javax.swing.JComboBox addHousePanelIsınmaCombo;
    private javax.swing.JCheckBox addHousePanelKendiCheck;
    private javax.swing.JCheckBox addHousePanelKiraCheck;
    private javax.swing.JLabel houseNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton updateHousePanelBackButton;
    private javax.swing.JButton updateHousePanelUpdateButton;
    // End of variables declaration//GEN-END:variables

}
