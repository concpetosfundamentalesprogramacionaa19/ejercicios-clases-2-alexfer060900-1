/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class EjemplosClase23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este metodo es el principal de mi proyecto
        // No olvidar ingresar valores
        
        String nombre; 
        String apellido; 
        int edad;
        String ciudad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, ingresar sus nombres: ");
        nombre = entrada.nextLine();
        
        System.out.println("Por favor, ingresar sus apellidos: ");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor, ingresar su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine(); //limpieza del buffer de entrada de datos 
        System.out.println("Por favor, ingresar su ciudad: ");
        ciudad = entrada.nextLine();
        
        /**
        System.out.println("Su nombres son: " +nombre+"\n\n\t"+ "Sus apellidos" 
                + " son: " +apellido+ ", edad: " +edad+ "\n Ciudad: " +ciudad);
        */
        System.out.printf("Sus nombres son %s\n\n\t Sus apellidos son %s "
                + "Edad: %s\n Ciudad: %s" , nombre,apellido,edad,ciudad);
        }   
    }
