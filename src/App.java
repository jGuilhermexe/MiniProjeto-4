import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner plano = new Scanner(System.in);
        Personagem Cebolinha = new Personagem("Cebolinha", 0);
        Personagem Cascao = new Personagem("Cascao", 0);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ AVENTURAS DE CASCAO E CEBOLINHA ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("AS CRIANÇAS DECIDEM APRONTAR MAIS UMA VEZ EM UM FINAL DE SEMANA, O ALVO DESSA VEZ FOI UMA CASA ABANDONADA. VOCE QUE DEVE DECIDIR O DESTINO DELES!\n");

        Capitulo capitulo1 = new Capitulo(Cebolinha.nome + " e o Cascao encontraram uma casa abandonada, o que eles devem fazer?", new String[]{"Olhar para janela", "Abrir a porta"}, Cebolinha, Cascao, 0, 0, plano);
        Capitulo final1 = new Capitulo(Cebolinha.nome + " foi olhar pela janela, em quanto isso,  Cascao se assusta com um barulho no quintal e grita, fazendo Cebolinha dar de cara com uma aranha que estava pendurada na janela. Os dois se assustam e correm pra casa.", new String[]{}, Cebolinha, Cascao, -100, -100, plano);
        Capitulo capitulo11 = new Capitulo(Cebolinha.nome + " entra na frente, Cascao entra em seguida bastante assustado. Ao entrar, as crianças encontram uma escada e uma porta misteriosa. O que eles devem fazer?", new String[]{"Subir as Escadas", "Abrir a porta"}, Cebolinha, Cascao, +50, +50, plano);
        Capitulo final2 = new Capitulo(Cebolinha.nome + " encontra uma porta diferente das outras, Cascao não queria abrir, mesmo assim Cebolinha abriu, eles se depararam com um esqueleto que é usado para estudos. Eles se assustaram e voltaram pra casa correndo .", new String[]{}, Cebolinha, Cascao, -50, -50, plano);
        Capitulo final11 = new Capitulo(Cebolinha.nome + " entao, sobe as escadas na frente do Cascao, ao subirem as escadas, eles encontram uma caixa, com alguns brinquedos antigos. Ele ficam felizes e os pegam para si, como mérito de sua coragem!!", new String[]{}, Cebolinha, Cascao, +100, +100, plano);


        int escolha = 0;
        capitulo1.mostrar();
        escolha = capitulo1.escolher();

        if (escolha == 1) {
            final1.mostrar();
        } else if (escolha == 2) {
            capitulo11.mostrar();
            escolha = capitulo11.escolher();

            if (escolha == 1) {
                final11.mostrar();

            } else if (escolha == 2) {
                final2.mostrar();

            }
        }
    }
}