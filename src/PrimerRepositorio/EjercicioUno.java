/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimerRepositorio;

import javax.swing.JOptionPane;

/**
 *
 * @author liborio
 */
public class EjercicioUno extends javax.swing.JFrame {

    /**
     * Creates new form EjercicioUno
     */
    public EjercicioUno() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrimeraPersona = new javax.swing.JTextField();
        txtSegundaPersona = new javax.swing.JTextField();
        txtTerceraPersona = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPersona1 = new javax.swing.JTextField();
        txtPersona2 = new javax.swing.JTextField();
        txtPersona3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        jLabel1.setText("Invierten Dinero A Empresa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 11))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Primera Persona");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 20));

        jLabel3.setText("Segunda Persona");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, -1));

        jLabel4.setText("Tercera Persona");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, -1));

        txtPrimeraPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimeraPersonaKeyTyped(evt);
            }
        });
        jPanel2.add(txtPrimeraPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 60, -1));

        txtSegundaPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundaPersonaActionPerformed(evt);
            }
        });
        txtSegundaPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundaPersonaKeyTyped(evt);
            }
        });
        jPanel2.add(txtSegundaPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 60, -1));

        txtTerceraPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTerceraPersonaKeyTyped(evt);
            }
        });
        jPanel2.add(txtTerceraPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 60, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        cmdBorrar.setText("Borrar");
        jPanel2.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 250, 170));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 11))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Primera Persona");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel6.setText("Segunda Persona");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel7.setText("Tercera Persona");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));
        jPanel3.add(txtPersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 60, -1));

        txtPersona2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersona2ActionPerformed(evt);
            }
        });
        jPanel3.add(txtPersona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 60, -1));
        jPanel3.add(txtPersona3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 60, -1));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel8.setText("Cantidad Total");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 100, -1));

        txtRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResActionPerformed(evt);
            }
        });
        jPanel3.add(txtRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 80, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 240, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResActionPerformed

    private void txtPersona2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersona2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersona2ActionPerformed

    private void txtPrimeraPersonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimeraPersonaKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPrimeraPersonaKeyTyped

    private void txtSegundaPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundaPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundaPersonaActionPerformed

    private void txtSegundaPersonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundaPersonaKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSegundaPersonaKeyTyped

    private void txtTerceraPersonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTerceraPersonaKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtTerceraPersonaKeyTyped

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

        String Total, pres, sres, tres;
        double Primero, Segundo, Tercero, Oper = 0, Oper1 = 0, Oper2 = 0, Oper3 = 0;

        if (txtPrimeraPersona.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor coloque el valor en su primera persona", "Error", JOptionPane.ERROR_MESSAGE);
            txtPrimeraPersona.requestFocusInWindow();
        } else if (txtSegundaPersona.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor coloque el valor en su segunda persona", "Error", JOptionPane.ERROR_MESSAGE);
            txtSegundaPersona.requestFocusInWindow();
        } else if (txtTerceraPersona.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor coloque el valor en su tercera persona", "Error", JOptionPane.ERROR_MESSAGE);
            txtTerceraPersona.requestFocusInWindow();
        } else {
            Primero = Double.parseDouble(txtPrimeraPersona.getText());
            Segundo = Double.parseDouble(txtSegundaPersona.getText());
            Tercero = Double.parseDouble(txtTerceraPersona.getText());

            if (Segundo == Primero) {
                JOptionPane.showMessageDialog(this, "Digite Por Favor Una Cantidad Distinta", "Error", JOptionPane.ERROR_MESSAGE);
                txtPrimeraPersona.requestFocusInWindow();
            } else if (Tercero == Segundo) {
                JOptionPane.showMessageDialog(this, "Digite Por Favor Una Cantidad Distinta", "Error", JOptionPane.ERROR_MESSAGE);
                txtSegundaPersona.requestFocusInWindow();
            } else if (Tercero == Primero) {
                JOptionPane.showMessageDialog(this, "Digite Por Favor Una Cantidad Distinta", "Error", JOptionPane.ERROR_MESSAGE);
                txtTerceraPersona.requestFocusInWindow();
            }

            Oper = Primero + Segundo + Tercero;
            Primero = (Primero * 100) / Oper;
            Segundo = (Segundo * 100) / Oper;
            Tercero = (Tercero * 100) / Oper;

        }
        Total = String.valueOf(Oper);
        txtRes.setText(Total);
        pres = String.valueOf(Oper1 + "%");
        txtPersona1.setText(pres);
        sres = String.valueOf(Oper2 + "%");
        txtPersona2.setText(sres);
        tres = String.valueOf(Oper3 + "%");
        txtPersona3.setText(tres);
    }//GEN-LAST:event_cmdCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(EjercicioUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioUno().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtPersona1;
    private javax.swing.JTextField txtPersona2;
    private javax.swing.JTextField txtPersona3;
    private javax.swing.JTextField txtPrimeraPersona;
    private javax.swing.JTextField txtRes;
    private javax.swing.JTextField txtSegundaPersona;
    private javax.swing.JTextField txtTerceraPersona;
    // End of variables declaration//GEN-END:variables
}
