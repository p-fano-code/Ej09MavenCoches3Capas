package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import modelo.entidad.Coche;
import modelo.negocio.GestorCoche;
import modelo.persistencia.CocheDaoMysql;
import modelo.persistencia.interfaces.DaoCoche;

public class TestNegocio {

	Coche c1 = new Coche("5634ABC","Peugeot","301",100000);
	GestorCoche ges = new GestorCoche();
	DaoCoche cocheDao = new CocheDaoMysql();
	
	@Test
	public void testAlta() {
		cocheDao.alta(c1);
		Coche comprobar = ges.obtener(c1.getMatricula());
		assertEquals(c1, comprobar);		
	}
	
	@Test 
	public void testBaja() {
		cocheDao.baja(c1.getMatricula());
		Coche comprobar = ges.obtener(c1.getMatricula());
		assertNull(comprobar);
	}
	
	@Test
	public void modificar() {
		Coche clon = new Coche("5634ABC","Doge","Charger",100000);
		c1.modCoche(clon);
		assertEquals(clon, c1);
	}
}
