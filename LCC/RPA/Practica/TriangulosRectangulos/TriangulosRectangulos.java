//Importar: Libreria (Esta contiene los módulos necesarios para el programa)
import java.util.Scanner;
public class TriangulosRectangulos
{
	{
		Scanner sc = new Scanner(System.in);
		double BaseT1;
		double BaseT2;
		double AlturaT1;
		double AlturaT2;
		System.out.println("Ingrese las medidas del primer triángulo:");
		System.out.println("\nBase: ");
		BaseT1 = sc.nextDouble();
		System.out.println("\nAltura: ");
		AlturaT1 = sc.nextDouble();
		System.out.println("Ingrese las medidas del segundo triángulo:");
		System.out.println("\nBase: ");
		BaseT2 = sc.nextDouble();
		System.out.println("\nAltura: ");
		AlturaT2 = sc.nextDouble();
		HipotenusaT1 = Hipotenusa(Base1, Altura1);
		HipotenusaT2 = Hipotenusa(Base2, Altura2);
		cmHip1 = mAcm(HipotenusaT2);
		cmHip2 = mAcm(HipotenusaT2);
		HMayor = Mayor(HipotenusaT1, HipotenusaT2);
		System.out.println("\nLa hipotenusa del primer triángulo mide "+cmHip1);
		System.out.println("\nLa hipotenusa del segundo triángulo mide "+cmHip2);
		System.out.println("\nLa hipotenusa mayor es: "+HMayor);
	}
}
