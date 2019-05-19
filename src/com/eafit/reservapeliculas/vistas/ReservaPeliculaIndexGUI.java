package com.eafit.reservapeliculas.vistas;

public class ReservaPeliculaIndexGUI extends javax.swing.JFrame {

        public ReservaPeliculaIndexGUI() {
            initComponents();
        }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrarUsuarios = new javax.swing.JButton();
        registrarPeliculas = new javax.swing.JButton();
        reservarPelicula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        registrarUsuarios.setText("Registrar Usuarios");
        registrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuariosActionPerformed(evt);
            }
        });

        registrarPeliculas.setText("Agregar Peliculas");
        registrarPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPeliculasActionPerformed(evt);
            }
        });

        reservarPelicula.setText("Reservar Pelicula");
        reservarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarPeliculaActionPerformed(evt);
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
                    .addComponent(registrarPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservarPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(registrarUsuarios)
                .addGap(18, 18, 18)
                .addComponent(registrarPeliculas)
                .addGap(18, 18, 18)
                .addComponent(reservarPelicula)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPeliculasActionPerformed
        // TODO add your handling code here:
        AgregarPeliculaGUI agregarPeliculaGUI = new AgregarPeliculaGUI();
        agregarPeliculaGUI.setVisible(true);
    }//GEN-LAST:event_registrarPeliculasActionPerformed

    private void reservarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarPeliculaActionPerformed
        // TODO add your handling code here:
        AgregarReservaPeliculaGUI agregarReservaGUI = new AgregarReservaPeliculaGUI();
        agregarReservaGUI.setVisible(true);
    }//GEN-LAST:event_reservarPeliculaActionPerformed

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
            java.util.logging.Logger.getLogger(ReservaPeliculaIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservaPeliculaIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservaPeliculaIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservaPeliculaIndexGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaPeliculaIndexGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton registrarPeliculas;
    private javax.swing.JButton registrarUsuarios;
    private javax.swing.JButton reservarPelicula;
    // End of variables declaration//GEN-END:variables
}
