package exerciciosfaccat;

/*
As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
escreva o custo total da compra.
*/


public class Ex16 {
	
	public static void main(String [] args) {
		double apple = 5;
		double valor = 0;
		
		if(apple < 12) {
			valor= apple * 1.30;
		}else {
			if(apple >= 12) {
				valor = apple * 1;
			}
		}
		
		System.out.println("o valor total ficou " + valor );
		
	}
	
}
