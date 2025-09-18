package models;

import java.util.Scanner;

public class Multiplo4Y8 {
    public int numero;

    public Multiplo4Y8() {
    }

    public Multiplo4Y8(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean esMultiplo4Y8() {
        return this.numero % 4 == 0 && this.numero % 8 == 0;
    }
}
