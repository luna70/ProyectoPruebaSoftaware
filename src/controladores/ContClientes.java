package controladores;

import modelo.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import servicio.ClienteS;

@Controller
@RequestMapping("clientes")
public class ContClientes {
	
	@Autowired
	private ClienteS clienteS;
	
	@RequestMapping("lista") //para listar los registros de Clientes
	public String lista(Model m){
		m.addAttribute("lista", clienteS.listar(1));
		return "clientes/listaclientes";
	}
	
	@RequestMapping("agregar")
	public String agregar(Model m){
		m.addAttribute(clienteS.listar(1));
		return "clientes/agregarclientes";
	}
	
	@RequestMapping("guardar")
	public String guardar(String fecha, Cliente c){
		clienteS.adicionar(c);
		return "redirect:lista";
	}
	
	@RequestMapping("modificar")
	public String modificar(){
		return "clientes/modificarclientes";
	}
	
	@RequestMapping("mostrar")
	public String mostrar(){
		return "clientes/mostrarclientes";
	}

}
