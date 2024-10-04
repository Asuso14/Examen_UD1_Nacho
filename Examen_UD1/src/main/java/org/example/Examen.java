package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public void ejercicio1(){
        Scanner entry = new Scanner(System.in);
        int num = 0;
        boolean value = true;
        //Este bucle lo que comprueba es que el usuario introduzca un número y no una letra
        while (value) { //He puesto así el bucle porque el valor puede ser 0, es la única forma que se me ocurre.
            try {
                System.out.println("Introduce un numero: ");
                num = entry.nextInt();
                value = false;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error, eso no es un numero. Prueba de nuevo: ");
                entry.nextLine();
            }
        }
        //Este if comprueba si el número es positivo te da su valor normal
        // , y sino lo multiplica por -1 para poner el valor a positivo (Else).
        if (num > 0){
            System.out.println("El valor absoluto es " + num);
        }else{
            num = (num * -1);
            System.out.println("Su valor absoluto es: " + num);
        }
    }
    public void ejercicio2(){
        Scanner entry = new Scanner(System.in);
        //Aqui lo que hago es poner valor a las variables que usaré.
        int value = 0;
        int P_largo = 0;
        int P_ancho = 0;
        int A_largo = 0;
        int A_ancho = 0;
        int cuadrado = 0;
        //Aqui lo que hacemos es pedir el nombre al usuario y despues le ponemos un mensaje
        //que tiene su nombre.
        System.out.println("Introduce tú nombre: ");
        String name = entry.nextLine();
        System.out.println("La obra de " + name);
        //Este bucle solo es para que el usuario ingrese los números que se le solicitan,
        //Si el usuario ingresa una letra se repite el bucle.
        while (value == 0){
            try {
                System.out.println("Introduce el ancho de la pared: ");
                P_largo = entry.nextInt();
                System.out.println("Introduce el alto de la pared: ");
                P_ancho = entry.nextInt();
                System.out.println("Introduce el largo del azulejo: ");
                A_largo = entry.nextInt();
                System.out.println("Introduce el ancho del azulejo: ");
                A_ancho = entry.nextInt();
                value = 1;
            }catch (NumberFormatException | InputMismatchException e){
                System.out.println("Error, No puedes introducir texto.");
                entry.nextLine();
            }
        }
        //Aquí el programa lo que hace es comprobar que el azulejo no sea cuadrado.
        //Si pasa dara un error y no seguirá con el programa.
        if (A_largo == A_ancho){
            System.out.println("El azulejo no puede ser cuadrado");
            cuadrado = 1;
        }
        if (cuadrado == 0){
            //Aquí lo que hara el programa sera multiplicar la altura por la anchura
            //de ambos objetos. Despues de hacer esto comprueba que azulejo no sea mas
            // grande que la pared, si pasa eso dara error y no seguirá.
            // Si no es el caso da el resultado.
            int LA_pared = (P_largo * P_ancho);
            int LA_azulejo = (A_largo * A_ancho);
            if (LA_pared < LA_azulejo){
                System.out.println("El azulejo no puede ser más grande que la pared.");
            }else {
                //Hacemos una variable que pueda tener decimales y calculamos
                // el resultado con diametro total de la pared entre el diametro de los azulejos.
                float total = (LA_pared / LA_azulejo);
                System.out.println("Se necesitan " + total + " azulejos. :)");
            }
            
        }
    }
}

