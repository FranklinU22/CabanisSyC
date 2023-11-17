package com.cabanasSyC.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;

/**
 *
 * @author Ying
 */
@Entity
public class Tours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tour;

    @Column(nullable = false, length = 50)
    private String nombre_tour;
    
    @Column(nullable = false, length = 10)
    private Date hora_inicio;
    
    @Column(nullable = false, length = 10)
    private Date hora_fin;

    @Column(nullable = false, length = 100)
    private String descripcion;
    
    @Column(nullable = false, length = 50)
    private int costo;

    public Tours() {
    }

    public Tours(String nombre_tour, Date hora_inicio, Date hora_fin, String descripcion, int costo) {
        this.nombre_tour = nombre_tour;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public int getId_tour() {
        return id_tour;
    }

    public void setId_tour(int id_tour) {
        this.id_tour = id_tour;
    }

    public String getNombre_tour() {
        return nombre_tour;
    }

    public void setNombre_tour(String nombre_tour) {
        this.nombre_tour = nombre_tour;
    }

    public Date getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Date getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Date hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

   

    
    
    
}
