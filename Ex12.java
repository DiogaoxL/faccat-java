package exerciciosfaccat;

public class Ex12 {

	/*
	 * Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e
	 * escrever o valor correspondente em graus Celsius.
	 * 
	 * Observação: Para testar se a sua resposta está correta saiba que 100oC = 212F
	 */

	public static void main(String[] args) {
		int fahrenheit = 50;
		float C = ((fahrenheit - 32) * 5) / 9;
		
		System.out.print(C + "°C");
	}
}
