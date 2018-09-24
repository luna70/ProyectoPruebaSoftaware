package modelo;

public class Cliente extends Persona{
	private String ci;
	private String nombreemp;
	private Integer nit;
	private String telfemp;
	private String emailemp;
	private String diremp;
	private Integer estado;
	
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getNombreemp() {
		return nombreemp;
	}
	public void setNombreemp(String nombreemp) {
		this.nombreemp = nombreemp;
	}
	public Integer getNit() {
		return nit;
	}
	public void setNit(Integer nit) {
		this.nit = nit;
	}
	public String getTelfemp() {
		return telfemp;
	}
	public void setTelfemp(String telfemp) {
		this.telfemp = telfemp;
	}
	public String getEmailemp() {
		return emailemp;
	}
	public void setEmailemp(String emailemp) {
		this.emailemp = emailemp;
	}
	public String getDiremp() {
		return diremp;
	}
	public void setDiremp(String diremp) {
		this.diremp = diremp;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
}
