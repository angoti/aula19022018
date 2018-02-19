public class Funcionario {
	String nome;
	double horasTrabalhadas, valorDaHora;
	
	double calcularSalario() {
		return horasTrabalhadas*valorDaHora;
	}
}
