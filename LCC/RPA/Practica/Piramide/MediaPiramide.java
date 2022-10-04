import java.util.Scanner;
public class MediaPiramide
{
	public static void main(String[] args)
	{
		int i;
		int j;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de filas de la " +
				"pirámide : ");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
