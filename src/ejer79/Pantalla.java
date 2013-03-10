/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer79;


import java.util.Scanner;

/**
 *
 * @author Luis Pitarch
 * @version 1
 */
public class Pantalla {
    /**
     * 
     * @param texto Mensaje que sale en pantalla para pedir un texto
     * @return El valor introducido por teclado
     */
    public static String pideCadena(String texto) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("\t" + texto);
        return teclado.nextLine();
    }
    /**
     * 
     * @param texto Saca por pantalla el parametro introducido
     */
    static void imprime(String texto) {
        System.out.println("\t" + texto );
    }
}
