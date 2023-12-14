package exerciciosfaccat;

public class Ex37 {

	public static void main(String[] args) {

		int kg_morango = 5;
		int kg_macas = 2;
		double valor_morango = 0;
		double valor_macas = 0;
		double total = 0;

		if (kg_morango <= 5) {
			valor_morango = kg_morango * 2.5;
		} else {
			if (kg_morango > 5) {
				valor_morango = kg_morango * 2.2;
			}

			if (kg_macas <= 5) {
				valor_macas = kg_macas * 1.8;
			} else {
				if (kg_macas > 5) {
					valor_macas = kg_macas * 1.5;
				}
			}

			total = valor_macas + valor_morango;

			if (kg_macas + kg_morango > 8 || total > 25) {
				total = total - ((total * 10) / 100);
			}

			System.out.println("O total a ser pago " + total);
		}

	}

}
