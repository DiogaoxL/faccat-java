package exerciciosfaccat;

import java.util.Scanner;
/*
Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
*/

public class Ex38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha_certa = 9999;
		int codigo_certo = 1234;

		System.out.println("digite seu código: ");
		int cod_usuario = sc.nextInt();
		int senha = 0;

		if (cod_usuario == codigo_certo) {
			System.out.println("usuario correto!");
			System.out.println("Digite sua senha: ");
			senha = sc.nextInt();

			if (senha == senha_certa) {
				System.out.println("senha correta!");
			} else {
				System.out.println("senha incorreta!");
			}
		} else {
			System.out.println("Usuario invalido! tente novamente");
		}
		
		sc.close();

	}
}
