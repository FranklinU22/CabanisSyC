
package com.cabanasSyC.Repository;



import com.cabanasSyC.Entidad.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;


public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{

}
