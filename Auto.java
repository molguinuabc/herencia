/**
 * Subclase Auto: hereda de Vehiculo con 'extends'.
 * Auto ES UN Vehiculo (relación "es-un").
 */
public class Auto extends Vehiculo {

    // Atributo propio de Auto
    private int numeroPuertas;

    public Auto(String marca, String modelo, int anio, int numeroPuertas) {
        // Llamamos al constructor de la superclase
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * SOBRESCRITURA del método moverse().
     * Usamos @Override para que el compilador valide la firma.
     */
    @Override
    public void moverse() {
        System.out.println("🚗 El auto " + marca + " " + modelo + 
                           " avanza por la carretera sobre 4 ruedas.");
    }

    // Método exclusivo de Auto
    public void tocarBocina() {
        System.out.println("¡Beep beep! 🎺");
    }
}