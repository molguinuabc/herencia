/**
 * Subclase Barco: también hereda de Vehiculo.
 */
public class Barco extends Vehiculo {

    // Atributo propio de Barco
    private double eslora; // longitud en metros

    public Barco(String marca, String modelo, int anio, double eslora) {
        super(marca, modelo, anio);
        this.eslora = eslora;
    }

    /**
     * Otra SOBRESCRITURA de moverse().
     * Mismo método, comportamiento DIFERENTE → POLIMORFISMO.
     */
    @Override
    public void moverse() {
        System.out.println("🚢 El barco " + marca + " " + modelo + 
                           " navega sobre las olas del mar.");
    }

    // Método exclusivo de Barco
    public void lanzarAncla() {
        System.out.println("⚓ Ancla lanzada...");
    }
}