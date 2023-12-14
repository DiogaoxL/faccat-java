package exerciciosfaccat;

import java.util.Scanner;

public class Ex05 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numnero: ");
		int n1 = sc.nextInt();
		
		int antecessor = n1 - 1 ;
		
		System.out.print("seu antecessor é: " + antecessor);
		
		sc.close();
	}
	}

