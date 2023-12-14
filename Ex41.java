package exerciciosfaccat;

public class Ex41 {

	public static void main(String[] args) {
		int n1 = 8;
		int n2 = 9;
		int n3 = 10;

		double media_exercicios = 10;

		double media_de_aproveitamento = (n1 + n2 * 2 + n3 * 3 + media_exercicios) / 7;

		if (media_de_aproveitamento >= 9) {
			System.out.println('A');
		}

		if (media_de_aproveitamento >= 7.5 && media_de_aproveitamento < 9) {
			System.out.println('B');
		}

		if (media_de_aproveitamento >= 6 && media_de_aproveitamento < 7.5) {
			System.out.println('C');
		}

		if (media_de_aproveitamento < 6) {
			System.out.println('D');
		}

	}

}
