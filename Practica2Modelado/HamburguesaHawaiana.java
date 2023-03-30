import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HamburguesaHawaiana extends Hamburguesas{
    public HamburguesaHawaiana() {
        super.id= 1;
        super.nombre = "Hamburguesa Hawaiana";
        super.descriipcion=" Hamburguesa con carne de res y pinia con queso ";
        super.precio = 109.0;
    }

    @Override
    void agregarProteina() {
        System.out.println("Cocinando carne de res y pinia  agregandola");
    }

    @Override
    void agregarQueso() {
        System.out.println("Agregando rebanada de queso");
    }

    public boolean clienteQuiereQueso (){
        String ans= obtenerRespuesta();
        if (ans.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String obtenerRespuesta(){
        String respuesta = null;
        System.out.println("¿Quieres queso en tu hamburguesa y/n?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            respuesta = in.readLine();
        } catch (IOException ioe) {
            System.out.println("Errorrr ");
        }

        if (respuesta == null){
            return "no";
        }
        return respuesta;
    }
}