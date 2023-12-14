package exerciciosfaccat;

public class Ex22 {
	public static void main(String[] args) {
		double tempo_mensal = 180;
		double tempo_diario = 8;

		double salario_normal = tempo_mensal * tempo_diario;
		double horas_semanais = tempo_mensal / 4;

		double hora_extra = 0;
		double salario_extra = 0;
		double novo_salario = 0;

		if (horas_semanais > 40) {
			hora_extra = (tempo_diario * 50) / 100 + tempo_diario;

			salario_extra = horas_semanais * hora_extra;
			novo_salario = salario_extra + salario_normal;

			System.out.println("você trabalhou " + horas_semanais + " horas semanais ");
			System.out.println("entao recebera " + salario_extra + " a mais esse mês");
			System.out.println("seu novo salario ficara R$" + novo_salario);
		} else {
			System.out.println("você trabalhou " + horas_semanais + " horas semanais ");
			System.out.println("seu salario ficara R$" + salario_normal);
		}
	}
}
