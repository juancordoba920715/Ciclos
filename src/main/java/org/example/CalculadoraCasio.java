package org.example;

import java.util.Random;
import java.util.Scanner;

public class CalculadoraCasio {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Random aleatorio=new Random();

        Integer opcion;


        System.out.println("Casio fx90");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        System.out.println("5. RAIZ CUADRADA");
        System.out.println("6. POTENCIA");
        System.out.println("7. SENO");
        System.out.println("8. COSENO");
        System.out.println("9. SALIR");

        System.out.println("----------------------------------------");

        do {
            Integer numeroDos= aleatorio.nextInt(10);
            Integer numeroUno= aleatorio.nextInt(10);

            System.out.println("¿ que operacion quiere realizar? ");
            opcion= teclado.nextInt();
            switch (opcion){

                case 1:
                    System.out.println("Eligio sumar");
                    Integer suma=numeroUno+numeroDos;
                    System.out.println(numeroUno+"+"+numeroDos+"="+suma);
                    break;
                case 2:
                    System.out.println("Eligio restar");
                    Integer resta=numeroUno-numeroDos;
                    System.out.println(numeroUno+"-"+numeroDos+"="+resta);
                    break;
                case 3:
                    System.out.println("Eligio multiplicar");
                    Integer multiplicacion=numeroUno*numeroDos;
                    System.out.println(numeroUno+"*"+numeroDos+"="+multiplicacion);
                    break;
                case 4:
                    System.out.println("Eligio division");
                    Integer division=numeroUno/numeroDos;
                    System.out.println(numeroUno+"/"+numeroDos+"="+division);
                    break;
                case 5:
                    System.out.println("Eligio raiz cuadrada");
                    Double raizCuadrada=Math.sqrt(numeroUno);
                    System.out.println("La raiz es: "+raizCuadrada);
                    break;
                case 6:
                    System.out.println("Eligio potencia");
                    Double pontencia=Math.pow(numeroUno,numeroDos);
                    System.out.println("la potencia es: "+pontencia);
                    break;
                case 7:
                    System.out.println("Eligio seno");
                    Double seno=Math.sin(numeroUno);
                    System.out.println("el seno es: "+seno);
                    break;
                case 8:
                    System.out.println("Eligio coseno");
                    Double coseno=Math.cos(numeroUno);
                    System.out.println("el coseno es: "+coseno);
                    break;
                default:
                    System.out.println("opcion invalida, verifique porfavor");
                    break;
            }
        }while (opcion!=9);

        System.out.println("Gracias hasta pronto");




    }
}
