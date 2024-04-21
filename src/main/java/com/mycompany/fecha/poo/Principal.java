package com.mycompany.fecha.poo;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int dia=sc.nextInt();
        int mes=sc.nextInt();
        int anio=sc.nextInt();
        
        Fecha fechaNueva = new Fecha(dia, mes, anio);
        fechaNueva.fechaCorta();
        fechaNueva.validarFecha();
        fechaNueva.mesLetra();
        fechaNueva.fechaLarga();
        
        if (fechaNueva.validarFecha()==true) {
            System.out.println("La fecha es valida");
            System.out.println(fechaNueva.fechaLarga());
        }else{
            System.out.println("La fecha es invalida");
        }
        

    }
}
