package models;

public class CuentaBancaria {
    //atributos: titular, saldo
    private String titular;
    private double saldo;

    //comstructores
    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //getters y setters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodos
    public void depositar(double cantidad){
        if (cantidad > 0){
            this.saldo += cantidad;
            System.out.println(cantidad + " depositado exitosamente. \nSALDO ACTUAL: "+saldo + "\n");
        }
        else System.out.println("La cantidad debe ser mayor a 0\n");
    }

    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            this.saldo -= cantidad;
            System.out.println("Se ha retirado "+ cantidad + " de cuenta bancaria. \nSALDO ACTUAL: "+ saldo+ "\n");
        } else if (cantidad > 0 && cantidad > saldo) System.out.println("Saldo insuficiente en la cuenta bancaria\n");
        else System.out.println("La cantitidad debe ser mayor a 0\n");
    }

    public void cuentaFinal(){
        System.out.println(titular+ ". Su saldo es de: C$ "  + saldo + "\n");
    }

    //to string
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
