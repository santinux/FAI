import java.util.Scanner;
public class NatParesHastaN
{
	public static void main (String[] args)
	{
		int i;
		int P;
		double N;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Hasta qué número desea ver?: ");
		N = sc.nextDouble();
		for (i=1; i<=N; i++)
		{
			System.out.print(i + ",");
		}
	}
}

