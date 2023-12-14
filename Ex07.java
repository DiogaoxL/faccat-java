package exerciciosfaccat;
import java.util.Scanner;

public class Ex07 {
	//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
	//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		int idade = sc.nextInt();
		
		int meses = idade * 12;
		int dias = idade * 365;
		
		System.out.print("voce tem " + idade + " anos " + meses + " meses " + dias + " dias" );
		
		sc.close();
	}
}
