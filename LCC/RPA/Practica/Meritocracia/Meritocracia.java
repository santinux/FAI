/*
* RPA, TP # 3.2.
*
* Ejercicio # 3 <Meritocracia>.
*
* Notación UpperCammelCase, Indentación 2, Java. 
*
* Santino Fuentes, 2022.
******************************************************************************/
/*
* El programa define el valor de un bono a cobrar por la persona ingresada,
* y si esta está habilitada para recibirlo.
*/

import java.util.Scanner;
public class Meritocracia
{
	// Programa principal
	public static void main (String[] args)
	{
		int Inasistencias;
		double Bono;
		String Nombre;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el nombre: ");
		Nombre = sc.next();
		System.out.println("Ingrese la cantidad de inasistencias: ");
		Inasistencias = sc.nextInt();
		if(Inasistencias <= 2)
		{
			Bono = 15000 - (Inasistencias * 500);
			System.out.println("A " + Nombre + 
			" le corresponde cobrar el bono por buena asistencia.\n" + 
			"Monto especial a percibir: $" + Bono + ".\n");
		}
		else
		{
			System.out.println("A " + Nombre + 
			" no le corresponde cobrar el bono por buena asistencia.\n");
		}
	}
}
