import java.util.*;
import java.lang.*;
import java.io.*;


// Clase que define el objeto 'Propiedad'
public class PropiedadAlquiler {
    // Atributos (Encapsulamiento)
    private String nombre;
    private String ubicacion;
    private double precioPorNoche;
    private boolean estaDisponible;

    // Constructor: Inicializa el objeto con sus datos básicos
    public PropiedadAlquiler(String nombre, String ubicacion, double precio) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precioPorNoche = precio;
        this.estaDisponible = true; // Por defecto está disponible
    }

    // Método para realizar una reserva
    public void reservar() {
        if (estaDisponible) {
            estaDisponible = false;
            System.out.println("Reserva exitosa para: " + nombre);
        } else {
            System.out.println("Lo sentimos, " + nombre + " ya está ocupada.");
        }
    }

    // Método para liberar la propiedad
    public void finalizarReserva() {
        estaDisponible = true;
        System.out.println("La propiedad " + nombre + " ahora está disponible.");
    }

    // Método para mostrar la ficha técnica de la propiedad
    public void mostrarInfo() {
        String estado = estaDisponible ? "Disponible" : "Ocupada";
        System.out.println("--- Información de la Propiedad ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Precio: $" + precioPorNoche + " por noche");
        System.out.println("Estado actual: " + estado);
        System.out.println("-----------------------------------");
    }

    // Método Principal para ejecutar el programa
    public static void main(String[] args) {
        // Creación de diferentes objetos basados en la misma clase
        PropiedadAlquiler apto1 = new PropiedadAlquiler("Apartamento Vista Mar", "San Juan", 120.0);
        PropiedadAlquiler villa1 = new PropiedadAlquiler("Villa Montaña", "Guaynabo", 250.0);

        // Interactuando con los objetos
        apto1.mostrarInfo();
        apto1.reservar();
        apto1.mostrarInfo();

        villa1.mostrarInfo();
    }
}
