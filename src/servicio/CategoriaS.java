package servicio;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import modelo.Categoria;
@Service
public class CategoriaS extends Conector{
	
	public List<Map<String,Object>> listar(Integer estado){
		return db.queryForList("select * from categorias where estado=?",estado);
	}
	public void adicionar(Categoria ca){
		db.update("insert into categorias(codcat, nombrecat) values(?,?)",
				ca.getCodcat(), ca.getNombrecat());
	}
	public void modificar(Categoria ca){
		db.update("update categorias set (nombrecat)=(?) where codcat=?", 
				ca.getNombrecat());
	}
	public void eliminar(Integer codcat){
		db.update("update categorias set estado=0 where codcat=?", codcat);
	}
	 public Map<String,Object> ver(Integer codcat){
		 return db.queryForMap("select * from categorias where codcat=?", codcat);
	 }
}
