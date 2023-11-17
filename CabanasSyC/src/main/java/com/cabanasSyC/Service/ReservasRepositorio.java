/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cabanasSyC.Service;


import com.cabanasSyC.Repository.*;
import com.cabanasSyC.Entidad.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ying
 */
public interface ReservasRepositorio extends JpaRepository<Reservas,Integer>{

}
