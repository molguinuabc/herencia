/**
 * Clase base (superclase) que representa un vehículo genérico.
 * Aquí definimos atributos y comportamientos COMUNES a todos los vehículos.
 */
public class Vehiculo {

    // Atributos protegidos: accesibles desde las subclases
    protected String marca;
    protected String modelo;
    protected int anio;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    /**
     * Método que será SOBRESCRITO (override) por las subclases.
     * Este es el corazón del POLIMORFISMO.
     */
    public void moverse() {
        System.out.println("El vehículo se está moviendo...");
    }

    /**
     * Método común que NO se sobrescribe.
     * Todas las subclases lo heredan tal cual.
     */
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Año: " + anio);
    }

    // Getters (buena práctica)
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAnio() { return anio; }
}
