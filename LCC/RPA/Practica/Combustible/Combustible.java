/*
* RPA, TP # 3.2.
*
* Ejercicio # 4 <Combustible>.
*
* Notación UpperCammelCase, Indentación 2, Java. 
*
* Santino Fuentes, 2022.
******************************************************************************/

// Programa principal

import java.util.Scanner;

public class Combustible
{
	public static double CalculoPrecio(int Tipo, double Litros)
	{
		double AsignaPrecio;
		double PrecioBruto;
		switch (Tipo) {
		case 1 : // NaftaSuper 
			AsignaPrecio = 110.49;
			break;
		case 2 : // NaftaPremium 
			AsignaPrecio = 120.99;
			break;
		case 3 : // Diesel500
			AsignaPrecio = 125.12;
			break;
		default :
			AsignaPrecio = 0;
		}
		PrecioBruto = AsignaPrecio * Litros;
		return PrecioBruto;
	}
	public static void ListaCombustibles()
	{
		System.out.println("1) Nafta Super.");
		System.out.println("2) Nafta Premium.");
		System.out.println("3) Diesel 500.");
	}
	public static void main (String[] args)
	{
		double LitrosCarg;
		double PrecioFinal;
		double PBruto;
		int TipoComb;
		String EsSocio;
		Scanner sc = new Scanner(System.in);

		ListaCombustibles();
		System.out.println("Ingrese el tipo de combustible a " +
					"cargar:\n");
		TipoComb = sc.nextInt();
		System.out.println("Ingrese la cantidad de litros a "
					+ "cargar:\n");
		LitrosCarg = sc.nextDouble();
		System.out.println("Es socio del Automóvil Club Argentino? " +
					"(Si/No)");
		EsSocio = sc.next();
		PBruto = CalculoPrecio(TipoComb, LitrosCarg);
		if (EsSocio.equals("Si")) {
			PrecioFinal = (PBruto * 0.95);
		} else {
			PrecioFinal = PBruto;
		}
		System.out.println("El monto a abonar es: $" + PrecioFinal);
	}
}
