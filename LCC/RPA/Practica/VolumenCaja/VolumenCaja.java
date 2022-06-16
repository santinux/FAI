//importar librería: Libreria
import java.util.Scanner;
/*
* Las medidas ingresadas son en cm, se trabaja en cm el volumen y luego 
* de llama el método conversor a m, PERO SOLO AL FINAL!
*/
public class VolumenCaja 
{
	public static void main (String[] args)
	{
		double AltoCaja;
		double AnchoCaja;
		double ProfundidadCaja;
		double VolumenCaja;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\tIngrese las medidas de la caja:");
		System.out.println("\nAlto: ");
		AltoCaja = sc.nextDouble();
		System.out.println("\nAncho: ");
		AnchoCaja = sc.nextDouble();
		System.out.println("\nProfundidad: ");
		ProfundidadCaja = sc.nextDouble();
		VolumenCaja = Volumen(AltoCaja, AnchoCaja, ProfundidadCaja);
		VolumenCaja = cmAm(VolumenCaja);
		System.out.println("El volumen de la caja es de: " + VolumenCaja + "m");
	}
}
