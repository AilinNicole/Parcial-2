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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author 54364
 */


public class Clinica{
    private List<Pasiente> pasientes;
    private List<Profesional> profesionales;
    private List<Turnos> turnos;
    private List<Recurso> recursos;
    

    public Clinica() {
        pasientes = new ArrayList<>();
        profesionales = new ArrayList<>();
        turnos = new ArrayList<>();
        recursos = new ArrayList<>();
        
    }
    
    

    // Métodos para agregar pacientes, profesionales, turnos, recursos, etc.
    public void agregarPaciente(Pasiente paciente) {
        pasientes.add(paciente);
    }

    public void agregarProfesional(Profesional profesional) {
        profesionales.add(profesional);
    }

    public void agregarTurno(Turnos turno) {
        turnos.add(turno);
    }

    public void agregarRecurso(Recurso recurso) {
        recursos.add(recurso);
        
       
    
    }

    // Ejercicio 2: Listar pacientes del día Martes 29 de agosto de 2023 en la especialidad de Cardiología.
    public List<Pasiente> listarPacienteMartesRadiologia() {
        return turnos.stream()
            .filter(turno -> turno.getFecha().isEqual(LocalDate.of(2023, 9, 12)) &&
                             turno.getEspecialidad().getNombre().equals("Radiología"))
            .sorted(Comparator.comparing(Turnos::getHoraLlegada))
            .map(Turnos::getPaciente)
            .collect(Collectors.toList());
    }

    // Ejercicio 3: Listar turnos por Profesional y Especialidad.
    public Map<Profesional, Map<Especialidad, List<Turnos>>> listarTurnosPorProfesionalEspecialidad() {
        return turnos.stream()
            .collect(Collectors.groupingBy(
                Turnos::getProfesional,
                Collectors.groupingBy(Turnos::getEspecialidad)
            ));
    }

    // Ejercicio 4: Listar pacientes mayores de 65 años afiliados a INSSSEP.
    public List<Pasiente> listarPacientesMayores65AfiliadosINSSSEP() {
        return pasientes.stream()
            .filter(pasiente -> pasiente.getEdad() > 65 && "INSSSEP".equals(pasiente.getObraSocial()))
            .sorted(Comparator.comparingInt(Pasiente::getEdad))
            .collect(Collectors.toList());
    
    }

    // Ejercicio 5: Obtener la cantidad de camas de una plaza y televisores en el edificio.
    public int getCantidadCamasUnaPlaza() {
        return recursos.stream()
            .filter(recurso -> "Cama de una plaza".equals(recurso.getCategoria()))
            .mapToInt(Recurso::getCantidad)
            .sum();
    }

    public int getCantidadTelevisores() {
        return recursos.stream()
            .filter(recurso -> "Televisor".equals(recurso.getCategoria()))
            .mapToInt(Recurso::getCantidad)
            .sum();
    }
}
