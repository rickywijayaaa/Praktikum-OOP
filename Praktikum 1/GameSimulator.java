import java.util.Scanner;
import java.lang.System;


public class GameSimulator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ;

        int jumlah = Integer.parseInt(input.nextLine()) ;
        String namaseeker = input.nextLine();
        HideNSeek game = new HideNSeek(namaseeker, jumlah-1);
        System.out.printf("Game dimulai dengan %d pemain, seeker adalah %s\n",jumlah,namaseeker);
        while (game.getPlayerFound() != game.getPlayer()){
            int counter = Integer.parseInt(input.nextLine()) ;
            if (counter == (game.getPlayerFound()+1)){
                game.foundPlayer();
                System.out.printf ("%d Pemain ditemukan\n",game.getPlayerFound());
            }

        }
        
        System.out.println("Semua pemain telah ditemukan, permainan selesai.");

        input.close();

    }
}
