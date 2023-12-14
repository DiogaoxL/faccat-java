package exerciciosfaccat;

//escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
//dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
//das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
//novo com a mulher mais velha.

public class Ex36 {

	public static void main(String[] args) {

		int h1 = 18;
		int h2 = 17;
		int homem_mais_velho = 0;
		int homem_mais_novo = 0;

		int m1 = 19;
		int m2 = 20;
		int mulher_mais_velha = 0;
		int mulher_mais_nova = 0;

		if (h1 > h2) {
			homem_mais_velho = h1;
			homem_mais_novo = h2;
		} else {
			homem_mais_velho = h2;
			homem_mais_novo = h1;
		}

		if (m1 > m2) {
			mulher_mais_velha = m1;
			mulher_mais_nova = m2;
		} else {
			mulher_mais_velha = m2;
			mulher_mais_nova = m1;
		}

		System.out.println("a soma das idades do homem mais velho com a mulher mais nova é "
				+ (homem_mais_velho + mulher_mais_nova));

		System.out.println("o produto das idades do homem mais novo com a mulher mais velha é "
				+ homem_mais_novo * mulher_mais_velha);

	}

}
