/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.unipar.hibernateteste;

import br.com.unipar.hibernateteste.model.util.PetDoguiLog;

/**
 *
 * @author leoal
 */
public class SessaoCadastros extends javax.swing.JFrame {

    /**
     * Creates new form SessaoCadastros
     */
    public SessaoCadastros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCadastroAtendimento = new javax.swing.JButton();
        jButtonCadastroCliente = new javax.swing.JButton();
        jButtonCadastroPet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCadastroAtendimento.setText("Atendimento");
        jButtonCadastroAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroAtendimentoActionPerformed(evt);
            }
        });

        jButtonCadastroCliente.setText("Cliente");
        jButtonCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroClienteActionPerformed(evt);
            }
        });

        jButtonCadastroPet.setText("Pet");
        jButtonCadastroPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroPetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastroAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastroPet, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(jButtonCadastroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadastroPet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadastroAtendimento)
                .addGap(228, 228, 228))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroAtendimentoActionPerformed
        PetDoguiLog.infoGeral("Abriu a Tela Cadastro Atendimento");
        TelaPetDogui dialogForm = new TelaPetDogui();
        dialogForm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialogForm.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroAtendimentoActionPerformed

    private void jButtonCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroClienteActionPerformed
        PetDoguiLog.infoGeral("Abriu a Tela Cadastro Cliente");
        CadastroCliente tela = new CadastroCliente();
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroClienteActionPerformed

    private void jButtonCadastroPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroPetActionPerformed
        PetDoguiLog.infoGeral("Abriu a Tela Cadastro Pet");
        CadastroPet tela = new CadastroPet();
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroPetActionPerformed

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
            java.util.logging.Logger.getLogger(SessaoCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SessaoCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SessaoCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SessaoCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SessaoCadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastroAtendimento;
    private javax.swing.JButton jButtonCadastroCliente;
    private javax.swing.JButton jButtonCadastroPet;
    // End of variables declaration//GEN-END:variables
}
