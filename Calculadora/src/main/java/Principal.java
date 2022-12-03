import javax.naming.spi.DirStateFactory.Result;

public class Principal extends javax.swing.JFrame {

    private static Calculadora c = new Calculadora();
    String x = "";
    String y = "";
    String z = "";

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCamp = new javax.swing.JTextField();
        btZero = new javax.swing.JButton();
        btUm = new javax.swing.JButton();
        btDois = new javax.swing.JButton();
        btTres = new javax.swing.JButton();
        btQuatro = new javax.swing.JButton();
        btCinco = new javax.swing.JButton();
        btSeis = new javax.swing.JButton();
        btSete = new javax.swing.JButton();
        btOito = new javax.swing.JButton();
        btNove = new javax.swing.JButton();
        btPonto = new javax.swing.JButton();
        BtIgual = new javax.swing.JButton();
        BtDividir = new javax.swing.JButton();
        btMultiplicar = new javax.swing.JButton();
        btSubtrair = new javax.swing.JButton();
        btSomar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        txtCamp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtCamp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampActionPerformed(evt);
            }
        });

        btZero.setBackground(new java.awt.Color(204, 204, 204));
        btZero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btZero.setForeground(new java.awt.Color(0, 0, 0));
        btZero.setText("0");
        btZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btZeroActionPerformed(evt);
            }
        });

        btUm.setBackground(new java.awt.Color(204, 204, 204));
        btUm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btUm.setForeground(new java.awt.Color(0, 0, 0));
        btUm.setText("1");
        btUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUmActionPerformed(evt);
            }
        });

        btDois.setBackground(new java.awt.Color(204, 204, 204));
        btDois.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btDois.setForeground(new java.awt.Color(0, 0, 0));
        btDois.setText("2");
        btDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoisActionPerformed(evt);
            }
        });

        btTres.setBackground(new java.awt.Color(204, 204, 204));
        btTres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btTres.setForeground(new java.awt.Color(0, 0, 0));
        btTres.setText("3");
        btTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTresActionPerformed(evt);
            }
        });

        btQuatro.setBackground(new java.awt.Color(204, 204, 204));
        btQuatro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btQuatro.setForeground(new java.awt.Color(0, 0, 0));
        btQuatro.setText("4");
        btQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuatroActionPerformed(evt);
            }
        });

        btCinco.setBackground(new java.awt.Color(204, 204, 204));
        btCinco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btCinco.setForeground(new java.awt.Color(0, 0, 0));
        btCinco.setText("5");
        btCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCincoActionPerformed(evt);
            }
        });

        btSeis.setBackground(new java.awt.Color(204, 204, 204));
        btSeis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSeis.setForeground(new java.awt.Color(0, 0, 0));
        btSeis.setText("6");
        btSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeisActionPerformed(evt);
            }
        });

        btSete.setBackground(new java.awt.Color(204, 204, 204));
        btSete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSete.setForeground(new java.awt.Color(0, 0, 0));
        btSete.setText("7");
        btSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeteActionPerformed(evt);
            }
        });

        btOito.setBackground(new java.awt.Color(204, 204, 204));
        btOito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btOito.setForeground(new java.awt.Color(0, 0, 0));
        btOito.setText("8");
        btOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOitoActionPerformed(evt);
            }
        });

        btNove.setBackground(new java.awt.Color(204, 204, 204));
        btNove.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btNove.setForeground(new java.awt.Color(0, 0, 0));
        btNove.setText("9");
        btNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNoveActionPerformed(evt);
            }
        });

        btPonto.setBackground(new java.awt.Color(255, 153, 0));
        btPonto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btPonto.setText(".");
        btPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPontoActionPerformed(evt);
            }
        });

        BtIgual.setBackground(new java.awt.Color(204, 102, 0));
        BtIgual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtIgual.setText("=");
        BtIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIgualActionPerformed(evt);
            }
        });

        BtDividir.setBackground(new java.awt.Color(255, 153, 0));
        BtDividir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtDividir.setText("/");
        BtDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDividirActionPerformed(evt);
            }
        });

        btMultiplicar.setBackground(new java.awt.Color(255, 153, 0));
        btMultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btMultiplicar.setText("*");
        btMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicarActionPerformed(evt);
            }
        });

        btSubtrair.setBackground(new java.awt.Color(255, 153, 0));
        btSubtrair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSubtrair.setText("-");
        btSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtrairActionPerformed(evt);
            }
        });

        btSomar.setBackground(new java.awt.Color(255, 153, 0));
        btSomar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSomar.setText("+");
        btSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCamp)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btZero, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BtIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btUm,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btDois,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btQuatro,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btCinco,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btTres,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btSubtrair,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btSeis,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(BtDividir,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btSete, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btOito, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btNove, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btSete, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btOito, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btNove, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btUm, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btDois, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btTres, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btZero, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCampActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCampActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCampActionPerformed

    private void btZeroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btZeroActionPerformed
        atribuir("0");
    }// GEN-LAST:event_btZeroActionPerformed

    private void btUmActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btUmActionPerformed
        atribuir("1");
    }// GEN-LAST:event_btUmActionPerformed

    private void btDoisActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btDoisActionPerformed
        atribuir("2");
    }// GEN-LAST:event_btDoisActionPerformed

    private void btTresActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btTresActionPerformed
        atribuir("3");
    }// GEN-LAST:event_btTresActionPerformed

    private void btQuatroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btQuatroActionPerformed
        atribuir("4");
    }// GEN-LAST:event_btQuatroActionPerformed

    private void btCincoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btCincoActionPerformed
        atribuir("5");
    }// GEN-LAST:event_btCincoActionPerformed

    private void btSeisActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSeisActionPerformed
        atribuir("6");
    }// GEN-LAST:event_btSeisActionPerformed

    private void btSeteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSeteActionPerformed
        atribuir("7");
    }// GEN-LAST:event_btSeteActionPerformed

    private void btOitoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btOitoActionPerformed
        atribuir("8");
    }// GEN-LAST:event_btOitoActionPerformed

    private void btNoveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btNoveActionPerformed
        atribuir("9");
    }// GEN-LAST:event_btNoveActionPerformed

    private void btPontoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btPontoActionPerformed
        atribuir(".");
    }// GEN-LAST:event_btPontoActionPerformed

    private void btMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btMultiplicarActionPerformedo
        atribuir(x + " * ");
    }// GEN-LAST:event_btMultiplicarActionPerformed

    private void BtDividirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtDividirActionPerformed
        atribuir(x + " / ");
    }// GEN-LAST:event_BtDividirActionPerformed

    private void btSubtrairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSubtrairActionPerformed
        atribuir(x + " - ");
    }// GEN-LAST:event_btSubtrairActionPerformed

    private void btSomarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btSomarActionPerformed
        atribuir(x + " + ");
    }// GEN-LAST:event_btSomarActionPerformed

    private void BtIgualActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtIgualActionPerformed
        atribuir(x + " = ");
        txtCamp.setText(definirOperacao(txtCamp.getText()));
    }// GEN-LAST:event_BtIgualActionPerformeda

    public void atribuir(String s) {
        String valor = txtCamp.getText();
        valor += s;
        txtCamp.setText(valor);
    }

    public static String definirOperacao(String s) {
        double result = 0;

        if (s.contains(("*"))) {
            String[] arrOfStrings = s.split(" * ");
            result = c.multiplicar(Double.parseDouble(arrOfStrings[0]), Double.parseDouble(arrOfStrings[2]));
        }
        if (s.contains(("/"))) {
            String[] arrofStrings = s.split(" / ");
            result = c.dividir(Double.parseDouble(arrofStrings[0]), Double.parseDouble(arrofStrings[2]));
        }
        if (s.contains(("+"))) {
            String[] arrofStrings = s.split(" + ");
            result = c.somar(Double.parseDouble(arrofStrings[0]), Double.parseDouble(arrofStrings[2]));
        }
        if (s.contains(("-"))) {
            String[] arrofStrings = s.split(" * ");
            result = c.subtrair(Double.parseDouble(arrofStrings[0]), Double.parseDouble(arrofStrings[2]));
        }
        return s += (Double.toString(result));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
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
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtDividir;
    private javax.swing.JButton BtIgual;
    private javax.swing.JButton btCinco;
    private javax.swing.JButton btDois;
    private javax.swing.JButton btMultiplicar;
    private javax.swing.JButton btNove;
    private javax.swing.JButton btOito;
    private javax.swing.JButton btPonto;
    private javax.swing.JButton btQuatro;
    private javax.swing.JButton btSeis;
    private javax.swing.JButton btSete;
    private javax.swing.JButton btSomar;
    private javax.swing.JButton btSubtrair;
    private javax.swing.JButton btTres;
    private javax.swing.JButton btUm;
    private javax.swing.JButton btZero;
    private javax.swing.JTextField txtCamp;
    // End of variables declaration//GEN-END:variables
}
