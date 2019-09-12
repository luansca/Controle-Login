/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import Formulario.FrmPedidos;
import java.awt.Color;
import java.awt.Component;

/**
 *
 * @author Luusc
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
         txtPesq.setBackground(new Color (0, 0, 0, 20));
         this.setLocationRelativeTo(null);
              
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraLateral = new javax.swing.JPanel();
        painelBotoes = new javax.swing.JPanel();
        fundoComp = new keeptoo.KGradientPanel();
        btnComp = new javax.swing.JButton();
        fundoproduto = new keeptoo.KGradientPanel();
        btnProdutos = new javax.swing.JButton();
        fundoForn = new keeptoo.KGradientPanel();
        btnForn = new javax.swing.JButton();
        fundoNF = new keeptoo.KGradientPanel();
        btnNF = new javax.swing.JButton();
        fundoPrincipal = new javax.swing.JPanel();
        txtPesq = new app.bolivia.swing.JCTextField();
        btnBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));

        barraLateral.setBackground(new java.awt.Color(0, 42, 122));
        barraLateral.setPreferredSize(new java.awt.Dimension(60, 500));
        barraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelBotoes.setOpaque(false);
        painelBotoes.setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        fundoComp.setkEndColor(new java.awt.Color(204, 204, 255));
        fundoComp.setkStartColor(new java.awt.Color(0, 42, 122));
        fundoComp.setPreferredSize(new java.awt.Dimension(200, 32));
        fundoComp.setLayout(new java.awt.BorderLayout());

        btnComp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnComp.setForeground(new java.awt.Color(255, 255, 255));
        btnComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconLogin/iconForm.png"))); // NOI18N
        btnComp.setToolTipText("Formulário de Compras");
        btnComp.setBorder(null);
        btnComp.setContentAreaFilled(false);
        btnComp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComp.setInheritsPopupMenu(true);
        btnComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompActionPerformed(evt);
            }
        });
        fundoComp.add(btnComp, java.awt.BorderLayout.CENTER);

        painelBotoes.add(fundoComp);

        fundoproduto.setkEndColor(new java.awt.Color(204, 204, 255));
        fundoproduto.setkStartColor(new java.awt.Color(0, 42, 122));
        fundoproduto.setPreferredSize(new java.awt.Dimension(200, 32));
        fundoproduto.setLayout(new java.awt.BorderLayout());

        btnProdutos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconLogin/iconProdutos.png"))); // NOI18N
        btnProdutos.setToolTipText("Produtos");
        btnProdutos.setBorder(null);
        btnProdutos.setContentAreaFilled(false);
        btnProdutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProdutos.setInheritsPopupMenu(true);
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        fundoproduto.add(btnProdutos, java.awt.BorderLayout.CENTER);

        painelBotoes.add(fundoproduto);

        fundoForn.setkEndColor(new java.awt.Color(204, 204, 255));
        fundoForn.setkStartColor(new java.awt.Color(0, 42, 122));
        fundoForn.setPreferredSize(new java.awt.Dimension(200, 32));
        fundoForn.setLayout(new java.awt.BorderLayout());

        btnForn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnForn.setForeground(new java.awt.Color(255, 255, 255));
        btnForn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconLogin/iconCadProd.png"))); // NOI18N
        btnForn.setToolTipText("Fornecedores");
        btnForn.setBorder(null);
        btnForn.setContentAreaFilled(false);
        btnForn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnForn.setInheritsPopupMenu(true);
        btnForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornActionPerformed(evt);
            }
        });
        fundoForn.add(btnForn, java.awt.BorderLayout.CENTER);

        painelBotoes.add(fundoForn);

        fundoNF.setkEndColor(new java.awt.Color(204, 204, 255));
        fundoNF.setkStartColor(new java.awt.Color(0, 42, 122));
        fundoNF.setPreferredSize(new java.awt.Dimension(200, 32));
        fundoNF.setLayout(new java.awt.BorderLayout());

        btnNF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNF.setForeground(new java.awt.Color(255, 255, 255));
        btnNF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconLogin/iconNF.png"))); // NOI18N
        btnNF.setToolTipText("Nota Fiscal");
        btnNF.setBorder(null);
        btnNF.setContentAreaFilled(false);
        btnNF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNF.setInheritsPopupMenu(true);
        btnNF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNFActionPerformed(evt);
            }
        });
        fundoNF.add(btnNF, java.awt.BorderLayout.CENTER);

        painelBotoes.add(fundoNF);

        barraLateral.add(painelBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 60, 220));

        getContentPane().add(barraLateral, java.awt.BorderLayout.LINE_START);

        fundoPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        fundoPrincipal.setPreferredSize(new java.awt.Dimension(800, 522));
        fundoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPesq.setBackground(new java.awt.Color(204, 204, 204));
        txtPesq.setBorder(null);
        txtPesq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqActionPerformed(evt);
            }
        });
        fundoPrincipal.add(txtPesq, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconLogin/search32px.png"))); // NOI18N
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        fundoPrincipal.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 50, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconLogin/cancel_25px.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        fundoPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 30, -1));

        getContentPane().add(fundoPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqActionPerformed
     
     
    }//GEN-LAST:event_txtPesqActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompActionPerformed
        Component pedidos = new FrmPedidos();
        pedidos.setVisible(true);
                
    }//GEN-LAST:event_btnCompActionPerformed

    private void btnNFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNFActionPerformed

    private void btnFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFornActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaMenu().setVisible(true);
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraLateral;
    private javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnComp;
    public static javax.swing.JButton btnForn;
    public static javax.swing.JButton btnNF;
    public static javax.swing.JButton btnProdutos;
    private keeptoo.KGradientPanel fundoComp;
    private keeptoo.KGradientPanel fundoForn;
    private keeptoo.KGradientPanel fundoNF;
    private javax.swing.JPanel fundoPrincipal;
    private keeptoo.KGradientPanel fundoproduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel painelBotoes;
    private app.bolivia.swing.JCTextField txtPesq;
    // End of variables declaration//GEN-END:variables

}