//importar Libreria (el método "Descuento" se encuentra en ella)
import java.util.Scanner;
public class Promocion
{
	public static void main (String[] args)
	{
		int CantidadP1;
		int CantidadP2;
		double PrecioUnitP1;
		double PrecioUnitP2;
		double PrecioBrutoP1;
		double PrecioBrutoP2;
		double PrecioBrutoTot;
		double PrecioNetoTot;
		System.out.println("\n\tDatos primer producto");
		System.out.println("\nIngrese el precio unitario del primer producto: ");
		PrecioUnitP1 = sc.next();
		System.out.println("\nIngrese la cantidad de productos comprados: ");
		CantidadP1 = sc.nextInt();
		System.out.println("\n\tDatos segundo producto");
		System.out.println("\nIngrese el precio unitario del segundo producto: ");
		PrecioUnitP2 = sc.next();
		System.out.println("\nIngrese la cantidad de productos comprados: ");
		CantidadP2 = sc.nextInt();
		PrecioBrutoP1 = PrecioUnitP1 * CantidadP1;
		PrecioBrutoP2 = PrecioUnitP2 * CantidadP2;
		PrecioBrutoTot = PrecioBrutoP1 + PrecioBrutoP2;
		PrecioNetoTot = Descuento(25, PrecioBrutoTot);
		System.out.println("\nEl precio neto a pagar por el cliente es de: $"
				+ PrecioNetoTot);
	}
}
