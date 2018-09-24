package modelo;
import java.util.Date;
public class ReservaAlquiler {
	private String codalq;
	private String ci;
	private Integer codp;
	private Date fecha;
	private Double monto;
	private Date fevento;
	private Date fenterga;
	private Date fdevolucion;
	private Integer confirmado;
	private Integer anulada;
	private String garantia;
	private Integer entregado;
	private Integer devuelto;
	private Integer tipo;
	private Integer estado;
	
	public String getCodalq() {
		return codalq;
	}
	public void setCodalq(String codalq) {
		this.codalq = codalq;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public Integer getCodp() {
		return codp;
	}
	public void setCodp(Integer codp) {
		this.codp = codp;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Date getFevento() {
		return fevento;
	}
	public void setFevento(Date fevento) {
		this.fevento = fevento;
	}
	public Date getFenterga() {
		return fenterga;
	}
	public void setFenterga(Date fenterga) {
		this.fenterga = fenterga;
	}
	public Date getFdevolucion() {
		return fdevolucion;
	}
	public void setFdevolucion(Date fdevolucion) {
		this.fdevolucion = fdevolucion;
	}
	public Integer getConfirmado() {
		return confirmado;
	}
	public void setConfirmado(Integer confirmado) {
		this.confirmado = confirmado;
	}
	public Integer getAnulada() {
		return anulada;
	}
	public void setAnulada(Integer anulada) {
		this.anulada = anulada;
	}
	public String getGarantia() {
		return garantia;
	}
	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}
	public Integer getEntregado() {
		return entregado;
	}
	public void setEntregado(Integer entregado) {
		this.entregado = entregado;
	}
	public Integer getDevuelto() {
		return devuelto;
	}
	public void setDevuelto(Integer devuelto) {
		this.devuelto = devuelto;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
}
