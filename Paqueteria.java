import java.util.Scanner;
public class Paqueteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
int a,b,c = 0;
System.out.println("¿A que parte de america harás el envío a el (1)Norte (2)Centro (3) Sur");
a=teclado.nextInt();

if (a==1) {
	System.out.println("¿Cuantos gramos de equipaje llevas?");
	b=teclado.nextInt();
	c=b*11;
	if (b<=5000) 
	System.out.println("El precio sera de "+c);
	else  
	System.out.println("No podemos llevar el paquete es por seguridad :))");
	}
if (a==2) {
	System.out.println("¿Cuantos gramos de equipaje llevas?");
	b=teclado.nextInt();
	c=b*10;
	if (b<=5000) 
	System.out.println("El precio sera de "+c);
	else  
	System.out.println("No podemos llevar el paquete es por seguridad :))");
	}
if (a==3) 
	System.out.println("¿Cuantos gramos de equipaje llevas?");
	b=teclado.nextInt();
	c=b*12;
	if (b<=5000) 
	System.out.println("El precio sera de "+c);
	else  
	System.out.println("No podemos llevar el paquete es por seguridad :))");

	}

}