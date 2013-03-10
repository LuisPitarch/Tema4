/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer79;

/**
 *
 * @author Luis Pitarch
 * @version 1
 */
public class MyError extends Exception{
    // Se ejecuta el constructor con el mensaje
    MyError() {
         Pantalla.imprime("Has puesto letras");
    }
    
}
