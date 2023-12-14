package exerciciosfaccat;

/*
Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
compra'. 
*/


public class Ex26 {
	public static void main(String[] args) {
		int qnt_atual = 11;
		int qnt_maxima = 10;
		int qnt_minima = 2;

		int qnt_media = (qnt_maxima + qnt_minima) / 2;

		if (qnt_atual >= qnt_media) {
			System.out.println("Não efetuar compra");
		} else {
			System.out.println("efetuar compra");
		}

	}
}
