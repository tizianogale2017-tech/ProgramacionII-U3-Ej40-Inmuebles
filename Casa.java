package Ejercicio40_inmuebles;

public class Casa extends Inmueble {
    private double superficiePatio;
    private int cantidadPlantas;

    public Casa(String direccion, double superficieMetros2, double precioBase, double superficiePatio, int cantidadPlantas) {
        super(direccion, superficieMetros2, precioBase);
        this.superficiePatio = superficiePatio;
        this.cantidadPlantas = cantidadPlantas;
    }

    @Override
    public double calcularTasacion() {
        return precioBase + superficiePatio * 250.0 + cantidadPlantas * 5000.0;
    }
}
