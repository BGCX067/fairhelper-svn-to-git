/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdatePersonPanel.java
 *
 * Created on 20.Kas.2009, 15:18:33
 */

package fairhelper.panels;

import fairhelper.House;
import fairhelper.HouseManager;
import fairhelper.Person;
import fairhelper.language.Language;
import fairhelper.theme.Theme;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Feoran
 */
public class UpdatePersonPanel extends javax.swing.JPanel {

    private Person person;

    /** Creates new form UpdatePersonPanel */
    public UpdatePersonPanel(Person person) {
        this.person = person;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        addPersonPanelAddButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        addPersonMonthlyIncomeCombo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        addPersonSigortaCombo = new javax.swing.JComboBox();
        addPersonHealthProbYesCheck = new javax.swing.JCheckBox();
        addPersonPanelHeathProbNoCheck = new javax.swing.JCheckBox();
        addPersonRoleCombo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addPersonPanelBackButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        addPersonEgitimDurumu = new javax.swing.JComboBox();
        dayBox = new javax.swing.JComboBox();
        monthBox = new javax.swing.JComboBox();
        yearBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addPersonSurnameField = new javax.swing.JTextField();
        addPersonNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(Theme.getColor("backgroundColor2"));
        setPreferredSize(new java.awt.Dimension(620, 480));

        addPersonPanelAddButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        addPersonPanelAddButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addPersonPanelAddButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        addPersonPanelAddButton.setText(Language.getText("saveChangesButton"));
        addPersonPanelAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonPanelAddButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setForeground(Theme.getColor("labelColor1"));
        jLabel9.setText(Language.getText("personMonthlyIncomeLabel"));

        addPersonMonthlyIncomeCombo.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addPersonMonthlyIncomeCombo.setForeground(Theme.getColor("fieldForegroundColor1"));
        addPersonMonthlyIncomeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0 - 600 TL", "600 - 2000 TL", "2000 TL ve üzeri", "YOK" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setForeground(Theme.getColor("labelColor1"));
        jLabel8.setText(Language.getText("healthInsuranceLabel"));

        addPersonSigortaCombo.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addPersonSigortaCombo.setForeground(Theme.getColor("fieldForegroundColor1"));
        addPersonSigortaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SGK", "ÖZEL", "YOK" }));

        addPersonHealthProbYesCheck.setBackground(Theme.getColor("backgroundColor2"));
        addPersonHealthProbYesCheck.setForeground(Theme.getColor("labelColor1"));
        addPersonHealthProbYesCheck.setText(Language.getText("varLabel"));
        addPersonHealthProbYesCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonHealthProbYesCheckActionPerformed(evt);
            }
        });

        addPersonPanelHeathProbNoCheck.setBackground(Theme.getColor("backgroundColor2"));
        addPersonPanelHeathProbNoCheck.setForeground(Theme.getColor("labelColor1"));
        addPersonPanelHeathProbNoCheck.setText(Language.getText("yokLabel"));
        addPersonPanelHeathProbNoCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonPanelHeathProbNoCheckActionPerformed(evt);
            }
        });

        addPersonRoleCombo.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addPersonRoleCombo.setForeground(Theme.getColor("fieldForegroundColor1"));
        addPersonRoleCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ANNE", "BABA", "ÇOCUK", "DEDE", "ANNEANNE", "BABAANNE" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setForeground(Theme.getColor("labelColor1"));
        jLabel7.setText(Language.getText("healthProblemLabel"));

        jLabel10.setForeground(Theme.getColor("labelColor1"));
        jLabel10.setText(Language.getText("houseNameLabel"));

        addPersonPanelBackButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        addPersonPanelBackButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        addPersonPanelBackButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        addPersonPanelBackButton.setText(Language.getText("backButton"));

        jLabel11.setForeground(Theme.getColor("labelColor1"));
        jLabel11.setText("Eğitim Durumu :");

        addPersonEgitimDurumu.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addPersonEgitimDurumu.setForeground(Theme.getColor("fieldForegroundColor1"));
        addPersonEgitimDurumu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "İLKOKUL", "LİSE", "ÜNİVERSİTE" }));

        dayBox.setBackground(Theme.getColor("fieldBackgroundColor1"));
        dayBox.setForeground(Theme.getColor("fieldForegroundColor1"));
        dayBox.setModel(new javax.swing.DefaultComboBoxModel(getDayArray()));

        monthBox.setBackground(Theme.getColor("fieldBackgroundColor1"));
        monthBox.setForeground(Theme.getColor("fieldForegroundColor1"));
        monthBox.setModel(new javax.swing.DefaultComboBoxModel(getMonthArray()));
        monthBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthBoxActionPerformed(evt);
            }
        });

        yearBox.setBackground(Theme.getColor("fieldBackgroundColor1"));
        yearBox.setForeground(Theme.getColor("fieldForegroundColor1"));
        yearBox.setModel(new javax.swing.DefaultComboBoxModel(getYearArray()));
        yearBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setForeground(Theme.getColor("labelColor1"));
        jLabel2.setText(Language.getText("firstNameField"));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setForeground(Theme.getColor("labelColor1"));
        jLabel6.setText(Language.getText("houseRoleLabel"));

        addPersonSurnameField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addPersonSurnameField.setForeground(Theme.getColor("fieldForegroundColor1"));

        addPersonNameField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        addPersonNameField.setForeground(Theme.getColor("fieldForegroundColor1"));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setForeground(Theme.getColor("labelColor1"));
        jLabel4.setText(Language.getText("tcNoLabel"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setForeground(Theme.getColor("labelColor1"));
        jLabel3.setText(Language.getText("surnameField"));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setForeground(Theme.getColor("labelColor1"));
        jLabel5.setText(Language.getText("birthdateLabel"));

        jLabel12.setText(HouseManager.getPersonHouse(person).getSurname());

        jLabel13.setText(person.getTc());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPersonNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(addPersonSurnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(addPersonEgitimDurumu, 0, 183, Short.MAX_VALUE)
                            .addComponent(addPersonMonthlyIncomeCombo, 0, 183, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearBox, 0, 68, Short.MAX_VALUE))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addPersonSigortaCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addPersonPanelHeathProbNoCheck)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(addPersonRoleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addPersonHealthProbYesCheck, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addPersonPanelAddButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(addPersonPanelBackButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addGap(34, 34, 34))))
                    .addComponent(jLabel13))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(addPersonRoleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPersonNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(addPersonPanelHeathProbNoCheck)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(addPersonSigortaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(addPersonSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel13)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPersonHealthProbYesCheck)
                            .addComponent(jLabel7))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addPersonPanelAddButton)
                    .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPersonEgitimDurumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(addPersonPanelBackButton))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPersonMonthlyIncomeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(82, 82, 82))
        );
    }//GEN-END:initComponents


    

    private void addPersonPanelAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonPanelAddButtonActionPerformed

        House house=HouseManager.getPersonHouse(person);
        if (addPersonNameField.getText().equals(""))
            JOptionPane.showMessageDialog(null, Language.getText("fillAllFieldsMessage"));
        else if (addPersonSurnameField.getText().equals(""))
            JOptionPane.showMessageDialog(null, Language.getText("fillAllFieldsMessage"));
        else if (!addPersonHealthProbYesCheck.isSelected() && !addPersonPanelHeathProbNoCheck.isSelected())
            JOptionPane.showMessageDialog(null, Language.getText("fillAllFieldsMessage"));
        else if (house == null) {
            JOptionPane.showMessageDialog(null, Language.getText("houseCouldntFoundMessage"));
        } else {
            int point=0;
            String role="";
            int index=addPersonRoleCombo.getSelectedIndex();
            if(index==0)
                role="Anne";
            else if(index==1)
                role="Baba";
            else if(index==2)
                role="Çocuk";
            else if(index==3)
                role="Dede";
            else if(index==4)
                role="Anneanne";
            else if(index==5)
                role="Babaanne";
            if(addPersonHealthProbYesCheck.isSelected())
                point=point+10;
            if(addPersonPanelHeathProbNoCheck.isSelected())
                point=point+15;
            if(addPersonSigortaCombo.getSelectedIndex()==0)
                point=point+15;//SGK
            if(addPersonSigortaCombo.getSelectedIndex()==1)
                point=point+20;//özel
            if(addPersonSigortaCombo.getSelectedIndex()==2)
                point=point+5;//yok
            if(addPersonMonthlyIncomeCombo.getSelectedIndex()==0)
                point=point+10;//0-600
            if(addPersonMonthlyIncomeCombo.getSelectedIndex()==1)
                point=point+20;//600-2000
            if(addPersonMonthlyIncomeCombo.getSelectedIndex()==2)
                point=point+30;//2000-üzeri
            if(addPersonMonthlyIncomeCombo.getSelectedIndex()==3)
                point=point+5;//yok
            if(addPersonEgitimDurumu.getSelectedIndex()==0)
                point=point+5;//ilkokul
            if(addPersonEgitimDurumu.getSelectedIndex()==1)
                point=point+10;//lise
            if(addPersonEgitimDurumu.getSelectedIndex()==2)
                point=point+15;//üniversite
            Person updatedPerson=new Person(addPersonNameField.getText(),addPersonSurnameField.getText(),role,person.getTc(), point);
            HouseManager.update(person, updatedPerson);
            JOptionPane.showMessageDialog(null, Language.getText("personUpdatedMessage"));
        }
}//GEN-LAST:event_addPersonPanelAddButtonActionPerformed

    private int getPersonIndex(House house) {
        for (int i=0; i<house.getPersons().size(); i++) {
            if (house.getPersons().get(i).getTc().equals(person.getTc()))
                return i;
        }
        return -1;
    }

    private void monthBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthBoxActionPerformed
        loadDayBox();
}//GEN-LAST:event_monthBoxActionPerformed

    private void yearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearBoxActionPerformed
        loadDayBox();
}//GEN-LAST:event_yearBoxActionPerformed

    private void addPersonHealthProbYesCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonHealthProbYesCheckActionPerformed
        addPersonPanelHeathProbNoCheck.setSelected(false);
    }//GEN-LAST:event_addPersonHealthProbYesCheckActionPerformed

    private void addPersonPanelHeathProbNoCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonPanelHeathProbNoCheckActionPerformed
        addPersonHealthProbYesCheck.setSelected(false);
    }//GEN-LAST:event_addPersonPanelHeathProbNoCheckActionPerformed


    private String[] getYearArray() {
        String[] yearArray = new String[110];
        int firstYearInt = 1900;
        for (int i=0; i<yearArray.length; i++) {
            yearArray[i] = Integer.toString(firstYearInt);
            firstYearInt++;
        }
        return yearArray;
    }

    private void loadDayBox() {

        dayBox.setModel(new javax.swing.DefaultComboBoxModel(getDayArray()));

    }

    private String[] getDayArray() {
        int day;

        if (monthBox.getSelectedIndex()+1 == 1)
            day = 31;
        else if (monthBox.getSelectedIndex()+1 == 2) {
            if (yearBox.getSelectedIndex()%4 == 0)
                day = 29;
            else
                day = 28;
        }
        else if (monthBox.getSelectedIndex()+1 == 3)
            day = 31;
        else if (monthBox.getSelectedIndex()+1 == 4)
            day = 30;
        else if (monthBox.getSelectedIndex()+1 == 5)
            day = 31;
        else if (monthBox.getSelectedIndex()+1 == 6)
            day = 30;
        else if (monthBox.getSelectedIndex()+1 == 7)
            day = 31;
        else if (monthBox.getSelectedIndex()+1 == 8)
            day = 31;
        else if (monthBox.getSelectedIndex()+1 == 9)
            day = 30;
        else if (monthBox.getSelectedIndex()+1 == 10)
            day = 31;
        else if (monthBox.getSelectedIndex()+1 == 11)
            day = 30;
        else if (monthBox.getSelectedIndex()+1 == 12)
            day = 31;
        else
            day = 31;

        String[] dayArray = new String[day];
        for (int i=0; i<day; i++)
            dayArray[i] = Integer.toString(i+1);
        return dayArray;
    }

    private String[] getMonthArray() {
        String[] monthArray = new String[12];
        for (int i=0; i<monthArray.length; i++)
            monthArray[i] = Integer.toString(i+1);
        return monthArray;
    }

    public JButton getAddPersonPanelBackButton() {
        return addPersonPanelBackButton;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox addPersonEgitimDurumu;
    private javax.swing.JCheckBox addPersonHealthProbYesCheck;
    private javax.swing.JComboBox addPersonMonthlyIncomeCombo;
    private javax.swing.JTextField addPersonNameField;
    private javax.swing.JButton addPersonPanelAddButton;
    private javax.swing.JButton addPersonPanelBackButton;
    private javax.swing.JCheckBox addPersonPanelHeathProbNoCheck;
    private javax.swing.JComboBox addPersonRoleCombo;
    private javax.swing.JComboBox addPersonSigortaCombo;
    private javax.swing.JTextField addPersonSurnameField;
    private javax.swing.JComboBox dayBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox monthBox;
    private javax.swing.JComboBox yearBox;
    // End of variables declaration//GEN-END:variables

}
