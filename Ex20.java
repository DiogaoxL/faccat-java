package exerciciosfaccat;

public class Ex20 {
	public static void main(String[] args) {
		int n1 = 2;
		int n2 = 3;
		int maior = 0;
		int menor = 0;

		if (n1 > n2) {
			maior = n1;
			menor = n2;
		} else {
			maior = n2;
			menor = n1;
		}
		
		System.out.println("o menor é " + menor + " e o maior " +  maior);
	}
}
