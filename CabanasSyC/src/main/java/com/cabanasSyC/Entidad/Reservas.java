package com.cabanasSyC.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import jakarta.persistence.Table;
import java.sql.Date;
import java.time.format.DateTimeFormatter;



/**
 *
 * @author Ying
 */
@Entity
public class Reservas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reserva;

    @Column(nullable = false, length = 10)
    private Date fecha_entrada ;
    
    
    @Column(nullable = false, length = 10)
    private Date fecha_salida ;

    @Column(nullable = false, length = 10)
    private int numero_habitacion;
    
    @Column(nullable = false, length = 10)
    private int numero_adultos ;

    @Column(nullable = false, length = 10)
    private int numero_menores ;
    
    @Column(nullable = false, length = 200)
    private String detalle ;
    
    @Column(nullable = false, length = 100)
    private int id_usuario ;
    
    
    @Column(nullable = false, length = 10)
    private int id_cabana ;
    
    @Column(nullable = false, length = 30)
    private String nacionalidad ;
    
    @Column(nullable = false, length = 15)
    private long costo_total ;
    
    
    
    
    
    public Reservas() {
    }

   
    public Reservas(Date fecha_entrada, Date fecha_salida, int numero_habitacion, int numero_adultos, int numero_menores, String detalle, String nacionalidad, long costo_total) {
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.numero_habitacion = numero_habitacion;
        this.numero_adultos = numero_adultos;
        this.numero_menores = numero_menores;
        this.detalle = detalle;
        this.nacionalidad = nacionalidad;
        this.costo_total = costo_total;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getNumero_habitacion() {
        return numero_habitacion;
    }

    public void setNumero_habitacion(int numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }

    public int getNumero_adultos() {
        return numero_adultos;
    }

    public void setNumero_adultos(int numero_adultos) {
        this.numero_adultos = numero_adultos;
    }

    public int getNumero_menores() {
        return numero_menores;
    }

    public void setNumero_menores(int numero_menores) {
        this.numero_menores = numero_menores;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_cabana() {
        return id_cabana;
    }

    public void setId_cabana(int id_cabana) {
        this.id_cabana = id_cabana;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public long getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(long costo_total) {
        this.costo_total = costo_total;
    }
    
    



}