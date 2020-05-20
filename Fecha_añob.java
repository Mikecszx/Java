import java.util.Scanner;
public class Fecha_añob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
int a,b,c,d,e,m,x;

System.out.println("Introduzca el dia");
d=teclado.nextInt();
System.out.println("Introduzca el mes del 1 al 12 ");
m=teclado.nextInt();
System.out.println("Introduza el año");
a=teclado.nextInt();
if (d>=1 && d<=30)
System.out.println("Dia correcto");
else 
System.out.println("Dia incorecto");


if (m>=1 && d<=12) {
System.out.println("Mes correcto");
	switch(m)
	{
	case 1:
		System.out.println("El mes tiene 31 dias ");
		if (a!=0) {
			System.out.println("El año es correcto");

				if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				System.out.println("El año es bisiesto ");
				else
				System.out.println("El año no es bisiesto ");
			}
			else
			System.out.println("El año es incorrecto");
		break;
	case 2:
		if (a!=0) {
			System.out.println("El año es correcto");

				if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				System.out.println("El año es bisiesto y el mes tiene 29 dias");
				else
				System.out.println("El año no es bisiesto y el mes tiene 28 dias");
			}
			else
			System.out.println("El año es incorrecto");
		break;
	case 3:
		System.out.println("El mes tiene 31 dias");
		if (a!=0) {
			System.out.println("El año es correcto");

				if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				System.out.println("El año es bisiesto ");
				else
				System.out.println("El año no es bisiesto ");
			}
			else
			System.out.println("El año es incorrecto");
		break;
	case 4:
		System.out.println("El mes tiene 30 dias");
		if (a!=0) {
			System.out.println("El año es correcto");

				if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				System.out.println("El año es bisiesto");
				else
				System.out.println("El año no es bisiesto ");
			}
			else
			System.out.println("El año es incorrecto");
		break;
	case 5: 
		System.out.println("El mes tiene 31 dias");
		if (a!=0) {
			System.out.println("El año es correcto");

				if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				System.out.println("El año es bisiesto");
				else
				System.out.println("El año no es bisiesto ");
			}
			else
			System.out.println("El año es incorrecto");
		break;
	case 6:
		System.out.println("El mes tiene 30 dias");
		if (a!=0) {
			System.out.println("El año es correcto");

				if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				System.out.println("El año es bisiesto");
				else
				System.out.println("El año no es bisiesto ");
			}
			else
			System.out.println("El año es incorrecto");
		break;
	case 7:
		System.out.println("El mes tiene 31 dias");
		if (a!=0) {
			System.out.println("El año es correcto");

				if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				System.out.println("El año es bisiesto");
				else
				System.out.println("El año no es bisiesto ");
			}
			else
			System.out.println("El año es incorrecto");
		break;
	case 8:
		System.out.println("El mes tiene 31 dias");
		if (a!=0) {
			System.out.println("El año es correcto");

				if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				System.out.println("El año es bisiesto");
				else
				System.out.println("El año no es bisiesto ");
			}
			else
			System.out.println("El año es incorrecto");
		break;
	case 9:
		System.out.println("El mes tiene 30 dias");
		if (a!=0) {
			System.out.println("El año es correcto");

				if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				System.out.println("El año es bisiesto");
				else
				System.out.println("El año no es bisiesto ");
			}
			else
			System.out.println("El año es incorrecto");
		break;
	case 10:
		System.out.println("El mes tiene 31 dias");
		if (a!=0) {
			System.out.println("El año es correcto");

				if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				System.out.println("El año es bisiesto");
				else
				System.out.println("El año no es bisiesto ");
			}
			else
			System.out.println("El año es incorrecto");
		break;
	case 11:
		System.out.println("El mes tiene 30 dias");
		if (a!=0) {
			System.out.println("El año es correcto");

				if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				System.out.println("El año es bisiesto");
				else
				System.out.println("El año no es bisiesto ");
			}
			else
			System.out.println("El año es incorrecto");
		break;
	case 12: 
		System.out.println("El mes tiene 31 dias");
		if (a!=0) {
			System.out.println("El año es correcto");

				if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))
				System.out.println("El año es bisiesto");
				else
				System.out.println("El año no es bisiesto ");
			}
			else
			System.out.println("El año es incorrecto");
		break;
		
	default:
	}
	}

else 
System.out.println("Mes incorrecto");		
	}

}
 