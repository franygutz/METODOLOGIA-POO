package models;

public class Coche {
    //atributos: marca, modelo, año
    public String marca;
    public String modelo;
    public int ano;

    //metodo para mostrar datos
    public String mostrarInfo()
    {
        return "Marca: " + marca + "\nModelo: "+ modelo + "\nAno: "+ ano;
    }
}
