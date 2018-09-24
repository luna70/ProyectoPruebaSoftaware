package controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("enseres")

public class ContEnseres {
		@RequestMapping("lista")
		public String lista(){
			return "enseres/listaenseres";
		}

}
