import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Integer a = 0;
		Integer b = 0;
		Integer opcion = 0;
		Integer resultado = 0;

		Scanner teclado = new Scanner(System.in);

		/*do {
			System.out.println("Ingrese su operaci√≥n" + '\n' + "1 Para restar" + '\n' + "2 Para sumar " + '\n'
					+ "3 Para dividir" + '\n' + "4 Para multiplicar");

			opcion = teclado.nextInt();

		} while (opcion < 1 && opcion > 4);
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();

		switch(opcion){
			case 1: resultado = resta(a,b);
					break;
			case 2: resultado = suma(a,b);
					break;
			case 3: resultado = a/b;
					break;
			case 4: resultado = a*b;
					break;
					
		}*/
		System.out.println("Ingrese su operaci√≥n" + '\n' + "1 Para restar" + '\n' + "2 Para sumar " + '\n'
				+ "3 Para dividir" + '\n' + "4 Para multiplicar");

		opcion = teclado.nextInt();
		if(opcion >= 1 && opcion <=4) {
			System.out.println("Ingrese el primer numero");
			a = teclado.nextInt();
			System.out.println("Ingrese el segundo numero");
			b = teclado.nextInt();

			switch(opcion){
				case 1: resultado = resta(a,b);
						break;
				case 2: resultado = suma(a,b);
						break;
				case 3: resultado = a/b;
						break;
				case 4: resultado = a*b;
						break;
						
			}System.out.println("El resultado es " + resultado.toString());
			}else
			{
				System.out.println("OpciÛn no v·lida");
			}
		
		
		//System.out.println("El resultado es " + resultado.toString());
	}
	
	private static Integer suma (Integer nro1,Integer nro2) {
		Integer suma = new Integer(nro1+nro2);
		return suma; 
	}
	private static Integer resta(Integer nro1, Integer nro2) {
		Integer resta = new Integer(nro1-nro2);
		return resta; 
	}
}
