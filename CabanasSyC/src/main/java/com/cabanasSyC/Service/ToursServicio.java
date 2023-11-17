
package com.cabanasSyC.Service;


import com.cabanasSyC.Entidad.Tours;
import com.cabanasSyC.Repository.ToursRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ying
 */
@Service
public class ToursServicio {
    
    @Autowired
    private ToursRepositorio repo;
    
    public List<Tours>listAll(){
    return repo.findAll();
    }
    public void save (Tours tours){
    repo.save(tours);
    }
    public Tours get(Integer id_tours){
    return repo.findById(id_tours).get();
    }
    public void delete(Integer id_tours){
    repo.deleteById(id_tours);
    }
}
