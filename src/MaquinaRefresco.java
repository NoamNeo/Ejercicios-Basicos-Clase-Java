import java.util.Scanner;

public class MaquinaRefresco {
    public static void main(String[] args){
        Scanner usrInput = new Scanner(System.in);
        double dinero;
        int decision;
        final String[] bebidas = {"Fanta", "Copa de vino", "Roncola"};
        final double[] precio = {1.5, 5, 7.5};
        System.out.println("Pon cuanto dinero tienes (para usar decimales usa .)");
        dinero =  usrInput.nextDouble();
        System.out.println("Escribe la bebida que quieres");
        for(int i = 0; i < bebidas.length; i++){
            System.out.println(i + ": " +bebidas[i]);
            System.out.println("Precio: " + precio[i]);
        }
        decision = usrInput.nextInt();
        if (dinero < precio[decision]){
            System.out.println("Eres demasiado pobre");
        }else if (dinero >= precio[decision]){
            System.out.println("Has comprado " + bebidas[decision]);
        }
    }
}
