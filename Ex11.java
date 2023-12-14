package exerciciosfaccat;

public class Ex11 {
	/*
	 * Uma revendedora de carros usados paga a seus funcionários vendedores um
	 * salário fixo por mês, mais uma comissão também fixa para cada carro vendido e
	 * mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia
	 * o número de carros por ele vendidos, o valor total de suas vendas, o salário
	 * fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário
	 * final do vendedor.
	 */
	public static void main(String[] args) {
		int vendas_carro = 2;
		int tot_vendas = 20000;
		int salario_fixo = 5000;

		int qnt_de_porc = vendas_carro * 5;
		float comissao = (tot_vendas * qnt_de_porc) / 100;
		float novo_salario = salario_fixo + comissao;
		
		System.out.print("o seu salario esse mês foi de: " + novo_salario);
	}
}
