
package Clases;


public class Deuda {
    private int idDeuda;
    private double monto;
    private String descripcion;
    private Empresa empresa;

    public Deuda() {
    }

    public Deuda(int idDeuda, double monto, String descripcion, Empresa empresa) {
        this.idDeuda = idDeuda;
        this.monto = monto;
        this.descripcion = descripcion;
        this.empresa = empresa;
    }

    public int getIdDeuda() {
        return idDeuda;
    }

    public void setIdDeuda(int idDeuda) {
        this.idDeuda = idDeuda;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Deuda{" +
                "idDeuda=" + idDeuda +
                ", monto=" + monto +
                ", descripcion='" + descripcion + '\'' +
                ", empresa=" + empresa +
                '}';
    }
}