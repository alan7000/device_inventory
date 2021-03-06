/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.client;

import fr.freeboxos.ftb.client.dlg.AddProcesseurDlg;
import fr.freeboxos.ftb.client.model.ProcesseurTableModel;
import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.ProcesseurService;
import fr.freeboxos.ftb.metier.entitys.Processeur;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author alan
 */
public class ProcesseurIHM extends javax.swing.JDialog {

    private final ProcesseurService processeurService;
    private final ProcesseurTableModel model;

    /**
     * Creates new form ProcesseurIHM
     *
     * @param parent
     * @param modal
     * @throws java.lang.Exception
     */
    public ProcesseurIHM(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1920, 1080);
        this.processeurService = MetierFactory.getProcesseurService();
        this.model = new ProcesseurTableModel(this.processeurService.sort());
        this.jTable1.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("Liste des processeur");
        getContentPane().add(jLabel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);

        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);

        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);

        jButton5.setText("Quitter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Bouton pour quitter l'IHM
     *
     * @param evt
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * Mise a jour d'un processeur
     *
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (this.jTable1.getSelectedRow() == -1) {
                throw new Exception("Veuillez selectionner un processeur");
            }

            Processeur processeur = this.model.getProcesseurAt(this.jTable1.getSelectedRow());

            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);

            AddProcesseurDlg addProcesseurDlg = null;

            addProcesseurDlg = new AddProcesseurDlg(frame, true, processeur);

            addProcesseurDlg.setVisible(true);

            processeur = addProcesseurDlg.getProcesseur();

            if (processeur != null) {
                try {
                    this.processeurService.update(processeur);
                    this.model.update(this.processeurService.sort());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(), "erreur", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(ProcesseurIHM.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Ajout d'un processeur
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);

        AddProcesseurDlg addProcesseurDlg;
        addProcesseurDlg = new AddProcesseurDlg(frame, true);
        addProcesseurDlg.setVisible(true);

        Processeur processeur = addProcesseurDlg.getProcesseur();
        if (processeur != null) {
            try {
                this.processeurService.add(processeur);
                this.model.update(this.processeurService.sort());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erreur pendant l'ajout du processeur", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Suppression d'un processeur
     *
     * @param evt
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (this.jTable1.getSelectedRow() == -1) {
                throw new Exception("Veuillez selectionner un processeur");
            }

            Processeur processeur = this.model.getProcesseurAt(this.jTable1.getSelectedRow());

            try {
                this.processeurService.remove(processeur);
                this.model.update(this.processeurService.sort());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProcesseurIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcesseurIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcesseurIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcesseurIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ProcesseurIHM dialog = null;
                try {
                    dialog = new ProcesseurIHM(new javax.swing.JFrame(), true);
                } catch (Exception ex) {
                    Logger.getLogger(ProcesseurIHM.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
