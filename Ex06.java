package exerciciosfaccat;
import java.util.Scanner;

public class Ex06 {
	// Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
	//área do retângulo. 
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a base do retangulo: ");
		int base = sc.nextInt();
		
		System.out.println("Qual a base do altura: ");
		int altura = sc.nextInt();
		
		int area = base * altura ;
		
		System.out.print("a area do retangulo: " + area);
		
		sc.close();
	}
}
