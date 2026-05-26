
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        campoEmail_Login = new javax.swing.JTextField();
        campoSenha_Login = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        bttEntrar = new javax.swing.JButton();
        naoTemConta = new javax.swing.JLabel();
        bttCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(212, 94, 128));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jPanel3.setBackground(new java.awt.Color(255, 102, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        campoEmail_Login.setBackground(new java.awt.Color(255, 204, 255));
        campoEmail_Login.setForeground(new java.awt.Color(255, 255, 255));
        campoEmail_Login.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        campoEmail_Login.setName("emailField"); // NOI18N
        campoEmail_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmail_LoginActionPerformed(evt);
            }
        });

        campoSenha_Login.setBackground(new java.awt.Color(255, 204, 255));
        campoSenha_Login.setForeground(new java.awt.Color(255, 255, 255));
        campoSenha_Login.setToolTipText("");
        campoSenha_Login.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        campoSenha_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenha_LoginActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/—Pngtree—contact icon_4658034 (1).png"))); // NOI18N

        bttEntrar.setBackground(new java.awt.Color(255, 204, 255));
        bttEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttEntrar.setForeground(new java.awt.Color(255, 255, 255));
        bttEntrar.setText("Entrar");
        bttEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEntrarActionPerformed(evt);
            }
        });

        naoTemConta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        naoTemConta.setForeground(new java.awt.Color(255, 255, 255));
        naoTemConta.setText("Não tem conta?");

        bttCadastrar.setBackground(new java.awt.Color(255, 204, 255));
        bttCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        bttCadastrar.setText("Cadastrar");
        bttCadastrar.setName("bttCadastrar"); // NOI18N
        bttCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 119, Short.MAX_VALUE)
                .addComponent(bttEntrar)
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEmail_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSenha_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(naoTemConta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(bttCadastrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(campoEmail_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttEntrar)
                .addGap(18, 18, 18)
                .addComponent(naoTemConta)
                .addGap(18, 18, 18)
                .addComponent(bttCadastrar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoEmail_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmail_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmail_LoginActionPerformed

    private void campoSenha_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenha_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenha_LoginActionPerformed

    private void bttCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCadastrarActionPerformed
    Cadastro telalogin = new Cadastro();
    setVisible(false);
    telalogin.setVisible(true);
    }//GEN-LAST:event_bttCadastrarActionPerformed

    private void bttEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEntrarActionPerformed
        String email = campoEmail_Login.getText();
        String senha = new String (campoSenha_Login.getPassword());
        
    if (BancoUsuario.ValidarLogin(email, senha)){
        JOptionPane.showMessageDialog(this, "Seja Bem Vindo" + BancoUsuario.ValidarNome(email, senha)+ "\n login realizado com sucesso!");
    } else {
        JOptionPane.showMessageDialog(this,"Email ou senha inválidos!");
    }
    }//GEN-LAST:event_bttEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttCadastrar;
    private javax.swing.JButton bttEntrar;
    private javax.swing.JTextField campoEmail_Login;
    private javax.swing.JPasswordField campoSenha_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel naoTemConta;
    // End of variables declaration//GEN-END:variables
}
