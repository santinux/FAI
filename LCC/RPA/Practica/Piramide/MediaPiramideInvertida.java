import java.util.Scanner;
public class MediaPiramideInvertida
{
	public static void main(String[] args)
	{
		int i;
		int j;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el número de filas: ");
		n = sc.nextInt();
		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
