package exerciciosfaccat;

/*
Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
estar em condições+ um dos seguintes requisitos deve ser satisfeito:
 - Ter no mínimo 65 anos de idade.
 - Ter trabalhado no mínimo 30 anos.
 - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano
de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
*/

public class Ex42 {

	public static void main(String[] args) {
		int codigo = 123;
		int nasc = 1960;
		int entrada_empresa = 1988;

		int idade = 2023 - nasc;
		int tempo_de_empresa = 2023 - entrada_empresa;

		if ((idade >= 65 && tempo_de_empresa >= 30) || (idade >= 60 && tempo_de_empresa >= 25)) {
			System.out.println("Requerer aposentadoria");
		} else {
			System.out.println(
					"Não requerer aposentadoria. Sua idade é " + idade + " e o tempo de empresa " + tempo_de_empresa);
		}
	}

}
