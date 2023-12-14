package exerciciosfaccat;
import java.util.Scanner;

public class Ex13 {
	/*
	Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
	Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
	final é: 

	((n1*2)+(n2*3)+(n3*5))/ 10

	*/
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua primeira nota ");
		int n1 = sc.nextInt();
		System.out.print("Digite sua segunda nota ");
		int n2 = sc.nextInt();
		System.out.print("Digite sua terceira nota ");
		int n3 = sc.nextInt();
		
		
		float mediafinal = ((n1*2)+(n2*3)+(n3*5))/ 10;
		
		System.out.print("a media final foi " + mediafinal);
		
		
		sc.close();
	}
}
