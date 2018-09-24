package servicio;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.Cliente;
@Service
public class ClienteS extends Conector{
	
	@Autowired 
	PersonaS personaS;
	
	public List<Map<String,Object>> listar(Integer estado){
		return db.queryForList("select * from clientes c join personas p on c.ci=p.ci where estado=?",estado);
	}
	public void adicionar(Cliente c){
		personaS.adicionar(c);
		db.update("insert into clientes(ci, nombreemp, nit, telfemp, emailemp, diremp) values(?,?,?,?,?,?)",
				c.getCi(), c.getNombreemp(), c.getNit(), c.getTelfemp(),c.getEmailemp(), c.getDiremp());
	}
	public void modificar(Cliente c){
		personaS.modificar(c);
		db.update("update clientes set (nombreemp, nit, telfemp, emailemp, diremp)=(?,?,?,?,?) where ci=?", 
				c.getNombreemp(), c.getNit(), c.getTelfemp(), c.getEmailemp(), c.getDiremp());
	}
	public void eliminar(String ci){
		db.update("update clientes set estado=0 where ci=?",ci);
	}
	 public Map<String,Object> ver(String ci){
		 return db.queryForMap("select * from clientes where ci=?",ci);
	 }
}
