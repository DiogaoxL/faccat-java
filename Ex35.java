package exerciciosfaccat;

public class Ex35 {

	public static void main(String[] args) {

		int litros_vendidos = 20;
		char tipo_combustivel = 'G';// A de alcool e G de gasolina
		double valor = 0;
		double valor_total = 0;
		
		if (tipo_combustivel == 'A') {
			  if (litros_vendidos <= 20) {
			    valor = litros_vendidos * 2.9;
			    valor_total = valor - (2.9 * 3) / 100;
			    System.out.println("o valor a ser pago é: " + valor);
			  }
			} else {
			  if (litros_vendidos > 20) {
			    valor = litros_vendidos * 2.9;
			    valor_total = valor - (2.9 * 5) / 100;
			    System.out.println("o valor a ser pago é:" + valor);
			  }
			}

		
			if (tipo_combustivel == 'G') {
			  if (litros_vendidos <= 20) {
			    valor = litros_vendidos * 3.30;
			    valor_total = valor - (3.30 * 4) / 100;
			    System.out.println("o valor a ser pago é: " + valor);
			  }
			} else {
			  if (litros_vendidos > 20) {
			    valor = litros_vendidos * 3.30;
			    valor_total = valor - (3.30 * 6) / 100;
			    System.out.println("o valor a ser pago é: " + valor);
			  }
			}
	}

}
