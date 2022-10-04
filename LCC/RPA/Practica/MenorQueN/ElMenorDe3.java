import java.util.Scanner;
public class ElMenorDe3
{
	public static double Menor(double Valor0, double Valor1, double Valor2)
	{
		double MenorValor = 0;
		if (Valor0 == Valor1 && Valor0 == Valor2 && Valor1 == Valor2)
		{
			MenorValor = 0;
		}
		else if (Valor0 < Valor1 && Valor0 < Valor2)
		{
			MenorValor = Valor0;
		}
		else if (Valor1 < Valor0 && Valor1 < Valor2)
		{
			MenorValor = Valor1;
		}
		else if (Valor2 < Valor0 && Valor2 < Valor1)
		{
			MenorValor = Valor2;
		}
		return MenorValor;
	}
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double Num0;
		double Num1;
		double Num2;
		double MenorNum;
		System.out.println("Ingrese un número:");
		Num0 = sc.nextDouble();
		System.out.println("Ingrese un número:");
		Num1 = sc.nextDouble();
		System.out.println("Ingrese un número:");
		Num2 = sc.nextDouble();
		MenorNum = Menor(Num0, Num1, Num2);
		System.out.println("El menor de los números es: "+MenorNum);
	}
}
