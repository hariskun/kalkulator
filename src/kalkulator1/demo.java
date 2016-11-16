
package kalkulator1;


public class demo extends javax.swing.JFrame {
private double angka1 = 0;
private double angka2 = 0;
private char math_operator;
   
    public demo() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text1 = new javax.swing.JTextField();
        cmd1 = new javax.swing.JButton();
        cmd2 = new javax.swing.JButton();
        cmd3 = new javax.swing.JButton();
        cmd4 = new javax.swing.JButton();
        cmd5 = new javax.swing.JButton();
        cmd6 = new javax.swing.JButton();
        cmd7 = new javax.swing.JButton();
        cmd8 = new javax.swing.JButton();
        cmd9 = new javax.swing.JButton();
        cmd0 = new javax.swing.JButton();
        cmdkoma = new javax.swing.JButton();
        cmdclear = new javax.swing.JButton();
        cmdbagi = new javax.swing.JButton();
        cmdkali = new javax.swing.JButton();
        cmdkurang = new javax.swing.JButton();
        cmdtambah = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cmdsmdengan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });

        cmd1.setText("1");
        cmd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd1ActionPerformed(evt);
            }
        });

        cmd2.setText("2");
        cmd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd2ActionPerformed(evt);
            }
        });

        cmd3.setText("3");
        cmd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd3ActionPerformed(evt);
            }
        });

        cmd4.setText("4");
        cmd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd4ActionPerformed(evt);
            }
        });

        cmd5.setText("5");
        cmd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd5ActionPerformed(evt);
            }
        });

        cmd6.setText("6");
        cmd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd6ActionPerformed(evt);
            }
        });

        cmd7.setText("7");
        cmd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd7ActionPerformed(evt);
            }
        });

        cmd8.setText("8");

        cmd9.setText("9");

        cmd0.setText("0");

        cmdkoma.setText(".");

        cmdclear.setText("C");

        cmdbagi.setText("/");

        cmdkali.setText("*");

        cmdkurang.setText("-");
        cmdkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdkurangActionPerformed(evt);
            }
        });

        cmdtambah.setText("+");

        jButton1.setText("+/-");

        cmdsmdengan.setText("=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmd9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmd0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdkoma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdclear))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmd5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmd6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmd7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmd8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdbagi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdkali))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdkurang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdtambah))
                            .addComponent(cmdsmdengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(text1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cmd1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmd2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmd3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmd4))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd1)
                    .addComponent(cmd2)
                    .addComponent(cmd3)
                    .addComponent(cmd4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd5)
                    .addComponent(cmd6)
                    .addComponent(cmd7)
                    .addComponent(cmd8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd9)
                    .addComponent(cmd0)
                    .addComponent(cmdkoma)
                    .addComponent(cmdclear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdbagi)
                    .addComponent(cmdkali)
                    .addComponent(cmdkurang)
                    .addComponent(cmdtambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cmdsmdengan))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdkurangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdkurangActionPerformed

    private void cmd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd1ActionPerformed
    String cmd1Text = text1.getText() + cmd1.getText();
        text1.setText( cmd1Text );
    }//GEN-LAST:event_cmd1ActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void cmd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd2ActionPerformed
    String cmd2Text = text1.getText() + cmd2.getText();
        text1.setText( cmd2Text );
    }//GEN-LAST:event_cmd2ActionPerformed

    private void cmd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd3ActionPerformed
    String cmd3Text = text1.getText() + cmd3.getText();
        text1.setText( cmd3Text );
    }//GEN-LAST:event_cmd3ActionPerformed

    private void cmd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd4ActionPerformed
    String cmd4Text = text1.getText() + cmd4.getText();
        text1.setText( cmd4Text );
    }//GEN-LAST:event_cmd4ActionPerformed

    private void cmd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd5ActionPerformed
    String cmd5Text = text1.getText() + cmd5.getText();
        text1.setText( cmd5Text );
    }//GEN-LAST:event_cmd5ActionPerformed

    private void cmd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd6ActionPerformed
       String cmd6Text = text1.getText() + cmd6.getText();
        text1.setText( cmd6Text );
    }//GEN-LAST:event_cmd6ActionPerformed

    private void cmd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd7ActionPerformed
     String cmd7Text = text1.getText() + cmd7.getText();
        text1.setText( cmd7Text );
    }//GEN-LAST:event_cmd7ActionPerformed
    private void getOperator(String btnText){
         math_operator = btnText.charAt(0);
     angka1 = angka1 + Double.parseDouble(text1.getText());
     text1.setText("");}
   
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
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd0;
    private javax.swing.JButton cmd1;
    private javax.swing.JButton cmd2;
    private javax.swing.JButton cmd3;
    private javax.swing.JButton cmd4;
    private javax.swing.JButton cmd5;
    private javax.swing.JButton cmd6;
    private javax.swing.JButton cmd7;
    private javax.swing.JButton cmd8;
    private javax.swing.JButton cmd9;
    private javax.swing.JButton cmdbagi;
    private javax.swing.JButton cmdclear;
    private javax.swing.JButton cmdkali;
    private javax.swing.JButton cmdkoma;
    private javax.swing.JButton cmdkurang;
    private javax.swing.JButton cmdsmdengan;
    private javax.swing.JButton cmdtambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField text1;
    // End of variables declaration//GEN-END:variables

    private String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
