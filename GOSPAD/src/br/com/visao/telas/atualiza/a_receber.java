/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.telas.atualiza;

import br.com.visao.telas.cadastro.*;

/**
 *
 * @author Rafael Paes Leme
 */
public class a_receber extends javax.swing.JInternalFrame {

    /**
     * Creates new form a_pagar
     */
    public a_receber() {
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
        bt_salvar_a_receber = new javax.swing.JButton();
        bt_limpar_a_receber = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_a_receber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        doc_a_receber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        VLT_a_receber = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        cbx_clie_a_receber = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        dt_receb_a_receber = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        dt_venc_a_receber = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        dt_lanc_a_receber = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        VL_rec_a_receber = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        VL_a_rec_a_receber = new javax.swing.JTextField();
        bt_situacao_a_receber = new javax.swing.JLabel();
        situacao_a_receber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs_a_receber = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Atualização de Contas a Receber");
        setVisible(true);

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        bt_salvar_a_receber.setBackground(new java.awt.Color(0, 153, 204));
        bt_salvar_a_receber.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_salvar_a_receber.setForeground(new java.awt.Color(255, 255, 255));
        bt_salvar_a_receber.setText("ATUALIZAR");
        bt_salvar_a_receber.setBorderPainted(false);
        bt_salvar_a_receber.setContentAreaFilled(false);
        bt_salvar_a_receber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_salvar_a_receber.setOpaque(true);

        bt_limpar_a_receber.setBackground(new java.awt.Color(0, 153, 204));
        bt_limpar_a_receber.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        bt_limpar_a_receber.setForeground(new java.awt.Color(255, 255, 255));
        bt_limpar_a_receber.setText("LIMPAR");
        bt_limpar_a_receber.setBorderPainted(false);
        bt_limpar_a_receber.setContentAreaFilled(false);
        bt_limpar_a_receber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_limpar_a_receber.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_salvar_a_receber)
                .addGap(18, 18, 18)
                .addComponent(bt_limpar_a_receber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salvar_a_receber)
                    .addComponent(bt_limpar_a_receber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel1.setText("ID");

        id_a_receber.setEditable(false);
        id_a_receber.setBackground(new java.awt.Color(255, 255, 204));
        id_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel2.setText("Documento");

        doc_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel3.setText("Valor Total");

        try {
            VLT_a_receber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        VLT_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cliente");

        cbx_clie_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        cbx_clie_a_receber.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel5.setText("Recebimento");

        try {
            dt_receb_a_receber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_receb_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel6.setText("Vencimento");

        try {
            dt_venc_a_receber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_venc_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Lançamento");

        try {
            dt_lanc_a_receber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dt_lanc_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel8.setText("Valor Recebido");

        try {
            VL_rec_a_receber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        VL_rec_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel9.setText("Valor a Receber");

        VL_a_rec_a_receber.setEditable(false);
        VL_a_rec_a_receber.setBackground(new java.awt.Color(255, 255, 204));
        VL_a_rec_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        bt_situacao_a_receber.setBackground(new java.awt.Color(0, 102, 204));
        bt_situacao_a_receber.setFont(new java.awt.Font("Khmer UI", 1, 11)); // NOI18N
        bt_situacao_a_receber.setForeground(new java.awt.Color(255, 255, 255));
        bt_situacao_a_receber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt_situacao_a_receber.setText("Situação");
        bt_situacao_a_receber.setToolTipText("Clique aqui para saber sua situação a receber.");
        bt_situacao_a_receber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_situacao_a_receber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_situacao_a_receber.setOpaque(true);

        situacao_a_receber.setEditable(false);
        situacao_a_receber.setBackground(new java.awt.Color(255, 255, 204));
        situacao_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel11.setText("Observação");

        obs_a_receber.setColumns(20);
        obs_a_receber.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        obs_a_receber.setLineWrap(true);
        obs_a_receber.setRows(5);
        jScrollPane1.setViewportView(obs_a_receber);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));

        jLabel17.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel17.setText("Buscar por Documento");

        jComboBox1.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jLabel18.setText("Buscar por ID");

        jComboBox2.setFont(new java.awt.Font("Khmer UI", 0, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Khmer UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 255, 204));
        jButton1.setText("BUSCAR");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VLT_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_clie_a_receber, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dt_receb_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dt_venc_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(dt_lanc_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(id_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doc_a_receber))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(VL_rec_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VL_a_rec_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_situacao_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(situacao_a_receber))
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(doc_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(VLT_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_clie_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dt_receb_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(dt_venc_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(dt_lanc_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(VL_rec_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(VL_a_rec_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_situacao_a_receber)
                    .addComponent(situacao_a_receber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
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

        setBounds(0, 0, 720, 479);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField VLT_a_receber;
    private javax.swing.JTextField VL_a_rec_a_receber;
    private javax.swing.JFormattedTextField VL_rec_a_receber;
    private javax.swing.JButton bt_limpar_a_receber;
    private javax.swing.JButton bt_salvar_a_receber;
    private javax.swing.JLabel bt_situacao_a_receber;
    private javax.swing.JComboBox cbx_clie_a_receber;
    private javax.swing.JTextField doc_a_receber;
    private javax.swing.JFormattedTextField dt_lanc_a_receber;
    private javax.swing.JFormattedTextField dt_receb_a_receber;
    private javax.swing.JFormattedTextField dt_venc_a_receber;
    private javax.swing.JTextField id_a_receber;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
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
    private javax.swing.JTextArea obs_a_receber;
    private javax.swing.JTextField situacao_a_receber;
    // End of variables declaration//GEN-END:variables
}
