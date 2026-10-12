package Ejercicio40_inmuebles;

public class Inmueble {
    private String direccion;
    protected double superficieMetros2;
    protected double precioBase;

    public Inmueble(String direccion, double superficieMetros2, double precioBase) {
        this.direccion = direccion;
        this.superficieMetros2 = superficieMetros2;
        this.precioBase = precioBase;
    }

    public double calcularTasacion() {
        return precioBase;
    }

    public String getDireccion() {
        return direccion;
    }
}
