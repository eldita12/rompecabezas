/*
 * funciones a usarse por BusquedBFS para comprobar el algoritmo
 */
public class Tablero{
	
	
	/*
	 * Variables
	 */	
	int i,j, tamano, aux=0; 
	String[][] estadoFinal;
	String[][] estadoInicial;


	public Tablero(int tamano, String estadoIni, String estadoFin, Pos posicion){
		
		 this.tamano= tamano;  
		
		 estadoFinal= new String[tamano][tamano];
		 estadoInicial= new String[tamano][tamano];

			for ( i = 0; i < tamano; i++) {
		    	for ( j = 0;  j< tamano; j++) {
		    		
		    		String auxFin[]=estadoFin.split(",");  // Esto debido a que el split te crea un String[]
		    		String auxIni[]=estadoIni.split(",");
		        	
		    		estadoFinal[i][j] = auxFin[aux];//Aqu’ como ya le das un espacio espec’fico ya es un String
		        	estadoInicial[i][j] = auxIni[aux];// Por ende el mŽtodo parseInt funciona :) 
		        	
		        	aux++;
		    	}
			}

			
			imprimir(); 

	}

	//movimientos linkedList

	/*
	 * Funci—n que regresa un booleano, si un tablero es igual a otro regresa True, de lo contrario False
	 */
	//igual()
	
	
	/*
	 * Regresa el valor heuristico del tablero
	 */
	//h()
	
	
	/*
	 * Regresa la suma de h y el numero de movimientos (profunidad de arb—l)
	 */
	//f()
	
	/*
	 * Regresa un ArrayList de todos los hijos del tablero logrables por un movimiento 
	 */
	// hijos(){
		
	
	
	/*
	 * Imprime el estado actual del tablero que recibe
	 */
	public void imprimir(){
			
			System.out.println("Estado Inicial: ");
			for ( i = 0; i < tamano; i++) {
		    	for ( j = 0;  j< tamano; j++) {		 		
		        	System.out.print(" "+estadoInicial[i][j]); 
		    	}
		    	System.out.println("");
			}
			
			System.out.println("\nEstado Final:  ");
			for ( i = 0; i < tamano; i++) {
		    	for ( j = 0;  j< tamano; j++) {
		    		
		        	System.out.print(" "+estadoFinal[i][j]); 
		    	}
		    	System.out.println("");
			}


	}


}
