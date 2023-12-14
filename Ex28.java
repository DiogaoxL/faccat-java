package exerciciosfaccat;

/*
Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
*/ 

public class Ex28 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 15;
		int n3 = 11;

		int maior = 0;
		
		if (n1 > n2 && n1 > n3) {
			  maior = n1;
			} else {
			  if (n2 > n1 && n2 > n3) {
			    maior = n2;
			  } else{
			    if (n3 > n1 && n3 > n2) {
			      maior = n3;
			    }
			  }
			}
		
		System.out.println("o maior numero digitado foi: " + maior);
	}
}
