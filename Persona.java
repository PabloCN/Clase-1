/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprogramaoo;

/**
 *
 * @author Alumno
 */
public class Persona {
    //Definir atributos(variables, tipos de datos)
 String nombre;
 int edad;
 double peso;
 double estatura;
 char sexo;
 String procedencia;
 
    //Metodo Constructor
 public Persona(){
 
 nombre= "";
 edad= 0;
 peso=0;
 estatura= 0;
 sexo= 'i';
 procedencia="desconocido";
 
     
 }
 //definir comportamientos(metodos)
 
 
 void saludar(){
 System.out.println("Hola, ¿Como estas?, soy: " + nombre);
 }
 
}
