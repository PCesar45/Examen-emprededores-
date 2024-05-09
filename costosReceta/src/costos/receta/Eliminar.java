/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package costos.receta;


import static costos.receta.Modificar.ingredientes;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Pablo
 */
public final class Eliminar extends javax.swing.JFrame {

    /**
     * Creates new form Modificar
     */
    public static ArrayList<Ingrediente> ingredientes;
    DefaultTableModel model2 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Return false to make all cells non-editable
                return false;
            }
        };
    public Eliminar(int selec) {
        initComponents();
        ingredientes = new ArrayList<>();
        CargarListaIngredientes();
        ordenarPorNombre();
        model2.addColumn("Ingrediente");
        model2.addColumn("Costo");
        actualizarcombobox();
        if(selec!=-1){
            tabla2.setRowSelectionInterval(selec, selec);
            Ingrediente seleccionado=buscarIng(model2.getValueAt(selec,0).toString());
            Ingre.setText(seleccionado.getNombre());
            Costo.setText(String.valueOf(seleccionado.getCostoPorUnidad()));
            Unidad.setText(seleccionado.getUnidad());
        }
        
        
    }
   public static void ordenarPorNombre() {
        Collections.sort(ingredientes);
    }
     void actualizarcombobox(){
         ordenarPorNombre();
         // Remove all rows from the table
        model2.setRowCount(0);


        for (int i = 0; i < ingredientes.size(); i++) {
             model2.addRow(new Object[]{ingredientes.get(i).getNombre(),String.valueOf(ingredientes.get(i).getCostoPorUnidad())}); 
        }
        
         
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ingrediente:");

        jLabel2.setText("Unidad de medida:");

        jLabel3.setText("Costo por unidad");

        Ingre.setEnabled(false);
        Ingre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreActionPerformed(evt);
            }
        });

        Unidad.setEnabled(false);
        Unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnidadActionPerformed(evt);
            }
        });

        Costo.setEnabled(false);

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tabla2.setModel(model2);
        tabla2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51)
                        .addComponent(Ingre, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Ingre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngreActionPerformed

    private void UnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnidadActionPerformed

    }//GEN-LAST:event_UnidadActionPerformed
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
   
    public void BorrarContenidoArchivo(String rutaArchivo) {


        try {
            // Abrir el archivo en modo de escritura (esto eliminará su contenido)
            FileWriter fileWriter = new FileWriter(rutaArchivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Cerrar el BufferedWriter
            bufferedWriter.close();

            
        } catch (IOException e) {
            showMessageDialog(null,"Error al borrar el contenido del archivo: " + e.getMessage());
        }
    }

    void guardarInfoNueva(){
        for (int i = 0; i < ingredientes.size(); i++) {
            String ingredient=ingredientes.get(i).getNombre()+","+String.valueOf(ingredientes.get(i).getCostoPorUnidad())+","+ingredientes.get(i).getUnidad()+"\n";
            Guardar_en_el_archivo(ingredient);
            
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if(Costo.getText().isEmpty()){
             showMessageDialog(null, "la cantidad no puede ser vacio");
         }
         else if(!isInteger(Costo.getText())){
            showMessageDialog(null, "la cantidad debe ser un numero ");
        }else{
           Ingrediente seleccionado;
           seleccionado=buscarIng(model2.getValueAt(tabla2.getSelectedRow(),0).toString());
           ingredientes.remove(seleccionado);
           model2.removeRow(tabla2.getSelectedRow());

            String rutaArchivo ="src/costos/receta/Archivos/Ingredientes.txt";
           //para que lo guarde tambien en el build
           String rutaArchivo2 ="build/classes/costos/receta/Archivos/Ingredientes.txt";
           BorrarContenidoArchivo(rutaArchivo);
           BorrarContenidoArchivo(rutaArchivo2);
           guardarInfoNueva();
           interfazTotal.getIngredientes().clear();
           interfazTotal.CargarListaIngredientes();
           interfazTotal.actualizarcombobox();

           actualizarcombobox();
           showMessageDialog(null,"Eliminado con exito");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla2MouseClicked
        Ingrediente seleccionado;
        seleccionado=buscarIng(model2.getValueAt(tabla2.getSelectedRow(),0).toString());
        Ingre.setText(seleccionado.getNombre());
        Costo.setText(String.valueOf(seleccionado.getCostoPorUnidad()));
        Unidad.setText(seleccionado.getUnidad());
    }//GEN-LAST:event_tabla2MouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked
public static void CargarListaIngredientes(){
        try (Scanner myReader = new Scanner(interfazTotal.class.getResourceAsStream("Archivos/Ingredientes.txt"))) {
            while (myReader.hasNextLine()) {
                String Ing= myReader.nextLine();
                if(!"\n".equals(Ing)){
                    String[]IngSep=Ing.split(",");
                    ingredientes.add(new Ingrediente(IngSep[0],Double.parseDouble(IngSep[1]),IngSep[2]));
                }
               
            }
        }
    }
    public boolean isInteger(String cadena){
        boolean contieneSoloNumeros = true;
        for (char c : cadena.toCharArray()) {
            if (!Character.isDigit(c)&&c!='.') {
                contieneSoloNumeros = false;
                break;
            }
        }
        return contieneSoloNumeros;
    }
    Ingrediente buscarIng(String nombre){
         for (int i = 0; i < ingredientes.size(); i++) {
            if(nombre.equals(ingredientes.get(i).getNombre())){
                return ingredientes.get(i);
            }
        }
         return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Costo;
    private javax.swing.JTextField Ingre;
    private javax.swing.JTextField Unidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
