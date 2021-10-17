package testing;

import java.util.List;

import org.junit.jupiter.api.Test;

import modelo.entidad.Coche;
import modelo.persistencia.interfaces.DaoCoche;

public class TestDao {
	
	@Test
	void test1() {
		DaoCoche dao = new DaoCoche() {
			
			public Coche obtener(String matricula) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public boolean modificar(Coche c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			public List<Coche> listar() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public boolean baja(String matricula) {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean alta(Coche c) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}
}
