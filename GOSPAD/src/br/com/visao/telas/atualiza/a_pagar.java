/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.telas.atualiza;

import br.com.conexao.conexao;
import br.com.controle.a_pagarControl;
import br.com.visao.telas.cadastro.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Paes Leme
 */
public class a_pagar extends javax.swing.JInternalFrame {

    /**
     * Creates new form a_pagar
     */
    public a_pagar() {
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

        jPanel3 = new javax.swing.JPanel();
        bt_salvar_a_pagar = new javax.swing.JButton();
        bt_limpar_a_pagar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_a_pagar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        doc_a_pagar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbx_forn_a_pagar = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        dt_pgto_a_pagar = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        dt_venc_a_pagar = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        dt_lanc_a_pagar = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        VL_pagar_a_pagar = new javax.swing.JTextField();
        bt_situacao_a_pagar = new javax.swing.JLabel();
        situacao_a_pagar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs_a_pagar = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cbx_busca_nome = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        cbx_busca_id = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        id_fornecedor = new javax.swing.JLabel();
        VL_a_pagar = new javax.swing.JTextField();
        VL_pgto_a_pagar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Atualização de Contas a Pagar");
        setVisible(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        bt_salvar_a_pagar.setBackground(new java.awt.Color(0, 153, 204));
        bt_salvar_a_pagar.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_salvar_a_pagar.setForeground(new java.awt.Color(255, 255, 255));
        bt_salvar_a_pagar.setText("ATUALIZAR");
        bt_salvar_a_pagar.setBorderPainted(false);
        bt_salvar_a_pagar.setContentAreaFilled(false);
        bt_salvar_a_pagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_salvar_a_pagar.setOpaque(true);
        bt_salvar_a_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvar_a_pagarActionPerformed(evt);
            }
        });

        bt_limpar_a_pagar.setBackground(new java.awt.Color(0, 153, 204));
        bt_limpar_a_pagar.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_limpar_a_pagar.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpar_a_pagar.setText("LIMPAR");
        bt_limpar_a_pagar.setBorderPainted(false);
        bt_limpar_a_pagar.setContentAreaFilled(false);
        bt_limpar_a_pagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_limpar_a_pagar.setOpaque(true);
        bt_limpar_a_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpar_a_pagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_salvar_a_pagar)
                .addGap(18, 18, 18)
                .addComponent(bt_limpar_a_pagar)
                .addContainerGap(405, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salvar_a_pagar)
                    .addComponent(bt_limpar_a_pagar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel1.setText("ID");

        id_a_pagar.setEditable(false);
        id_a_pagar.setBackground(new java.awt.Color(255, 255, 204));
        id_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel2.setText("Documento");

        doc_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel3.setText("Valor Total");

        jLabel4.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel4.setText("Fornecedor");

        cbx_forn_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        cbx_forn_a_pagar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Clique aqui para carregar lista de Fornecedores." }));
        cbx_forn_a_pagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_forn_a_pagarMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel5.setText("Pagamento");

        try {
            dt_pgto_a_pagar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_pgto_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel6.setText("Vencimento");

        try {
            dt_venc_a_pagar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_venc_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel7.setText("Lançamento");

        try {
            dt_lanc_a_pagar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_lanc_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel8.setText("Valor Pago");

        jLabel9.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel9.setText("Valor a Pagar");

        VL_pagar_a_pagar.setEditable(false);
        VL_pagar_a_pagar.setBackground(new java.awt.Color(255, 255, 204));
        VL_pagar_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        bt_situacao_a_pagar.setBackground(new java.awt.Color(0, 102, 204));
        bt_situacao_a_pagar.setFont(new java.awt.Font("Khmer UI", 1, 11)); // NOI18N
        bt_situacao_a_pagar.setForeground(new java.awt.Color(255, 255, 255));
        bt_situacao_a_pagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_situacao_a_pagar.setText("Situação");
        bt_situacao_a_pagar.setToolTipText("Clique aqui para saber sua situação a pagar.");
        bt_situacao_a_pagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_situacao_a_pagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_situacao_a_pagar.setOpaque(true);
        bt_situacao_a_pagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_situacao_a_pagarMousePressed(evt);
            }
        });

        buscar_situacao();
        situacao_a_pagar.setEditable(false);
        situacao_a_pagar.setBackground(new java.awt.Color(255, 255, 204));
        situacao_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel11.setText("Observação");

        obs_a_pagar.setColumns(20);
        obs_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        obs_a_pagar.setLineWrap(true);
        obs_a_pagar.setRows(5);
        jScrollPane1.setViewportView(obs_a_pagar);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));

        jLabel17.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel17.setText("Buscar por Documento");

        cbx_busca_nome.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        cbx_busca_nome.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Clique aqui para carregar informações de pesquisa" }));
        cbx_busca_nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_busca_nomeMousePressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel18.setText("Buscar por ID");

        cbx_busca_id.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        cbx_busca_id.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID" }));
        cbx_busca_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbx_busca_idMousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 255, 204));
        jButton1.setText("BUSCAR");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_busca_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_busca_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbx_busca_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cbx_busca_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        id_fornecedor.setVisible(false);
        id_fornecedor.setText("iid fornecedor");

        VL_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        VL_pgto_a_pagar.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id_fornecedor)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(id_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doc_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(VL_pgto_a_pagar)
                                    .addComponent(dt_pgto_a_pagar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dt_venc_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(VL_pagar_a_pagar)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_situacao_a_pagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dt_lanc_a_pagar)
                                    .addComponent(situacao_a_pagar)))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VL_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_forn_a_pagar, 0, 1, Short.MAX_VALUE)))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(doc_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cbx_forn_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VL_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dt_pgto_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(dt_venc_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(dt_lanc_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(VL_pagar_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_situacao_a_pagar)
                    .addComponent(situacao_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VL_pgto_a_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(id_fornecedor)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 643, 466);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_busca_nomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_busca_nomeMousePressed

        cbx_busca_id.setEnabled(false);
        ListarNomes_CBX();
        cbx_busca_nome.setEnabled(true);

// TODO add your handling code here:
    }//GEN-LAST:event_cbx_busca_nomeMousePressed

    private void cbx_busca_idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_busca_idMousePressed

        cbx_busca_nome.setEnabled(false);
        ListarId_CBX();
        cbx_busca_id.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_busca_idMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Buscar();
        buscar_situacao();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbx_forn_a_pagarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_forn_a_pagarMousePressed

        Listar_Fornecedor_CBX();
        
// TODO add your handling code here:
    }//GEN-LAST:event_cbx_forn_a_pagarMousePressed

    private void bt_situacao_a_pagarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_situacao_a_pagarMousePressed

        bt_situacao();
        
// TODO add your handling code here:
    }//GEN-LAST:event_bt_situacao_a_pagarMousePressed

    private void bt_salvar_a_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvar_a_pagarActionPerformed

        SalvarDados();
        
// TODO add your handling code here:
    }//GEN-LAST:event_bt_salvar_a_pagarActionPerformed

    private void bt_limpar_a_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpar_a_pagarActionPerformed

        LimparCampos();
        
// TODO add your handling code here:
    }//GEN-LAST:event_bt_limpar_a_pagarActionPerformed

    
    public void LimparCampos() {

        id_a_pagar.setText(null);
        doc_a_pagar.setText(null);
        VL_a_pagar.setText(null);
        cbx_forn_a_pagar.addItem("Clique aqui para carregar lista de Fornecedores.");
        dt_pgto_a_pagar.setText(null);
        dt_venc_a_pagar.setText(null);
        dt_lanc_a_pagar.setText(null);
        VL_pgto_a_pagar.setText("");
        situacao_a_pagar.setText(null);
        obs_a_pagar.setText(null);

    }

    
    public void SalvarDados() {

        ArrayList<String> Registro = new ArrayList<>();
        Registro.add(id_a_pagar.getText());
        Registro.add(doc_a_pagar.getText());
        Registro.add(VL_a_pagar.getText());
        Registro.add(id_fornecedor.getText());

        if ("  /  /    ".equals(dt_pgto_a_pagar.getText())) {
            Registro.add("00/00/0000");
        } else {
            Registro.add(dt_pgto_a_pagar.getText());
        }

        if ("  /  /    ".equals(dt_venc_a_pagar.getText())) {
            Registro.add("00/00/0000");
        } else {
            Registro.add(dt_venc_a_pagar.getText());
        }

        if ("  /  /    ".equals(dt_lanc_a_pagar.getText())) {
            Registro.add("00/00/0000");
        } else {
            Registro.add(dt_lanc_a_pagar.getText());
        }

        Registro.add(VL_pgto_a_pagar.getText());
        Registro.add(VL_pagar_a_pagar.getText());
        Registro.add(situacao_a_pagar.getText());
        Registro.add(obs_a_pagar.getText());

        a_pagarControl Controllap = new a_pagarControl();
        try {
            //
            Controllap.Atualizar(Registro);
            //

// TODO add your handling code here:
        } catch (ParseException ex) {

            JOptionPane.showMessageDialog(null, "Erro Fatal! Erro, " + ex + ". Informações inseridas incorretamentes!");

            Logger.getLogger(br.com.visao.telas.cadastro.fornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }

        LimparCampos();

    }

    
    public void bt_situacao() {

        Double valor_total = Double.parseDouble(VL_a_pagar.getText());
        Double valor_pago = Double.parseDouble(VL_pgto_a_pagar.getText());
        Double valor_a_pagar;

        valor_a_pagar = valor_total - valor_pago;

        if (valor_a_pagar > 0) {
            situacao_a_pagar.setText("Conta Pendente");
            situacao_a_pagar.setForeground(Color.RED);
            situacao_a_pagar.setBackground(Color.BLACK);
            VL_pagar_a_pagar.setText(String.valueOf(valor_a_pagar));
        } else if (valor_a_pagar == 0) {
            situacao_a_pagar.setText("Conta Paga");
            situacao_a_pagar.setForeground(Color.BLUE);
            situacao_a_pagar.setBackground(Color.BLACK);
            VL_pagar_a_pagar.setText(String.valueOf(valor_a_pagar));
        } else {
            situacao_a_pagar.setText("Troco de " + String.valueOf(valor_a_pagar).replace("-", "") + " real(reais).");
            situacao_a_pagar.setForeground(Color.GREEN);
            situacao_a_pagar.setBackground(Color.BLACK);
            VL_pagar_a_pagar.setText(String.valueOf(valor_a_pagar));
        }

    }

    
    public void Listar_Fornecedor_CBX() {

        try {

            Connection conn = conexao.GeraConexao();

            String sql = "SELECT * FROM GOSPAD_BD.fornecedor";

            PreparedStatement comando = conn.prepareStatement(sql);

            ResultSet rs = comando.executeQuery();

            cbx_forn_a_pagar.removeAllItems();

            while (rs.next()) {

                id_fornecedor.setText(rs.getString("id"));
                cbx_forn_a_pagar.addItem(rs.getString("nome"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void ListaAP_ID() {

        String buscarNome = (String) cbx_busca_id.getSelectedItem();

        try {

            if (!buscarNome.equals("")) {

                Connection conn = conexao.GeraConexao();

                String sql = "SELECT * FROM GOSPAD_BD.a_pagar WHERE id = ?";

                PreparedStatement comando = conn.prepareStatement(sql);

                comando.setString(1, buscarNome);

                ResultSet rs = comando.executeQuery();

                cbx_forn_a_pagar.removeAllItems();

                while (rs.next()) {

                    id_a_pagar.setText(rs.getString("id"));
                    doc_a_pagar.setText(rs.getString("documento"));
                    VL_a_pagar.setText(rs.getString("vl_total"));

                    id_fornecedor.setText(rs.getString("id_fornecedor"));

                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    df.setLenient(false);
                    String data_registro = df.format(rs.getDate("pgto_dt"));
                    dt_pgto_a_pagar.setText(String.valueOf(data_registro));

                    DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                    df2.setLenient(false);
                    String data_registro2 = df2.format(rs.getDate("vencimento_dt"));
                    dt_venc_a_pagar.setText(String.valueOf(data_registro2));

                    DateFormat df3 = new SimpleDateFormat("dd/MM/yyyy");
                    df3.setLenient(false);
                    String data_registro3 = df3.format(rs.getDate("lancamento_dt"));
                    dt_lanc_a_pagar.setText(String.valueOf(data_registro3));

                    VL_pgto_a_pagar.setText(rs.getString("vl_pago"));
                    VL_pagar_a_pagar.setText(rs.getString("vl_apagar"));
                    situacao_a_pagar.setText(rs.getString("situacao"));
                    obs_a_pagar.setText(rs.getString("observacao"));

                    Lista_id_fornecedor();

                }

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um nome!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void ListaAP_Nome() {

        String buscarNome = (String) cbx_busca_nome.getSelectedItem();

        try {

            if (!buscarNome.equals("")) {

                Connection conn = conexao.GeraConexao();

                String sql = "SELECT * FROM GOSPAD_BD.a_pagar WHERE documento = ?";

                PreparedStatement comando = conn.prepareStatement(sql);

                comando.setString(1, buscarNome);

                ResultSet rs = comando.executeQuery();

                cbx_forn_a_pagar.removeAllItems();

                while (rs.next()) {

                    id_a_pagar.setText(rs.getString("id"));
                    doc_a_pagar.setText(rs.getString("documento"));
                    VL_a_pagar.setText(rs.getString("vl_total"));

                    id_fornecedor.setText(rs.getString("id_fornecedor"));

                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    df.setLenient(false);
                    String data_registro = df.format(rs.getDate("pgto_dt"));
                    dt_pgto_a_pagar.setText(String.valueOf(data_registro));

                    DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                    df2.setLenient(false);
                    String data_registro2 = df2.format(rs.getDate("vencimento_dt"));
                    dt_venc_a_pagar.setText(String.valueOf(data_registro2));

                    DateFormat df3 = new SimpleDateFormat("dd/MM/yyyy");
                    df3.setLenient(false);
                    String data_registro3 = df3.format(rs.getDate("lancamento_dt"));
                    dt_lanc_a_pagar.setText(String.valueOf(data_registro3));

                    VL_pgto_a_pagar.setText(rs.getString("vl_pago"));
                    VL_pagar_a_pagar.setText(rs.getString("vl_apagar"));
                    situacao_a_pagar.setText(rs.getString("situacao"));
                    obs_a_pagar.setText(rs.getString("observacao"));

                    Lista_id_fornecedor();

                }

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um nome!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void Lista_id_fornecedor() {

        String buscarID = (String) id_fornecedor.getText();

        try {

            if (!buscarID.equals("")) {

                Connection conn = conexao.GeraConexao();

                String sql = "SELECT * FROM GOSPAD_BD.fornecedor WHERE id = ?";

                PreparedStatement comando = conn.prepareStatement(sql);

                comando.setString(1, buscarID);

                ResultSet rs = comando.executeQuery();

                cbx_forn_a_pagar.removeAllItems();

                while (rs.next()) {

                    cbx_forn_a_pagar.addItem(rs.getString("nome"));

                }

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um nome!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void Buscar() {

        boolean nome = cbx_busca_nome.isEnabled();
        String cbxNome = (String) cbx_busca_nome.getSelectedItem();

        boolean id = cbx_busca_id.isEnabled();
        String cbxID = (String) cbx_busca_id.getSelectedItem();

        if (nome == true && id == false) {
            ListaAP_Nome();
        } else if (nome == true && id == true) {
            ListaAP_ID();
        } else if (nome == false && id == true) {
            ListaAP_ID();
        } else if (nome == true && id == true && "Clique aqui para carregar informações de pesquisa".equals(cbxNome) && "ID".equals(cbxID)) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar Informações!\n\nFavor, insira informações para pesquisa! (Nome e ID).");
        } else if (nome == true && id == true && "Clique aqui para carregar informações de pesquisa".equals(cbxNome) && !"ID".equals(cbxID)) {
            ListaAP_ID();
        } else if (nome == true && id == true && !"Clique aqui para carregar informações de pesquisa".equals(cbxNome) && "ID".equals(cbxID)) {
            ListaAP_Nome();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar Informações!\n\nFavor, insira informações para pesquisa! (Nome e ID).");
        }

    }

    public void ListarId_CBX() {

        try {

            Connection conn = conexao.GeraConexao();

            String sql = "SELECT * FROM GOSPAD_BD.a_pagar";

            PreparedStatement comando = conn.prepareStatement(sql);

            ResultSet rs = comando.executeQuery();

            cbx_busca_id.removeAllItems();

            while (rs.next()) {

                cbx_busca_id.addItem(rs.getString("id"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void ListarNomes_CBX() {

        try {

            Connection conn = conexao.GeraConexao();

            String sql = "SELECT * FROM GOSPAD_BD.a_pagar";

            PreparedStatement comando = conn.prepareStatement(sql);

            ResultSet rs = comando.executeQuery();

            cbx_busca_nome.removeAllItems();

            while (rs.next()) {

                cbx_busca_nome.addItem(rs.getString("documento"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    public void buscar_situacao(){
        String situacao = situacao_a_pagar.getText();

if (    null != situacao)switch (situacao) {
            case "Conta Pendente":
                situacao_a_pagar.setForeground(Color.RED);
                situacao_a_pagar.setBackground(Color.BLACK);
                break;
            case "Conta Paga":
                situacao_a_pagar.setForeground(Color.BLUE);
                situacao_a_pagar.setBackground(Color.BLACK);
                break;
            default:
                situacao_a_pagar.setForeground(Color.GREEN);
                situacao_a_pagar.setBackground(Color.BLACK);
                break;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VL_a_pagar;
    private javax.swing.JTextField VL_pagar_a_pagar;
    private javax.swing.JTextField VL_pgto_a_pagar;
    private javax.swing.JButton bt_limpar_a_pagar;
    private javax.swing.JButton bt_salvar_a_pagar;
    private javax.swing.JLabel bt_situacao_a_pagar;
    private javax.swing.JComboBox cbx_busca_id;
    private javax.swing.JComboBox cbx_busca_nome;
    private javax.swing.JComboBox cbx_forn_a_pagar;
    private javax.swing.JTextField doc_a_pagar;
    private javax.swing.JFormattedTextField dt_lanc_a_pagar;
    private javax.swing.JFormattedTextField dt_pgto_a_pagar;
    private javax.swing.JFormattedTextField dt_venc_a_pagar;
    private javax.swing.JTextField id_a_pagar;
    private javax.swing.JLabel id_fornecedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea obs_a_pagar;
    private javax.swing.JTextField situacao_a_pagar;
    // End of variables declaration//GEN-END:variables

}
