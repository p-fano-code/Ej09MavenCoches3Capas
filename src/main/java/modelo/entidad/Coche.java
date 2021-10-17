package modelo.entidad;

import java.util.List;

import modelo.negocio.GestorCoche;

public class Coche {

	private String matricula;
	private String marca;
	private String modelo;
	private int kilometros;

	public Coche() {
	}

	public Coche(String matricula, String marca, String modelo, int kilometros) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.kilometros = kilometros;
	}
	
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", kilometros="
				+ kilometros + "]";
	}

	public void addCoche(Coche coche1) {
		// TODO Auto-generated method stub
		GestorCoche gs = new GestorCoche();
		
		boolean alta = gs.alta(coche1);
		if(alta) {
			System.out.println("El coche se añadió correctamente");
		}else {
			System.out.println("Hubo un fallo al añadir el coche");
		}
		
	}
	
	public void delCoche(Coche coche) {
		
		GestorCoche gesCoche = new GestorCoche();
		
		boolean baja = gesCoche.baja(coche.matricula);
		if(baja){
			System.out.println("El coche se elimino correctamente");
		}else{
			System.out.println("Hubo un fallo al eliminar el coche");
		}
	}
	
	public void listCoches(Coche coche) {
		GestorCoche gs = new GestorCoche();
		coche = gs.obtener(coche.matricula);
		System.out.println(coche);
		
		System.out.println("****************");
		
		List<Coche> listaCoches = gs.listar();
		
		System.out.println(listaCoches);
	}
	
	public void modCoche(Coche coche) {
		
		GestorCoche gc = new GestorCoche();
		
		boolean modificar = gc.modificar(coche);
		if(modificar){
			System.out.println("El coche se modificó correctamente");
		}else{
			System.out.println("Hubo un fallo al modificar el coche");
		}
	}

	

}
