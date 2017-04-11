/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejerccio07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejerccio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("ingrese el puntaje del 0 a 60 :");
        int numero1 = Integer.parseInt(reader.nextLine());
        if (numero1 >=0 && numero1<=29){
            System.out.println("\nNota: Desaprobado");
        }
        if (numero1 >=30 && numero1<=34){
            System.out.println("\nNota: 1");
        }
        if (numero1 >=35 && numero1<=39){
            System.out.println("\nNota: 2");
        }
        if (numero1 >=40 && numero1<=44){
            System.out.println("\nNota: 3");
        }
        if (numero1 >=45 && numero1<=49){
            System.out.println("\nNota: 4");
        }
    }
    
}
