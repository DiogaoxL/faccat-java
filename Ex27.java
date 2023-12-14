package exerciciosfaccat;

/*
Ler um valor e escrever se é positivo, negativo ou zero.
*/

public class Ex27 {
	public static void main(String[] args) {
		int n = 0;

		if (n > 0) {
			System.out.println("positivo");
		} else {
			if (n < 0) {
				System.out.println("negativo");
			} else {
				if (n == 0) {
					System.out.println("zero positivo");
				}
			}

		}
	}
}