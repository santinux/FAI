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
	public static void main (String[] args)
	{
		double LitrosCarg;
		double PrecioFinal;
		double PBruto;
		String TipoComb;
		String EsSocio;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el tipo de combustible a cargar:\n");
		TipoComb = sc.next();
		System.out.println("Ingrese la cantidad de litros a cargar:\n");
		LitrosCarg = sc.nextDouble();
		System.out.println("Es socio del Automóvil Club Argentino? 'Si'/'No'");
		EsSocio = sc.next();
		PBruto = CalculoPrecio(TipoComb, LitrosCarg);
		if(EsSocio.equals("Si")
		{
			PrecioFinal = (PBruto * 0.95);
		}
		else
		{
			PrecioFinal = PBruto;
		}
	}
}

