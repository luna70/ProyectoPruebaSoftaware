package servicio;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import modelo.Pagos;
@Service
public class PagosS extends Conector{
	
	public List<Map<String,Object>> listar(Integer estado){
		return db.queryForList("select * from pagos where estado=?",estado);
	}
	public void adicionar(Pagos pa){
		db.update("insert into pagos(codp, monto, fpago, codalq) values(?,?,?,?)",
				pa.getCodp(), pa.getMonto(), pa.getFpago(), pa.getCodalq());
	}
	public void modificar(Pagos pa){
		db.update("update pagos set (monto, fpago)=(?,?) where codpt=?", 
				pa.getMonto(), pa.getFpago());
	}
	public void eliminar(Integer codp){
		db.update("update pagos set estado=0 where codcat=?", codp);
	}
	 public Map<String,Object> ver(Integer codp){
		 return db.queryForMap("select * from pagos where codp=?", codp);
	 }
}
