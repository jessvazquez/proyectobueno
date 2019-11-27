/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3.p2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author deivi
 */
@Entity
@Table(name = "empleados")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"),
    @NamedQuery(name = "Empleados.findByNombre", query = "SELECT e FROM Empleados e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empleados.findByEdad", query = "SELECT e FROM Empleados e WHERE e.edad = :edad"),
    @NamedQuery(name = "Empleados.findByTurno", query = "SELECT e FROM Empleados e WHERE e.turno = :turno"),
    @NamedQuery(name = "Empleados.findByNumeroEmpleado", query = "SELECT e FROM Empleados e WHERE e.numeroEmpleado = :numeroEmpleado"),
    @NamedQuery(name = "Empleados.findByArea", query = "SELECT e FROM Empleados e WHERE e.area = :area"),
    @NamedQuery(name = "Empleados.findByHoraEntrada", query = "SELECT e FROM Empleados e WHERE e.horaEntrada = :horaEntrada"),
    @NamedQuery(name = "Empleados.findByHoraSalida", query = "SELECT e FROM Empleados e WHERE e.horaSalida = :horaSalida"),
    @NamedQuery(name = "Empleados.findByEstatus", query = "SELECT e FROM Empleados e WHERE e.estatus = :estatus"),
    @NamedQuery(name = "Empleados.findByIncidentes", query = "SELECT e FROM Empleados e WHERE e.incidentes = :incidentes")
})
public class Empleados implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "edad")
    private int edad;
    @Basic(optional = false)
    @Column(name = "turno")
    private String turno;
    @Id
    @Basic(optional = false)
    @Column(name = "numeroEmpleado")
    private Integer numeroEmpleado;
    @Basic(optional = false)
    @Column(name = "area")
    private String area;
    @Basic(optional = false)
    @Column(name = "horaEntrada")
    private String horaEntrada;
    @Basic(optional = false)
    @Column(name = "horaSalida")
    private String horaSalida;
    @Basic(optional = false)
    @Column(name = "estatus")
    private int estatus;
    @Basic(optional = false)
    @Column(name = "incidentes")
    private int incidentes;

    public Empleados()
    {
    }

    public Empleados(Integer numeroEmpleado)
    {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Empleados(Integer numeroEmpleado, String nombre, int edad, String turno, String area, String horaEntrada, String horaSalida, int estatus, int incidentes)
    {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.area = area;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.estatus = estatus;
        this.incidentes = incidentes;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getTurno()
    {
        return turno;
    }

    public void setTurno(String turno)
    {
        this.turno = turno;
    }

    public Integer getNumeroEmpleado()
    {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado)
    {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getArea()
    {
        return area;
    }

    public void setArea(String area)
    {
        this.area = area;
    }

    public String getHoraEntrada()
    {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada)
    {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida()
    {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida)
    {
        this.horaSalida = horaSalida;
    }

    public int getEstatus()
    {
        return estatus;
    }

    public void setEstatus(int estatus)
    {
        this.estatus = estatus;
    }

    public int getIncidentes()
    {
        return incidentes;
    }

    public void setIncidentes(int incidentes)
    {
        this.incidentes = incidentes;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (numeroEmpleado != null ? numeroEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados))
        {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.numeroEmpleado == null && other.numeroEmpleado != null) || (this.numeroEmpleado != null && !this.numeroEmpleado.equals(other.numeroEmpleado)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "s3.p2.Empleados[ numeroEmpleado=" + numeroEmpleado + " ]";
    }
    
}
