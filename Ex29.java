package exerciciosfaccat;

/*
Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
maiores. 
*/

public class Ex29 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 15;
		int n3 = 11;

		int maior = 0;
		int meio = 0;
		int menor = 0;

		if (n1 > n2 && n1 > n3) {
			maior = n1;
			if (n2 > n3) {
				meio = n2;
			} else {
				meio = n3;
			}
		} else if (n2 > n1 && n2 > n3) {
			maior = n2;
			if (n1 > n3) {
				meio = n1;
			} else {
				meio = n3;
			}
		} else {
			maior = n3;
			if (n1 > n2) {
				meio = n1;
			} else {
				meio = n2;
			}
		}
		System.out.println("o maior foi: " + maior);
		System.out.println("a soma dos maiores valores: " + (maior + meio));
	}
}
