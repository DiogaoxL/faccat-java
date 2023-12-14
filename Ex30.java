package exerciciosfaccat;

/*
Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
crescente. 
*/

public class Ex30 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 15;
		int n3 = 11;

		int maior = 0;
		int meio = 0;
		int menor = 0;

		if (n1 > n2 && n2 > n3) {
			maior = n1;
			meio = n2;
			menor = n3;
		} else {
			if (n2 > n1 && n1 > n3) {
				maior = n2;
				meio = n1;
				menor = n3;
			} else {
				if (n3 > n1 && n2 > n3) {
					maior = n2;
					meio = n3;
					menor = n1;
				} else {
					if (n3 > n1 && n2 > n1) {
						maior = n3;
						meio = n2;
						menor = n1;
					} else {
						if (n1 > n2 && n2 < n3) {
							maior = n3;
							meio = n1;
							menor = n2;
						}
					}
				}
			}
		}

		System.out.println("os valores em ordem crescente " + menor + " " + meio + " " + maior);
	}
}
