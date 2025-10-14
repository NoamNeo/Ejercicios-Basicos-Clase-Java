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
    }
}