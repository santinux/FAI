/*
* RPA, TP # 3.2.
*
* Ejercicio # 2 <Préstamo Bancario>.
*
* Notación UpperCammelCase, Indentación 2, Java.
*
* Santino Fuentes, 2022.
******************************************************************************/

import java.util.Scanner;

public class Prestamo

{

	// Programa principal

	public static void main (String[] args)

	/*
	* El programa define el préstamo del cliente en función de su sueldo
	* y condición familiar
	*/

	{

	/*
	* Declaración de variables, clases, objetos, y sus tipos
	*/

	double Prestar;
	double Sueldo;
	String Tiene;
	String TieneFamilia;
	Scanner sc = new Scanner(System.in);

	Tiene = ("Si");

	System.out.println("¿Tiene usted familia?");
	TieneFamilia = sc.next();
	System.out.println("Ingrese el valor de su sueldo:\n");
	Sueldo = sc.nextDouble();

	if(TieneFamilia.equals(Tiene))
	{
		Prestar = (Sueldo * 0.25);
	}
	else
	{
		Prestar = (Sueldo * 0.50);
	}

	System.out.println("Asígnese al cliente un préstamo de: $" + Prestar);

	}

}
