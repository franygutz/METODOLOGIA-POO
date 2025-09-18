package models;

public class PalabrasFrase {
    public String frase;

    public PalabrasFrase() {
    }

    public PalabrasFrase(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void cantidadPalabras(){

        if (this.frase.length()>0){
            for(int i = 0; i < this.frase.length(); i++) {
                System.out.println(this.frase.charAt(i));
            }
        }
        else {
            System.out.println("No existe palabra en la frase");
        }
    }
}
