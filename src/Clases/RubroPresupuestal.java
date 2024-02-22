/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author user
 */


public class RubroPresupuestal{
    private int idRubro;
    private String nombre;
    private String descripcion;

    public RubroPresupuestal() {
    }

    public RubroPresupuestal(int idRubro, String nombre, String descripcion) {
        this.idRubro = idRubro;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdRubro() {
        return idRubro;
    }

    public void setIdRubro(int idRubro) {
        this.idRubro = idRubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "RubroPresupuestal{" +
                "idRubro=" + idRubro +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
