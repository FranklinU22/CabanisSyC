package com.cabanasSyC.Entidad;

import jakarta.persistence.Column;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario ;

    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(nullable = false, length = 50)
    private String apellidos;
    @Column(nullable = false, length = 50, unique = true)
    private String usuario ;
    @Column(nullable = false, length = 50)
    private String telefono;
    @Column(nullable = false, length = 50)
    private String email ;
    @Column(nullable = false, length = 50)
    private String nacionalidad  ;
    
    

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String usuario, String telefono, String email, String nacionalidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.telefono = telefono;
        this.email = email;
        this.nacionalidad = nacionalidad;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    

}
