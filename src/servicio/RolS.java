package servicio;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import modelo.Rol;
@Service
public class RolS extends Conector{
	
	public List<Map<String,Object>> listar(Integer estado){
		return db.queryForList("select * from rol where estado=?",estado);
	}
	public void adicionar(Rol r){
		db.update("insert into rol(codrol, nombrerol) values(?,?)",
				r.getCodrol(), r.getNombrerol());
	}
	public void modificar(Rol r){
		db.update("update rol set (nombrerol)=(?) where codrol=?", 
				r.getNombrerol());
	}
	public void eliminar(Integer codrol){
		db.update("update rol set estado=0 where codrol=?", codrol);
	}
	 public Map<String,Object> ver(Integer codrol){
		 return db.queryForMap("select * from rol where codrol=?", codrol);
	 }
}
