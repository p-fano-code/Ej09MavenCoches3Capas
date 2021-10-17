package modelo.persistencia.interfaces;

import java.util.List;

import modelo.entidad.Coche;

public interface DaoCoche {

	boolean alta(Coche c);
	boolean baja(String matricula);
	boolean modificar(Coche c);
	Coche obtener(String matricula);
	List <Coche> listar();
	
}
