package controladores;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import modelo.Dato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import servicio.MenuS;
import servicio.UsuarioS;

@Controller
@RequestMapping("principal")
public class Principal {
	@Autowired
	private UsuarioS usuarioS;
	@Autowired
	private MenuS menuS;

	@RequestMapping("login")
	public String login(){
		return "login";
	}

	@RequestMapping("index")
	public String index(HttpServletRequest request,Model m,Dato d){
		Map<String,Object> u=usuarioS.login(d);
		if(u!=null){
			HttpSession sesion=request.getSession(true);
			sesion.setAttribute("usuario",u);
			List<Map<String,Object>> menus=menuS.listar(Integer.parseInt(u.get("codrol").toString()));
			m.addAttribute("menus",menus);
			m.addAttribute("usuario",u);
			return "index";
		}
		else return "redirect:login";
	}

	@RequestMapping("salir")
	public String salir(HttpServletRequest request){
		HttpSession sesion=request.getSession();
		sesion.removeAttribute("usuario");
		sesion.invalidate();
		return "redirect:login";
	}
}
