import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public void main(String[] args){
        Scanner usrInput = new Scanner(System.in);
        int numGen, numUsuario, contador;
        System.out.println("Intenta adivinar un número del 1 al 10 generado por la máquina");
        numUsuario = usrInput.nextInt();
        numGen = (int) (Math.random()*11);
        contador = 1;
        if(numGen == numUsuario){
            System.out.println("WOW, acertaste a la primera");
        }else {
            while(numUsuario != numGen){
                if (numUsuario < numGen){
                    System.out.println("El número es mayor que el que introduciste");
                }else if (numUsuario > numGen){
                    System.out.println("El número es menor que el que introduciste");
                }
                contador++;
                numUsuario = usrInput.nextInt();
            }
        }
        System.out.println("Acertaste! El núemro era: "+ numUsuario);
        System.out.println("Número de intentos: "+ contador);
    }
}
