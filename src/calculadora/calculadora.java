/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
/**
 *
 * @author salva
 */
public class calculadora {


        public double resultado;
        private int resultadoC;
        private int numero;
        private String signo;

        public calculadora() {

        }

        public void valorI(int resultado) {
            this.resultado = resultado;
        }

        public void suma(int numero) {
            this.signo = "+";
            this.numero = numero;
            this.resultado += this.numero;

        }

        public void multiplicacion(int numero) {
            this.signo = "*";
            this.numero = numero;
            this.resultado *= this.numero;

        }

        public void resta(int numero) {
            this.signo = "-";
            this.numero = numero;
            this.resultado -= this.numero;

        }

        public void division(int numero) {
            this.signo = "/";

            if (numero == 0) {
                resultado = 0;
                 System.out.println(" ERROR ");

            } else {
                this.numero = numero;
                resultado /= this.numero;
            }
        }

    public void eliminar() {
        if (this.signo.equalsIgnoreCase("+")) {
            this.resultado -= this.numero;
        } else if (this.signo.equalsIgnoreCase("-")) {
            this.resultado += this.numero;
        } else if (this.signo.equalsIgnoreCase("*")) {
            this.resultado /= this.numero;
        } else if (this.signo.equalsIgnoreCase("/")) {
            this.resultado *= this.numero;
        }
    }

    public void resultado() {
        resultadoC = (int) resultado;
        if (resultado % resultadoC == 0) {
            System.out.println("resultado = " + resultadoC);
        } else {
            System.out.println("resultado = " + resultado);
        }
    }

}
