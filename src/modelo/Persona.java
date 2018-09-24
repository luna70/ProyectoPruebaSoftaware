package modelo;
//import java.text.SimpleDateFormat;
import java.util.Date;
public class Persona {
		private String ci;
		private String nombre;
		private String ap;
		private String am;
		private String sexo;
		private String telef;
		private String dir;
		private Date freg;
		
		public String getCi() {
			return ci;
		}
		public void setCi(String ci) {
			this.ci = ci;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getAp() {
			return ap;
		}
		public void setAp(String ap) {
			this.ap = ap;
		}
		public String getAm() {
			return am;
		}
		public void setAm(String am) {
			this.am = am;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public String getTelef() {
			return telef;
		}
		public void setTelef(String telef) {
			this.telef = telef;
		}
		public String getDir() {
			return dir;
		}
		public void setDir(String dir) {
			this.dir = dir;
		}
		public Date getFreg() {
			return freg;
		}
		public void setFreg(Date freg) {
			this.freg = freg;
		}
		
}
