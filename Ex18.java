package exerciciosfaccat;

/*
Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). 
*/

public class Ex18 {

	public static void main(String[] args) {

		int ano_atual = 2023;
		int ano_nasc = 2000;
		
		int idade = ano_atual - ano_nasc;
		
		
		if (idade >= 16 && idade < 17) {
			  System.out.println("Voto opcional");
			} else {
			  if (idade >= 18) {
				  System.out.println("Voto Obrigatório");
			  } else{
				  System.out.println("não vota!");
			  }
			}

	}

}
