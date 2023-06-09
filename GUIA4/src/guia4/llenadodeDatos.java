/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package guia4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.DefaultListModel;

/**
 *
 * @author ESTUDIANTE 25
 */
public class llenadodeDatos extends javax.swing.JInternalFrame {

    Queue<String> coladedatos = new LinkedList<String>();
    DefaultListModel modelo = new DefaultListModel();
    public llenadodeDatos() {
        initComponents();
        jList1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomape = new javax.swing.JLabel();
        edd = new javax.swing.JLabel();
        prepa = new javax.swing.JLabel();
        cuadro1 = new javax.swing.JTextField();
        cuadro2 = new javax.swing.JTextField();
        cuadro3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        exe1 = new javax.swing.JCheckBox();
        exe2 = new javax.swing.JCheckBox();
        exe3 = new javax.swing.JCheckBox();
        exe4 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("DIGITE SUS DATOS");

        nomape.setBackground(new java.awt.Color(204, 204, 255));
        nomape.setText("NOMBRE Y APELLIDO:");

        edd.setText("EDAD:");

        prepa.setText("EMPRESA AFILIADA (POS o PC):");

        cuadro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadro1ActionPerformed(evt);
            }
        });

        cuadro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadro2ActionPerformed(evt);
            }
        });

        jLabel1.setText("EN EL CASO DE CUMPLIR CON ALGUNA ESPECIFICACION MARQUE  EL CUADRO.");

        exe1.setText("MAS DE 60 o MENOS DE 12 AÑOS");
        exe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exe1ActionPerformed(evt);
            }
        });

        exe2.setText("SE ENCUENTRA EN EMBARAZO");

        exe3.setText("LIMITACION MOTRIZ");
        exe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exe3ActionPerformed(evt);
            }
        });

        exe4.setText("BENEFICIARIO O CONTRIBUTIVO");

        jButton2.setText("ENTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("AL FINALIZAR DE CLIC AQUI.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(exe4)
                                .addComponent(exe2)
                                .addComponent(exe3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(148, 148, 148)
                                    .addComponent(jButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(102, 102, 102)
                                    .addComponent(jLabel2)))
                            .addGap(81, 81, 81)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nomape)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cuadro1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(edd)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cuadro3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(prepa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cuadro2)))
                            .addComponent(exe1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomape)
                    .addComponent(cuadro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prepa)
                    .addComponent(cuadro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edd)
                    .addComponent(cuadro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(exe1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exe2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exe3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exe4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuadro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadro1ActionPerformed

    private void exe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exe1ActionPerformed

    private void exe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exe3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exe3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String dato1 = cuadro1.getText(); 
       String dato2 = cuadro2.getText(); 
       String dato3 = cuadro3.getText(); 
      // cola.add(dato1)
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cuadro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadro2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cuadro1;
    private javax.swing.JTextField cuadro2;
    private javax.swing.JTextField cuadro3;
    private javax.swing.JLabel edd;
    private javax.swing.JCheckBox exe1;
    private javax.swing.JCheckBox exe2;
    private javax.swing.JCheckBox exe3;
    private javax.swing.JCheckBox exe4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nomape;
    private javax.swing.JLabel prepa;
    // End of variables declaration//GEN-END:variables
}
