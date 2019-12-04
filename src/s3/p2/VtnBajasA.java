/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3.p2;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import java.awt.Cursor;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author deivi
 */
public class VtnBajasA extends javax.swing.JFrame
{

    int pos = -1;

    /**
     * Creates new form VtnBajasA
     */
    public VtnBajasA()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        tfNumeroEmpleado = new javax.swing.JTextField();
        tfTurno = new javax.swing.JTextField();
        sad = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfContrasena = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        tfArea = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        tfEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bajas de administrador");

        jPanel1.setBackground(new java.awt.Color(4, 83, 123));
        jPanel1.setForeground(new java.awt.Color(4, 83, 123));

        tfNumeroEmpleado.setBackground(new java.awt.Color(0, 102, 204));
        tfNumeroEmpleado.setEnabled(false);
        tfNumeroEmpleado.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfNumeroEmpleadoKeyPressed(evt);
            }
        });

        tfTurno.setBackground(new java.awt.Color(0, 102, 204));
        tfTurno.setEnabled(false);
        tfTurno.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfTurnoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                tfTurnoKeyReleased(evt);
            }
        });

        sad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sad.setForeground(new java.awt.Color(255, 255, 255));
        sad.setText("Nombre");

        tfNombre.setBackground(new java.awt.Color(0, 102, 204));
        tfNombre.setEnabled(false);
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfNombreKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contrasena");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Area");

        tfContrasena.setBackground(new java.awt.Color(0, 102, 204));
        tfContrasena.setEnabled(false);
        tfContrasena.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfContrasenaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edad");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        tfArea.setBackground(new java.awt.Color(0, 102, 204));
        tfArea.setEnabled(false);
        tfArea.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfAreaKeyPressed(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/submit_1.png"))); // NOI18N
        btnAceptar.setText("Buscar");
        btnAceptar.setToolTipText("");
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarActionPerformed(evt);
            }
        });

        tfEdad.setBackground(new java.awt.Color(0, 102, 204));
        tfEdad.setEnabled(false);
        tfEdad.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfEdadKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de empleado");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Turno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(tfNumeroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(tfTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(sad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(tfContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(tfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(83, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(37, 37, 37)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNumeroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(151, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        CtrlInterfaz.limpia(tfNombre, tfArea, tfEdad, tfNumeroEmpleado, tfTurno, tfContrasena);
        btnAceptar.setText("Buscar");
        CtrlInterfaz.cambia(btnAceptar); // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        this.setCursor(Cursor.WAIT_CURSOR);
        if (btnAceptar.getText().equals("Buscar"))
        {

            String folio = JOptionPane.showInputDialog(this,
                    "Dame el numero de empleado a eliminar :");
            if (folio != null)
            {

                EntityManagerFactory emf = Persistence.createEntityManagerFactory("ESProyectoPU");
                AdministradoresJpaController p = new AdministradoresJpaController(emf);

                Administradores ap = p.findAdministradores(Integer.parseInt(folio));

                if (ap != null)
                {

                    btnAceptar.setText("Eliminar");
                    pos = ap.getNumeroEmpleado();
                    tfNombre.setText(ap.getNombre());
                    tfEdad.setText(String.valueOf(ap.getEdad()));
                    tfTurno.setText(ap.getTurno());
                    tfArea.setText(ap.getArea());
                    tfNumeroEmpleado.setText(String.valueOf(ap.getNumeroEmpleado()));
                    tfContrasena.setText(ap.getContrasena());

                } else
                {
                    Mensaje.error(this, "Datos no encontrados!");
                    this.setCursor(Cursor.DEFAULT_CURSOR);
                }

            }
        } else
        {
            this.setCursor(Cursor.WAIT_CURSOR);
            if (Mensaje.pregunta(this, "Esta seguro de eliminar este registro") == 0)
            {

                EntityManagerFactory emf = Persistence.createEntityManagerFactory("ESProyectoPU");
                AdministradoresJpaController p = new AdministradoresJpaController(emf);

                try
                {
                    p.destroy(pos);
                    Mensaje.exito(this, "Dato eliminado correctamente!");
                } catch (Exception ex)
                {
                    Mensaje.error(this, "Error..." + ex.toString());
                }

            }
            this.setCursor(Cursor.DEFAULT_CURSOR);
            btnCancelarActionPerformed(evt);
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void tfEdadKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfEdadKeyPressed
    {//GEN-HEADEREND:event_tfEdadKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, evt);
    }//GEN-LAST:event_tfEdadKeyPressed

    private void tfTurnoKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfTurnoKeyReleased
    {//GEN-HEADEREND:event_tfTurnoKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfTurnoKeyReleased

    private void tfTurnoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfTurnoKeyPressed
    {//GEN-HEADEREND:event_tfTurnoKeyPressed
        // TODO add your handling code here:
                Validaciones.enter(this, evt, tfTurno);        // TODO add your handling code here:

    }//GEN-LAST:event_tfTurnoKeyPressed

    private void tfAreaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfAreaKeyPressed
    {//GEN-HEADEREND:event_tfAreaKeyPressed
        // TODO add your handling code here:
                Validaciones.enter(this, evt, tfArea);        // TODO add your handling code here:

                
    }//GEN-LAST:event_tfAreaKeyPressed

    private void tfNumeroEmpleadoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfNumeroEmpleadoKeyPressed
    {//GEN-HEADEREND:event_tfNumeroEmpleadoKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfNumeroEmpleado);        // TODO add your handling code here:

    }//GEN-LAST:event_tfNumeroEmpleadoKeyPressed

    private void tfContrasenaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfContrasenaKeyPressed
    {//GEN-HEADEREND:event_tfContrasenaKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfContrasena);        // TODO add your handling code here:

    }//GEN-LAST:event_tfContrasenaKeyPressed

    private void tfNombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_tfNombreKeyPressed
    {//GEN-HEADEREND:event_tfNombreKeyPressed
        Validaciones.enter(this, evt, tfNombre);        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnBajasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnBajasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnBajasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnBajasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnBajasA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sad;
    private javax.swing.JTextField tfArea;
    private javax.swing.JTextField tfContrasena;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumeroEmpleado;
    private javax.swing.JTextField tfTurno;
    // End of variables declaration//GEN-END:variables
}
