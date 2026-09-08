package logica;

public abstract class Persona {
	protected double peso;
	protected int altura;
	protected int edad;
	
	public Persona(double peso, int altura, int edad) {
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
	
	public double getPeso() {
		return peso;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public abstract double TMB();
	
}
