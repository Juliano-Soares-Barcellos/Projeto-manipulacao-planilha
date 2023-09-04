/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julianob
 */
public class ProcurarCodigo extends javax.swing.JFrame {

    /**
     * Creates new form ProcurarCodigo
     */
    private DefaultTableModel model;
    private JTable Tabela2;
    private List<String> teste = new ArrayList<>();
    private TelaInicial telaInicial;

    public ProcurarCodigo(TelaInicial TelaInicial, JTable Tabelas)
    {
        this.Tabela2 = Tabelas;
        this.telaInicial = TelaInicial;
        initComponents();
        model = (DefaultTableModel) Tabelas.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotaoProcura = new javax.swing.JButton();
        TextoProcura = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        BotaoVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabelas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Procurar Produto na Tabela");

        jPanel1.setBackground(new java.awt.Color(176, 208, 212));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 18, 18));
        jLabel1.setText("Procurar informações sobre o codigo :");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Digite o Codigo do item procurado:");

        BotaoProcura.setText("Procurar");
        BotaoProcura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProcuraActionPerformed(evt);
            }
        });

        TextoProcura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoProcuraKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoProcura, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(BotaoProcura))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoProcura, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoProcura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(176, 208, 212));

        BotaoVoltar.setText("< Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoVoltar)
                .addGap(503, 503, 503))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 102));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setForeground(new java.awt.Color(255, 204, 102));

        Tabelas.setBackground(new java.awt.Color(255, 255, 255));
        Tabelas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Tabelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Material", "Codigo do Produto", "Data do Conserto", "Data do Conserto", "Garantia", "Quantidade de conserto", "Dias Garantia"
            }
        ));
        jScrollPane1.setViewportView(Tabelas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoProcuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProcuraActionPerformed
        int garantiaColumnIndex = 2;
        int ConsertoColumnIndex = 4;
        int QuantidadeConsertoColumnIndex = 3;
        int CodigoColumnIndex = 1;

         if (TextoProcura.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "nao há produto para verificar no cadastro");
        }
        else
        {
            int indice = acharCodigoIndice(TextoProcura.getText());
           
            if (indice >= 0 ) 
            {
                Object ultimoElemento = null;
                Object penultimoElemento = null;
                // Percorre as colunas da linha e armazena o último valor não nulo encontrado
                for (int columnIndex = 0; columnIndex < Tabela2.getColumnCount(); columnIndex++) 
                {
                    Object valor = Tabela2.getValueAt(indice, columnIndex);
                    
                    if (valor != null) 
                    {
                        Object conserto = Tabela2.getValueAt(indice, 4);
                        int quantidade = Integer.parseInt(conserto.toString());
                        
                        if (quantidade > 1) 
                        {
                            penultimoElemento = ultimoElemento;
                            ultimoElemento = valor;
                        } 
                        else 
                        {
                            penultimoElemento = "";
                            ultimoElemento = valor;
                        }
                    }
                }
                // Obtém o valor do código
                Object nomeItem = Tabela2.getValueAt(indice, 0);
                // Obtém o valor da garantia
                Object garantia = Tabela2.getValueAt(indice, garantiaColumnIndex);
                Object conserto = Tabela2.getValueAt(indice, ConsertoColumnIndex);
                Object diasGarantia = Tabela2.getValueAt(indice, QuantidadeConsertoColumnIndex);
                Object Codigo = Tabela2.getValueAt(indice, CodigoColumnIndex);

                // Adiciona os valores na nova linha da tabela Tabelas
                DefaultTableModel tempModel = (DefaultTableModel) Tabelas.getModel();
                tempModel.addRow(new Object[]{nomeItem, Codigo, penultimoElemento, ultimoElemento, garantia, conserto, diasGarantia});

                // Define o novo modelo da tabela Tabelas
                Tabelas.setModel(tempModel);
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado");
            }
        } 
      TextoProcura.setText("");


    }//GEN-LAST:event_BotaoProcuraActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void TextoProcuraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoProcuraKeyReleased
TextoProcura.setText(TextoProcura.getText().replaceAll("[^0-9]+", ""));        // TODO add your handling code here:
    }//GEN-LAST:event_TextoProcuraKeyReleased

    public int acharCodigoIndice(String codigo)
    {
        int i;
        for (i = 0; i < model.getRowCount(); i++)
        {
            String nome = model.getValueAt(i, 1).toString().trim();
            if (nome.equals(codigo)) 
            {
                return i;
            }
        }
        return -i;
    }


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
            java.util.logging.Logger.getLogger(ProcurarCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcurarCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcurarCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcurarCodigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcurarCodigo(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoProcura;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JTable Tabelas;
    private javax.swing.JTextField TextoProcura;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
