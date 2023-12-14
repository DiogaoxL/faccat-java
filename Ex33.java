package exerciciosfaccat;

/*
Ler dois valores e imprimir uma das três mensagens a seguir:
‘Números iguais’, caso os números sejam iguais
‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
‘Segundo maior’, caso o segundo seja maior que o primeiro. 
*/

public class Ex33 {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 4;

		if (n1 == n2) {
			System.out.println("numeros iguais");
		} else {
			if (n1 > n2) {
				System.out.println("Primeiro é maior");
			} else {
				System.out.println("Segundo maior");
			}
		}
		
		
		
	}
}
