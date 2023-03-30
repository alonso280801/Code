
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HamburguesaPicania extends Hamburguesas{
    public HamburguesaPicania() {
        super.id= 7;
        super.nombre = "Hamburguesa de Picaña";
        super.descriipcion=" Hamburguesa con rebanadas de picaña y queso ";
        super.precio = 119.0;
    }

    @Override
    void agregarProteina() {
        System.out.println("Cocinando y agregando la picaña ");
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