import java.util.Scanner;
public class CantDeterm
{
	public static void main(String[] args)
	{
		int edad; // edad ingresada
		int edadMenor; // menor de las ingrsadas
		int cantAlumnos; // límite superior
		int i; // variable iteradora
		edadMenor = 150; // se asigna un número para comparar
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de alumnos:\n");
		cantAlumnos = sc.nextInt();
		if (cantAlumnos > 0) {
			for (i = 1; i <= cantAlumnos; i++) {
				System.out.println("Ingrese la edad del " +
						"alumno " + i);
				edad = sc.nextInt();
				if (edad < edadMenor) {
					edadMenor = edad;
				}
			}
			System.out.println("La edad menor es: " + edadMenor);
		} else if (cantAlumnos == 0) {
			System.out.print("¿No hay alumnos?");
		} else {
			System.out.print("Por favor, ingrese un nro positivo");
		}
	}
}
