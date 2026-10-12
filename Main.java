package Ejercicio40_inmuebles;

public class Main {
    public static void main(String[] args) {
        Inmueble[] cartera = {
            new Casa("Los Álamos 123", 180.0, 90000000.0, 250.0, 2),
            new Departamento("Av. Colón 800, 4B", 65.0, 55000000.0, 85000.0, 4),
            new LocalComercial("Peatonal Sarmiento 50", 40.0, 70000000.0, true, "CENTRO")
        };

        System.out.println("=== Tasaciones comerciales ===");
        for (Inmueble i : cartera) {
            System.out.printf("%s - %s: %.2f%n", i.getClass().getSimpleName(), i.getDireccion(), i.calcularTasacion());
        }
    }
}
