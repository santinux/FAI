public static int ASegundos(int Horas, int Minutos, int Segundos)
{
	int Aux1;
	int Aux2;
	int Aux3;
	Aux1 = Horas * 3600;
	Aux2 = Minutos * 60;
	Aux3 = Aux1 + Aux2 + Segundos;
	return Aux3;
}
