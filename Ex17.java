package exerciciosfaccat;

/*
Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
aluno é aprovado). Escrever também a média calculada.
*/

public class Ex17 {
	public static void main(String[] args) {

		double n1 = 5;
		double n2 = 9;

		double media = (n1 + n2) / 2;

		if (media >= 6) {
			System.out.println("Parabens vc foi aprovado! Sua media foi " + media);
		} else {
			System.out.println("Parabens vc foi reprovado! Sua media foi " + media);
		}

	}
}
