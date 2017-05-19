import java.util.Random;
import java.util.Scanner;

/**
 * Created by ftlor on 18/05/2017.
 */
public class JogoPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Jogo criar = new Jogo();
        Random r = new Random();

        System.out.println("Nome: ");
        criar.nome = entrada.nextLine();
        criar.nivel = 1;
        criar.mana = 0;
        criar.forca = 10;
        criar.exp = 0;
        criar.vida = 100;
        criar.energia = 100;
        criar.destreza = 10 + r.nextInt(20);

        while (true) {
            System.out.println("===== Skyrim Piorado =====");
            System.out.println("1. Atacar");
            System.out.println("2. Comprar");
            System.out.println("3. Dormir");
            System.out.println("4. Status");
            System.out.println("5. Subir de Nнvel");
            System.out.println("6. Sair");

            int escolha = entrada.nextInt();
            switch (escolha){
                case 1:


            }
        }
    }
}
