import java.util.Scanner;

public class TrabalhandoComNumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor1;
		int valor2;
		int soma;
		int sub;
		int divide;
		int multiplica;
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Por favor informe o primeiro valor");
		valor1 = leitor.nextInt();
		System.out.println("Por favor informe o segundo valor");
		valor2 = leitor.nextInt();
		soma = valor1 + valor2;
		System.out.println("Resultado da soma: " + soma);
		sub = valor1 - valor2;
		System.out.println("Resultado da subtração : " + sub);
		divide = valor1 / valor2;
		System.out.println("Resultado da divisão : " + divide);
		multiplica = valor1 * valor2;
		System.out.println("Resultado da multiplicação :" + multiplica);
				
	}

}
