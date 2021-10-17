package test;

import java.util.Scanner;

import modelo.entidad.Coche;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Coche coche1 = new Coche("5631ABC","Renault","Scenic",100000);
		Coche coche2 = new Coche("3356CHJ","Ssan Yong","Rodius",300000);
		Coche coche3 = new Coche("5631ABC","Seat","Ibiza",200000);
		
		
		System.out.println("¿Que deseas hacer?");
		System.out.println("--1 dar un coche de alta");
		System.out.println("--2 dar un coche de baja");
		System.out.println("--3 modificar un coche");
		System.out.println("--4 listar los coches");
		
		int opcion = teclado.nextInt();;
		
		
		switch (opcion) {
		case 1: {
			coche1.addCoche(coche1);
			break;
		}
		case 2: {
			coche1.delCoche(coche1);	
			break;
		}
		case 3: {
			coche1.modCoche(coche3);	
			break;
		}
		case 4: {
			coche1.listCoches(coche1);	
			break;
		}
		default:
			break;
		}
		

	
	}

}
