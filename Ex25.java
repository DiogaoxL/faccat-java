package exerciciosfaccat;

/*
Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. 
*/

public class Ex25 {
	public static void main(String[] args) {
		double num_conta = 22425;
		double saldo = 5000;
		double debito = 8000;
		double credito = 5000;
		
		double saldo_atual = saldo - debito + credito;
		
		if (saldo_atual >= 0) {
			  System.out.println("O numero da conta " + num_conta +" Saldo positivo "  + saldo_atual);
			} else {
				System.out.println("O numero da conta " + num_conta + " Saldo negativo " + saldo_atual);
			}
	}
}
