/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session5.Entidades;

/**
 *
 * @author Estudiante
 */
public class Empleado extends Persona {

    private String codEmpleado;

    public Empleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public Empleado() {
    }

    public static Empleado fromPersona(Persona per) {
        Empleado emp = new Empleado();
        emp.setNombre(per.getNombre());
        emp.setApellido(per.getApellido());
        emp.setDni(per.getDni());
        return emp;
    }

    @Override

    public String getText() {
        return "Empleado: " + this.getNombre() + " " + this.getApellido() + " | DNI: " + this.getDni();
    }

    /**
     * @return the codEmpleado
     */
    public String getCodEmpleado() {
        return codEmpleado;
    }

    /**
     * @param codEmpleado the codEmpleado to set
     */
    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

}
