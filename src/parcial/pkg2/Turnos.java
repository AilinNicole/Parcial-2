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
import java.time.LocalTime; // Importa la clase LocalTime

public class Turnos {
    private Pasiente paciente;
    private Profesional profesional;
    private Especialidad especialidad;
    private LocalDate fecha;
    private String secretario;
    private LocalTime horaLlegada; // Agrega el atributo horaLlegada

    public Turnos(Pasiente paciente, Profesional profesional, Especialidad especialidad, LocalDate fecha, String secretario, LocalTime horaLlegada) {
        this.paciente = paciente;
        this.profesional = profesional;
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.secretario = secretario;
        this.horaLlegada = horaLlegada; // Inicializa el atributo horaLlegada
    }

    public Pasiente getPaciente() {
        return paciente;
    }

    public void setPaciente(Pasiente paciente) {
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getSecretario() {
        return secretario;
    }

    public void setSecretario(String secretario) {
        this.secretario = secretario;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }}

