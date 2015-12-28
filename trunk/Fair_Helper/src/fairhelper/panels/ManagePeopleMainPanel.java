/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ManagePeopleMainPanel.java
 *
 * Created on 20.Kas.2009, 09:54:23
 */

package fairhelper.panels;

import fairhelper.House;
import fairhelper.HouseManager;
import fairhelper.Person;
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
public class ManagePeopleMainPanel extends javax.swing.JPanel {

    private House house;

    /** Creates new form ManagePeopleMainPanel */
    public ManagePeopleMainPanel(House house) {
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

        personListScroll = new javax.swing.JScrollPane();
        personList = new javax.swing.JList();
        searchPersonButton = new javax.swing.JButton();
        searchPersonField = new javax.swing.JTextField();
        personInfoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        personNameLabel = new javax.swing.JLabel();
        personTcLabel = new javax.swing.JLabel();
        helpPointLabel = new javax.swing.JLabel();
        deletePersonButton = new javax.swing.JButton();
        updatePersonPanelButton = new javax.swing.JButton();
        showHelpsButton = new javax.swing.JButton();

        setBackground(Theme.getColor("backgroundColor2"));
        setPreferredSize(new java.awt.Dimension(620, 480));

        personList.setBackground(Theme.getColor("fieldBackgroundColor1"));
        personList.setForeground(Theme.getColor("fieldForegroundColor1"));
        personList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = getPersonNameArray();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        personList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                personListValueChanged(evt);
            }
        });
        personListScroll.setViewportView(personList);

        searchPersonButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        searchPersonButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        searchPersonButton.setText("Kişi Arama");
        searchPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPersonButtonActionPerformed(evt);
            }
        });

        searchPersonField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        searchPersonField.setForeground(Theme.getColor("fieldForegroundColor1"));

        personInfoPanel.setBackground(Theme.getColor("backgroundColor2"));

        jLabel1.setForeground(Theme.getColor("labelColor1"));
        jLabel1.setText(Language.getText("fullNameLabel"));

        jLabel2.setForeground(Theme.getColor("labelColor1"));
        jLabel2.setText(Language.getText("tcNoLabel"));

        jLabel7.setForeground(Theme.getColor("labelColor1"));
        jLabel7.setText(Language.getText("houseHelpPointLabel"));

        personNameLabel.setForeground(Theme.getColor("labelColor1"));

        personTcLabel.setForeground(Theme.getColor("labelColor1"));

        helpPointLabel.setForeground(Theme.getColor("labelColor1"));

        deletePersonButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        deletePersonButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        deletePersonButton.setText("Kişiyi Sil");
        deletePersonButton.setEnabled(!personList.isSelectionEmpty());
        deletePersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonButtonActionPerformed(evt);
            }
        });

        updatePersonPanelButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        updatePersonPanelButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        updatePersonPanelButton.setText("Kişiyi Güncelle");
        updatePersonPanelButton.setEnabled(!personList.isSelectionEmpty());

        showHelpsButton.setText("Yardımları Görüntüle");
        showHelpsButton.setEnabled(false);

        javax.swing.GroupLayout personInfoPanelLayout = new javax.swing.GroupLayout(personInfoPanel);
        personInfoPanel.setLayout(personInfoPanelLayout);
        personInfoPanelLayout.setHorizontalGroup(
            personInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personInfoPanelLayout.createSequentialGroup()
                        .addGroup(personInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(40, 40, 40)
                        .addGroup(personInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(personTcLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(helpPointLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personInfoPanelLayout.createSequentialGroup()
                        .addComponent(deletePersonButton, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personInfoPanelLayout.createSequentialGroup()
                        .addGroup(personInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showHelpsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(updatePersonPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addGap(133, 133, 133))))
        );
        personInfoPanelLayout.setVerticalGroup(
            personInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(personNameLabel))
                .addGap(18, 18, 18)
                .addGroup(personInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(personTcLabel))
                .addGap(12, 12, 12)
                .addGroup(personInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(helpPointLabel))
                .addGap(30, 30, 30)
                .addComponent(deletePersonButton)
                .addGap(18, 18, 18)
                .addComponent(updatePersonPanelButton)
                .addGap(18, 18, 18)
                .addComponent(showHelpsButton)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(personListScroll, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPersonField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPersonField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPersonButton))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(personInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personListScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents



    private void personListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_personListValueChanged
        if (!personList.isSelectionEmpty()) {
            Person selectedPerson = house.getPersons().get(personList.getSelectedIndex());
            personNameLabel.setText(selectedPerson.getSurname());
            personTcLabel.setText(selectedPerson.getTc());
            helpPointLabel.setText(Integer.toString(selectedPerson.getHelpPoint()));
            if (UserManager.getManageHousePrivilage()) {
                deletePersonButton.setEnabled(true);
                updatePersonPanelButton.setEnabled(true);
		    showHelpsButton.setEnabled(true);
            } else {
                deletePersonButton.setEnabled(false);
                updatePersonPanelButton.setEnabled(false);
		    showHelpsButton.setEnabled(false);
            }
        } else {
            personNameLabel.setText("");
            personTcLabel.setText("");
            helpPointLabel.setText("");
            deletePersonButton.setEnabled(false);
            updatePersonPanelButton.setEnabled(false);
		showHelpsButton.setEnabled(false);
        }

}//GEN-LAST:event_personListValueChanged

    private void searchPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPersonButtonActionPerformed
        int index = personList.getNextMatch(searchPersonField.getText(), 0, Bias.Forward);
        if (index != -1) {
            personList.setSelectedIndex(index);
            int listHeight = personListScroll.getVerticalScrollBar().getMaximum();
            int scrollHeight = personListScroll.getVerticalScrollBar().getVisibleAmount();
            int newValue = ((listHeight - scrollHeight) / personList.getLastVisibleIndex()) * personList.getSelectedIndex();
            personListScroll.getVerticalScrollBar().setValue(newValue);
        }
        else {
            JOptionPane.showMessageDialog(null, Language.getText("personCouldntFoundMessage"));
            searchPersonField.setText("");
        }
}//GEN-LAST:event_searchPersonButtonActionPerformed

    private void deletePersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonButtonActionPerformed
        String message = Language.getText("deletePersonMessage");
        int answer = JOptionPane.showConfirmDialog(null, message, Language.getText("deletePersonButton"), JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            HouseManager.removePerson(house.getPersons().get(personList.getSelectedIndex()));
            this.house = HouseManager.getHouse(HouseManager.findHouse(house.getId()));
            personList.clearSelection();
            personList.removeAll();
            personList.setListData(getPersonNameArray());
            personList.revalidate();
            personList.repaint();
            personListValueChanged(null);
        }
}//GEN-LAST:event_deletePersonButtonActionPerformed

    private String[] getPersonNameArray() {
        String[] personNameArray = new String[house.getPersons().size()];
        for (int i=0; i<personNameArray.length; i++) {
            personNameArray[i] = house.getPersons().get(i).getName() + " " + house.getPersons().get(i).getSurname();
        }
        return personNameArray;
    }

    public JButton getUpdatePersonPanelButton() {
        return updatePersonPanelButton;
    }

    public Person getSelectedPerson() {
        return house.getPersons().get(personList.getSelectedIndex());
    }

    public JButton getShowHelpsButton() {
        return showHelpsButton;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletePersonButton;
    private javax.swing.JLabel helpPointLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel personInfoPanel;
    private javax.swing.JList personList;
    private javax.swing.JScrollPane personListScroll;
    private javax.swing.JLabel personNameLabel;
    private javax.swing.JLabel personTcLabel;
    private javax.swing.JButton searchPersonButton;
    private javax.swing.JTextField searchPersonField;
    private javax.swing.JButton showHelpsButton;
    private javax.swing.JButton updatePersonPanelButton;
    // End of variables declaration//GEN-END:variables

}
