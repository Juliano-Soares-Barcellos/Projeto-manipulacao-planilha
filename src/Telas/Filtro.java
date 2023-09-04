/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julianob
 */
public class Filtro extends javax.swing.JFrame {

    /**
     * Creates new form Filtro
     */
    private DefaultTableModel model;
    private JTable Tabela2;
    private TelaInicial telainicial;

    public Filtro(TelaInicial tela, JTable Tabelas) {
        initComponents();
        this.Tabela2 = Tabelas;
        this.telainicial = tela;

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Define a cor da linha
                if (row % 2 == 0) {
                    component.setBackground(new Color(176, 208, 212, 180));
                } else {
                    component.setBackground(new Color(255, 250, 25));
                }

                return component;
            }
        };

        Tabela1.setDefaultRenderer(Object.class, renderer);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cmes = new javax.swing.JComboBox<>();
        Cano = new javax.swing.JComboBox<>();
        BotaoEnter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Valor = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Valor1 = new javax.swing.JLabel();
        Valor2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gastos com Consertos");
        setBackground(new java.awt.Color(176, 208, 212));

        jPanel1.setBackground(new java.awt.Color(176, 208, 212));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("escolha o mês :");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("escolha o ano :");

        Cmes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        Cmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmesActionPerformed(evt);
            }
        });

        Cano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027" }));

        BotaoEnter.setText("Procurar");
        BotaoEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 18, 18));
        jLabel3.setText("Verificação de Gastos de Conserto Por Mês :");

        Tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material", "Codigo do Produto", "Penultimo Conserto", "Ultimo Conserto", "Garantia"
            }
        ));
        jScrollPane1.setViewportView(Tabela1);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Total de gastos R$ :");

        jButton2.setText("< Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Valor.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Total de produtos na garantia");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total de produtos Consertado");

        Valor1.setBackground(new java.awt.Color(255, 255, 204));

        Valor2.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoEnter)
                .addGap(215, 215, 215))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel4)
                        .addGap(44, 44, 44)
                        .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cmes, 0, 191, Short.MAX_VALUE)
                            .addComponent(Cano, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Cmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Cano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(BotaoEnter)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5))
                    .addComponent(Valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Valor2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Valor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmesActionPerformed

    private void BotaoEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEnterActionPerformed
        filtrarTabela();
// TODO add your handling code here:
    }//GEN-LAST:event_BotaoEnterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    private void filtrarTabela() {
        int totalProdutosConsertados = 0;
        int totalProdutosComGarantia = 0;

        String mesSelecionado = (String) Cmes.getSelectedItem();
        String anoSelecionado = (String) Cano.getSelectedItem();
        boolean dentroDaGarantia = false;
        String mesEscolhido = obterNumeroMes(mesSelecionado);
        int quantidadeConserto = 0;

        double valorTotal = 0.0;
        DefaultTableModel model = (DefaultTableModel) Tabela1.getModel();
        model.setRowCount(0);

        Object ultimoElemento = null;
        Object penultimoElemento = null;

        for (int i = 0; i < Tabela2.getRowCount(); i++) {
            // Percorre as colunas da linha e armazena o último valor não nulo encontrado
            for (int columnIndex = 0; columnIndex < Tabela2.getColumnCount(); columnIndex++) {
                Object valor = Tabela2.getValueAt(i, columnIndex);
                if (valor != null) {
                    Object conserto = Tabela2.getValueAt(i, 4);
                    int quantidade = Integer.parseInt(conserto.toString());

                    if (quantidade > 1) {
                        penultimoElemento = ultimoElemento;
                        ultimoElemento = valor;
                    } else {
                        penultimoElemento = "";
                        ultimoElemento = valor;
                    }
                }
            }

            String ultimaData = ultimoElemento.toString();
            String penultimoData = penultimoElemento.toString();
            DefaultTableModel tab = (DefaultTableModel) Tabela2.getModel();

            if (tab.getColumnCount() >= 5 && ultimaData.matches("\\d{2}/\\d{2}/\\d{4}")) {
                try {
                    LocalDate data = LocalDate.parse(ultimaData, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    int mesConserto = data.getMonthValue();
                    int anoConserto = data.getYear();

                    if (mesConserto == Integer.parseInt(mesEscolhido) && anoConserto == Integer.parseInt(anoSelecionado)) {
                        String c =tab.getValueAt(i, 4).toString();
quantidadeConserto=Integer.parseInt(c);
                        if (quantidadeConserto > 1) {
                            // Verificar a garantia apenas se o produto já foi consertado mais de uma vez
                            LocalDate datas2 = LocalDate.parse(penultimoData, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                            LocalDate dataSelecionada = LocalDate.of(anoConserto, mesConserto, 1);
                            LocalDate dataLimiteGarantia = datas2.plusDays(90);
                            dentroDaGarantia = dataSelecionada.isBefore(dataLimiteGarantia);
                        } else {
                            dentroDaGarantia = false;
                        }

                        Object Garantia = dentroDaGarantia ? "com Garantia" : "";

                        if (!dentroDaGarantia) {
                            double valorProduto = quantidadeConserto * 47.0;
                            valorTotal += valorProduto;
                        }
                        // Obtém o valor do código
                        Object nomeItem = Tabela2.getValueAt(i, 0);

                        // Obtém o valor da garantia
                        Object conserto = Tabela2.getValueAt(i, 4);

                        Object Codigo = Tabela2.getValueAt(i, 1);

                        DefaultTableModel tempModel = (DefaultTableModel) Tabela1.getModel();
                        tempModel.addRow(new Object[]{nomeItem, Codigo, penultimoElemento, ultimoElemento, Garantia, conserto});

                        if (quantidadeConserto > 0) {
                            totalProdutosConsertados++;
                        }

                        if (dentroDaGarantia) {
                            totalProdutosComGarantia++;
                        }
                    }
                } catch (DateTimeParseException  e) {
                      System.out.println("Erro de data: " + ultimaData);
    e.printStackTrace();
                }

            }

        }
        JOptionPane.showMessageDialog(null, "Total gasto este mês: R$ " + valorTotal);
        String val = valueOf(valorTotal);
        Valor.setText(val);

        String totalGarantia = valueOf(totalProdutosComGarantia);
        Valor1.setText(totalGarantia);

        String quantidadeProdutos = valueOf(totalProdutosConsertados);
        Valor2.setText(quantidadeProdutos);
    }

    public String obterNumeroMes(String mesSelecionado) {
        switch (mesSelecionado) {
            case "Janeiro":
                return "01";

            case "Fevereiro":
                return "02";

            case "Março":
                return "03";

            case "Abril":
                return "04";

            case "Maio":
                return "05";

            case "Junho":
                return "06";

            case "Julho":
                return "07";

            case "Agosto":
                return "08";

            case "Setembro":
                return "09";

            case "Outubro":
                return "10";

            case "Novembro":
                return "11";

            case "Dezembro":
                return "12";

        }
        return "0";
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
            java.util.logging.Logger.getLogger(Filtro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filtro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filtro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filtro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Filtro(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEnter;
    private javax.swing.JComboBox<String> Cano;
    private javax.swing.JComboBox<String> Cmes;
    private javax.swing.JTable Tabela1;
    private javax.swing.JLabel Valor;
    private javax.swing.JLabel Valor1;
    private javax.swing.JLabel Valor2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
