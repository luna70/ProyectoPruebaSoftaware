package servicio;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.Detalle;
import modelo.ReservaAlquiler;
@Service
public class ReservaAlquilerS extends Conector{
	
	@Autowired
	private DetalleS detalleS;
	
	public List<Map<String,Object>> listar(Integer estado){
		return db.queryForList("select * from reservaalquiler where estado=?",estado);
	}
	
	public void adicionar(ReservaAlquiler ra,Detalle de){
		db.update("insert into reservaalquiler(codalq, ci, codp, fecha, monto, fevento, fentrega, fdevolucion, confirmado, anulada, garantia, entregado, devuelto, tipo,) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				ra.getCodalq(), ra.getCi(), ra.getCodp(), ra.getFecha(), ra.getMonto(), ra.getFevento(), ra.getFenterga(), ra.getFdevolucion(), ra.getConfirmado(), ra.getAnulada(), ra.getGarantia(),
				ra.getEntregado(), ra.getDevuelto(), ra.getTipo());
		detalleS.adicionar(de);
	}
	
	public void modificar(ReservaAlquiler ra){
		db.update("update reservaalquiler set (fecha, monto, fevento, fentrega, fdevolucion, confirmado, anulada, garantia, entregado, devuelto, tipo)=(?,?,?,?,?,?,?,?,?,?,?) where codalq=?",
				ra.getFecha(), ra.getMonto(), ra.getFevento(), ra.getFenterga(), ra.getFdevolucion(), ra.getConfirmado(), ra.getAnulada(), ra.getGarantia(), ra.getEntregado(),
				ra.getDevuelto(), ra.getTipo());
	}
	
	public void eliminar(String codalq){
		db.update("update reservaalqulier set estado=0 where codalq=?",codalq);
		detalleS.eliminar(codalq);
	}
	 public Map<String,Object> ver(String cadalq){
		 return db.queryForMap("select * from reservaalquiler where codalq=?",cadalq);
	 }
}
