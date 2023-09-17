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
    public class Profesional extends Persona {
    private Especialidad especialidad;
    private String secretario;

    public Profesional(String nombre, String apellido, int edad, boolean activo, Especialidad especialidad, String secretario) {
        super(nombre, apellido, edad, activo);
        this.especialidad = especialidad;
        this.secretario = secretario;
    }

    @Override
    public String getRol() {
        return "Profesional";
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidad: " + especialidad.getNombre() + ", Secretario: " + secretario;
    }

    public String getNombre(){
        return nombre;
    }}
       
    

