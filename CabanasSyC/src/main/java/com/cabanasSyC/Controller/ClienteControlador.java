package com.cabanasSyC.Controller;


import com.cabanasSyC.Entidad.Cliente;
import com.cabanasSyC.Service.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ClienteControlador {

    @Autowired
    private ClienteServicio servicio;

    @RequestMapping("/")
    public String verPaginaInicio(Model modelo) {
        
        modelo.addAttribute("listaCliente", servicio.listAll());
        return "index";
    }

 @RequestMapping("/nuevo")
    public String mostrarFormularioRegistroCliente(Model modelo) {
        Cliente cliente = new Cliente();
        modelo.addAttribute("cliente", cliente);
        return "nuevo_cliente";
    }

    /*@PostMapping
    @RequestMapping("/nuevo")
    public String insertarCliente(@RequestParam String nombre,@RequestParam String apellidos,@RequestParam int cedula,@RequestParam String correo,@RequestParam String telefono){
    servicio.insertarCliente(nombre,apellidos,cedula,correo,telefono);
    return "nuevo_cliente";
    }*/

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardarCliente(@ModelAttribute("cliente") Cliente cliente) {
        servicio.save(cliente);
        return "redirect:/";
    }

    @RequestMapping("/editar/{id}")
    public ModelAndView mostrarFormularioEditar(@PathVariable (name="id")Integer id) {
        ModelAndView modelo = new ModelAndView("editar_cliente");
        Cliente cliente=servicio.get(id);
        modelo.addObject("cliente",cliente);
        return modelo;
    }
    
    @RequestMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable(name="id") Integer id){
    servicio.delete(id);
    return "redirect:/";
    }

}
