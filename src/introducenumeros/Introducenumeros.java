/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducenumeros;

import calculadora.calculadora;

/**
 *
 * @author salva
 */
public class Introducenumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    calculadora cal = new calculadora();
    
    cal.suma(20);
    cal.resta(4);
    cal.division(5);
    cal.resultado();
    
    }
    
}
