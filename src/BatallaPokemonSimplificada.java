import java.util.Scanner;

public class BatallaPokemonSimplificada {
    public void main(String[] args){
        Scanner usrInput = new Scanner(System.in);
        int vidaJugador, vidaEnemigo, danhoAtkJugador, danhoAtkEnemigo;
        System.out.println("Introduce la vida de tu Pokemon");
        vidaJugador = usrInput.nextInt();
        System.out.println("Introduce la vida de tu Enemigo");
        vidaEnemigo = usrInput.nextInt();
        danhoAtkJugador = 5;
        danhoAtkEnemigo = 3;
        while(vidaJugador>0 && vidaEnemigo>0){
            vidaEnemigo = vidaEnemigo - danhoAtkJugador;
            System.out.println("Tu pokemon hizo " + danhoAtkJugador + " daño a tu oponente.");
            vidaJugador = vidaJugador - danhoAtkEnemigo;
            System.out.println("Tu pokemon recibe " + danhoAtkEnemigo + " puntos de daño.");
            if(vidaJugador <= 0){
                System.out.println("Ha ganado tu oponente");
            }else if (vidaEnemigo <= 0){
                System.out.println("Has ganado el combate");
            }
        }
    }
}
