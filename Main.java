import java.util.ArrayList;
import java.util.List;

/**
 * Clase de prueba donde demostramos HERENCIA y POLIMORFISMO.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== 1) HERENCIA EN ACCIÓN ===\n");

        // Creamos objetos de las subclases
        Auto auto = new Auto("Toyota", "Corolla", 2023, 4);
        Barco barco = new Barco("Yamaha", "Explorer", 2022, 12.5);

        // Los métodos heredados de Vehiculo están disponibles:
        auto.mostrarInfo();
        barco.mostrarInfo();

        // Métodos propios de cada subclase:
        auto.tocarBocina();
        barco.lanzarAncla();

        System.out.println("\n=== 2) POLIMORFISMO EN ACCIÓN ===\n");

        /*
         * CLAVE DEL POLIMORFISMO:
         * Una referencia de tipo Vehiculo puede apuntar a cualquier subclase.
         * Java decide en TIEMPO DE EJECUCIÓN qué versión de moverse() llamar.
         */
        Vehiculo v1 = new Auto("Ford", "Mustang", 2024, 2);
        Vehiculo v2 = new Barco("Sea Ray", "Sundancer", 2023, 10.0);

        v1.moverse(); // Ejecuta el moverse() de Auto
        v2.moverse(); // Ejecuta el moverse() de Barco

        System.out.println("\n=== 3) POLIMORFISMO CON COLECCIONES ===\n");

        // Una lista de Vehiculos puede contener Autos y Barcos mezclados
        List<Vehiculo> flota = new ArrayList<>();
        flota.add(new Auto("Honda", "Civic", 2021, 4));
        flota.add(new Barco("Bayliner", "VR5", 2020, 8.2));
        flota.add(new Auto("Tesla", "Model 3", 2024, 4));
        flota.add(new Barco("Beneteau", "Oceanis", 2019, 11.0));

        // Recorremos la lista: cada objeto responde según SU tipo real
        for (Vehiculo v : flota) {
            v.mostrarInfo();
            v.moverse();  // ← Aquí ocurre la "magia" del polimorfismo
            System.out.println("---");
        }

        System.out.println("\n=== 4) USO DE instanceof (para métodos exclusivos) ===\n");

        for (Vehiculo v : flota) {
            if (v instanceof Auto) {
                // Casting seguro para usar métodos exclusivos de Auto
                ((Auto) v).tocarBocina();
            } else if (v instanceof Barco) {
                ((Barco) v).lanzarAncla();
            }
        }
    }
}