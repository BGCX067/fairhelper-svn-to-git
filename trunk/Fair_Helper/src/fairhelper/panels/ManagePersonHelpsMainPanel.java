/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ManagePersonHelpsMainPanel.java
 *
 * Created on 20.Kas.2009, 00:45:52
 */

package fairhelper.panels;

import fairhelper.Help;
import fairhelper.HelpManager;
import fairhelper.UserManager;
import fairhelper.language.Language;
import fairhelper.theme.Theme;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.text.Position.Bias;

/**
 *
 * @author Feoran
 */
public class ManagePersonHelpsMainPanel extends javax.swing.JPanel {

    /** Creates new form ManagePersonHelpsMainPanel */
    public ManagePersonHelpsMainPanel() {
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

        helpListScroll = new javax.swing.JScrollPane();
        helpList = new javax.swing.JList();
        searchHelpField = new javax.swing.JTextField();
        searchHelpButton = new javax.swing.JButton();
        helpInfoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deleteHelpButton = new javax.swing.JButton();
        updateHelpPanelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        helpNameLabel = new javax.swing.JLabel();
        helpPointLabel = new javax.swing.JLabel();
        helpToButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setBackground(Theme.getColor("backgroundColor2"));
        setPreferredSize(new java.awt.Dimension(620, 480));

        helpList.setBackground(Theme.getColor("fieldBackgroundColor1"));
        helpList.setForeground(Theme.getColor("fieldForegroundColor1"));
        helpList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = HelpManager.getPersonHelpNameArray();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        helpList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                helpListValueChanged(evt);
            }
        });
        helpListScroll.setViewportView(helpList);

        searchHelpField.setBackground(Theme.getColor("fieldBackgroundColor1"));
        searchHelpField.setForeground(Theme.getColor("fieldForegroundColor1"));

        searchHelpButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        searchHelpButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        searchHelpButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        searchHelpButton.setText(Language.getText("searchHelpButton"));
        searchHelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchHelpButtonActionPerformed(evt);
            }
        });

        helpInfoPanel.setBackground(Theme.getColor("backgroundColor2"));

        jLabel1.setForeground(Theme.getColor("labelColor1"));
        jLabel1.setText(Language.getText("helpKindHelpNameLabel"));

        deleteHelpButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        deleteHelpButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        deleteHelpButton.setText(Language.getText("deleteHelpButton"));
        deleteHelpButton.setEnabled(!helpList.isSelectionEmpty());
        deleteHelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHelpButtonActionPerformed(evt);
            }
        });

        updateHelpPanelButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        updateHelpPanelButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        updateHelpPanelButton.setText(Language.getText("updateHelpPanelButton"));
        updateHelpPanelButton.setEnabled(!helpList.isSelectionEmpty());

        jLabel2.setForeground(Theme.getColor("labelColor1"));
        jLabel2.setText(Language.getText("helpKindPointLabel"));

        helpNameLabel.setForeground(Theme.getColor("labelColor1"));

        helpPointLabel.setForeground(Theme.getColor("labelColor1"));

        helpToButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        helpToButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        helpToButton.setText(Language.getText("helpToButton"));
        helpToButton.setEnabled(!helpList.isSelectionEmpty());

        javax.swing.GroupLayout helpInfoPanelLayout = new javax.swing.GroupLayout(helpInfoPanel);
        helpInfoPanel.setLayout(helpInfoPanelLayout);
        helpInfoPanelLayout.setHorizontalGroup(
            helpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpInfoPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(helpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(helpInfoPanelLayout.createSequentialGroup()
                        .addComponent(updateHelpPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(241, 241, 241))
                    .addGroup(helpInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(helpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(helpPointLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(helpNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))))
            .addGroup(helpInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(helpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(helpToButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteHelpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(241, 241, 241))
        );
        helpInfoPanelLayout.setVerticalGroup(
            helpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(helpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(helpNameLabel))
                .addGap(18, 18, 18)
                .addGroup(helpInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(helpPointLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(helpToButton)
                .addGap(18, 18, 18)
                .addComponent(deleteHelpButton)
                .addGap(26, 26, 26)
                .addComponent(updateHelpPanelButton)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18));
        jLabel3.setForeground(Theme.getColor("labelColor1"));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(Language.getText("managePersonHelpsPanelButton"));

        backButton.setBackground(Theme.getColor("buttonBackgroundColor1"));
        backButton.setForeground(Theme.getColor("buttonForegroundColor1"));
        backButton.setText(Language.getText("backButton"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchHelpField)
                            .addComponent(helpListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchHelpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(helpInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchHelpField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchHelpButton))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpListScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addGap(101, 101, 101))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getUpdateHelpPanelButton() {
        return updateHelpPanelButton;
    }

    public Help getSelectedHelp() {
            String[] array=HelpManager.getPersonHelpNameArray();
            String text=array[helpList.getSelectedIndex()];
            Help selectedHelp = HelpManager.getHelp(HelpManager.getHelpIndex(text, true));

            return selectedHelp;
    }

    public JButton getHelpToButton() {
        return helpToButton;
    }

    

    private void helpListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_helpListValueChanged
        if (!helpList.isSelectionEmpty()) {
            Help selectedHelp = HelpManager.getHelp((String)helpList.getSelectedValue(), true);
            helpNameLabel.setText(selectedHelp.getHelptype());
            helpPointLabel.setText(Integer.toString(selectedHelp.getPoint()));
            if (UserManager.getManageHelpPrivilage()) {
                deleteHelpButton.setEnabled(true);
                updateHelpPanelButton.setEnabled(true);
                helpToButton.setEnabled(true);
            } else {
                deleteHelpButton.setEnabled(false);
                updateHelpPanelButton.setEnabled(false);
                helpToButton.setEnabled(false);
            }
        } else {
            helpNameLabel.setText("");
            helpPointLabel.setText("");
            deleteHelpButton.setEnabled(false);
            updateHelpPanelButton.setEnabled(false);
            helpToButton.setEnabled(false);
        }
}//GEN-LAST:event_helpListValueChanged
/**
 * girilen bilgiye göre ilgili kişi yardımını bulur
 * @param evt
 */
    private void searchHelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchHelpButtonActionPerformed
        int index = helpList.getNextMatch(searchHelpField.getText(), 0, Bias.Forward);
        if (index != -1) {
            helpList.setSelectedIndex(index);
            if (helpListScroll.getVerticalScrollBar().getValue() != 0) {
                int listHeight = helpListScroll.getVerticalScrollBar().getMaximum();
                int scrollHeight = helpListScroll.getVerticalScrollBar().getVisibleAmount();
                int newValue = ((listHeight - scrollHeight) / helpList.getLastVisibleIndex()) * helpList.getSelectedIndex();
            }
        } else {
            JOptionPane.showMessageDialog(null, Language.getText("helpCouldntFoundMessage"));
            searchHelpField.setText("");
        }
}//GEN-LAST:event_searchHelpButtonActionPerformed

    private void deleteHelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHelpButtonActionPerformed
        String message = Language.getText("deleteHelpMessage");
        int answer = JOptionPane.showConfirmDialog(null, message, Language.getText("deleteHelpButton"), JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
		String[] array=HelpManager.getPersonHelpNameArray();
		String text=array[helpList.getSelectedIndex()];
            Help selectedHelp = HelpManager.getHelp(HelpManager.getHelpIndex(text, true));
            try {
                HelpManager.deleteHelpKind(selectedHelp);
            } catch (Exception ex) {
                Logger.getLogger(ManageHouseHelpsMainPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            helpList.clearSelection();
            helpList.removeAll();
            helpList.setListData(HelpManager.getPersonHelpNameArray());
            helpList.revalidate();
            helpList.repaint();
            helpListValueChanged(null);
        }
}//GEN-LAST:event_deleteHelpButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteHelpButton;
    private javax.swing.JPanel helpInfoPanel;
    private javax.swing.JList helpList;
    private javax.swing.JScrollPane helpListScroll;
    private javax.swing.JLabel helpNameLabel;
    private javax.swing.JLabel helpPointLabel;
    private javax.swing.JButton helpToButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton searchHelpButton;
    private javax.swing.JTextField searchHelpField;
    private javax.swing.JButton updateHelpPanelButton;
    // End of variables declaration//GEN-END:variables

}