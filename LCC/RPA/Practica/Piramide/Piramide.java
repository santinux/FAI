import java.util.Scanner;
public class Piramide
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca numero de filas: ");
		int NroFilas = sc.nextInt();
		sc.close();

		System.out.println();
		int Altura;
		for (Altura = 1; Altura <= NroFilas; Altura++){
			int Esp;
			for (Esp = 1; Esp <= NroFilas - Altura; Esp++){
				System.out.print(" ");
			}

			int Star;
			for (Star = 1; Star <= (Altura * 2) - 1; Star++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
