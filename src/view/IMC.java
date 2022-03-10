/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author jairb
 */
public class IMC extends javax.swing.JFrame {

    /**
     * Creates new form IMC
     */
    public IMC() {
        initComponents();
    }

    public void limpar() {
        jtfSNome.setText("");
        jtfFPeso.setText("");
        jtfFAltura.setText("");
        jtfSNome.requestFocus();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfSNome = new javax.swing.JTextField();
        jbCalcular = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jtfFPeso = new javax.swing.JTextField();
        jtfFAltura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calc. IMC");

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Peso:");

        jLabel2.setText("Altura:");

        jLabel3.setText("Nome:");

        jtfSNome.setNextFocusableComponent(jtfFPeso);
        jtfSNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSNomeActionPerformed(evt);
            }
        });
        jtfSNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfSNomeKeyTyped(evt);
            }
        });

        jbCalcular.setText("Calcular");
        jbCalcular.setNextFocusableComponent(jbLimpar);
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });
        jbCalcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCalcularKeyPressed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.setNextFocusableComponent(jtfSNome);
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jtfFPeso.setNextFocusableComponent(jtfFAltura);
        jtfFPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfFPesoKeyTyped(evt);
            }
        });

        jtfFAltura.setNextFocusableComponent(jbCalcular);
        jtfFAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfFAlturaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfFAltura)
                            .addComponent(jtfFPeso))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbCalcular)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbLimpar))))
                    .addComponent(jtfSNome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfSNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbLimpar)
                    .addComponent(jtfFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbCalcular)
                    .addComponent(jtfFAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtfSNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSNomeKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321/[]{}=+-_)(*&¨%$#@!<>;:?";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfSNomeKeyTyped

    private void jtfFPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFPesoKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfFPesoKeyTyped

    private void jtfFAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFAlturaKeyTyped
        // TODO add your handling code here:
        String caracteres = "0987654321.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfFAlturaKeyTyped

    private void jbCalcularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCalcularKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbCalcular.doClick();
        }
    }//GEN-LAST:event_jbCalcularKeyPressed

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        // TODO add your handling code here:
        if (jtfSNome.getText().isBlank() || jtfFPeso.getText().isBlank()
                || jtfFAltura.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!");
        } else {
            String nome, imcResultado, msg;
            float peso, altura, imc;

            //Recebendo dados da tela através dos Text Field
            nome = jtfSNome.getText();
            nome = nome.toUpperCase();
//        nome = nome.substring(0,1).toUpperCase() + 
//                nome.substring(1).toLowerCase();
            peso = Float.parseFloat(jtfFPeso.getText());
            altura = Float.parseFloat(jtfFAltura.getText());

            //Calcular o IMC
            imc = peso / (altura * altura);
            if (imc <= 10) {
                JOptionPane.showMessageDialog(this, "Revise os valores de peso e altura!");
                jtfFPeso.requestFocus();
            } else {
                if (imc < 18.5) {
                    imcResultado = "magreza";
                } else if (imc <= 24.9) {
                    imcResultado = "peso ideal";
                } else if (imc <= 30) {
                    imcResultado = "sobrepeso";
                } else {
                    imcResultado = "obesidade";
                }
                //Chamar botão limpar
                limpar();
                
                //Exibir resultado
                msg = nome + ", seu IMC é de: " + String.format("%.2f", imc)
                        + " e você esta com : " + imcResultado + ".";
                JOptionPane.showMessageDialog(this, msg);
            }
        }
    }//GEN-LAST:event_jbCalcularActionPerformed

    private void jtfSNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSNomeActionPerformed

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
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JTextField jtfFAltura;
    private javax.swing.JTextField jtfFPeso;
    public javax.swing.JTextField jtfSNome;
    // End of variables declaration//GEN-END:variables
}
