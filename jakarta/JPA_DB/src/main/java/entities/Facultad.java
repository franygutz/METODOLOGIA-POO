package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity //para decirle que se va a trabajar con base de datos
@Table(name = "Facultades") //para crear una tabla en la base de datos
@Getter
@Setter//asi ya no se crean getters y setters
public class Facultad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para generar ids automaticamente
    private long id;

    @Column(nullable = false, length = 60) //dandole atributos que van para la tabla
    private String nombre;
}
