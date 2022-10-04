import java.util.Scanner;
public class NaturalesHastaN
{
	public static void main (String[] args)
	{
		int N = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Hasta qué numero desea ver?: ");
		N = sc.nextInt();
		for (int i=1; i<=N; i++){
			System.out.print(i + ",");
		}
	}
}
