/**
 * Created by ftlor on 18/05/2017.
 */
public class Jogo {
    String nome;
    int vida;
    int nivel;
    int arma = 10;
    int forca;
    int destreza;
    int energia;
    int exp;
    int mana;
    int moedas;
    int monstro1;
    int monstro2;
    int monstro3;
    int chefe;
    int forcaM1 = 5, forcaM2, forcaM3, forcaC;
    int destrezaM1 = 10, destrezaM2, destrezaM3, destrezaC;
    int vidaM1 = 100, vidaM2 = 100, vidaM3 = 100, vidaC = 100;

    String dormir() {
        String d = "";
        if (energia <= 20) {
            energia = 100;
            moedas = moedas - 5;
        } else {
            d = ("Energia mбxima permitida");
        }
        return d;
    }

    String verificarStatus() {
        String mensagem;
        mensagem = ("Nome................: " + nome)
                + ("\nNнvel.............: " + nivel)
                + ("\nVida..............: " + vida)
                + ("\n Durabilidade.....: " + arma)
                + ("\nMana..............: " + mana)
                + ("\nForзa.............: " + forca)
                + ("\nExperiкncia.......: " + exp)
                + ("\nEnergia...........: " + energia)
                + ("\nDestreza..........: " + destreza)
                + ("\nMoedas............: " + moedas);
        return mensagem;
    }

    String upar() {
        String p = "";
        if (exp >= 100) {
            nivel++;
            exp = 0;
            destreza = destreza + 10;
            energia = 100;
            forca = forca + 10;
            mana = 100;
        } else {
            p = ("Vocк nгo pode subir de nнvel! Exp insuficiente");
        }
        return p;
    }

    String monstro1() {
        String m = "";
        if (forca > destrezaM1){
            arma = arma - 1;
            energia = energia - 20;
            vidaM1 = vidaM1 - forca;
            vida = vida  - forcaM1;
        }else if (vidaM1 == 0){
            m = ("Parabens, vocк matou o Charmander");
            exp = exp + 30;
            moedas = moedas + 30;
            vidaM1 = 100;
        }
        return m;
    }
    String monstro2() {
        String m = "";
        if (forca > destrezaM2) {
            arma = arma - 1;
            energia = energia - 20;
            vidaM2 = vidaM2 - forca;
            vida = vida - forcaM2;
        } else if (vidaM2 == 0) {
            m = ("Parabens, vocк matou o Kobolt");
            exp = exp + 30;
            moedas = moedas + 30;
            vidaM2 = 100;
        }
        return m;
    }
    String monstro3() {
        String m = "";
        if (forca > destrezaM3) {
            arma = arma - 1;
            energia = energia - 20;
            vidaM3 = vidaM3 - forca;
            vida = vida - forcaM3;
        } else if (vidaM3 == 0) {
            m = ("Parabens, vocк matou o Goblin");
            exp = exp + 30;
            moedas = moedas + 30;
            vidaM3 = 100;
        }
        return m;
    }

}
