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
public class Pasiente extends Persona {
    private String numeroAfiliado;
    private String obraSocial;

    public Pasiente(String nombre, String apellido, int edad, boolean activo, String numeroAfiliado, String obraSocial) {
        super(nombre, apellido, edad, activo);
        this.numeroAfiliado = numeroAfiliado;
        this.obraSocial = obraSocial;
    }

    @Override
    public String getRol() {
        return "Pasiente";
    }

    @Override
    public String toString() {
        return super.toString() + ", Nro. Afiliado: " + numeroAfiliado + ", Obra Social: " + obraSocial;
    }
    
     public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
     public String getNombre() {
        return nombre;
        
     }
     public int getEdad() {
        return edad;
    }
}
     
     
  
