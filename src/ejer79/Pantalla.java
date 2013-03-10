/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer79;


import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Pantalla {
    public static String pideCadena(String texto) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("\t" + texto);
        return teclado.nextLine();
    }
    public static int pideInt(String num) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("\t" + num);
        return teclado.nextInt();
    }
    public static float pideFloat(String num) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("\t" + num);
        return teclado.nextFloat();
    }
    static int pideNum(String texto) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("\t" + texto);
        return teclado.nextInt();
    }
    static void imprimeT(String texto, String valor) {
        System.out.println("\t" + texto +  valor);
    } 
    static void imprimeI(String texto, int valor) {
        System.out.println("\t" + texto + valor);
    }
    static void imprimeF(String texto, float valor) {
        System.out.println("\t" + texto + valor);
    }
    static void imprimeI(String texto, float valor, String texto2, float valor2) {
        System.out.println("\t" + texto + valor + texto2 + valor2);
    }
    static void imprime(String texto) {
        System.out.println("\t" + texto );
    }
}
