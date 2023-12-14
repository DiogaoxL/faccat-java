package exerciciosfaccat;

import java.util.Scanner;

public class Ex08 {
	/*
	 * Escreva um algoritmo para ler o número total de eleitores de um município, o
	 * número de votos brancos, nulos e válidos. Calcular e escrever o percentual
	 * que cada um representa em relação ao total de eleitores.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o numero de votos do candidato A: ");
		int candidatoA = sc.nextInt();
		System.out.print("Qual o numero de votos do candidato B: ");
		int candidatoB = sc.nextInt();
		System.out.print("Qual o numero de votos do candidato C: ");
		int candidatoC = sc.nextInt();

		System.out.print("Qual o numero de votos nulos");
		int votos_nulos = sc.nextInt();
		System.out.print("Qual o numero de votos brancos");
		int votos_brancos = sc.nextInt();

		int votos_validos = candidatoA + candidatoB + candidatoC;
		int total_eleitores = votos_validos + votos_brancos + votos_nulos;

		float porc_tot_validos = (votos_validos * 100) / total_eleitores;
		float porc_tot_A = (candidatoA * 100) / total_eleitores;
		float porc_tot_B = (candidatoB * 100) / total_eleitores;
		float porc_tot_C = (candidatoC * 100) / total_eleitores;
		float porc_tot_nulos = (votos_nulos * 100) / total_eleitores;
		float brancos = (votos_brancos * 100) / total_eleitores;
		
		System.out.println("o número total de eleitores " + total_eleitores);
		System.out.println("o percentual correspondente de votos válidos em relação à quantidade de eleitores " + porc_tot_validos);
		System.out.println("o percentual correspondente de votos válidos do candidato A " + porc_tot_A );
		System.out.println("o percentual correspondente de votos válidos do candidato B " + porc_tot_B );
		System.out.println("o percentual correspondente de votos válidos do candidato C " + porc_tot_C );
		System.out.println("o percentual correspondente de votos nulos " + porc_tot_nulos) ;
		System.out.println("o percentual correspondente de votos em branco "+ brancos);
		
		sc.close();
	}
}
