package aplicação;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.Conversor;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a cotação do Dolar: ");
		double cot = sc.nextDouble();
		
		System.out.println("digite o valor e Dólar: ");
		double dol = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em Reais: R$ %.2f%n",  Conversor.Conversao(cot, dol));
		

	}

}
