import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Integer a = 0;
		Integer b = 0;
		Integer opcion;
		Integer resultado = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Ingrese su operación" + '\n' + "1 Para restar" + '\n' + "2 Para sumar " + '\n'
					+ "3 Para dividir" + '\n' + "4 Para multiplicar");

			opcion = teclado.nextInt();

		} while (opcion < 1 && opcion > 4);
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
	
		switch(opcion){
			case 1: resultado = a-b;
					break;
			case 2: resultado = a+b;
					break;
			case 3: resultado = a/b;
					break;
			case 4: resultado = a*b;
					break;
		}
		
		System.out.println("El resultado es " + resultado.toString());
	}
}
