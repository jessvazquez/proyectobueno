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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author deivi
 */
public class VtnAltasA extends javax.swing.JFrame
{

    /**
     * Creates new form VtnAltasA
     */
    public VtnAltasA()
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
        tfNombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTurno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfNumeroEmpleado = new javax.swing.JTextField();
        dfs = new javax.swing.JLabel();
        tfContrasena = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        sad = new javax.swing.JLabel();
        btnRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Altas de administradores");
        setPreferredSize(new java.awt.Dimension(670, 450));

        jPanel1.setBackground(new java.awt.Color(4, 83, 123));
        jPanel1.setPreferredSize(new java.awt.Dimension(670, 450));

        tfNombre.setBackground(new java.awt.Color(0, 102, 204));
        tfNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tfNombreActionPerformed(evt);
            }
        });
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfNombreKeyTyped(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/submit_1.png"))); // NOI18N
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edad:");

        tfEdad.setBackground(new java.awt.Color(0, 102, 204));
        tfEdad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfEdad.setEnabled(false);
        tfEdad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tfEdadActionPerformed(evt);
            }
        });
        tfEdad.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfEdadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfEdadKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Turno:");

        tfTurno.setBackground(new java.awt.Color(0, 102, 204));
        tfTurno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfTurno.setEnabled(false);
        tfTurno.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfTurnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfTurnoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Area:");

        tfArea.setBackground(new java.awt.Color(0, 102, 204));
        tfArea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfArea.setEnabled(false);
        tfArea.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfAreaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfAreaKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de empleado:");

        tfNumeroEmpleado.setBackground(new java.awt.Color(0, 102, 204));
        tfNumeroEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfNumeroEmpleado.setEnabled(false);
        tfNumeroEmpleado.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfNumeroEmpleadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfNumeroEmpleadoKeyTyped(evt);
            }
        });

        dfs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dfs.setForeground(new java.awt.Color(255, 255, 255));
        dfs.setText("Contraseña:");

        tfContrasena.setBackground(new java.awt.Color(0, 102, 204));
        tfContrasena.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfContrasena.setEnabled(false);
        tfContrasena.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfContrasenaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfContrasenaKeyTyped(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegresarActionPerformed(evt);
            }
        });

        sad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sad.setForeground(new java.awt.Color(255, 255, 255));
        sad.setText("Nombre:");

        btnRefrescar.setBackground(java.awt.Color.pink);
        btnRefrescar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        btnRefrescar.setBorderPainted(false);
        btnRefrescar.setContentAreaFilled(false);
        btnRefrescar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dfs, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfTurno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(tfNumeroEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfArea, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfContrasena))))
                        .addGap(93, 93, 93)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dfs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        this.setCursor(Cursor.WAIT_CURSOR);
        String nombre = tfNombre.getText();
        int edad = 0;
        String numeroEmpleado;
        if (!Validaciones.verificaEntero(tfEdad))
        {
            Mensaje.error(this, "se esperaba un entero");
            CtrlInterfaz.cambia(tfEdad);
        } else
        {
            if (!Validaciones.verificaEntero(tfNumeroEmpleado))
            {
                Mensaje.error(this, "se esperaba un entero");
                CtrlInterfaz.cambia(tfNumeroEmpleado);
            } else
            {
                edad = Integer.parseInt(tfEdad.getText());
                String turno = tfTurno.getText();
                String area = tfArea.getText();
                numeroEmpleado = tfNumeroEmpleado.getText();
                String contrasena = tfContrasena.getText();

                Administradores obj = new Administradores(Integer.parseInt(numeroEmpleado), nombre, edad, turno, area, contrasena);

                EntityManagerFactory emf = Persistence.createEntityManagerFactory("ESProyectoPU");
                AdministradoresJpaController p = new AdministradoresJpaController(emf);


                    try
                    {
                        p.create(obj);
                        Mensaje.exito(this, "dato insertado correctamente");
                        //btnCancelarActionPerformed(evt);
                    } catch (Exception ex)
                    {
                        Mensaje.error(this, "El numero de empleado ya existe");
                    }
                

            }
        }
        this.dispose();
        this.setCursor(Cursor.DEFAULT_CURSOR);// TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void tfEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEdadActionPerformed

    private void tfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfEdad);
    }//GEN-LAST:event_tfNombreKeyPressed

    private void tfEdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEdadKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfArea);
    }//GEN-LAST:event_tfEdadKeyPressed

    private void tfAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAreaKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfNumeroEmpleado);
    }//GEN-LAST:event_tfAreaKeyPressed

    private void tfNumeroEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroEmpleadoKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfTurno);
    }//GEN-LAST:event_tfNumeroEmpleadoKeyPressed

    private void tfTurnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTurnoKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfContrasena);
    }//GEN-LAST:event_tfTurnoKeyPressed

    private void tfContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContrasenaKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, btnAceptar);
    }//GEN-LAST:event_tfContrasenaKeyPressed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
        // TODO add your handling code here:
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEdadKeyTyped
        // TODO add your handling code here:
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_tfEdadKeyTyped

    private void tfAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAreaKeyTyped
        // TODO add your handling code here:
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_tfAreaKeyTyped

    private void tfNumeroEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroEmpleadoKeyTyped
        // TODO add your handling code here:
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_tfNumeroEmpleadoKeyTyped

    private void tfTurnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTurnoKeyTyped
        // TODO add your handling code here:
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_tfTurnoKeyTyped

    private void tfContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfContrasenaKeyTyped
        // TODO add your handling code here:
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_tfContrasenaKeyTyped

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRefrescarActionPerformed
    {//GEN-HEADEREND:event_btnRefrescarActionPerformed
        // TODO add your handling code here:
        CtrlInterfaz.limpia(tfArea, tfEdad, tfNombre, tfNumeroEmpleado, tfTurno, tfContrasena);
    }//GEN-LAST:event_btnRefrescarActionPerformed

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
            java.util.logging.Logger.getLogger(VtnAltasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnAltasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnAltasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnAltasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnAltasA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel dfs;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
