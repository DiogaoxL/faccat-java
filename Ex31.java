package exerciciosfaccat;

/*
Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
*/

public class Ex31 {
	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int c = 9;

		if (a < (b + c) && b < (a + c) && c < (a + b)) {
			System.out.println("triangulo existe!");
		} else {
			System.out.println("triangulo não existe!");
		}

	}
}
