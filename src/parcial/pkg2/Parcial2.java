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
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrmPrinicipal frmP = new FrmPrinicipal();
        frmP.setVisible(true);
        
        
    Especialidad radiologia = new Especialidad(191, "Radiología");
        Profesional medico1 = new Profesional("Juan", "Perez", 40, true, radiologia, "Maria");
        Pasiente pasiente1 = new Pasiente("Maria", "Gomez", 70, true, "123456", "INSSSEP");

     
       
    }}
    
    

