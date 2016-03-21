package Dni;


public class NIF {
	
	
	//-------CAMPOS ----------
	
	private int numDni; 			//Numero del Dni
	private char letraDni; 			//letra del dni
	
	//--------CONSTRUCTOR---------
	
	public NIF (){
		
		numDni = 0;   
		letraDni = ' ';
	}
	
	//--- METODOS PUBLICOS
	
	/**
	 * Este método devuelve el numero del Dni
	 * @return el numero del Dni
	 */
	
	public int getDni() {
		return numDni;
	}
	
	/**
	 * Nos permite cambiar el número del Dni
	 * @param numDni el nuevo numero del DNI
	 */
	
	public void setDni(int numDni) {
		this.numDni = numDni;
	}

	
	/**
	 * Devuelve el numero del DNI y su letra
	 * @return el Dni completo
	 */
	
	public void mostrarNIF() {
		if (numDni == 0)
		{
			System.out.print("No has puesto ningun Dni");
		}
		
		else if ( cuentaCifras(numDni) < 8){
			String cadena = numDni +"";
			for (int i = 0 ; i < 8 - cuentaCifras(numDni); i++){
				cadena = "0" + cadena;
			}
				System.out.print(cadena + "-" + letraDni);
		}
		else {
			System.out.print(numDni + "-" + letraDni);
		}
	}
	
	/**
	 * Calcula la letra del dni
	 * @param numDni el numero del Dni
	 * @return La letra del Dni
	 */
	
	public char calculaLetra(String dni){
		return calculaLetra2(dni); 				
	}
	
	//-------------METODOS PRIVADOS----------------
	
	/**
	 * Calcula y devuelve la letra del Dni, se la entrega al metodo publico calcuLetra()
	 * @param el numero del Dni
	 * @return La letra del Dni
	 */
	private char calculaLetra2 (String dni)
	
	{
		
	 char letras []= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	 String[] numeros = dni.split(" ");
	 String auxiliar = "";
	 for(String numero : numeros) {
		 auxiliar += numero;
	 }
	 
	 if (auxiliar.length() != 8) { //que ocurre si tiene mas o menos de ocho cifras
		 return ' ';
	 }
	 
	 
	 
	 if (dni == "00000000") { //que ocurre si son todo ceros 
	 		 return ' ';
	 }
	 
	 
	 
	 int numeroDni = Integer.parseInt(auxiliar);
	 numeroDni = numeroDni % 23;
	 char letra = letras[numeroDni];
	 letraDni = letra;
	 return letra;
	}
	
	 /**
     * Devuelve la suma de las cifras del valor del número.
     * @param el número del que queremos saber las cifras
     * @return el número de cifras
     */
    private int cuentaCifras(long numero)
    {
        int totalCifras = 0;     //contador de cifras del numero
        while(numero > 0){ 
            totalCifras ++;    
            numero /= 10;   //Dividimos el numero entre 10 para bajar una posicion el número
        }
        return totalCifras;
    }
}
