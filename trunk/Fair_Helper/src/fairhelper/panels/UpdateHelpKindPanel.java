
/*
 * UpdateHelpKindPanel.java
 *
 * Created on 20.Kas.2009, 15:49:27
 */

package fairhelper.panels;

import fairhelper.Help;
import fairhelper.HelpManager;
import fairhelper.language.Language;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Ethem Cem Ozkan
 * Email cemozkan89@hotmail.com
 * No 07110604
 */
public class UpdateHelpKindPanel extends JPanel
{
    private Help object;

    /** Creates new form UpdateHelpKindPanel */
    public UpdateHelpKindPanel(Help help)
    {
	  object=help;
	  /*try {
	  HelpManager.deleteHelpKind(help);
	  } catch (Exception ex) {
	  Logger.getLogger(UpdateHelpKindPanel.class.getName()).log(Level.SEVERE, null, ex);
	  }*/
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        helpPoint = new javax.swing.JSpinner();
        okButonu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(620, 480));

        jLabel2.setText("YARDIM PUANI");

        helpPoint.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        okButonu.setText(Language.getText("updateButton"));
        okButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButonuActionPerformed(evt);
            }
        });

        jLabel1.setText(Language.getText("oldPointLabel"));

        jLabel3.setText(Integer.toString(object.getPoint()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(helpPoint)
                            .addComponent(okButonu, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(helpPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(okButonu)
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void okButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButonuActionPerformed
	  Integer obj=(Integer)helpPoint.getValue();
	  int point=obj.intValue();
	  object.setPoint(point);
	  try
	  {
		HelpManager.updateHelpKind(object, point);
		JOptionPane.showMessageDialog(null, Language.getText("helpUpdatedMessage"));
	  }
	  catch(Exception e)
	  {
		JOptionPane.showMessageDialog(null, Language.getText("helpCannotUpdate"));
	  }
    }//GEN-LAST:event_okButonuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner helpPoint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton okButonu;
    // End of variables declaration//GEN-END:variables

}
