package run;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = util.Conexion.get();
            if(conn != null){
                System.out.println("Conexion exitorsa a la base de datos.");
            } else{
                System.out.println("No se pudo conectar a la bas de datos.");
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
