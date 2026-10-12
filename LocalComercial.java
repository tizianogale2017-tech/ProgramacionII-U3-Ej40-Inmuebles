package Ejercicio40_inmuebles;

public class LocalComercial extends Inmueble {
    private boolean vidrieraALaCalle;
    private String zonificacion;

    public LocalComercial(String direccion, double superficieMetros2, double precioBase, boolean vidrieraALaCalle, String zonificacion) {
        super(direccion, superficieMetros2, precioBase);
        this.vidrieraALaCalle = vidrieraALaCalle;
        this.zonificacion = zonificacion;
    }

    @Override
    public double calcularTasacion() {
        double factorZona = zonificacion.equals("CENTRO") ? 1.40 : 1.10;
        double factorVidriera = vidrieraALaCalle ? 1.15 : 1.0;
        return precioBase * factorZona * factorVidriera;
    }
}
