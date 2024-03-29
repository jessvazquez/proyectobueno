/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3.p2;

import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import java.awt.Cursor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author deivi
 */
public class VtnPrincipal extends javax.swing.JFrame
{

    String noEmpleado;
    DateFormat hourFormat = new SimpleDateFormat("HH:mm");
    Date date = new Date();
    int estado;
    int reportes;

    /**
     * Creates new form VtnP
     */
    public VtnPrincipal()
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
        javax.swing.JButton btnEntrada = new javax.swing.JButton();
        btnIniciosesion = new javax.swing.JButton();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        rSLabelFecha2 = new rojeru_san.RSLabelFecha();
        tfClave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(4, 83, 123));

        btnEntrada.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/submit_1.png"))); // NOI18N
        btnEntrada.setContentAreaFilled(false);
        btnEntrada.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEntradaActionPerformed(evt);
            }
        });
        btnEntrada.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnEntradaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                btnEntradaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                btnEntradaKeyTyped(evt);
            }
        });

        btnIniciosesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        btnIniciosesion.setBorderPainted(false);
        btnIniciosesion.setContentAreaFilled(false);
        btnIniciosesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIniciosesion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnIniciosesionActionPerformed(evt);
            }
        });

        rSLabelFecha1.setBackground(new java.awt.Color(0, 0, 0));
        rSLabelFecha1.setForeground(new java.awt.Color(255, 255, 255));

        rSLabelHora1.setBackground(new java.awt.Color(0, 0, 0));
        rSLabelHora1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        rSLabelHora1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelHora1.setToolTipText("");
        rSLabelHora1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N

        rSLabelFecha2.setBackground(new java.awt.Color(0, 0, 0));
        rSLabelFecha2.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelFecha2.setFormato("MMMM, dd yyyy");

        tfClave.setBackground(new java.awt.Color(0, 102, 204));
        tfClave.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        tfClave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tfClaveActionPerformed(evt);
            }
        });
        tfClave.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                tfClaveKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfClaveKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clave: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(rSLabelFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciosesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tfClave, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciosesion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSLabelFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfClave, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEntrada)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClaveActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfClaveActionPerformed

    private void btnIniciosesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciosesionActionPerformed
        // TODO add your handling code here:
        VtnInicioSesion vis = new VtnInicioSesion();
        vis.setVisible(true);

    }//GEN-LAST:event_btnIniciosesionActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        this.setCursor(Cursor.WAIT_CURSOR);

        noEmpleado = tfClave.getText();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ESProyectoPU");
        EmpleadosJpaController p = new EmpleadosJpaController(emf);
        Empleados ap = p.findEmpleados(Integer.parseInt(noEmpleado));

        String entrada = ap.getHoraEntrada();
        estado = ap.getEstatus();

        if (ap != null)
        {
            if (ap.getEstatus() == 0)
            {
                if (entrada.equals(hourFormat.format(date)))
                {
                    Mensaje.exito(this, "Entrada registrada en tiempo " + hourFormat.format(date));
                    estado = 1;
                    ap.setEstatus(estado);
                    try
                    {
                        p.edit(ap);
                    } catch (Exception ex)
                    {
                        Mensaje.error(this, "No se ha podido registrar entrada");
                    }
                } else
                {
                    Mensaje.error(this, "Usuario registrado con retardo " + hourFormat.format(date));
                    estado = 1;
                    ap.setEstatus(estado);
                    reportes = ap.getRetardos() + 1;
                    ap.setRetardos(reportes);
                    try
                    {
                        p.edit(ap);

                    } catch (Exception ex)
                    {
                        Mensaje.error(this, "No se ha podido registrar entrada con retardo");
                    }
                }
            } else
            {
                String salida = ap.getHoraSalida().toString();
                if (salida.equals(hourFormat.format(date)))
                {
                    Mensaje.exito(this, "Salida registrada en tiempo " + hourFormat.format(date));
                    estado = ap.getEstatus();
                    estado = 0;
                    ap.setEstatus(estado);

                    try
                    {
                        p.edit(ap);
                    } catch (Exception ex)
                    {
                        Mensaje.error(this, "No se ha podido registrar salida");
                    }

                } else
                {
                    Mensaje.error(this, "Salida registrada a destiempo " + hourFormat.format(date));
                    estado = ap.getEstatus();
                    estado = 0;
                    ap.setEstatus(estado);
                    reportes = ap.getSalidasDestiempo() + 1;
                    ap.setSalidasDestiempo(reportes);
                    try
                    {
                        p.edit(ap);
                    } catch (Exception ex)
                    {
                        Mensaje.error(this, "No se ha podido registrar salida a destiempo");
                    }
                }
            }
        } else
        {
            this.setCursor(Cursor.DEFAULT_CURSOR);
            Mensaje.error(this, "numero de empleado " + noEmpleado
                    + " no encontrado, comuniquese con la administracion");
        }

        this.setCursor(Cursor.DEFAULT_CURSOR);


    }//GEN-LAST:event_btnEntradaActionPerformed

    private void tfClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClaveKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfClaveKeyPressed

    private void tfClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfClaveKeyTyped
        // TODO add your handling code here:
        if (tfClave.getText().length() == 4)
        {
            evt.consume();
        } else
        {
            Validaciones.validaEntero(evt);

        }
    }//GEN-LAST:event_tfClaveKeyTyped

    private void btnEntradaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnEntradaKeyPressed
    {//GEN-HEADEREND:event_btnEntradaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n')
        {
            btnEntradaActionPerformed(null);
        }

    }//GEN-LAST:event_btnEntradaKeyPressed

    private void btnEntradaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnEntradaKeyTyped
    {//GEN-HEADEREND:event_btnEntradaKeyTyped
        Validaciones.validaAlfanumerico(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntradaKeyTyped

    private void btnEntradaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnEntradaKeyReleased
    {//GEN-HEADEREND:event_btnEntradaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntradaKeyReleased

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
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciosesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelFecha rSLabelFecha2;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private javax.swing.JTextField tfClave;
    // End of variables declaration//GEN-END:variables
}
