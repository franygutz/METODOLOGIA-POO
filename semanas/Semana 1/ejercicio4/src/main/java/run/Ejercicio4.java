package run;

import models.CuentaBancaria;

public class Ejercicio4 {
    public static void main(String[] args) {
        //objeto tipo clase cuentabancaria
        CuentaBancaria cuentaBancaria = new CuentaBancaria("Franya Gutierrez", 6000);

        cuentaBancaria.retirar(2000); //6000-2000=4000
        cuentaBancaria.depositar(500); //4000+500=4500
        cuentaBancaria.retirar(7000); // 4500<7000

        cuentaBancaria.cuentaFinal(); //saldo final: 4500
    }
}
