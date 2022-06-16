//import Libreria
import java.util.Scanner;
public class VueltasLuces
{
	public static void main (String[] args)
	{
		final float LargoLuces = 20;
		double DiametroColumna;
		double RadioColumna;
		double Vueltas;
		Scanner sc = new Scanner(System.in);
		System.out.println("\tIngrese el diámetro de la columna: ");
		DiametroColumna = sc.nextDouble();
		RadioColumna = DiametroColumna / 2;
		PerimetroColumna = Perimetro(RadioColumna);
		PerimetroColumna = cmAm(PerimetroColumna);
		Vueltas = LargoLuces / Perimetro;
		System.out.println("Se puede dar " + Vueltas + " con una tira de luces.");
	}
}
