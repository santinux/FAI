public static double Mayor(double Valor0, double Valor1)
{
	double MayorValor;
	if (Valor0 == Valor1)
	{
		MayorValor = 0;
	}
	else if (Valor0 < Valor1)
	{
		MayorValor = Valor1;
	}
	else
	{
		MayorValor = Valor0;
	}
	return MayorValor;
}
