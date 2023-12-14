package exerciciosfaccat;

public class Ex10 {
	/*
	 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
	 * porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	 * Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
	 * escrever um algoritmo para ler o custo de fábrica de um carro, calcular e
	 * escrever o custo final ao consumidor.
	 */

	public static void main(String[] args) {

		int custo = 20000;

		float distribuidor = (custo * 28) / 100;
		float imposto = (custo * 45) / 100;
		float revenda = custo + distribuidor + imposto;
		
		System.out.print("O valor de revenda do carro é R$" + revenda);
	}
}
