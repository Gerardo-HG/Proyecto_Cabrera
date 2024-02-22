/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class Empresa {
    private int idEmpresa;
    private String nombre;
    private String rubro;
    private ArrayList<Deuda> deudas;

    public Empresa(int par, String nombre_de_la_Empresa, String descripcionRubro) {
    }

    public Empresa(int idEmpresa, String nombre, String rubro, ArrayList<Deuda> deudas) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.rubro = rubro;
        this.deudas = deudas;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public ArrayList<Deuda> getDeudas() {
        return deudas;
    }

    public void setDeudas(ArrayList<Deuda> deudas) {
        this.deudas = deudas;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", nombre='" + nombre + '\'' +
                ", rubro='" + rubro + '\'' +
                ", deudas=" + deudas +
                '}';
    }
}