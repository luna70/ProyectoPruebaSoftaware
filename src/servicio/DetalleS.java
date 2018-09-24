package servicio;

import java.util.List;
import java.util.Map;

import modelo.Detalle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DetalleS extends Conector{
	
	//@Autowired
	//CategoriaS categoriaS;
	public List<Map<String,Object>> listar(Integer estado){
		return db.queryForList("select * from detalle where estado=?",estado);
	}
	
	public void adicionar(Detalle de){
		//categoriaS.adicionar(e);
		db.update("insert into detalle(coddet, code, cantidad, preciounit, estropeados, restablecidos, codalq) values(?,?,?,?,?,?,?)",
				de.getCoddet(), de.getCode(), de.getCantidad(), de.getPreciounit(), de.getEstropeados(), de.getRestablecidos(), de.getCodalq());
	}
	
	public void modificar(Detalle de){
		//personaS.modificar(u);
		db.update("update detalle set (cantidad, preciounit, estropeados, restablecidos)=(?,?,?,?) where coddet=?",
				de.getCantidad(), de.getPreciounit(), de.getEstropeados(), de.getRestablecidos());
	}
	
	public void eliminar(String coddet){
		db.update("update detalle set estado=0 where coddet=?",coddet);
	}
	 public Map<String,Object> ver(String coddet){
		 return db.queryForMap("select * from detalle where coddet=?",coddet);
	 }
}
