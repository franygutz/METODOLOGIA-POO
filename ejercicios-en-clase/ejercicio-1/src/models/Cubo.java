package models;
//Calcular el cubo de un numeo impar multiplo de 3
public class Cubo {
    public int numero;

    public Cubo() {
    }

    public Cubo(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean esMultiplo3() {
        return this.numero % 3 == 0;
    }

    public boolean esImpar() {
        return this.numero % 2 != 0;
    }
}
