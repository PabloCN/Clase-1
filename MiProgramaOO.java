/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprogramaoo;

/*
 *
 * @author Alumno
 */
public class MiProgramaOO {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Persona juan= null;
        Persona juan = new Persona();
        juan.nombre= "Juan";
        juan.edad=23;
        juan.peso=87.5;
        juan.estatura= 1.55;
        juan.sexo= 'm';
        juan.procedencia="Hacienda Nueva";
        Persona maria = new Persona();
        maria.nombre= "Maria";
        maria.edad=18;
        maria.peso=67.5;
        maria.estatura= 1.70;
        maria.sexo= 'f';
        maria.procedencia="El Cobre";
        Persona miguelito = new Persona();
        miguelito.nombre= "Miguelito";
        miguelito.edad=12;
        miguelito.peso=40.6;
        miguelito.estatura= 1.4;
        miguelito.sexo= 'm';
        miguelito.procedencia="Huehuquilla";
        
        System.out.println();
        
    }
    
}
