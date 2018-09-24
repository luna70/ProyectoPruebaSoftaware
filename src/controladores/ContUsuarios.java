package controladores;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import modelo.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import servicio.RolS;
import servicio.UsuarioS;

@Controller
@RequestMapping("usuarios")
public class ContUsuarios {

	@Autowired
	private UsuarioS usuarioS;

	@Autowired
	private RolS rolS;

	@RequestMapping("lista")
	public String lista(Model mod){
		mod.addAttribute("lista",usuarioS.listar(1));
		return "usuarios/listausuarios";
	}

	// Agregar usuario Nuevo
	@RequestMapping("agregar")
	public String agregar(Model m){
		m.addAttribute("roles",rolS.listar(1));
		return "usuarios/agregarusuario";
	}

	@RequestMapping("guardar")
	public String guardar(HttpServletRequest req,Usuario u,String fecha,MultipartFile fotou){ //guardar fecha y fotos
		try {
			if(fotou!=null){
				String ruta=req.getServletContext().getRealPath("/fotos/");
				String nombre=fotou.getOriginalFilename();
				System.out.println("subido a: "+ruta+"/"+nombre);
				fotou.transferTo(new File(ruta+"/"+nombre));
				u.setFoto(nombre);
			}
			u.setFnac(new SimpleDateFormat("yyyy-MM-dd").parse(fecha));
		} catch (Exception e) {e.printStackTrace();
		}
		System.out,println("");
		usuarioS.adicionar(u);
		return "redirect:lista";
	}

	//Modifcar Usuario
	@RequestMapping("modificar")
	public String modificar(Model m,String ci){
		m.addAttribute("roles", rolS.listar(1));
		m.addAttribute("usuario",usuarioS.ver(ci));
		return "usuarios/modificarusuario";
	}

	@RequestMapping("guardarmodificado")
	public String guardarmodificado(HttpServletRequest req,Usuario u,String fecha,MultipartFile fotou){ //guardar fecha y fotos
		try {
			if(fotou!=null&&fotou.getSize()>0){
				String ruta=req.getServletContext().getRealPath("/fotos/");
				String nombre=fotou.getOriginalFilename();
				System.out.println("subido a: "+ruta+"/"+nombre);
				fotou.transferTo(new File(ruta+"/"+nombre));
				u.setFoto(nombre);
			}
			u.setFnac(new SimpleDateFormat("yyyy-MM-dd").parse(fecha));
		} catch (Exception e) {e.printStackTrace();
		}
		usuarioS.modificar(u);
		return "redirect:lista";
	}

	@RequestMapping("mostrar")
	public String mostrar(Model m,String ci){
		m.addAttribute("roles", rolS.listar(1));
		m.addAttribute("usuario",usuarioS.ver(ci));
		return "usuarios/mostrarusuario";
	}


}
