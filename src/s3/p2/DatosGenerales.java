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
public class DatosGenerales
{
    private String nombre;  
    private int edad;
    private String turno;
    private int numeroEmpleado;
    private String area;

    public DatosGenerales()
    {
    }

    public DatosGenerales(String nombre, int edad, String turno, int numeroEmpleado, String area)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.numeroEmpleado = numeroEmpleado;
        this.area = area;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad()
    {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    /**
     * @return the turno
     */
    public String getTurno()
    {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno)
    {
        this.turno = turno;
    }

    /**
     * @return the numeroEmpleado
     */
    public int getNumeroEmpleado()
    {
        return numeroEmpleado;
    }

    /**
     * @param numeroEmpleado the numeroEmpleado to set
     */
    public void setNumeroEmpleado(int numeroEmpleado)
    {
        this.numeroEmpleado = numeroEmpleado;
    }

    /**
     * @return the area
     */
    public String getArea()
    {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area)
    {
        this.area = area;
    }

}
