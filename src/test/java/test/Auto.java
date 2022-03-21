
package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	 public static int cantidadCreados;
	    
	    
	    int cantidadAsientos() {
	    	int a = 0;
	    	for (int i = 0; i < asientos.length; i++) {
	    		if (asientos[i] != null) {
	    			a++;
	    		}
			}
	    	return a;
	    }
	
	public String verificarIntegridad() {
		int a = asientos.length;
		int b=0;
		for (int i = 0; i < asientos.length; i++) {
			
			if(asientos[i].registro == motor.registro &&  asientos[i].registro == this.registro) {
				b++;
			}
			else
				break;
		}
		if(a == b)
			System.out.println("Auto original");
		else
			System.out.println("Laz piezas no son originales");
    }
}
