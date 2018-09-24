package modelo;

public class Detalle {
	private String coddet;
	private String code;
	private Integer cantidad;
	private Double preciounit;
	private Integer estropeados;
	private Integer restablecidos;
	private String codalq;
	private Integer estado;
	
	public String getCoddet() {
		return coddet;
	}
	public void setCoddet(String coddet) {
		this.coddet = coddet;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPreciounit() {
		return preciounit;
	}
	public void setPreciounit(Double preciounit) {
		this.preciounit = preciounit;
	}
	public Integer getEstropeados() {
		return estropeados;
	}
	public void setEstropeados(int estropeados) {
		this.estropeados = estropeados;
	}
	public int getRestablecidos() {
		return restablecidos;
	}
	public void setRestablecidos(int restablecidos) {
		this.restablecidos = restablecidos;
	}
	public String getCodalq() {
		return codalq;
	}
	public void setCodalq(String codalq) {
		this.codalq = codalq;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}