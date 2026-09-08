package presentacion;

import logica.Persona;
import logica.Hombre;
import logica.Mujer;

public class Principal {
	
	public Principal() {
		Persona p;
		p = new Hombre(60, 170, 21);
		System.out.println("Tasa metabolica basal (TMB) para hombre con Peso: 60, Altura: 170 y Edad:21");
		System.out.println(p.TMB());

		p = new Mujer(70, 180, 29);
		System.out.println("Tasa metabolica basal (TMB) para mujer con Peso: 70, Altura: 180 y Edad:29");
		System.out.println(p.TMB());
		
		System.out.println("\nCasos de prueba para error:");
		System.out.println("\nCaso de datos invalidos para Hombre. Intentamos calcular el (TMB) para hombre con Peso: 70, Altura: 175, y Edad: 15.\nEl resultado es: ");
		p = new Hombre(70, 175, 15);
		System.out.println(p.TMB());
		System.out.println("Manejamos el error (Edad debe ser mayor a 15 años) retornando 0, pues el TMB nunca puede ser 0.");

		System.out.println("\nCaso de datos invalidos para Mujer. Intentamos calcular el (TMB) para mujer con Peso: 50, Altura: 160, y Edad: 15.\nEl resultado es: ");
		p = new Mujer(50, 160, 15);
		System.out.println(p.TMB());
		System.out.println("Manejamos el error (Edad debe ser mayor a 15 años) retornando 0, pues el TMB nunca puede ser 0.");

	}
	
	
	public static void main(String[] args) {
		new Principal();
	}
}
