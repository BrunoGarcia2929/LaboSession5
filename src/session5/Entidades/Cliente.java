/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session5.Entidades;

/**
 *
 * @author Estudiante
 */
public class Cliente extends Persona {

    private String codCliente;
    
    public static Cliente fromPersona(Persona per)
    {
        Cliente cli = new Cliente();
        cli.setNombre(per.getNombre());
        cli.setApellido(per.getApellido());
        cli.setDni(per.getDni());
        return cli;
    }
    
    public Cliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public Cliente() {
    }
    
    
    @Override
    
    public String getText()
    {
        return "Cliente: "+this.getNombre() + " "+ this.getApellido()+ " | DNI: "+this.getDni();
    }
    /**
     * @return the codCliente
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

}
