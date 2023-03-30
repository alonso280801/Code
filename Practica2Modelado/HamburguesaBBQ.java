import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HamburguesaBBQ extends Hamburguesas{
    public HamburguesaBBQ() {
        super.id= 6;
        super.nombre = "Hamburguesa BBQ";
        super.descriipcion=" Hamburguesa con carnes de res y salsa BBQ  con cebolla caramelizada";
        super.precio = 109.0;
    }

    @Override
    void agregarProteina() {
        System.out.println("Cocinando carne y agregando salsa BBQ con cebollas");
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
