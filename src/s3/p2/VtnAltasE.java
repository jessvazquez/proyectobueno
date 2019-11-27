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
public class VtnAltasE extends javax.swing.JFrame
{

    /**
     * Creates new form VtnA
     */
    public VtnAltasE()
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
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        sad = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTurno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfHoraEntrada = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfNumeroEmpleado = new javax.swing.JTextField();
        tfHoraSalida = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Altas de empleados");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(4, 83, 123));

        sad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sad.setForeground(new java.awt.Color(255, 255, 255));
        sad.setText("Nombre:");

        tfNombre.setBackground(new java.awt.Color(0, 102, 204));
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edad:");

        tfEdad.setBackground(new java.awt.Color(0, 102, 204));
        tfEdad.setEnabled(false);
        tfEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEdadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEdadKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Turno:");

        tfTurno.setBackground(new java.awt.Color(0, 102, 204));
        tfTurno.setEnabled(false);
        tfTurno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfTurnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTurnoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Area:");

        tfArea.setBackground(new java.awt.Color(0, 102, 204));
        tfArea.setEnabled(false);
        tfArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAreaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAreaKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de empleado:");

        tfHoraEntrada.setBackground(new java.awt.Color(0, 102, 204));
        tfHoraEntrada.setEnabled(false);
        tfHoraEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfHoraEntradaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfHoraEntradaKeyTyped(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/submit_1.png"))); // NOI18N
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hora de entrada:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora de salida:");

        tfNumeroEmpleado.setBackground(new java.awt.Color(0, 102, 204));
        tfNumeroEmpleado.setEnabled(false);
        tfNumeroEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNumeroEmpleadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumeroEmpleadoKeyTyped(evt);
            }
        });

        tfHoraSalida.setBackground(new java.awt.Color(0, 102, 204));
        tfHoraSalida.setEnabled(false);
        tfHoraSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfHoraSalidaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfHoraSalidaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnRegresar)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addComponent(tfTurno, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(tfNumeroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfHoraSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addComponent(tfHoraEntrada, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar)
                    .addComponent(btnRegresar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        this.setCursor(Cursor.WAIT_CURSOR);
        String nombre = tfNombre.getText();
        int edad = 0;
        int numeroEmpleado = 0;
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
                numeroEmpleado = Integer.parseInt(tfNumeroEmpleado.getText());
                String area = tfArea.getText();
                String horaEntrada = tfHoraEntrada.getText();
                String horaSalida = tfHoraSalida.getText();
                int estatus = 0;
                int incidentes = 0;
                
                Empleados obj = new Empleados(numeroEmpleado, nombre, edad, turno, area, horaEntrada, horaSalida, estatus, incidentes);
                
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("ESProyectoPU");
                EmpleadosJpaController p = new EmpleadosJpaController(emf);
                try
                {
                    p.create(obj);
                    Mensaje.exito(this, "dato insertado correctamente");
                    //btnCancelarActionPerformed(evt);
                } catch (Exception ex)
                {
                    Logger.getLogger(VtnAltasE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void tfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfEdad);
    }//GEN-LAST:event_tfNombreKeyPressed

    private void tfEdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEdadKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfTurno);
    }//GEN-LAST:event_tfEdadKeyPressed

    private void tfTurnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTurnoKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfArea);
    }//GEN-LAST:event_tfTurnoKeyPressed

    private void tfAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAreaKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfNumeroEmpleado);
    }//GEN-LAST:event_tfAreaKeyPressed

    private void tfNumeroEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroEmpleadoKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfHoraEntrada);
    }//GEN-LAST:event_tfNumeroEmpleadoKeyPressed

    private void tfHoraEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHoraEntradaKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, tfHoraSalida);
    }//GEN-LAST:event_tfHoraEntradaKeyPressed

    private void tfHoraSalidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHoraSalidaKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, btnAceptar);
    }//GEN-LAST:event_tfHoraSalidaKeyPressed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
        // TODO add your handling code here:
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEdadKeyTyped
        // TODO add your handling code here:
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_tfEdadKeyTyped

    private void tfTurnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTurnoKeyTyped
        // TODO add your handling code here:
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_tfTurnoKeyTyped

    private void tfAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAreaKeyTyped
        // TODO add your handling code here:
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_tfAreaKeyTyped

    private void tfNumeroEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroEmpleadoKeyTyped
        // TODO add your handling code here:
        Validaciones.validaEntero(evt);
    }//GEN-LAST:event_tfNumeroEmpleadoKeyTyped

    private void tfHoraEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHoraEntradaKeyTyped
        // TODO add your handling code here:
        //Validaciones.validaEntero(evt);
    }//GEN-LAST:event_tfHoraEntradaKeyTyped

    private void tfHoraSalidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfHoraSalidaKeyTyped
        // TODO add your handling code here:
        //Validaciones.validaEntero(evt);
    }//GEN-LAST:event_tfHoraSalidaKeyTyped

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
            java.util.logging.Logger.getLogger(VtnAltasE.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnAltasE.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnAltasE.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnAltasE.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnAltasE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sad;
    private javax.swing.JTextField tfArea;
    private javax.swing.JTextField tfEdad;
    private javax.swing.JTextField tfHoraEntrada;
    private javax.swing.JTextField tfHoraSalida;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNumeroEmpleado;
    private javax.swing.JTextField tfTurno;
    // End of variables declaration//GEN-END:variables
}