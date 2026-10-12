package Ejercicio40_inmuebles;

public class Departamento extends Inmueble {
    private double expensasMensuales;
    private int piso;

    public Departamento(String direccion, double superficieMetros2, double precioBase, double expensasMensuales, int piso) {
        super(direccion, superficieMetros2, precioBase);
        this.expensasMensuales = expensasMensuales;
        this.piso = piso;
    }

    @Override
    public double calcularTasacion() {
        return precioBase + piso * 1500.0 - expensasMensuales * 24;
    }
}
