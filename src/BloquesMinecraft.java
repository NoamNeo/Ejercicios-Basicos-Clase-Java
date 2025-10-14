import java.util.Scanner;

public class BloquesMinecraft{
    public void main(String[] args){
       Scanner usrInput = new Scanner(System.in);
        int bloques;
        System.out.println("Escibre cuántos bloques quieres picar: ");
        bloques = usrInput.nextInt();
        for(int i = 0; i < bloques; i++){
            System.out.println("Picando bloque " + (i+1) + "...");
        }
    }
}