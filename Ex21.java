package exerciciosfaccat;

/*
Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
*/

public class Ex21 {
	public static void main() {
		int comeco = 0;
		int fim = 48;
		
		int horas_jogadas = fim - comeco;
		
		if (horas_jogadas < 24) {
			  System.out.println("o jogo durou " + horas_jogadas + "hrs");
			} else {
			  if (horas_jogadas >= 24) {
				  System.out.println("o jogo durou " + horas_jogadas / 24 + " dias ");
				  System.out.println("O jogo pode tem no maximo 24hrs de duração");
			  }
			}
	}
}
