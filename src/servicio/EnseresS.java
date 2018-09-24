package servicio;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.Enseres;
@Service
public class EnseresS extends Conector{
	
	@Autowired
	CategoriaS categoriaS;
	public List<Map<String,Object>> listar(Integer estado){
		return db.queryForList("select * from enseres where estado=?",estado);
	}
	
	public void adicionar(Enseres e){
		//categoriaS.adicionar(e);
		db.update("insert into enseres(code, codcat, nombreenser, descripcion, cantidad, precioref, foto, preciorep) values(?,?,?,?,?,?,?,?)",
				e.getCode(),e.getCodcat() ,e.getNombreenser(), e.getDescripcion(), e.getCantidad(), e.getPrecioref(), e.getFoto(), e.getPreciorep());
	}
	
	public void modificar(Enseres e){
		//personaS.modificar(u);
		db.update("update enseres set (nombreenser, descripcion, cantidad, precioref, foto, preciorep)=(?,?,?,?,?,?) where code=?",
				e.getNombreenser(), e.getDescripcion(), e.getCantidad(), e.getPrecioref(), e.getFoto(), e.getPreciorep());
	}
	
	public void eliminar(String code){
		db.update("update enseres set estado=0 where code=?",code);
	}
	 public Map<String,Object> ver(String code){
		 return db.queryForMap("select * from enseres where code=?",code);
	 }
}
