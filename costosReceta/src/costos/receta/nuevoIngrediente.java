/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package costos.receta;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Pablo
 */
public class nuevoIngrediente extends javax.swing.JFrame {

    /**
     * Creates new form nuevoIngrediente
     */

    public nuevoIngrediente(  ) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Ingre = new javax.swing.JTextField();
        Unidad = new javax.swing.JTextField();
        Costo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Ingrediente:");

        jLabel2.setText("Unidad de medida:");

        jLabel3.setText("Costo por unidad");

        Ingre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreActionPerformed(evt);
            }
        });

        Unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnidadActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(Ingre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Costo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Ingre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void Guardar_en_el_archivo(String texto){
        //Si el ejecutable no sirve posiblemente es aca
        String rutaArchivo ="src/costos/receta/Archivos/Ingredientes.txt";
        //para que lo guarde tambien en el build
        String rutaArchivo2 ="build/classes/costos/receta/Archivos/Ingredientes.txt";
        try {
            // Crear un objeto FileWriter con la opción de añadir al final del archivo
            FileWriter fileWriter = new FileWriter(rutaArchivo, true);
            FileWriter fileWriter2 = new FileWriter(rutaArchivo2, true);
            // Crear un objeto BufferedWriter para escribir en el archivo
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);

            // Escribir en el archivo
            bufferedWriter.write(texto);
            bufferedWriter2.write(texto);

            // Cerrar el BufferedWriter
            bufferedWriter.close();
            bufferedWriter2.close();

            
        } catch (IOException e) {
            showMessageDialog(null,"Error al escribir en el archivo: " + e.getMessage());
        }
        
        
    } 
    private void IngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngreActionPerformed

    private void UnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnidadActionPerformed
        
    }//GEN-LAST:event_UnidadActionPerformed
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String ingredient=Ingre.getText()+","+Costo.getText()+","+Unidad.getText()+"\n";
        Guardar_en_el_archivo(ingredient);
        showMessageDialog(null, "Guardado");

        interfazTotal.getIngredientes().clear();
        interfazTotal.CargarListaIngredientes();
        interfazTotal.actualizarcombobox();
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Costo;
    private javax.swing.JTextField Ingre;
    private javax.swing.JTextField Unidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
