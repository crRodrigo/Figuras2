package figuras;

public class Rectangulo {
	
	double alto, ancho;

	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}	
	
	public double getPerimetro() {
		return this.alto * 2 + this.ancho * 2;
	}
}
