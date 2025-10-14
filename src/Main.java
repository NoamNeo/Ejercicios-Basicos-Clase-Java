import java.util.Scanner;
public class Main{
    public void main(String[] args){
       Scanner usrInput = new Scanner(System.in);
        //Ejercicio básico bloques Minecraft
        int bloques;
        System.out.println("Escibre cuántos bloques quieres picar: ");
        bloques = usrInput.nextInt();
        for(int i = 0; i < bloques; i++){
            System.out.println("Picando bloque " + (i+1) + "...");
        }

        //Ejercicio Saldo y precio del refresco
        double dinero;
        int decision;
        String[] bebidas = {"Fanta", "Copa de vino", "Roncola"};
        double[] precio = {1.5, 5, 7.5};
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