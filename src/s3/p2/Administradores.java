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
@Table(name = "administradores")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Administradores.findAll", query = "SELECT a FROM Administradores a"),
    @NamedQuery(name = "Administradores.findByNombre", query = "SELECT a FROM Administradores a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Administradores.findByEdad", query = "SELECT a FROM Administradores a WHERE a.edad = :edad"),
    @NamedQuery(name = "Administradores.findByTurno", query = "SELECT a FROM Administradores a WHERE a.turno = :turno"),
    @NamedQuery(name = "Administradores.findByArea", query = "SELECT a FROM Administradores a WHERE a.area = :area"),
    @NamedQuery(name = "Administradores.findByNumeroEmpleado", query = "SELECT a FROM Administradores a WHERE a.numeroEmpleado = :numeroEmpleado"),
    @NamedQuery(name = "Administradores.findByContrasena", query = "SELECT a FROM Administradores a WHERE a.contrasena = :contrasena")
})
public class Administradores implements Serializable
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
    @Basic(optional = false)
    @Column(name = "area")
    private String area;
    @Id
    @Basic(optional = false)
    @Column(name = "numeroEmpleado")
    private Integer numeroEmpleado;
    @Basic(optional = false)
    @Column(name = "contrasena")
    private String contrasena;

    public Administradores()
    {
    }

    public Administradores(Integer numeroEmpleado)
    {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Administradores(Integer numeroEmpleado, String nombre, int edad, String turno, String area, String contrasena)
    {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.area = area;
        this.contrasena = contrasena;
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

    public String getArea()
    {
        return area;
    }

    public void setArea(String area)
    {
        this.area = area;
    }

    public Integer getNumeroEmpleado()
    {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado)
    {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getContrasena()
    {
        return contrasena;
    }

    public void setContrasena(String contrasena)
    {
        this.contrasena = contrasena;
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
        if (!(object instanceof Administradores))
        {
            return false;
        }
        Administradores other = (Administradores) object;
        if ((this.numeroEmpleado == null && other.numeroEmpleado != null) || (this.numeroEmpleado != null && !this.numeroEmpleado.equals(other.numeroEmpleado)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "s3.p2.Administradores[ numeroEmpleado=" + numeroEmpleado + " ]";
    }
    
}
