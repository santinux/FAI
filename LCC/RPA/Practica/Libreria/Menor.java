/*
* PROBLEMA!
* Cuando se introducen 2 números iguales.
*/
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
