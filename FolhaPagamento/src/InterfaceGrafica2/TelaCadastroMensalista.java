
package InterfaceGrafica2;

import folhapagamento.Mensalista;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaCadastroMensalista extends javax.swing.JInternalFrame {
    
        private ArrayList<Mensalista> listaMensalista = new ArrayList<Mensalista>();
        DefaultTableModel modelo;

    public TelaCadastroMensalista() {
        initComponents();
        estadoInicialDaTela();
        modelo = new DefaultTableModel();
        tblMensalista.setModel(modelo);
        modelo.setColumnCount(0);
        modelo.addColumn("Matrícula");
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Dependentes");
        modelo.addColumn("Salário Bruto");
        modelo.addColumn("Desconto de INSS");
        modelo.addColumn("Desconto de IRRF");
        modelo.addColumn("Desconto Transporte");
        modelo.addColumn("Desconto Alimentação");
        modelo.addColumn("Salário Líquido");
        
    }
    
    private void estadoInicialDaTela(){
       btnAdicionar.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnCancelar.setEnabled(false);
       btnListarMensalistas.setEnabled(true);
       txtNome.setEnabled(false);
       txtCPF.setEnabled(false);         
       txtSalario.setEnabled(false);
       txtMatricula.setEnabled(false);
       txtValeRefeicao.setEnabled(false);
       txtNome.setText("");
       txtCPF.setText("");
       txtMatricula.setText("");
       txtSalario.setText(""); 
       txtValeRefeicao.setText("");
    }
    
    
    private void estadoDaTelaNaInclusao(){
       btnAdicionar.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnCancelar.setEnabled(true);
       btnListarMensalistas.setEnabled(false);
       txtNome.setEnabled(true);
       txtCPF.setEnabled(true);
       txtSalario.setEnabled(true);
       txtValeRefeicao.setEnabled(true);
       txtMatricula.setEnabled(true);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        lblValeRefeicao = new javax.swing.JLabel();
        txtValeRefeicao = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnListarMensalistas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMensalista = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setTitle("Mensalista");

        jLabel1.setText("Cadastro de Mensalistas");

        lblNome.setText("Nome:");

        lblCPF.setText("CPF:");

        lblMatricula.setText("Matricula:");

        lblSalario.setText("Salario:");

        lblValeRefeicao.setText("Valor Vale Refeição:");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnListarMensalistas.setText("Listar Mensalistas");
        btnListarMensalistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarMensalistasActionPerformed(evt);
            }
        });

        tblMensalista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblMensalista);

        jLabel2.setText("Numero de Dependentes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnListarMensalistas))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSalario)
                                    .addComponent(lblMatricula)
                                    .addComponent(lblNome)
                                    .addComponent(txtNome)
                                    .addComponent(lblCPF)
                                    .addComponent(txtCPF)
                                    .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(txtSalario))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblValeRefeicao)
                                    .addComponent(txtValeRefeicao, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField1)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValeRefeicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCPF)
                    .addComponent(txtValeRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(lblSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnListarMensalistas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        this.estadoInicialDaTela();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
       
        this.estadoDaTelaNaInclusao();
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        try {
            if (txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O campo nome é obrigatório.","Campo obrigatório.",JOptionPane.ERROR_MESSAGE);
        }
            
            else if (txtCPF.getText().equals("")){
                JOptionPane.showMessageDialog(null, "O campo CPF é obrigatório","Campo obrigatório",JOptionPane.ERROR_MESSAGE);
            }
            else if (txtMatricula.getText().equals("")){
                JOptionPane.showMessageDialog(null, "O campo Matricula é obrigatório","Campo obrigatório",JOptionPane.ERROR_MESSAGE);
            }
            else if (txtSalario.getText().equals("")){
                JOptionPane.showMessageDialog(null, "O campo Salário é obrigatório","Campo obrigatório",JOptionPane.ERROR_MESSAGE);
            }
            else if (txtValeRefeicao.getText().equals("")){
                JOptionPane.showMessageDialog(null, "O campo Vale Refeição é obrigatório","Campo obrigatório",JOptionPane.ERROR_MESSAGE);
            }
            else {
                
               Mensalista men = new Mensalista(txtNome.getText(),txtCPF.getText(),txtMatricula.getText(),
               Double.valueOf(txtSalario.getText()),Double.valueOf(txtValeRefeicao.getText()));
               
               listaMensalista.add(men);
               
               JOptionPane.showMessageDialog(null,
                        "Cliente cadastrado com sucesso.","Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
               this.estadoInicialDaTela();
                
            }
        }
            catch (Exception e){
           JOptionPane.showMessageDialog(null, 
                       "Ocorreu o erro: " + e.getMessage(),
                       "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnListarMensalistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarMensalistasActionPerformed
       
            
        
            
            
            for (Mensalista men: listaMensalista){
               double s = men.getSalario()-men.calcularDescontoVR()-men.calcularDescontoVT()-men.calcularIRRF()
                       -men.calcularInss();
                modelo.addRow(new Object [] {men.getMatricula(),men.getNome(),men.getCPF(),men.getListaDependente().size(),
                men.getSalario(),men.calcularInss(),men.calcularIRRF(),men.calcularDescontoVT(),men.calcularDescontoVR(),s});
                    
              
            }
        
    }//GEN-LAST:event_btnListarMensalistasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnListarMensalistas;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblValeRefeicao;
    private javax.swing.JTable tblMensalista;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtValeRefeicao;
    // End of variables declaration//GEN-END:variables
}
