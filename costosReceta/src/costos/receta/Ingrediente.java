/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package costos.receta;

/**
 *
 * @author Pablo
 */
public class Ingrediente implements Comparable<Ingrediente>{
    private String nombre;
    private double costoPorUnidad; // Costo por unidad
    private String unidad;

    public Ingrediente() {
    }
    
    public Ingrediente(String nombre, double costoPorUnidad,String unidad) {
        this.nombre = nombre;
        this.costoPorUnidad = costoPorUnidad;
        this.unidad=unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoPorUnidad() {
        return costoPorUnidad;
    }

    public void setCostoPorUnidad(double costoPorUnidad) {
        this.costoPorUnidad = costoPorUnidad;
    }
    
  

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
     @Override
    public int compareTo(Ingrediente otro) {
        return this.nombre.compareTo(otro.getNombre());
    }
    
}
