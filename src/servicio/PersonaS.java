package servicio;

import org.springframework.stereotype.Service;

import modelo.Persona;
@Service
public class PersonaS extends Conector{
	
	public void adicionar(Persona p){
		db.update("insert into personas(ci, nombre, ap, am, sexo, telef, dir) values(?,?,?,?,?,?,?)",
				p.getCi(), p.getNombre(), p.getAp(), p.getAm(),p.getSexo(), p.getTelef(),p.getDir());
	}
	public void modificar(Persona p){
		db.update("update personas set (nombre, ap, am, sexo, telef, dir)=(?,?,?,?,?,?) where ci=?", 
				p.getNombre(), p.getAp(), p.getAm(), p.getSexo(), p.getTelef(), p.getDir(),p.getCi());
	}

}
