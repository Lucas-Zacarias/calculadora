import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Integer a = 0;
		Integer b = 0;
		Integer opcion = 0;
		Integer resultado = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese su operaciÃ³n" + '\n' + "1 Para restar" + '\n' + "2 Para sumar " + '\n'
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
				case 3: resultado = dividir(a,b);
						break;
				case 4: resultado = multiplicar(a,b);
						break;
						
			}System.out.println("El resultado es " + resultado.toString());
			}else
			{
				System.out.println("Opción no válida");
			}
		
		}

	private static Integer multiplicar(Integer primerNumero, Integer segundoNumero){
	        Integer suma = new Integer(primerNumero*segundoNumero);
	        return suma;
}

	private static Integer dividir(Integer primerNumero, Integer segundoNumero){
	Integer division=0;
	if(segundoNumero!=0){
		 division = new Integer (primerNumero/segundoNumero);	
	}
	return division;	
		
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

