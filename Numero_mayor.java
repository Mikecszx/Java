import java.util.Scanner;
public class Numero_mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado= new Scanner (System.in);
int n1, n2;
System.out.println("Ingresa el primer numero");
n1=teclado.nextInt();
System.out.println("Ingresa el segundo numero");
n2=teclado.nextInt();
if (n1>n2)
	System.out.println("El menor es :"+n2+ "y el mayor es "+n1);
else 
System.out.println("El menor es  :"+n1+ ": y el mayor es  :" +n2);

	}

}
