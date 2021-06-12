package Vistas;

public class GenerarNumero {

    private int dato;
    private int contador = 1;
    private String numero = "";

    public void generar(int dato) {
        this.dato = dato;
        if ((this.dato >= 10000000) || (this.dato < 100000000)) {
            int valorEntero = contador + this.dato;
            numero = "" + valorEntero;
        }
        if ((this.dato >= 1000000) || (this.dato < 10000000)) {
            int valorEntero = contador + this.dato;
            numero = "0" + valorEntero;
        }
        if ((this.dato >= 100000) || (this.dato < 1000000)) {
            int valorEntero = contador + this.dato;
            numero = "00" + valorEntero;
        }
        if ((this.dato >= 10000) || (this.dato < 100000)) {
            int valorEntero = contador + this.dato;
            numero = "000" + valorEntero;
        }
        if ((this.dato >= 1000) || (this.dato < 10000)) {
            int valorEntero = contador + this.dato;
            numero = "0000" + valorEntero;
        }
        if ((this.dato >= 100) || (this.dato < 1000)) {
            int valorEntero = contador + this.dato;
            numero = "00000" + valorEntero;
        }
        if ((this.dato >= 9) || (this.dato < 100)) {
            int valorEntero = contador + this.dato;
            numero = "000000" + valorEntero;
        }
        if (this.dato < 9) {
            int valorEntero = contador + this.dato;
            numero = "0000000" + valorEntero;
        }
    }

    public String serie() {
        return this.numero;
    }
}
