/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualização;

import Modelagem.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class FCadProduto extends javax.swing.JFrame {

    /**
     * Creates new form FCadProduto
     */
    public FCadProduto() {
        initComponents();
    }

    Produto prod = new Produto();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_Limpar = new javax.swing.JButton();
        txt_Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Produto = new javax.swing.JTable();
        txt_Descricao = new javax.swing.JTextField();
        btn_Alterar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        btn_Cadastrar = new javax.swing.JButton();
        txt_Refresh = new javax.swing.JButton();
        btn_Sair = new javax.swing.JButton();
        txt_Codigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Cadastro de Produto");

        btn_Limpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/edit_clear.png"))); // NOI18N
        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        txt_Nome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nome do Produto:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Descrição");

        tbl_Produto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbl_Produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Código", "Nome Produto", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(tbl_Produto);

        txt_Descricao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DescricaoActionPerformed(evt);
            }
        });

        btn_Alterar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pencil.png"))); // NOI18N
        btn_Alterar.setText("Alterar");
        btn_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarActionPerformed(evt);
            }
        });

        btn_Excluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("ID:");

        txt_Id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdActionPerformed(evt);
            }
        });

        btn_Cadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/document_save.png"))); // NOI18N
        btn_Cadastrar.setText("Cadastrar");
        btn_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarActionPerformed(evt);
            }
        });

        txt_Refresh.setText("Refresh");
        txt_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RefreshActionPerformed(evt);
            }
        });

        btn_Sair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/exit.png"))); // NOI18N
        btn_Sair.setText("Sair");
        btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairActionPerformed(evt);
            }
        });

        txt_Codigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CodigoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Descricao)
                                    .addComponent(txt_Nome)
                                    .addComponent(txt_Id)
                                    .addComponent(txt_Codigo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btn_Cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Sair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Refresh)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Cadastrar)
                            .addComponent(btn_Sair)
                            .addComponent(btn_Limpar)
                            .addComponent(btn_Alterar)
                            .addComponent(btn_Excluir))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_Refresh)
                        .addGap(5, 5, 5)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        // TODO add your handling code here:
        txt_Id.setText("");
        txt_Codigo.setText("");
        txt_Nome.setText("");
        txt_Descricao.setText("");
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void txt_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomeActionPerformed

    private void txt_DescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DescricaoActionPerformed

    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
        // TODO add your handling code here:
        prod.setId(Integer.parseInt(txt_Id.getText()));
        prod.setNome(txt_Nome.getText());
        prod.setDescricao(txt_Descricao.getText());
        prod.alterar();
        refreshTable();
    }//GEN-LAST:event_btn_AlterarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        // TODO add your handling code here:
        prod.setId(Integer.parseInt(txt_Id.getText()));
        prod.excluir();
        refreshTable();
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdActionPerformed

    private void btn_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarActionPerformed
        // TODO add your handling code here:
        prod.setCodigo(Integer.parseInt(txt_Codigo.getText()));
        prod.setNome(txt_Nome.getText());
        prod.setDescricao(txt_Descricao.getText());

        prod.cadastrarProduto();
        refreshTable();
    }//GEN-LAST:event_btn_CadastrarActionPerformed

    private void txt_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RefreshActionPerformed
        // TODO add your handling code here:]
        refreshTable();
    }//GEN-LAST:event_txt_RefreshActionPerformed

    private void btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_SairActionPerformed

    private void txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CodigoActionPerformed

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
            java.util.logging.Logger.getLogger(FCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCadProduto().setVisible(true);
            }
        });
    }
    
    private void refreshTable() {
     ResultSet tabela;
        tabela = null;
        
        tabela = prod.ListarProduto();
        DefaultTableModel modelo = (DefaultTableModel) tbl_Produto.getModel();
        modelo.setNumRows(0);
        
        try{
            do{
                modelo.addRow(new String[]{tabela.getString(1), tabela.getString(2), tabela.getString(3), tabela.getString(4)});
            }while(tabela.next());
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela "+erro);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Cadastrar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Produto;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Descricao;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JButton txt_Refresh;
    // End of variables declaration//GEN-END:variables
}
