/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg2;

/**
 *
 * @author 54364
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected boolean activo;

    public Persona(String nombre, String apellido, int edad, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.activo = activo;
    }

    public abstract String getRol(); // Método abstracto para obtener el rol de la persona

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Activo: " + activo;
    }
}

   