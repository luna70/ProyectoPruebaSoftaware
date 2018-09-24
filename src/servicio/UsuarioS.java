package servicio;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.Dato;
import modelo.Usuario;
@Service
public class UsuarioS extends Conector{
	
	@Autowired 
	PersonaS personaS;
	//DatoS datoS;
	
	public List<Map<String,Object>> listar(Integer estado){
		return db.queryForList("select * from usuarios u join personas p on u.ci=p.ci where estado=?",estado);
	}
	
	public void adicionar(Usuario u){
		personaS.adicionar(u);
		db.update("insert into usuarios(ci,fnac,email,foto,codrol) values(?,?,?,?,?)",u.getCi(),u.getFnac(),u.getEmail(),u.getFoto(),u.getCodrol());
	}
	
	public void modificar(Usuario u){
		personaS.modificar(u);
		db.update("update usuarios set (fnac,email,foto,codrol)=(?,?,?,?) where ci=?",u.getFnac(),u.getEmail(),u.getFoto(),u.getCodrol(),u.getCi());
	}
	
	public void eliminar(String ci){
		db.update("update usuarios set estado=0 where ci=?",ci);
	}
	 public Map<String,Object> ver(String ci){
		 return db.queryForMap("select * from usuarios u join personas p on u.ci=p.ci join rol r on r.codrol=u.codrol where u.ci=?",ci);
	 }
	 
	 public Map<String,Object> login(Dato d){
		 try{
			 return db.queryForMap("select * from usuarios u join personas p on p.ci=u.ci join datos d on u.ci=d.ci where d.login=? and d.clave=?",d.getLogin(),d.getClave()); 
		 }
		 catch(Exception e){
			 return null;
		 }
	 }
}
