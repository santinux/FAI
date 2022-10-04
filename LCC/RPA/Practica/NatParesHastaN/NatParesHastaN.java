import java.util.Scanner;
public class NatParesHastaN
{
	public static void main (String[] args)
	{
		int i;
		int N;
		int M;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Hasta qué número desea ver?: ");
		N = sc.nextInt();
		M = N / 2;
		for (i = 0; i <= M ; i++){
			System.out.print(2 * i + ",");
		}
	}
}
