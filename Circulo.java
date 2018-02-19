public class Circulo {
	int raio;
	
	double calcularArea() {
		return raio*raio*Math.PI;
	}
	
	double calcularPerimetro() {
		return 2*raio*Math.PI;
	}
}
