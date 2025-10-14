import java.util.Scanner;
import java.util.Random;

public class CoinflipSim {
    public void main(String[] args){
        Scanner usrInput = new Scanner(System.in);
        int cantidad, cara=0, cruz=0, numRand;
        System.out.println("Escribe el número de veces que quieres simular un lanzamiento de moneda");
        cantidad =usrInput.nextInt();
        for(int i=0; i<cantidad; i++){
            numRand = (int) (Math.random()*2);
            if(numRand==0){
                cruz++;
            }else if(numRand==1){
                cara++;
            }
        }
        System.out.println("Se han tirado "+cantidad+" monedas");
        System.out.println("Caras: "+ cara);
        System.out.println("Cruces: "+cruz);
    }
}
