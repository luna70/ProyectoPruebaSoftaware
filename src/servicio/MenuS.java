package servicio;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import modelo.Menu;
@Service
public class MenuS extends Conector{
	
	public List<Map<String,Object>> listar(Integer codrol){
		return db.queryForList("select m.* from rolmenu r join menu m on r.codmen=m.codmen where r.codrol=?",codrol);
	}
}
