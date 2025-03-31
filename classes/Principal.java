package MetodoEstatico;

public class Principal {

	public static void main(String[] args) {
		double calculo1 = Circunferencia.area(3.0);
		double calculo2 = Circunferencia.volume(3.0);
		System.out.printf("%.2f \n", calculo1);
		System.out.printf("%.2f \n", calculo2);

	}

}
