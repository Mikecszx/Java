import java.util.Scanner;
public class Autobuses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado= new Scanner (System.in);
double a=1,b,c,d,e;
System.out.println("¿Que tipo de viaje eligío (1).A o (2).B?");
a=teclado.nextDouble();


if (a==1) {
	System.out.println("¿Cuantos kilometros va a viajar");
	b=teclado.nextDouble();
	c=b*2.00;
	System.out.println("El precio sera de "+c);
	}
	else 
	System.out.println("¿Cuanto kilometros va a viajar?");
	b=teclado.nextDouble();
	c=b*2.50;
	System.out.println("El precio sera de "+c);
	}
	
}
