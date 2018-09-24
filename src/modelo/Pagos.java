package modelo;
import java.util.Date;
public class Pagos {
	private Integer codp;
	private double monto;
	private Date fpago;
	private String codalq;
	private Integer estado;
	
	public Integer getCodp() {
		return codp;
	}
	public void setCodp(Integer codp) {
		this.codp = codp;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public Date getFpago() {
		return fpago;
	}
	public void setFpago(Date fpago) {
		this.fpago = fpago;
	}
	public String getCodalq() {
		return codalq;
	}
	public void setCodalq(String codalq) {
		this.codalq = codalq;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
}
