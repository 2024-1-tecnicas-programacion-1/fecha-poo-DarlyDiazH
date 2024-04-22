package com.mycompany.fecha.poo;

import java.util.HashMap;

public class Fecha {
    
    //ATRIBUTO
    int dia;
    int mes;
    int anio;
    
    //MÉTODOS
    
    //Complejidad temporal: O(1) Tiempo Constante
    
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    //Complejidad temporal: O(1) Tiempo Constante
    
    String fechaCorta(){
    return (dia+"/"+mes+"/"+anio);
    }
    
    //Complejidad temporal: O(1) Tiempo Constante
    
    Boolean validarFecha(){
        if (dia<1 || dia>31) {
            return false;
        }else if (mes<1 || mes>12) {
            return false;
        }else if(mes == 2){
            if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
                if (dia>29) {
                  return false; 
                }
            }else{
                if (dia>28) {
                  return false; 
                }
            }
        }
        return true;
    }
    
    HashMap <Integer, String> mesNuevo = new HashMap<>();  
    
    //Complejidad temporal: O(1) Tiempo Constante

    String mesLetra(){

        mesNuevo.put(1, "Enero");
        mesNuevo.put(2, "Febrero");
        mesNuevo.put(3, "Marzo");
        mesNuevo.put(4, "Abril");
        mesNuevo.put(5, "Mayo");
        mesNuevo.put(6, "Junio");
        mesNuevo.put(7, "Julio");
        mesNuevo.put(8, "Agosto");
        mesNuevo.put(9, "Septiembre");
        mesNuevo.put(10, "Octubre");
        mesNuevo.put(11, "Noviembre");
        mesNuevo.put(12, "Diciembre");
        
        
        return mesNuevo.get(mes);
    }
    
    
    //Complejidad temporal: O(1) Tiempo Constante
    
    String fechaLarga(){
    
    return (dia+" de "+mesNuevo.get(mes)+" de "+anio);
    }
   
}
