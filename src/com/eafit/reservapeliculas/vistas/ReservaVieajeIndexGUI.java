package com.eafit.reservapeliculas.vistas;

public class ReservaVieajeIndexGUI extends javax.swing.JFrame {

        public ReservaVieajeIndexGUI() {
            initComponents();
        }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrarUsuarios = new javax.swing.JButton();
        registrarVuelo = new javax.swing.JButton();
        reservarVuelo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        registrarUsuarios.setText("Registrar Usuarios");
        registrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuariosActionPerformed(evt);
            }
        });

        registrarVuelo.setText("Agregar Vuelo");
        registrarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarVueloActionPerformed(evt);
            }
        });

        reservarVuelo.setText("Reservar Vuelo");
        reservarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarVueloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(registrarVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservarVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(registrarUsuarios)
                .addGap(18, 18, 18)
                .addComponent(registrarVuelo)
                .addGap(18, 18, 18)
                .addComponent(reservarVuelo)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarVueloActionPerformed
        // TODO add your handling code here:
        AgregarVueloGUI agregarVueloGUI = new AgregarVueloGUI();
        agregarVueloGUI.setVisible(true);
    }//GEN-LAST:event_registrarVueloActionPerformed

    private void reservarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarVueloActionPerformed
        // TODO add your handling code here:
        AgregarReservaVueloGUI agregarVueloGUI = new AgregarReservaVueloGUI();
        agregarVueloGUI.setVisible(true);
    }//GEN-LAST:event_reservarVueloActionPerformed

    private void registrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuariosActionPerformed
        // TODO add your handling code here:
        AgregarClienteGUI agregarClienteGUI = new AgregarClienteGUI();
        
        agregarClienteGUI.setVisible(true);
    }//GEN-LAST:event_registrarUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(ReservaVieajeIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservaVieajeIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservaVieajeIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservaVieajeIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaVieajeIndexGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton registrarUsuarios;
    private javax.swing.JButton registrarVuelo;
    private javax.swing.JButton reservarVuelo;
    // End of variables declaration//GEN-END:variables
}
