import java.util.Scanner;
public class CeroOMas
{
	public static void main(String[] args)
	{
		int Edad; // edad ingresada
		int EdadMenor = 150; // edad para comparar
		int CantAlumnos = 1; // variable contadora
		String Respuesta;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Desea ingresar la edad de un alumno? " +
					"(s/n)\n");
		Respuesta = sc.next().trim().toLowerCase();
		while (Respuesta.equals("s")) {
			System.out.println("Ingrese la edad del alumno " +
						CantAlumnos + "\n");
			Edad = sc.nextInt();
			if (Edad < EdadMenor) {
				EdadMenor = Edad;
			}
			System.out.println("¿Desea ingresar otra edad?" +
						"(s/n)\n");
			Respuesta = sc.next().trim().toLowerCase();
			CantAlumnos = CantAlumnos + 1;
		}
		System.out.println("La edad menor es: " + EdadMenor);
	}
}
