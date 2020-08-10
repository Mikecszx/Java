import java.util.Scanner;
public class Compañia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
double a,b,c,d = 0,f=1,g,h=4,i =0,j=0,k=0,l;


System.out.println("Cuanto duro tu llamada? ");
a=teclado.nextDouble();
System.out.println("En que dia estas pon el numero del 1 al 7 :)");
b=teclado.nextDouble();
g=f+0.80;
if (b==7) {               //para determinar el dia y el impuesto
	i=f*.03;
	c=f+i;
	j=g*.03;
	d=g+j;
	k=h*.03;
	l=h+k;
	if (a<=5)                //para determinar el precio
		System.out.println("El precio de tu llamada es de "+c+" pesos");
	else if (a<=8)
		System.out.println("El precio de tu llamada es de "+d+" pesos");
	else if (a>=8)
		System.out.println("El precio de tu llamada es de "+l+" pesos");

}
else  {
	i=f*.15;
	c=f+i;
	j=g*.15;
	d=g+j;
	k=h*.15;
	l=h+k;

	
if (a<=5)                //para determinar el precio
	System.out.println("El precio de tu llamada es de "+c+" pesos");
else if (a<=8)
	System.out.println("El precio de tu llamada es de "+d+" pesos");
else if (a>=8)
	System.out.println("El precio de tu llamada es de "+l+" pesos");

		
	
}
}
}