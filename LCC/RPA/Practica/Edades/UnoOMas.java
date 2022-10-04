import java.util.Scanner;
public class UnoOMas
{
	/*
	 * Obtiene la edad menor de uno o mas alumnos
	 */
	public static void main(String[] args)
	{
		int Edad, EdadMenor, CantAlumnos;
		String Respuesta;
		Scanner sc = new Scanner(System.in);
		CantAlumnos = 1;
		EdadMenor = 150;
		do {
			System.out.println("Ingrese la edad del alumno " +
						CantAlumnos + "\n");
			Edad = sc.nextInt();
			if (Edad < EdadMenor) {
				EdadMenor = Edad;
			}
			CantAlumnos = CantAlumnos + 1;
			System.out.println("¿Desea ingresar otra edad? " +
						"(s/n)\n");
			Respuesta = sc.next().trim().toLowerCase();
		} while (Respuesta.equals("s"));
		System.out.println("La edad menor es: " + EdadMenor);
	}
}
