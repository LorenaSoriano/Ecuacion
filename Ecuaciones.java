import java.util.Scanner;

public class Ecuaciones {
	public static void main (String[ ] args) {
		double dis;
		System.out.println("Sabiendo que la ecuación de segundo grado tiene 3 valores, y un discriminante, vamos a averiguar si tiene solución real");
		System.out.println("Si la tiene, resolveremos la ecuación");
		
		//Pedir meter a por pantalla
		System.out.println("Introduzca el valor de A");
		
		try (//introducir los valores por scanner
		Scanner sa = new Scanner(System.in)) {
			// Entrada de datos numéricos
	        int a = sa.nextInt();
	        
	      //Pedir meter b por pantalla
			System.out.print("Introduzca el valor de B");
			
			try (//introducir los valores por scanner
			Scanner sb = new Scanner(System.in)) {
				// Entrada de datos numéricos
		        int b = sb.nextInt();
		        
		     //Pedir meter c por pantalla
				System.out.print("Introduzca el valor de C");
				
			try (//introducir los valores por scanner
				Scanner sc = new Scanner(System.in)) {
					// Entrada de datos numéricos
			        int c = sc.nextInt();
			        
			        dis=Math.pow(b, 2)-4*a*c;
				}
			//Comprobamos si tiene o no solución
			        
			    if(dis>0 || dis==0) {
			    	
			    	System.out.println("Hay dos soluciones reales distintas");
			    	double x1=(-b-Math.sqrt(dis))/2;
			    	double x2=(-b+Math.sqrt(dis))/2;
			    	//Muestra los valores
			    	System.out.println("Solución 1: " +x1);
			    	System.out.println("Solución 2: " +x2);
			    	
			    		    	
			    	
			    }else {
			    	System.out.println("No hay soluciones reales");
			    		  }
			}
		}
			    
			        
	        
	}

}
