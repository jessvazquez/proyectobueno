/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3.p2;

/**
 *
 * @author deivi
 */
public class VtnPAdmin extends javax.swing.JFrame
{

    /**
     * Creates new form VtnPAdmin
     */
    public VtnPAdmin()
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
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuEmpleados = new javax.swing.JMenu();
        mnuAltasE = new javax.swing.JMenuItem();
        mnuBajasE = new javax.swing.JMenuItem();
        mnuConsultasE = new javax.swing.JMenuItem();
        mnuModificacionesE = new javax.swing.JMenuItem();
        mnuAdministradores = new javax.swing.JMenu();
        mnuAltasA = new javax.swing.JMenuItem();
        mnuBajasA = new javax.swing.JMenuItem();
        mnuModificacionesA = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();
        mnuSSalir = new javax.swing.JMenuItem();

        setTitle("Ventana principal administrador");

        jPanel1.setBackground(new java.awt.Color(4, 83, 123));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(4, 83, 123));
        jMenuBar1.setBorderPainted(false);

        mnuEmpleados.setBackground(new java.awt.Color(4, 83, 123));
        mnuEmpleados.setText("Empleados");
        mnuEmpleados.setContentAreaFilled(false);

        mnuAltasE.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuAltasE.setText("Altas");
        mnuAltasE.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuAltasEActionPerformed(evt);
            }
        });
        mnuEmpleados.add(mnuAltasE);

        mnuBajasE.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mnuBajasE.setText("Bajas");
        mnuBajasE.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuBajasEActionPerformed(evt);
            }
        });
        mnuEmpleados.add(mnuBajasE);

        mnuConsultasE.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuConsultasE.setText("Consultas");
        mnuConsultasE.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuConsultasEActionPerformed(evt);
            }
        });
        mnuEmpleados.add(mnuConsultasE);

        mnuModificacionesE.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mnuModificacionesE.setText("Modificaciones");
        mnuModificacionesE.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuModificacionesEActionPerformed(evt);
            }
        });
        mnuEmpleados.add(mnuModificacionesE);

        jMenuBar1.add(mnuEmpleados);

        mnuAdministradores.setText("Administradores");

        mnuAltasA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        mnuAltasA.setText("Altas");
        mnuAltasA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuAltasAActionPerformed(evt);
            }
        });
        mnuAdministradores.add(mnuAltasA);

        mnuBajasA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        mnuBajasA.setText("Bajas");
        mnuBajasA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuBajasAActionPerformed(evt);
            }
        });
        mnuAdministradores.add(mnuBajasA);

        mnuModificacionesA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        mnuModificacionesA.setText("Modificaciones");
        mnuModificacionesA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuModificacionesAActionPerformed(evt);
            }
        });
        mnuAdministradores.add(mnuModificacionesA);

        jMenuBar1.add(mnuAdministradores);

        mnuSalir.setText("Salir");

        mnuSSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuSSalir.setText("Salir");
        mnuSSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuSSalirActionPerformed(evt);
            }
        });
        mnuSalir.add(mnuSSalir);

        jMenuBar1.add(mnuSalir);

        setJMenuBar(jMenuBar1);

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

    private void mnuBajasEActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuBajasEActionPerformed
    {//GEN-HEADEREND:event_mnuBajasEActionPerformed
        // TODO add your handling code here:
        VtnBajasE vbe = new VtnBajasE();
        vbe.setVisible(true);
    }//GEN-LAST:event_mnuBajasEActionPerformed

    private void mnuAltasEActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuAltasEActionPerformed
    {//GEN-HEADEREND:event_mnuAltasEActionPerformed
        // TODO add your handling code here:
        VtnAltasE vae = new VtnAltasE();
        vae.setVisible(true);
    }//GEN-LAST:event_mnuAltasEActionPerformed

    private void mnuConsultasEActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuConsultasEActionPerformed
    {//GEN-HEADEREND:event_mnuConsultasEActionPerformed
        // TODO add your handling code here:
        VtnConsultasE vce = new VtnConsultasE();
        vce.setVisible(true);
    }//GEN-LAST:event_mnuConsultasEActionPerformed

    private void mnuModificacionesEActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuModificacionesEActionPerformed
    {//GEN-HEADEREND:event_mnuModificacionesEActionPerformed
        // TODO add your handling code here:
        VtnModificacionesE vme = new VtnModificacionesE();
        vme.setVisible(true);
    }//GEN-LAST:event_mnuModificacionesEActionPerformed

    private void mnuAltasAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuAltasAActionPerformed
    {//GEN-HEADEREND:event_mnuAltasAActionPerformed
        // TODO add your handling code here:
        VtnAltasA vaa = new VtnAltasA();
        vaa.setVisible(true);
    }//GEN-LAST:event_mnuAltasAActionPerformed

    private void mnuBajasAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuBajasAActionPerformed
    {//GEN-HEADEREND:event_mnuBajasAActionPerformed
        // TODO add your handling code here:
        VtnBajasA vba = new VtnBajasA();
        vba.setVisible(true);
    }//GEN-LAST:event_mnuBajasAActionPerformed

    private void mnuModificacionesAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuModificacionesAActionPerformed
    {//GEN-HEADEREND:event_mnuModificacionesAActionPerformed
        // TODO add your handling code here:

        vtnModificacionesA vma = new vtnModificacionesA();
        vma.setVisible(true);

    }//GEN-LAST:event_mnuModificacionesAActionPerformed

    private void mnuSSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuSSalirActionPerformed
    {//GEN-HEADEREND:event_mnuSSalirActionPerformed
        // TODO add your handling code here

        VtnPrincipal vis = new VtnPrincipal();
        vis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuSSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VtnPAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnPAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnPAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnPAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnPAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnuAdministradores;
    private javax.swing.JMenuItem mnuAltasA;
    private javax.swing.JMenuItem mnuAltasE;
    private javax.swing.JMenuItem mnuBajasA;
    private javax.swing.JMenuItem mnuBajasE;
    private javax.swing.JMenuItem mnuConsultasE;
    private javax.swing.JMenu mnuEmpleados;
    private javax.swing.JMenuItem mnuModificacionesA;
    private javax.swing.JMenuItem mnuModificacionesE;
    private javax.swing.JMenuItem mnuSSalir;
    private javax.swing.JMenu mnuSalir;
    // End of variables declaration//GEN-END:variables
}
