package servicio;

import java.util.Map;

import org.springframework.stereotype.Service;

import modelo.Dato;

@Service
public class DatoS extends Conector{
	
	public void adicionar(Dato d){
		db.update("insert into datos(ci, login, clave) values(?,?,?)",
				d.getCi(), d.getLogin(), d.getClave());
	}
	public void modificar(Dato d){
		db.update("update datos set (login, clave)=(?,?) where ci=?", 
				d.getLogin(), d.getClave());
	}
	public void eliminar(String ci){
		db.update("update datos set estado=0 where ci=?",ci);
	}
	 public Map<String,Object> ver(String ci){
		 return db.queryForMap("select * from datos where ci=?",ci);
	 }
}
