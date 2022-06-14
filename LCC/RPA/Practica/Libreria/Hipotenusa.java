import java.lang.Math; 
public static double Hipotenusa(double Base, double Altura)
{
	double Hip;
	double Hipotenusa;
	Hip = Math.pow(Base) + Math.pow(Altura);
	Hipotenusa = Math.sqrt(Hip);
	return Hipotenusa;
}
