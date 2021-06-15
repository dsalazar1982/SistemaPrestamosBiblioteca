/*
 * Programa         : GenerarNumero.java
 * Fecha            : 10/06/2021 10:03:45 a. m.
 * Objetivo         : Programa que genera un numero consecutivo el cual es usado por el programa registro de prestamos para la asignacion del consecutivo de prestamo.
 * Desarrollador    : Daniel Alberto Salazar Erazo
 */
package Vistas;

public class GenerarNumero {

    private int dato;
    private int contador = 1;
    private String numero = "";

    public void generar(int dato) {
        this.dato = dato;

        // Genera un numero entero el 10.000.000 a 99.999.999 sin ceros a la izquierda 
        if ((this.dato >= 10000000) || (this.dato < 100000000)) {
            int valorEntero = contador + this.dato;
            numero = "" + valorEntero;
        }

        // Genera un numero entero de 1.000.000 a 9.999.999 con un cero a la izquierda 
        if ((this.dato >= 1000000) || (this.dato < 10000000)) {
            int valorEntero = contador + this.dato;
            numero = "0" + valorEntero;
        }

        // Genera un numero entero de 100.000 a 999.999 con dos ceros a la izquierda 
        if ((this.dato >= 100000) || (this.dato < 1000000)) {
            int valorEntero = contador + this.dato;
            numero = "00" + valorEntero;
        }

        // Genera un numero entero de 10.000 a 99.999 con tres ceros a la izquierda 
        if ((this.dato >= 10000) || (this.dato < 100000)) {
            int valorEntero = contador + this.dato;
            numero = "000" + valorEntero;
        }

        // Genera un numero entero de 1.000 a 9.999 con cuatro ceros a la izquierda 
        if ((this.dato >= 1000) || (this.dato < 10000)) {
            int valorEntero = contador + this.dato;
            numero = "0000" + valorEntero;
        }

        // Genera un numero entero de 100 a 999 con cinco ceros a la izquierda 
        if ((this.dato >= 100) || (this.dato < 1000)) {
            int valorEntero = contador + this.dato;
            numero = "00000" + valorEntero;
        }

        // Genera un numero entero de 9 a 999 con seis ceros a la izquierda 
        if ((this.dato >= 9) || (this.dato < 100)) {
            int valorEntero = contador + this.dato;
            numero = "000000" + valorEntero;
        }

        // Genera un numero entero de 1 a 8 con siete ceros a la izquierda 
        if (this.dato < 9) {
            int valorEntero = contador + this.dato;
            numero = "0000000" + valorEntero;
        }
    }

    public String serie() {
        return this.numero;
    }
}
