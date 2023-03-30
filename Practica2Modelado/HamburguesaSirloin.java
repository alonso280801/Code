import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HamburguesaSirloin extends Hamburguesas{
    public HamburguesaSirloin() {
        super.id= 9;
        super.nombre = "Hamburguesa Sirloin";
        super.descriipcion=" Hamburguesa con carne de sirloin y queso ";
        super.precio = 109.0;
    }

    @Override
    void agregarProteina() {
        System.out.println("Cocinando carne Sirloin y agregandola");
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
