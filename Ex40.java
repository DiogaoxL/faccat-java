package exerciciosfaccat;

public class Ex40 {

	public static void main(String[] args) {
		String nome = "bolacha";
		int quantidade = 5;
		double valor_und = 2.5;

		double total = valor_und * quantidade;

		double valor_a_pagar = 0;

		if (quantidade <= 5) {
			valor_a_pagar = total - (total * 2) / 100;
		} else {
			if (quantidade > 5 && quantidade <= 10) {
				valor_a_pagar = total - (total * 3) / 100;
			} else {
				valor_a_pagar = total - (total * 5) / 100;
			}
		}

		System.out.println("Voce comprou " + quantidade + " und de " + nome );
		System.out.println("O valor unitario de: " + valor_und);
		System.out.println("O total a ser pago é " + valor_a_pagar);
	}

}
