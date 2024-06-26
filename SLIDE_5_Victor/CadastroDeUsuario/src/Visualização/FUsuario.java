/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualização;

/**
 *
 * @author rodri
 */

import Modelagem.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FUsuario
     */
    public FUsuario() {
        initComponents();
        
        
    }
    
    Usuario usu = new Usuario();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Login = new javax.swing.JTextField();
        txt_Senha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_Cadastrar = new javax.swing.JButton();
        btn_Sair = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Usuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Cadastro de Usuário");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Digite o Nome:");

        txt_Nome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Digite o E-mail:");

        txt_Email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Digite o Login:");

        txt_Login.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LoginActionPerformed(evt);
            }
        });

        txt_Senha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SenhaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Digite o Senha:");

        btn_Cadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Cadastrar.setText("Cadastrar");
        btn_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarActionPerformed(evt);
            }
        });

        btn_Sair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Sair.setText("Sair");
        btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairActionPerformed(evt);
            }
        });

        btn_Limpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        tbl_Usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbl_Usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Login", "E-mail", "Senha"
            }
        ));
        jScrollPane1.setViewportView(tbl_Usuario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Sair)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(84, 84, 84))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Email)
                            .addComponent(txt_Nome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19)
                        .addComponent(txt_Login))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Senha)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cadastrar)
                    .addComponent(btn_Sair)
                    .addComponent(btn_Limpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomeActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailActionPerformed

    private void txt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LoginActionPerformed

    private void txt_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SenhaActionPerformed

    private void btn_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarActionPerformed
        // TODO add your handling code here:
        usu.setNome(txt_Nome.getText());
        usu.setEmail(txt_Email.getText());
        usu.setLogin(txt_Login.getText());
        usu.setSenha(txt_Senha.getText());
        
        usu.cadastrarUsuario();
        
        ResultSet tabela;
        tabela = null;
        
        tabela = usu.ListarUsuario();
        DefaultTableModel modelo = (DefaultTableModel) tbl_Usuario.getModel();
        modelo.setNumRows(0);
        
        try{
            do{
                modelo.addRow(new String[]{tabela.getString(1), tabela.getString(2), tabela.getString(3), tabela.getString(4)});
            }while(tabela.next());
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela "+erro);
        }
    }//GEN-LAST:event_btn_CadastrarActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        // TODO add your handling code here:
        txt_Nome.setText("");
        txt_Email.setText("");
        txt_Login.setText("");
        txt_Senha.setText("");
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_SairActionPerformed

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
            java.util.logging.Logger.getLogger(FUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cadastrar;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Usuario;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Login;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Senha;
    // End of variables declaration//GEN-END:variables
}
