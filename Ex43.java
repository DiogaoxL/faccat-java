package exerciciosfaccat;

public class Ex43 {

	public static void main(String[] args) {
		int a = 4;
		int b = 4;
		int c = 4;

		String mens = "";

		if (a < b + c && b < a + c && c < a + b) {
			if (a == b && b == c) {
				mens = "Triângulo Equilátero";
			} else {
				if (a == b && b == c && a == c) {
					mens = "riângulo Isósceles";
				} else {
					mens = "Triângulo Escaleno";
				}
			}
		} else {
			mens = "Não e possível formar um triângulo";
		}

		System.out.println(mens);

		// teste de mesa
		// a | b | c | mensagem

		// 1 | 2 | 3 | Não e possível formar um triângulo
		// 3 | 4 | 5 | Triângulo Escaleno
		// 2 | 2 | 4 | Não e possível formar um triângulo
		// 4 | 4 | 4 | Triângulo Equilátero
		// 5 | 3 | 3 | Triângulo Isósceles
	}

}
