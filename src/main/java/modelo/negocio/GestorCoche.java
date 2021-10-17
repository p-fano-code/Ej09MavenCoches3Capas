package modelo.negocio;

import java.util.List;

import modelo.entidad.Coche;
import modelo.persistencia.CocheDaoMysql;
import modelo.persistencia.interfaces.DaoCoche;

public class GestorCoche {

	DaoCoche cocheDao = new CocheDaoMysql();
	
	public boolean alta(Coche c){
		//aplicamos la regla de negocio
		if(c.getMatricula().length() == 7 &&
		   c.getMatricula().length() > 0 &&
		   c.getMarca().length() > 0 &&
		   c.getModelo().length() > 0) {
			
			boolean alta = cocheDao.alta(c);
			return alta;
		}
		return false;
	}
	
	public boolean baja(String matricula){
		boolean baja = cocheDao.baja(matricula);
		return baja;
	}
	
	public boolean modificar(Coche c){
		//aplicamos la regla de negocio
		if(c.getMatricula().length() == 7 &&
				   c.getMatricula().length() > 0 &&
				   c.getMarca().length() > 0 &&
				   c.getModelo().length() > 0) {
			
			boolean modificada = cocheDao.modificar(c);
			return modificada;
		}
		return false;
	}
	
	public Coche obtener(String matricula){
		Coche coche = cocheDao.obtener(matricula);
		return coche;
	}
	
	public List<Coche> listar(){
		List<Coche> listaCoche = cocheDao.listar();
		return listaCoche;
	}
	
}
