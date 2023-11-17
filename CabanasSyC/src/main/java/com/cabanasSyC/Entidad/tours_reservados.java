package com.cabanasSyC.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;

/**
 *
 * @author Ying
 */
public class tours_reservados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tours;

    @Column(nullable = false, length = 50)
    private int id_usuario;

    @Column(nullable = false, length = 10)
    private int id_tour;

    @Column(nullable = false, length = 10)
    private Date fecha_reserva;

    public tours_reservados() {
    }

    public int getId_tours() {
        return id_tours;
    }

    public void setId_tours(int id_tours) {
        this.id_tours = id_tours;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_tour() {
        return id_tour;
    }

    public void setId_tour(int id_tour) {
        this.id_tour = id_tour;
    }

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    
    
}


