/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class MiEjercicio {
    
    public static void main(String[] args) {
        
        String nombre; 
        String apellido; 
        int edad;
        String ciudad;
        String pais;
        int nota1;
        int nota2;
        float promedio;
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
        
        System.out.println("Por favor, ingrese su pais:");
        pais = entrada.nextLine();
        
        System.out.println("Por favor, ingresar la primera nota:");
        nota1 = entrada.nextInt();
        
        System.out.println("Por favor, ingresar la segunda nota:");
        nota2 = entrada.nextInt();
        promedio = (nota1+nota2)/2;
        
        System.out.printf("Sus nombres y apellidos son %s %s\n"
                +"Edad: %s\nCiudad: %s\nPais: %s\nNotas: %s %s\n"
                +"Promedio: %s" , nombre,apellido,edad,ciudad,pais,nota1,nota2
        ,promedio);
        }   
    }


