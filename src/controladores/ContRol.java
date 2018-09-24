package controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("rol")

public class ContRol {
	@RequestMapping("lista")
	public String lista(){
		return "rol/listaroles";
	}

}
