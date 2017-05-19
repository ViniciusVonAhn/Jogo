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
        int op=9;

        System.out.print("Nome do Personagem: ");
        criar.nome = entrada.nextLine();
        criar.nivel = 1;
        criar.mana = 0;
        criar.forca = 10;
        criar.exp = 0;
        criar.vida = 100;
        criar.energia = 100;
        criar.destreza = 10 + r.nextInt(20);

        do {
            System.out.println("===== Skyrim Piorado =====");
            System.out.println("1. Atacar");
            System.out.println("2. Comprar");
            System.out.println("3. Dormir");
            System.out.println("4. Status");
            System.out.println("5. Subir de Nнvel");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            op = entrada.nextInt();
            switch (op){
                case 1:
                    criar.atacar();
                    continue;
                case 2:
                    criar.comprar();
                    continue;
                case 3:
                    criar.dormir();
                    continue;
                case 4:
                    criar.verificarStatus();
                    continue;
                case 5:
                    criar.snivel();
                    continue;
                case 0:
                    break;
            }
        } while (op != 0);
    }
}
