import java.util.Scanner;
public class Conversiones_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
int a,b,c;
double d;
System.out.println("********************************");
System.out.println("¿QUE TIPO DE CONVERSION HARAS?");
System.out.println("1. DE MASA");
System.out.println("2. DE VOLUMEN");
System.out.println("3. DE LONGITUD");
System.out.println("********************************");
System.out.println("¿Cual eliges?");
a=teclado.nextInt();
switch (a)
{
	case 1:
		System.out.println("TENGO VARIOS TIPOS DE CONVERSIÓN DE MASA");
		System.out.println("1. KILOGRAMOS A GRAMOS");
		System.out.println("2. TONELADAS A KILOS");
		System.out.println("3. GRAMOS A LIBRAS");
		System.out.println("4. ONZAS A KILOGRAMOS");
		b=teclado.nextInt();
		switch (b)
		{
		case 1:
			System.out.println("¿Cuantos kilogramos deseas convertir?");
			c=teclado.nextInt();
			d=c*1000;
			System.out.println("Los kilogramos convertidos son "+d+" gramos");
			break;
		case 2:
			System.out.println("¿Cuantas toneladas deseas convertir?");
			c=teclado.nextInt();
			d=c*1000;
			System.out.println("Las toneladas convertidas son "+d+" kilos");
			break;
		case 3:
			System.out.println("¿Cuantos gramos deseas convertir?");
			c=teclado.nextInt();
			d=c/454;
			System.out.println("Los gramos convertidos son "+d+" libras");
			break;
		case 4:
			System.out.println("¿Cuantos onzas deseas convertir?");
			c=teclado.nextInt();
			d=c/35.274;
			System.out.println("Las onzas convertidos son "+d+" kilogramos");
			break;
		default:
			System.out.println("Esa conversión no la puedo hacer :((((");
		
		}
		
	case 2:
		System.out.println("TENGO VARIOS TIPOS DE CONVERSIÓN DE VOLUMEN");
		System.out.println("1. LITROS A MILILITROS");
		System.out.println("2. GALON IMPERIAL A TAZA IMPERIAL");
		System.out.println("3. PULGADA CUBICA A PIE CUBICO");
		System.out.println("4. GALON ESTAUNIDENSE A METROS CUBICO");
		b=teclado.nextInt();
		switch (b)
		{
		case 1:
			System.out.println("¿Cuantos litros deseas convertir?");
			c=teclado.nextInt();
			d=c*1000;
			System.out.println("Los litros convertidos son "+d+" mililitros");
			break;
		case 2:
			System.out.println("¿Cuantos galones imperiales deseas convertir?");
			c=teclado.nextInt();
			d=c*15.999999007517;
			System.out.println("Los galones imperiales convertidas son "+d+" tazas imperiales");
			break;
		case 3:
			System.out.println("¿Cuantas pulgadas cubicas deseas convertir?");
			c=teclado.nextInt();
			d=c/1728;
			System.out.println("Las pulgadas cubicas convertidos son "+d+" pies cubicos");
			break;
		case 4:
			System.out.println("¿Cuantos galones estaunidenses deseas convertir?");
			c=teclado.nextInt();
			d=c/220;
			System.out.println("Las galones estaunidense  convertidos son "+d+" metros cubicos");
			break;
		default:
			System.out.println("Esa conversión no la puedo hacer :((((");
		
		}
	case 3:
		System.out.println("TENGO VARIOS TIPOS DE CONVERSIÓN DE LONGITUD");
		System.out.println("1. DE NANOMETRO A METRO");
		System.out.println("2. DE PULGADAS A PIE");
		System.out.println("3. DE YARDA A MILLA NAUTICA");
		System.out.println("4. DE KILOMETRO A MICROMETRO");
		b=teclado.nextInt();
		switch (b)
		{
		case 1:
			System.out.println("¿Cuantos nanometros deseas convertir?");
			c=teclado.nextInt();
			d=c*0000000001;
			System.out.println("Los nanometros convertidos son "+d+" metros");
			break;
		case 2:
			System.out.println("¿Cuantas pulgadas deseas convertir?");
			c=teclado.nextInt();
			d=c/12;
			System.out.println("Las pulgadas convertidas son "+d+" pies");
			break;
		case 3:
			System.out.println("¿Cuantas yardas deseas convertir?");
			c=teclado.nextInt();
			d=c/2025;
			System.out.println("Las yardas convertidos son "+d+" millas nauticas");
			break;
		case 4:
			System.out.println("¿Cuantos kilometros deseas convertir?");
			c=teclado.nextInt();
			d=c*1000000000;
			System.out.println("Los kilometros convertidos son "+d+" micrometros");
			break;
		default:
			System.out.println("Esa conversión no la puedo hacer :((((");
	}

	default:
		System.out.println("Esa conversión no la puedo hacer disculpa :(((");
}
}
}