/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import javax.swing.table.DefaultTableCellRenderer;
import Model.Planilha;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julianob
 */
public class TelaInicial extends javax.swing.JFrame {

    private List<Object[]> dados;
    private List<Object[]> dado;
    private DefaultTableModel model;
    private String[] dadosComData;
    /**
     * Creates new form TelaInicial
     */
    private static String cargoUsuario;
    public TelaInicial(String cargo) {
        initComponents();
        cargoUsuario=cargo;
        dados = new ArrayList<>();
        dado = new ArrayList<>();
        model = (DefaultTableModel) Tabelas.getModel();
        carregarDadosDaTabela(Tabelas);
       ocultar(cargoUsuario);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() 
        {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
            {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                // Define a cor da linha
                if (row % 2 == 0)
                {
                    component.setBackground(new Color(176, 208, 212, 180));
                }
                else
                {
                    component.setBackground(new Color(255, 250, 250));
                }

                return component;
            }
        };

        Tabelas.setDefaultRenderer(Object.class, renderer);

    }

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
        TextoCodigo = new javax.swing.JTextField();
        BotaoEnviar = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabelas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastramento e atualização de Produtos");

        jPanel1.setBackground(new java.awt.Color(176, 208, 212));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(204, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo do material consertado :");

        TextoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoCodigoKeyReleased(evt);
            }
        });

        BotaoEnviar.setText("Enviar");
        BotaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnviarActionPerformed(evt);
            }
        });

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HEADSET", "DISCADOR", "CARRAPATOS", "" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome do material :");

        jLabel3.setBackground(new java.awt.Color(204, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("* Campo obrigatorio");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 18, 18));
        jLabel4.setText("Cadastramento de materiais consertados :");

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(243, 18, 18));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lista de todos os materiais que ja foram consertado ");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68)
                        .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel2)
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(BotaoEnviar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel5)))
                .addGap(410, 410, 410))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(BotaoEnviar)
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(199, 190, 169));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        Tabelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATERIAL", "CODIGO DO PRODUTO", "GARANTIA", "DIAS GARANTIA", "QUANTIDADE DE CONCERTO"
            }
        ));
        Tabelas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabelas.setGridColor(new java.awt.Color(153, 255, 255));
        Tabelas.setSelectionBackground(new java.awt.Color(255, 204, 0));
        Tabelas.setSelectionForeground(new java.awt.Color(102, 0, 0));
        Tabelas.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(Tabelas);

        jMenuBar1.setBackground(new java.awt.Color(176, 208, 212));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(176, 208, 212));

        jMenu1.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Procuar Codigo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Quantidade de materiais consertados");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("gastos com materiais");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEnviarActionPerformed
        if (TextoCodigo.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "nao há produto para realizar o cadastro");
        }
        else
        {
            String comboBox = ComboBox.getItemAt(ComboBox.getSelectedIndex());
            if (comboBox.equals(" ")) 
            {
                JOptionPane.showMessageDialog(null, "escolha o nome do material","  MATERIAL !!! ", JOptionPane.INFORMATION_MESSAGE);
            }
            else 
            {
                LocalDate date = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String dataFormatada =date.format(formatter);
                int i = acharCodigoIndice(TextoCodigo.getText());
    
                if (i < 0) 
                {
                    String resposta = JOptionPane.showInputDialog(null, "Você tem certeza que este equipamento foi para conserto \ndigite s/n","                                                           ATENÇÃO !!!", JOptionPane.INFORMATION_MESSAGE);
                    if (resposta != null && resposta.equalsIgnoreCase("s")) 
                    {
                        Planilha A = new Planilha(comboBox, TextoCodigo.getText(), "Com Garantia ", "Ainda tem 90 dias", 1, dataFormatada);
                        Object[] linha = new Object[]{A.getMaterial(), A.getCodigoDoProduto(), A.getGarantia(), A.getDias(), A.getIdasAoConserto(), A.getData()};
                        dados.add(linha);
                        model.addRow(linha);
                        GravandoNoCsv();

                        JOptionPane.showMessageDialog(null, "produto consertado pela primeira vez","  CONSERTADO !!! ", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Operação cancelado com sucesso","  CANCELADO  !!! ", JOptionPane.INFORMATION_MESSAGE);
                    }
                } 
                else
                {
                    String resposta = JOptionPane.showInputDialog(null, "Você tem certeza que este equipamento foi para conserto \ndigite s/n","                                                  ATENÇÂO!!!    ", JOptionPane.INFORMATION_MESSAGE);
                    if (resposta != null && resposta.equalsIgnoreCase("s")) 
                    {
                        RenovarQuantidadeConserto(i, dataFormatada);
                        adicionarColunaDataCsv(i, dataFormatada);
                        atualizarTabela(dataFormatada, i);
                        JOptionPane.showMessageDialog(null, "produto consertado  novamente","  CONSERTADO !!! ", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Operação cancelado com sucesso","  CANCELADO !!!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                TextoCodigo.setText("");
            }   // TODO add your handling code here:
    }//GEN-LAST:event_BotaoEnviarActionPerformed
}
    private void TextoCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoCodigoKeyReleased
        TextoCodigo.setText(TextoCodigo.getText().replaceAll("[^0-9]", "").replaceAll("\\s", ""));
// TODO add your handling code here:
    }//GEN-LAST:event_TextoCodigoKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ProcurarCodigo P = new ProcurarCodigo(this, Tabelas);
        P.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int ProdutosConsertados = model.getRowCount();
        int quantidade = 0;
        for (int i = 0; i < Tabelas.getRowCount(); i++) 
        {
          String quantidadeConsertada = String.valueOf(Tabelas.getValueAt(i, 4));
           int quantidadeConsertadas=Integer.parseInt(quantidadeConsertada);
            quantidade += quantidadeConsertadas;
        }
        
        String mensagem = "Total de produtos enviado para conserto: " + ProdutosConsertados
                + "\nTotal de consertos com produtos Reincidentes: " + quantidade;
        JOptionPane.showMessageDialog(null, mensagem, "Informações de Conserto", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Filtro f = new Filtro(this, Tabelas);
        f.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed
    public void carregarDadosDaTabela(JTable tabela) 
    {
        int te = 0;
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0);
        String[] dados = null;
        String[] colunas = null;

        model.setRowCount(0);
        int maxColunas = 0; // Número máximo de colunas encontrado no arquivo
        try (BufferedReader reader = new BufferedReader(new FileReader("Dados.csv")))
        {
            String linha;

            while ((linha = reader.readLine()) != null) 
            {
                dados = linha.split(";");
                maxColunas = Math.max(maxColunas, dados.length - 5);
            }
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        for (int i = 0; i < maxColunas; i++)
        {
            String nomeColuna = (i + 1) + "º " + "CONSERTO";
            model.addColumn(nomeColuna);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("Dados.csv")))
        {
            String linha;

            while ((linha = reader.readLine()) != null)
            {
                dados = linha.split(";");
                if (dados[dados.length - 1].matches("\\d{2}/\\d{2}/\\d{4}"))
                {
                    String dataString = dados[dados.length - 1];
                    LocalDate data = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    LocalDate dataAtual = LocalDate.now();
                    LocalDate dataLimiteGarantia = data.plusDays(90);
                    te = Integer.parseInt(dados[4]);
                    boolean dentroDaGarantia = dataAtual.isBefore(dataLimiteGarantia);
                    long diasRestantes = ChronoUnit.DAYS.between(dataAtual, dataLimiteGarantia);
                    dados[2] = dentroDaGarantia ? "com Garantia" : "sem Garantia";

                    if (diasRestantes >= 0)
                    {
                        dados[3] = "Ainda tem " + diasRestantes + " dias";
                    } 
        
                    else 
                    
                    {
                        dados[3] = "excedeu em " + -diasRestantes + " dias";
                    }

                    model.addRow(dados);
                }
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void GravandoNoCsv() 
    {
        try 
        {
            FileWriter csvWriter = new FileWriter("Dados.csv", true);

            List<List<String>> rows = new ArrayList<>();

            for (Object[] rowData : dados) 
            {
                List<String> row = new ArrayList<>();
                for (Object element : rowData)
                {
                    row.add(element.toString());
                }
                rows.add(row);
            }
            for (List<String> rowData : rows)
            {
                csvWriter.append(String.join(";", rowData));
                csvWriter.append("\n");
               
            }
                dados.clear();
            System.out.println("salvando dados");
            csvWriter.flush();
            csvWriter.close();
        }
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "Desculpe mas nao fui possivel gravar estes dados ");
        }
    }

    public void RenovarQuantidadeConserto(int i, String data) 
    {
        try 
        {
            Path filePath = Path.of("dados.csv");
            FileWriter c = new FileWriter("Dados.csv", true);
            List<String> linhas = Files.readAllLines(filePath);
            // Atualiza o valor na linha especificada
            String linhaAtualizada = linhas.get(i);
            String[] dados = linhaAtualizada.split(";");
            int quantidadeConserto = Integer.parseInt(dados[4]);
            int conserto = 1;
            int res = quantidadeConserto + conserto;
            String resultado = String.valueOf(res);
            dados[4] = resultado; // Atualiza a coluna 4

            linhaAtualizada = String.join(";", dados);
            linhas.set(i, linhaAtualizada);
            // Escreve as linhas atualizadas de volta no arquivo CSV
            Files.write(filePath, linhas, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private int acharCodigoIndice(String codigo)
    {
        int IntCodigo;
        for (IntCodigo = 0; IntCodigo < Tabelas.getRowCount(); IntCodigo++)
        {
            String codigoTabela = Tabelas.getValueAt(IntCodigo, 1).toString().trim();
            if (codigo.equals(codigoTabela)) 
            {
                return IntCodigo;
            }
        }
        return -1;
    }

    public void adicionarColunaDataCsv(int linha, String data)
    {
        try 
        {
            // Caminho do arquivo CSV
            String filePath = "dados.csv";
            // Lê todas as linhas do arquivo CSV
            List<String> linhas = Files.readAllLines(Path.of(filePath));
            // Verifica se a linha especificada existe
            if (linha < 0 || linha >= linhas.size()) 
            {
                System.out.println("Linha inválida!");
                return;
            }
            String linhaSelecionada = linhas.get(linha);
            String[] dados = linhaSelecionada.split(";");
            String[] dadosComData = Arrays.copyOf(dados, dados.length + 1);
            dadosComData[dadosComData.length - 1] = data;
            linhas.set(linha, String.join(";", dadosComData));
            Files.write(Path.of(filePath), linhas);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void atualizarTabela(String data, int i) 
    {
        int quantidadeConserto = Integer.parseInt(model.getValueAt(i, 4).toString());
        int conserto = 1;
        int res = quantidadeConserto + conserto;
        model.setValueAt(res, i, 4);
        String aindaDias = "Ainda tem 90 dias";
        String garantia = "com Garantia";
        model.setValueAt(aindaDias, i, 3);
        model.setValueAt(garantia, i, 2);
        
        for (int column = 0; column < Tabelas.getColumnCount(); column++)
        {
            Object modelValue = model.getValueAt(i, column);

            if (modelValue == null || modelValue.toString().isEmpty()) 
            {
                model.setValueAt(data, i, column);
                break;
            }
        }

    }
      public void ocultar(String cargo) {
        if ( !"total".equals(cargo)) {
            BotaoEnviar.setVisible(false);
            TextoCodigo.setVisible(false);
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            ComboBox.setVisible(false);
            jLabel3.setVisible(false);
            jLabel5.setVisible(true);
            jLabel4.setVisible(false);
        } else {
            BotaoEnviar.setVisible(true);
            jLabel5.setVisible(false);
        }
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

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial(cargoUsuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEnviar;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTable Tabelas;
    private javax.swing.JTextField TextoCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
