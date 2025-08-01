/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personajes;

/**
 */
// Subclase Arquero que hereda de Personaje (Herencia)
public class Arquero extends Personaje {

    // Constructor específico del Arquero con valores predeterminados
    public Arquero(String nombre) {
        super(nombre, 100, 50); // Vida: 100, Ataque: 50
    }

    // Implementación del método atacar (Polimorfismo)
    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca con su flecha.");
        enemigo.recibirDanio(ataque); // El enemigo pierde vida
    }
}