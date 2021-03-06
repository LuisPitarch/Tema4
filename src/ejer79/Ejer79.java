/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer79;

import java.io.IOException;

/**
 *
 * @author Luis Pitarch
 * @version 1
 */
public class Ejer79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        /**
         * @param habitacion el nº de habitacion a evaluar que cumpla unos requisitos
         * @param bien flag para indicar que el nº de habitacion es correcto
         */
        String habitacion;
        boolean bien;
        System.out.println("Este es un mensaje de prueba");
        do{ 
            bien=true;
            habitacion=Pantalla.pideCadena("Introduce el nº de la habitacion: ");
            if (habitacion.length()!=3){// Comprueba que el nº de habitacion tenga 3 digitos
                bien=false;
                if (habitacion.length()<3){
                    Pantalla.imprime("Debes introducir más numeros");
                }
                if (habitacion.length()>3){
                    Pantalla.imprime("Debes introducir menos numeros");
                }
            }
            
            for(int e=0;e<habitacion.length();e++){ 
                try {  // Comprueba que el número es correcto llamando al método validar
                    if(validar(habitacion.charAt(e))!=1){
                        bien=false;
                    }
                    }catch(MyError h){
                        bien=false;
                    }
            }
            if(bien){
                if (habitacion.charAt(0)!='0'){
                    bien=false;
                    Pantalla.imprime("El primer caracter tiene que ser 0");
                }
                if (habitacion.charAt(1)>'3'){
                    bien=false;
                    Pantalla.imprime("El segundo caracter tiene que estar entre 0 y 3");
                }
                if (habitacion.charAt(2)>'6'){
                    bien=false;
                    Pantalla.imprime("El tercer caracter tiene que estar entre 0 y 6");
                }
                if (habitacion.compareTo("000")==0){
                    bien=false;
                    Pantalla.imprime("Habitación reservada para el conserje");
                }
            }     
           
            
            
        }while(!bien);
        if (bien){
            Pantalla.imprime("Nº habitacion OK: ");
        }
    }
    /**
     * 
     * @param c Evalúa el caracter introducido
     * @return devuelve un 1 si el valor introducido es numérico
     * @throws MyError 
     */
      
    public static int validar(char c) throws MyError {
        
         if (c>='0'&&c<='9'){
             return 1;
         }
         MyError e;
         e=new MyError();
         throw e;
    }
}
