/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import java.awt.Dimension;

/**
 *
 * @author André18
 */
public class Consulta extends javax.swing.JFrame {

    /**
     * Creates new form Prestamo
     */
    public Consulta() {
        this.setMinimumSize(new Dimension(422, 517));
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Captura.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 160, 120);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 470, 400, 10);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-blanco.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-6, -16, 410, 150);

        jButton1.setText("Actualizar");
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 430, 90, 23);

        jLabel11.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel11.setText("Consultas y Modificaciones");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(90, 160, 250, 19);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(260, 200, 140, 10);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(0, 200, 130, 10);

        jLabel12.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel12.setText("Titulo     :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 260, 110, 19);

        jLabel13.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel13.setText("Autor      :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 300, 110, 19);

        jLabel14.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel14.setText("Editorial  :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 340, 110, 19);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(140, 220, 220, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(140, 260, 220, 30);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(140, 300, 220, 30);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(140, 340, 220, 30);

        jLabel15.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel15.setText("Codigo     :");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 220, 150, 19);

        jButton3.setText("Consultar");
        getContentPane().add(jButton3);
        jButton3.setBounds(70, 430, 90, 23);

        jLabel16.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel16.setText("Disponible :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 380, 150, 19);

        jRadioButton3.setText("Si");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(140, 380, 33, 23);

        jRadioButton4.setText("No");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(210, 380, 39, 23);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 140, 400, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
