
package flota;

public class MainFlota {
    public static void main(String[] args) {

        System.out.println("=== Reporte de Operaciones de Flota ===");

        Vehiculo[] flota = new Vehiculo[3];

        flota[0] = new Camion(
            "AA123BB", "Scania", 450.87719298245614, 18.0
        );

        flota[1] = new Furgoneta(
            "AF456CD", "Mercedes-Benz", 416.6666666666667, true
        );

        flota[2] = new MotoEnvios(
            "A099XYZ", "Honda", 180.0
        );

        double distanciaKm = 150.0;
        double costoTotal = 0.0;

        for (Vehiculo v : flota) {
            v.mostrarFicha();

            double costo = v.calcularCostoViaje(distanciaKm);
            costoTotal += costo;

            System.out.printf(
                "Costo de viaje (%.1f km): $%.1f%n",
                distanciaKm, costo
            );

            System.out.println(
                "--------------------------------------------------"
            );
        }

        System.out.printf(
            "Costo total operativo de la flota: $%.1f%n",
            costoTotal
        );
    }
}
