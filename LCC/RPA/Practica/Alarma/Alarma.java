import java.util.Scanner;
public class Alarma
{
	public static void main(String[] args)
	{
		int clave;
		int contador;
		int claveIn;
		contador = 1;
		clave = 690105;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una contraseña para desactivar " +
					"la alarma: ");
		claveIn = sc.nextInt();
		while (claveIn != clave) {
			System.out.println("Contraseña incorrecta, inténtelo" +
						" otra vez: ");
			claveIn = sc.nextInt();
			contador = contador + 1;
		}
		System.out.println("Alarma desactivada. Cantidad de " +
					"intentos: " + contador);
	}
}
