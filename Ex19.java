package exerciciosfaccat;

/*
Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. 
*/

public class Ex19 {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 6;
		int maior = 0;
		int menor = 0;

		if (n1 > n2) {
			maior = n1;
			menor = n2;
		} else {
			maior = n2;
			menor = n1;
		}
		
		System.out.println("o maior é "+ maior+ " e o menor "+ menor);
	}
}
