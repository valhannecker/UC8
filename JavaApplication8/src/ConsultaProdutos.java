import modelo.Produto;
import Banco.BancoProduto;
import javax.swing.table.DefaultTableModel;


public class ConsultaProdutos extends javax.swing.JInternalFrame {
    
    private void carregarProdutos(){
    DefaultTableModel modelo = new DefaultTableModel();
    String pesquisa = txtPesquisa.getText().toLowerCase();
    modelo.addColumn("Codigo");
    modelo.addColumn("Descricao");
    modelo.addColumn("Valor");
    modelo.addColumn("Quantidade");

    for (Produto produto : BancoProduto.produtos){
        if (produto.getDescricao().toLowerCase().contains(pesquisa)){
           modelo.addRow(new Object[] {
           produto.getId(),
           produto.getDescricao(),
           produto.getValor(),
           produto.getQuantidade()
                   
           });
        }
    }
    TabelaProduto.setModel(modelo);
 
    }
private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConsultaProdutos.class.getName());

    
    public ConsultaProdutos() {
        initComponents();
        carregarProdutos();
    }
    
    private void limparCampos() {

    txtDescricao.setText("");
    txtValor.setText("");
    txtQuantidade.setText("");
    txtPesquisa.setText("");

    idSelecionado = 0;

    txtDescricao.requestFocus();
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        rbDescricao = new javax.swing.JRadioButton();
        rbId = new javax.swing.JRadioButton();
        txtDescricao = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProduto = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Produtos");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        buttonGroup1.add(rbDescricao);
        rbDescricao.setForeground(new java.awt.Color(255, 255, 255));
        rbDescricao.setText("Descricao");

        rbId.setForeground(new java.awt.Color(255, 255, 255));
        rbId.setText("Codigo");

        txtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("descricao"));
        txtDescricao.addActionListener(this::txtDescricaoActionPerformed);

        jButton2.setText("Adicionar");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Editar");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("Excluir");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        txtValor.setBorder(javax.swing.BorderFactory.createTitledBorder("valor"));
        txtValor.addActionListener(this::txtValorActionPerformed);

        txtQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder("quantidade"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbId))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtDescricao)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtValor)
                                .addGap(18, 18, 18)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDescricao)
                    .addComponent(rbId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(12, 12, 12)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        TabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descricao", "Valor", "Quantidade"
            }
        ));
        TabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    carregarProdutos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if (txtDescricao.getText().isEmpty()
            || txtValor.getText().isEmpty()
            || txtQuantidade.getText().isEmpty()) {

        JOptionPane.showMessageDialog(
                null,
                "Preencha todos os campos.");

        return;
    }

    Produto produto = new Produto();

    produto.setId(BancoProduto.idProduto);
    produto.setDescricao(txtDescricao.getText());
    produto.setValor(
            Double.parseDouble(txtValor.getText()));
    produto.setQuantidade(
            Integer.parseInt(txtQuantidade.getText()));

    BancoProduto.produtos.add(produto);

    BancoProduto.idProduto++;

    JOptionPane.showMessageDialog(
            null,
            "Produto adicionado com sucesso!");

    carregarProdutos();
    limparCampos();
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutoMouseClicked
        int linha =
            TabelaProduto.getSelectedRow();

    if (linha >= 0) {

        idSelecionado = Integer.parseInt(
                TabelaProduto
                .getValueAt(linha, 0)
                .toString());

        txtDescricao.setText(
                TabelaProduto
                .getValueAt(linha, 1)
                .toString());

        txtValor.setText(
                TabelaProduto
                .getValueAt(linha, 2)
                .toString());

        txtQuantidade.setText(
                TabelaProduto
                .getValueAt(linha, 3)
                .toString());
    }

    }//GEN-LAST:event_TabelaProdutoMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if (idSelecionado == 0) {

        JOptionPane.showMessageDialog(
                null,
                "Selecione um produto.");

        return;
    }

    for (Produto produto :
            BancoProduto.produtos) {

        if (produto.getId() == idSelecionado) {

            produto.setDescricao(
                    txtDescricao.getText());

            produto.setValor(
                    Double.parseDouble(
                            txtValor.getText()));

            produto.setQuantidade(
                    Integer.parseInt(
                            txtQuantidade.getText()));

            JOptionPane.showMessageDialog(
                    null,
                    "Produto atualizado!");

            carregarProduto();
            limparCampos();

            idSelecionado = 0;

            break;
        }
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     if (idSelecionado == 0) {

        JOptionPane.showMessageDialog(
                null,
                "Selecione um produto.");

        return;
    }

    int resposta =
            JOptionPane.showConfirmDialog(
                    null,
                    "Deseja excluir?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);

    if (resposta == JOptionPane.YES_OPTION) {

        for (Produto produto :
                BancoProduto.produtos) {

            if (produto.getId()
                    == idSelecionado) {

                BancoProduto.produtos
                        .remove(produto);

                JOptionPane.showMessageDialog(
                        null,
                        "Produto removido!");

                carregarProduto();
                limparCampos();

                idSelecionado = 0;

                break;
            }
        }
    }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaProduto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbDescricao;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
