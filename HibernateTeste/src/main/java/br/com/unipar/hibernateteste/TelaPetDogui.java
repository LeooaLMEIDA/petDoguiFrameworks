
package br.com.unipar.hibernateteste;

import br.com.unipar.hibernateteste.model.Agendamento;
import br.com.unipar.hibernateteste.model.AgendamentoServico;
import br.com.unipar.hibernateteste.model.Servico;
import br.com.unipar.hibernateteste.model.dao.AgendamentoDAO;
import br.com.unipar.hibernateteste.model.dao.ServicoDAO;
import br.com.unipar.hibernateteste.model.util.EntityManagerUtil;
import br.com.unipar.hibernateteste.tablemodel.AgendamentoTableModel;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaPetDogui extends javax.swing.JFrame {

    private ServicoDAO daoServico;
    private Agendamento agendamento = new Agendamento();
    
    public TelaPetDogui() {
        EntityManagerUtil.getEntityManagerFactory();
        
        initComponents();
        atualizaLista();
        atualizaServico();
        
    }
    
    private void atualizaServico(){
        daoServico = new ServicoDAO();
        List<Servico> listaServicos = daoServico.findAll();
        
        for(Servico servico : listaServicos){
            jComboBoxServico.addItem(servico.getDescricao());
        }
        
    }
    
    private void atualizaLista(){
        AgendamentoDAO dao = new AgendamentoDAO();
        List<Agendamento> listaAgendamentos = dao.findAll();
        AgendamentoTableModel model = new AgendamentoTableModel(listaAgendamentos);
        jTableAgendamentos.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadastro = new javax.swing.JPanel();
        jLabelPet = new javax.swing.JLabel();
        jTextFieldPet = new javax.swing.JTextField();
        jLabelPet1 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jLabelPet2 = new javax.swing.JLabel();
        jComboBoxServico = new javax.swing.JComboBox<>();
        jButtonInserirServico = new javax.swing.JButton();
        jButtonBuscarPet = new javax.swing.JButton();
        jLabelPet3 = new javax.swing.JLabel();
        jTextFieldHora = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaServico = new javax.swing.JTextArea();
        jLabelPet4 = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jButtonAgendar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelLista = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAgendamentos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 1, 3, 0));

        jLabelPet.setText("Animal");

        jTextFieldPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPetActionPerformed(evt);
            }
        });

        jLabelPet1.setText("Data");

        jLabelPet2.setText("Serviço");

        jComboBoxServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServicoActionPerformed(evt);
            }
        });

        jButtonInserirServico.setText("+");
        jButtonInserirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirServicoActionPerformed(evt);
            }
        });

        jButtonBuscarPet.setText("+");
        jButtonBuscarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPetActionPerformed(evt);
            }
        });

        jLabelPet3.setText("Hora");

        jTextFieldHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoraActionPerformed(evt);
            }
        });

        jTextAreaServico.setColumns(20);
        jTextAreaServico.setRows(5);
        jScrollPane1.setViewportView(jTextAreaServico);

        jLabelPet4.setText("Valor");

        jTextFieldValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorTotalActionPerformed(evt);
            }
        });

        jButtonAgendar.setText("Agendar");
        jButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Novo Agendamento");

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                    .addComponent(jLabelPet, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jTextFieldPet, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jButtonBuscarPet, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelPet1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                    .addComponent(jLabelPet2)
                                    .addGap(12, 12, 12)
                                    .addComponent(jComboBoxServico, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jButtonInserirServico, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabelPet3)
                                    .addGap(12, 12, 12)
                                    .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                    .addComponent(jLabelPet4)
                                    .addGap(28, 28, 28)
                                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPet, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPet1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarPet)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPet2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPet3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonInserirServico)
                            .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPet4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgendar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCadastro);

        jTableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableAgendamentos);

        javax.swing.GroupLayout jPanelListaLayout = new javax.swing.GroupLayout(jPanelLista);
        jPanelLista.setLayout(jPanelListaLayout);
        jPanelListaLayout.setHorizontalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelListaLayout.setVerticalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelLista);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServicoActionPerformed
        
    }//GEN-LAST:event_jComboBoxServicoActionPerformed

    private void jButtonInserirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirServicoActionPerformed
        Servico servico = 
                daoServico.findByDescricao((String) jComboBoxServico.getSelectedItem());
        
        jTextAreaServico.setText(jTextAreaServico.getText().isEmpty() ?
                (servico.getDescricao()) : (jTextAreaServico.getText() + "," 
                + servico.getDescricao()));
        
        insereServico(servico);
        atualizaTotal(servico.getValor());
        
    }//GEN-LAST:event_jButtonInserirServicoActionPerformed

    private void jButtonBuscarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPetActionPerformed
        ConsultaPet dialogForm = new ConsultaPet(this, true);
        dialogForm.setVisible(true);
        jTextFieldPet.setText(dialogForm.getPetSelecionado().getNome());
        agendamento.setPet(dialogForm.getPetSelecionado());
    }//GEN-LAST:event_jButtonBuscarPetActionPerformed

    private void jTextFieldValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorTotalActionPerformed

    private void jButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarActionPerformed
        String data = jTextFieldData.getText();
        String hora = jTextFieldHora.getText();
        
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").
                    parse(data + " " + hora + ":00");
            agendamento.setDataHora(date);
            
            gravarAgendamento();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "A correta formatação da data é dd/MM/yyyy e hora HH:mm:ss"
                            + "\nERRO: " + e);
        }       
    }//GEN-LAST:event_jButtonAgendarActionPerformed

    private void jTextFieldHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoraActionPerformed

    private void jTextFieldPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPetActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPetDogui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPetDogui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPetDogui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPetDogui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPetDogui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendar;
    private javax.swing.JButton jButtonBuscarPet;
    private javax.swing.JButton jButtonInserirServico;
    private javax.swing.JComboBox<String> jComboBoxServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPet;
    private javax.swing.JLabel jLabelPet1;
    private javax.swing.JLabel jLabelPet2;
    private javax.swing.JLabel jLabelPet3;
    private javax.swing.JLabel jLabelPet4;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAgendamentos;
    private javax.swing.JTextArea jTextAreaServico;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldPet;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables

    private void atualizaTotal(BigDecimal valor){
        BigDecimal total = agendamento.getValor_total();
        
        agendamento.setValor_total(total.add(valor));
        jTextFieldValorTotal.setText(agendamento.getValor_total().toString());
    }
 
    private void insereServico(Servico servico){
        AgendamentoServico agendServ = new AgendamentoServico(servico,
                agendamento, servico.getValor());
        
        agendamento.getAgendamentoServicos().add(agendServ);
    }  

    private void gravarAgendamento() {
        AgendamentoDAO dao = new AgendamentoDAO();
        
        dao.save(agendamento);
        
        atualizaLista();
        
    }
}
