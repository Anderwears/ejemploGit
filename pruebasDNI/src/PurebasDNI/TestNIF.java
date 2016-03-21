package PurebasDNI;

import static org.junit.Assert.*;


import org.junit.Test;
import Dni.NIF;


public class TestNIF {
	private NIF nif = new NIF();
	
	

	@Test //Comprobamos que ocurre si usamos un numero negativo
	public void prueba1() {	
		assertEquals(' ', nif.calculaLetra("-68923708"));
	}
	
	@Test //Comprobamos que ocurre si usamos un numero mayor y menor a 8 cifras 
	public void prueba2() {	
		assertEquals(' ', nif.calculaLetra("92973464579382750243560893268923700000000000000000000000000000000000000000000000000000000000000000000000000000000000000098999999999999999999999999999999999999999999999988888888888888888888"));
		assertEquals(' ', nif.calculaLetra("92"));
	}
	
	@Test //Comprobamos que ocurre si el dni es completamente ceros
	public void prueba3() {	
		assertEquals(' ', nif.calculaLetra("00000000"));

	}
	
	@Test //Comprobamos que ocurre ponemos espacios en el dni
	public void prueba4() {	
		assertEquals('Z', nif.calculaLetra("12345678        "));
		assertEquals('Z', nif.calculaLetra("        12345678"));
		assertEquals('Z', nif.calculaLetra(" 1 2 3 4 5 6 7 8 "));

	}
	@Test //Comprobamos que ocurre si no se pone nada
	public void prueba5() {	
		assertEquals(' ', nif.calculaLetra("gyhfkfkuyuykkuyrkuyfguygfkuykuygfujygf ujygfu yuytytdyth ythdyte653 65v869jm«,"));
	

	}
	
	}
	

	
