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
public class Empleado extends DatosGenerales
{
    private String horaEntrada;
    private String horaSalida;
    private int estatus;
    private int incidentes;

    public Empleado(int estatus) {
        this.estatus = estatus;
    }

    public Empleado(int estatus, String nombre, int edad, String turno, int numeroEmpleado, String area) {
        super(nombre, edad, turno, numeroEmpleado, area);
        this.estatus = estatus;
    }

    public Empleado()
    {
    }


    public Empleado(String nombre, int edad, String turno, int numeroEmpleado, String area)
    {
        super(nombre, edad, turno, numeroEmpleado, area);
    }

    public Empleado(String horaEntrada, String horaSalida)
    {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }



    public Empleado(String horaEntrada, String horaSalida, String nombre, int edad, String turno, int numeroEmpleado, String area)
    {
        super(nombre, edad, turno, numeroEmpleado, area);
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    /**
     * @return the horaEntrada
     */
    public String getHoraEntrada()
    {
        return horaEntrada;
    }

    /**
     * @param horaEntrada the horaEntrada to set
     */
    public void setHoraEntrada(String horaEntrada)
    {
        this.horaEntrada = horaEntrada;
    }

    /**
     * @return the horaSalida
     */
    public String getHoraSalida()
    {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(String horaSalida)
    {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the estatus
     */
    public int getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    /**
     * @return the incidentes
     */
    public int getIncidentes() {
        return incidentes;
    }

    /**
     * @param incidentes the incidentes to set
     */
    public void setIncidentes(int incidentes) {
        this.incidentes = incidentes;
    }
    
    
}
