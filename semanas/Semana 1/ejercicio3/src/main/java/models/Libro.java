package models;

public class Libro {
    //atributos: titulo, autor, numeroPaginas
    public String  titulo;
    public String autor;
    public int numeroPaginas;

    //metodo para mostrar descripcion
    public String descripcionLibro(){
        return "Titulo: " + titulo + "\nAutor: "+ autor + "\nNumero de Paginas: " + numeroPaginas;
    }
}
