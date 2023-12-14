package exerciciosfaccat;
import java.util.Scanner;

/*
Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
*/


public class Ex32 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		System.out.println("qual o nome do primeiro time? "); 
		String t1 = sc.nextLine();
		System.out.println("qual o nome do segundo time? "); 
		String t2 = sc.nextLine();

		System.out.println("Quantos gols marcou o " + t1); 
		int gol1 = sc.nextInt();
		System.out.println("Quantos gols marcou o " + t2); 
		int gol2 = sc.nextInt();

		if (gol1 > gol2) {
			System.out.println("O " + t1 + " venceu o jogo!");
		} else {
			if (gol1 < gol2) {
				System.out.println("O " + t2 + " venceu o jogo!");
			} else {
				System.out.println("o jogo empatou!");
			}
		}
		sc.close();
	}
}
