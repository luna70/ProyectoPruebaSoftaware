package modelo;
import java.util.Date;
public class Usuario extends Persona{
	private String ci;
	private Date fnac;
	private String email;
	private String foto;
	private Integer estado;
	private Integer codrol;
	
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public Date getFnac() {
		return fnac;
	}
	public void setFnac(Date fnac) {
		this.fnac = fnac;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public Integer getCodrol() {
		return codrol;
	}
	public void setCodrol(Integer codrol) {
		this.codrol = codrol;
	}
	
}
