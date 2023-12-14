package exerciciosfaccat;

public class Ex09 {
	// Escreva um algoritmo para ler o salário mensal atual de um funcionário e o
	// percentual de reajuste.
	// Calcular e escrever o valor do novo salário.
	public static void main(String [] args) {
		int sa = 1200;
		int reajuste = 20;
		
		float nv = ((sa * reajuste) / 100) + sa;
		
		System.out.print("seu novo salario foi de: " + nv);
	}
}
