package VentaZapatos;
import java.util.Scanner;
import Zapato.Zapato;

public class VentaZapatos {

    static Scanner teclado= new Scanner(System.in);
    static String modelo;
    static int talla;
    static double precio;
    static double precioA;
    //Zapato zapato1 = new Zapato("Emperador",8,246)

        public static void opcionesModelo(){
            int opcMOD;
            System.out.println("  BIENVENIDO AL MENU!  ");
            System.out.println(" MODELOS DE ZAPATOS ");
            System.out.println("1) MODELO EJECUTIVO   $ 345.50 ");
            System.out.println("2) MODELO PREMIER  $ 298.70 ");
            System.out.println("3) MODELO EMPERADOR  $ 246.00");
            System.out.println(" ELIGE EL DE TU AGRADO :) ");
            opcMOD=teclado.nextInt();
            switch (opcMOD){
                case 1: modelo = "EJECUTIVO";
                        precio = 345.50;
                break;
                case 2: modelo = "PREMIER";
                        precio = 298.70;
                break;
                case 3: modelo = "EMPRERADOR";
                        precio = 246.00;
                break;
                default:
                    System.out.println("El modelo no existe ");
                    break;
            }
            System.out.println("El modelo elegido es "+modelo);
        }//end opcionesModelo
        public static void opcionesTalla(){
            int opcTA;
            System.out.println(" LAS TALLAS DE ZAPATOS SON  ");
            System.out.println("1) TALLA 8 ");
            System.out.println("2) TALLA 9 ");
            System.out.println("3) TALLA 10");
            System.out.println(" ELIGE EL DE TU AGRADO :) ");
            opcTA=teclado.nextInt();
            switch (opcTA){
                case 1: talla = 8;
                break;
                case 2: talla = 9;
                break;
                case 3: talla = 10;
                break;
                default:
                    System.out.println("La talla no existe ");
                    break;
            }
            System.out.println("La talla elegida es "+opcTA);
        }//end opcionesTalla
        public static void calcularPrecio(){

        if (talla==9) {
            precioA = precio + 10;
        }
            else {
                precioA= precio+20;
            }

        }//end calcularPrecio

        public static void imprimirVenta(){
            System.out.println("El precio de los zapatos elegidos es de "+ precioA);
        }//end imprimirVenta

    public static void main(String[] args) {
            int yes;
            do {


                opcionesModelo();
                opcionesTalla();
                calcularPrecio();
                imprimirVenta();
                System.out.println("Deseas hacer otro calculo? 1) SI,  2), NO");
                yes=teclado.nextInt();

            }while(yes==1);
    }

}

