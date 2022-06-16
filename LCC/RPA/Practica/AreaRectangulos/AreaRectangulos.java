import java.util.scanner;
public class AreaRectangulos
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double BaseR1;
		double BaseR2;
		double AlturaR1;
		double AlturaR2;
		double AreaR1;
		double AreaR2;
		double MayorArea;
		System.out.println("Ingrese las medidas del primer rectángulo:");
		System.out.println("\nBase: ");
		BaseR1 = sc.nextDouble();
		System.out.println("\nAltura: ");
		AlturaR1 = sc.nextDouble();
		System.out.println("Ingrese las medidas del segundo rectángulo:");
		System.out.println("\nBase: ");
		BaseR2 = sc.nextDouble();
		System.out.println("\nAltura: ");
		AlturaR2 = sc.nextDouble();
		AreaR1 = AreaRectangulo(AlturaR1, BaseR1);
		AreaR2 = AreaRectangulo(AlturaR2, BaseR2);
		MayorArea = Mayor(AreaR1, AreaR2);
		System.out.println("El área del primer rectángulo es: "+AreaR1);
		System.out.println("El área del segundo rectángulo es: "+AreaR2);
		System.out.println("El área mayor es: "+MayorArea);
	}
}
