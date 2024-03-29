/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import java.awt.Color;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;
import TelaLogin.Login;
import javax.swing.JScrollPane;
import javax.swing.JTable;


/**
 *
 * @author Luusc
 */
public class FrmProdutos extends javax.swing.JFrame {

  
    /**
     * 
     * Creates new form FrmProd
     */
    public FrmProdutos() {
        initComponents();
    
       
        
        txtCod.setBackground(new Color(0,51,204));
        this.setLocationRelativeTo(null);
        /*table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(Color.white);*/
         txtData.setBackground(new Color(0,51,204));
        razaoBF.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtRazao.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtCNPJ.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtTel.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtEmail.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtVendedor.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtNum.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtEnde.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtEndeBF.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtTelBF.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtCNPJBF.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtQtde.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtUnd.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtDescricao.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtValorUN.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
        txtValorTotal.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
      }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        central = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        txtCod = new app.bolivia.swing.JCTextField();
        jLabel1 = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        panelDosDados = new javax.swing.JScrollPane();
        panelCentraldoScroll = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtNum = new app.bolivia.swing.JCTextField();
        cBox = new javax.swing.JComboBox<>();
        txtEnde = new app.bolivia.swing.JCTextField();
        txtRazao = new app.bolivia.swing.JCTextField();
        txtCNPJ = new javax.swing.JFormattedTextField();
        txtTel = new javax.swing.JFormattedTextField();
        txtEmail = new app.bolivia.swing.JCTextField();
        txtVendedor = new app.bolivia.swing.JCTextField();
        panelDados = new javax.swing.JPanel();
        txtEndeBF = new app.bolivia.swing.JCTextField();
        razaoBF = new app.bolivia.swing.JCTextField();
        lblRazao = new javax.swing.JLabel();
        lblCNPJ = new javax.swing.JLabel();
        lblEndeBF = new javax.swing.JLabel();
        lblEndeBF2 = new javax.swing.JLabel();
        txtTelBF = new javax.swing.JFormattedTextField();
        txtCNPJBF = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtDescricao = new javax.swing.JTextField();
        txtQtde = new javax.swing.JTextField();
        txtValorUN = new javax.swing.JTextField();
        txtValorTotal = new javax.swing.JTextField();
        txtUnd = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        central.setPreferredSize(new java.awt.Dimension(720, 700));
        central.setLayout(new java.awt.BorderLayout());

        top.setBackground(new java.awt.Color(255, 255, 255));
        top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCod.setEditable(false);
        txtCod.setBackground(new java.awt.Color(0, 51, 204));
        txtCod.setBorder(null);
        txtCod.setForeground(new java.awt.Color(255, 255, 255));
        txtCod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCod.setToolTipText("");
        txtCod.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCod.setPhColor(new java.awt.Color(255, 255, 255));
        txtCod.setPlaceholder("Cód.");
        top.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconLogin/logo-fundo-transparente-2.png"))); // NOI18N
        top.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        txtHora.setBackground(new java.awt.Color(0, 51, 204));
        txtHora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        txtHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtHora.setOpaque(true);
        top.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 90, 25));

        txtData.setBackground(new java.awt.Color(0, 51, 204));
        txtData.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtData.setOpaque(true);
        top.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 90, 25));

        central.add(top, java.awt.BorderLayout.PAGE_START);

        panelDosDados.setBorder(null);

        panelCentraldoScroll.setBackground(new java.awt.Color(255, 255, 255));
        panelCentraldoScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fonecedor:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 14), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNum.setBorder(null);
        txtNum.setForeground(new java.awt.Color(0, 0, 204));
        txtNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNum.setPlaceholder("Núm.");
        jPanel1.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 50, 25));

        cBox.setEditable(true);
        cBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rua", "Av.", "Trv." }));
        cBox.setBorder(null);
        cBox.setOpaque(false);
        jPanel1.add(cBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 50, 25));

        txtEnde.setBorder(null);
        txtEnde.setForeground(new java.awt.Color(0, 0, 204));
        txtEnde.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtEnde.setPlaceholder("Endereço");
        txtEnde.setPreferredSize(new java.awt.Dimension(200, 25));
        txtEnde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndeActionPerformed(evt);
            }
        });
        jPanel1.add(txtEnde, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 180, -1));

        txtRazao.setBorder(null);
        txtRazao.setForeground(new java.awt.Color(0, 0, 204));
        txtRazao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtRazao.setPlaceholder("Razão Social");
        txtRazao.setPreferredSize(new java.awt.Dimension(200, 25));
        txtRazao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaoActionPerformed(evt);
            }
        });
        jPanel1.add(txtRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, -1));

        txtCNPJ.setBorder(null);
        txtCNPJ.setForeground(new java.awt.Color(0, 0, 204));
        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCNPJ.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCNPJ.setPreferredSize(new java.awt.Dimension(109, 25));
        jPanel1.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 25));

        txtTel.setBorder(null);
        txtTel.setForeground(new java.awt.Color(0, 0, 204));
        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTel.setPreferredSize(new java.awt.Dimension(109, 25));
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, 25));

        txtEmail.setBorder(null);
        txtEmail.setForeground(new java.awt.Color(0, 0, 204));
        txtEmail.setAutoscrolls(false);
        txtEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtEmail.setPlaceholder("E-mail");
        txtEmail.setPreferredSize(new java.awt.Dimension(200, 25));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 160, -1));

        txtVendedor.setBorder(null);
        txtVendedor.setForeground(new java.awt.Color(0, 0, 204));
        txtVendedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtVendedor.setPlaceholder("Vendedor");
        txtVendedor.setPreferredSize(new java.awt.Dimension(200, 25));
        txtVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendedorActionPerformed(evt);
            }
        });
        jPanel1.add(txtVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 190, -1));

        panelCentraldoScroll.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 100));

        panelDados.setBackground(new java.awt.Color(255, 255, 255));
        panelDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Empresa:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 14), new java.awt.Color(0, 51, 255))); // NOI18N
        panelDados.setOpaque(false);
        panelDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEndeBF.setEditable(false);
        txtEndeBF.setBackground(new java.awt.Color(255, 255, 255));
        txtEndeBF.setBorder(null);
        txtEndeBF.setForeground(new java.awt.Color(0, 0, 204));
        txtEndeBF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEndeBF.setText(" AV. JORGE AMADO, Nº 920, BAIRRO JARDINS, ARACAJU-SE");
        txtEndeBF.setFocusable(false);
        txtEndeBF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtEndeBF.setPlaceholder("Endereço");
        txtEndeBF.setPreferredSize(new java.awt.Dimension(200, 25));
        txtEndeBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndeBFActionPerformed(evt);
            }
        });
        panelDados.add(txtEndeBF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 340, -1));

        razaoBF.setEditable(false);
        razaoBF.setBackground(new java.awt.Color(255, 255, 255));
        razaoBF.setBorder(null);
        razaoBF.setForeground(new java.awt.Color(0, 0, 204));
        razaoBF.setText("  BAROS FILHOS CONTABILIDADE & SERVIÇOS LTDA");
        razaoBF.setFocusable(false);
        razaoBF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        razaoBF.setPlaceholder("Razão Social");
        razaoBF.setPreferredSize(new java.awt.Dimension(200, 25));
        razaoBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razaoBFActionPerformed(evt);
            }
        });
        panelDados.add(razaoBF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 340, -1));

        lblRazao.setBackground(new java.awt.Color(0, 51, 204));
        lblRazao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRazao.setForeground(new java.awt.Color(255, 255, 255));
        lblRazao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRazao.setText("Razão Social");
        lblRazao.setOpaque(true);
        panelDados.add(lblRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 25));

        lblCNPJ.setBackground(new java.awt.Color(0, 51, 204));
        lblCNPJ.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        lblCNPJ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCNPJ.setText("CNPJ");
        lblCNPJ.setOpaque(true);
        panelDados.add(lblCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 30, 25));

        lblEndeBF.setBackground(new java.awt.Color(0, 51, 204));
        lblEndeBF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEndeBF.setForeground(new java.awt.Color(255, 255, 255));
        lblEndeBF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEndeBF.setText("Endereço");
        lblEndeBF.setOpaque(true);
        panelDados.add(lblEndeBF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 25));

        lblEndeBF2.setBackground(new java.awt.Color(0, 51, 204));
        lblEndeBF2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEndeBF2.setForeground(new java.awt.Color(255, 255, 255));
        lblEndeBF2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEndeBF2.setText("Tel");
        lblEndeBF2.setOpaque(true);
        panelDados.add(lblEndeBF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 30, 25));

        txtTelBF.setEditable(false);
        txtTelBF.setBackground(new java.awt.Color(255, 255, 255));
        txtTelBF.setBorder(null);
        txtTelBF.setForeground(new java.awt.Color(0, 0, 204));
        try {
            txtTelBF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelBF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelBF.setText("7921075924");
        txtTelBF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTelBF.setPreferredSize(new java.awt.Dimension(109, 25));
        panelDados.add(txtTelBF, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 120, -1));

        txtCNPJBF.setEditable(false);
        txtCNPJBF.setBackground(new java.awt.Color(255, 255, 255));
        txtCNPJBF.setBorder(null);
        txtCNPJBF.setForeground(new java.awt.Color(0, 0, 204));
        try {
            txtCNPJBF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJBF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCNPJBF.setText("04.227.147/0001-70");
        txtCNPJBF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCNPJBF.setPreferredSize(new java.awt.Dimension(109, 25));
        panelDados.add(txtCNPJBF, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 120, -1));

        panelCentraldoScroll.add(panelDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 700, 100));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconLogin/save_32bluepx.png"))); // NOI18N
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        panelCentraldoScroll.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 30, -1));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconLogin/print_32px.png"))); // NOI18N
        btnImprimir.setContentAreaFilled(false);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        panelCentraldoScroll.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 30, -1));

        table.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Qtde.", "Und.", "Descrição", "Valor Un.", "Valor Total"
            }
        ));
        table.setFillsViewportHeight(true);
        table.setRowHeight(25);
        jScrollPane2.setViewportView(table);

        panelCentraldoScroll.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 427, 700, 320));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Produtos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 12), new java.awt.Color(0, 0, 51)), "Adicionar Produtos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 2, 12), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel2.setOpaque(false);

        txtQtde.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtde.setOpaque(false);

        txtValorUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUNActionPerformed(evt);
            }
        });

        txtUnd.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtUnd.setForeground(new java.awt.Color(0, 51, 204));
        txtUnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UND", "PC", "FD", "GL", "M", "CM", " " }));
        txtUnd.setBorder(null);
        txtUnd.setLightWeightPopupEnabled(false);
        txtUnd.setOpaque(false);
        txtUnd.setPreferredSize(new java.awt.Dimension(40, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUnd, 0, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorUN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorUN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelCentraldoScroll.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 690, 90));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconLogin/add_file_32px.png"))); // NOI18N
        btnAdd.setContentAreaFilled(false);
        btnAdd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconLogin/add_file_edit32px.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panelCentraldoScroll.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 30, 40));

        panelDosDados.setViewportView(panelCentraldoScroll);

        central.add(panelDosDados, java.awt.BorderLayout.CENTER);

        getContentPane().add(central, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndeActionPerformed

    private void txtRazaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaoActionPerformed

    }//GEN-LAST:event_txtRazaoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendedorActionPerformed

    private void txtEndeBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndeBFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndeBFActionPerformed

    private void razaoBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razaoBFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_razaoBFActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       Date data = new Date();		
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
     	txtData.setText(formato.format(data));
        SimpleDateFormat formatar = new SimpleDateFormat("HH:mm:ss");
       txtHora.setText(formatar.format(data));
        
        //horário automatico
       
      
    }//GEN-LAST:event_formWindowOpened

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
       
  
    
    
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtValorUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUNActionPerformed
      
    
    }//GEN-LAST:event_txtValorUNActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      
       

        
        String qtd = txtQtde.getText().trim();
       String und = (String) txtUnd.getSelectedItem();
       String desc = txtDescricao.getText().trim();
       String un = txtValorUN.getText().trim();
       String total = txtValorTotal.getText().trim();
       
       DefaultTableModel mod = (DefaultTableModel)this.table.getModel();
        
       mod.addRow(new Object[] {this.txtQtde.getText(), this.txtUnd.getSelectedItem(), this.txtDescricao.getText(), this.txtValorUN.getText(), this.txtValorTotal.getText()});
        
       txtQtde.setText("");
       txtUnd.setSelectedItem("");
       txtDescricao.setText("");
       txtValorUN.setText("");
       txtValorTotal.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private static javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cBox;
    private javax.swing.JPanel central;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblEndeBF;
    private javax.swing.JLabel lblEndeBF2;
    private javax.swing.JLabel lblRazao;
    private javax.swing.JPanel panelCentraldoScroll;
    private javax.swing.JPanel panelDados;
    private javax.swing.JScrollPane panelDosDados;
    private app.bolivia.swing.JCTextField razaoBF;
    private javax.swing.JTable table;
    private javax.swing.JPanel top;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCNPJBF;
    private app.bolivia.swing.JCTextField txtCod;
    private javax.swing.JLabel txtData;
    private javax.swing.JTextField txtDescricao;
    private app.bolivia.swing.JCTextField txtEmail;
    private app.bolivia.swing.JCTextField txtEnde;
    private app.bolivia.swing.JCTextField txtEndeBF;
    private javax.swing.JLabel txtHora;
    private app.bolivia.swing.JCTextField txtNum;
    private javax.swing.JTextField txtQtde;
    private app.bolivia.swing.JCTextField txtRazao;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JFormattedTextField txtTelBF;
    private javax.swing.JComboBox<String> txtUnd;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtValorUN;
    private app.bolivia.swing.JCTextField txtVendedor;
    // End of variables declaration//GEN-END:variables

   
      
}      
        
        
        
        
    


