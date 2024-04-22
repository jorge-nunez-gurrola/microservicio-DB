package com.example.Microservice_OAD.model;

import javax.persistence.*;

@Entity
@Table(name = "Empleado")
public class entidadDB {

    @Id
    @GeneratedValue
    private int empId;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="correo", nullable = false, length = 200)
    private String correo;

    // Constructor por defecto
    public entidadDB() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Empleado [Id=" + empId + 
                        ", nombre=" + nombre + 
                        ", apellido=" + apellido + 
                        ", correo=" + correo + "]";
    }

}
