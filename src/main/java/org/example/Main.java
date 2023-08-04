package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner teclado=new Scanner(System.in);
        Integer opcionMenu;
        Integer cantidadProducto=0;
        Integer costoUnitario=0;
        Integer costoVenta=0;

        System.out.println("FONDA ANTIOQUEÑA");
        System.out.println("*****************************");

        System.out.println("-------------Conoce nuestro menú-----------------");

        System.out.println("1. Chorizo Antioqueño --- $4000");
        System.out.println("2. Chicharron ----------- $15000");
        System.out.println("3. Morcilla ------------- $10000");
        System.out.println("4. Chuzo mixto ---------- $20000");
        System.out.println("5. aguardiente 1/2 ------ $25000");
        System.out.println("6. Ron 1/2 -------------- $30000");

        System.out.println("-------------------------------------");

        System.out.print("Digita el producto deseado: ");
        opcionMenu= teclado.nextInt();

        switch (opcionMenu){

            case 1:
                costoUnitario=4000;
                System.out.print("Digita la cantidad de chorizos que deseas: ");
                cantidadProducto= teclado.nextInt();
                break;

            case 2:
                costoUnitario=15000;
                System.out.print("Digita la cantidad de chorizos que deseas: ");
                cantidadProducto= teclado.nextInt();
                break;
            case 3:
                costoUnitario=10000;
                System.out.print("Digita la cantidad de chorizos que deseas: ");
                cantidadProducto= teclado.nextInt();
                break;
            case 4:
                costoUnitario=20000;
                System.out.print("Digita la cantidad de chorizos que deseas: ");
                cantidadProducto= teclado.nextInt();
                break;
            case 5:
                costoUnitario=25000;
                System.out.print("Digita la cantidad de chorizos que deseas: ");
                cantidadProducto= teclado.nextInt();
                break;
            case 6:
                costoUnitario=30000;
                System.out.print("Digita la cantidad de chorizos que deseas: ");
                cantidadProducto= teclado.nextInt();
                break;
            default:
                System.out.println("Este producto no existe en el menu");
                break;



        }
        costoVenta=costoUnitario*cantidadProducto;
        System.out.println("El total de la compra es: "+costoVenta);


    }
}