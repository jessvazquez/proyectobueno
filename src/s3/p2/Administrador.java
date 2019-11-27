/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3.p2;

/**
 *
 * @author deivi
 */
public class Administrador extends DatosGenerales
{
    private String contrasena;

    public Administrador()
    {
    }


    public Administrador(String nombre, int edad, String turno, int numeroEmpleado, String area)
    {
        super(nombre, edad, turno, numeroEmpleado, area);
    }

    public Administrador(String contrasena)
    {
        this.contrasena = contrasena;
    }

 

    public Administrador(String contrasena, String nombre, int edad, String turno, int numeroEmpleado, String area)
    {
        super(nombre, edad, turno, numeroEmpleado, area);
        this.contrasena = contrasena;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena()
    {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena)
    {
        this.contrasena = contrasena;
    }
    
    
}
