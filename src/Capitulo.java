import java.util.Scanner;

public class Capitulo {
    String texto;
    String[] escolhas;
    Personagem Cebolinha;
    Personagem Cascao;
    int incrementoCebolinha;
    int incrementoCascao;
    Scanner plano;

    Capitulo(String texto,
             String[] escolhas,
             Personagem Cebolinha, 
             Personagem Cascao,
             int incrementoCebolinha,
             int incrementoCascao,
             Scanner plano)
            
    {
        this.texto = texto;
        this.escolhas = escolhas;
        this.Cebolinha = Cebolinha;
        this.Cascao = Cascao;
        this.incrementoCascao = incrementoCascao;
        this.incrementoCebolinha = incrementoCebolinha;
        this.plano = plano;
    }


    void mostrar() {
        System.out.println(texto);
        Cascao.atualizarCoragem(incrementoCascao);
        Cebolinha.atualizarCoragem(incrementoCebolinha);

            for(int i = 0; i < escolhas.length; i++)
            {
                System.out.println("- " + escolhas[i]);
            }

            System.out.println();
            System.out.println(". . .");
            System.out.println();
    }


    int escolher() {
        int opcaoEscolhida = 0;
        String escolha;
        boolean escolhaCorreta = false;

        if(escolhas.length == 0)
        {
            System.out.println("OBRIGADO POR PARTICIPAR DAS AVENTURAS DE CASCAO E CEBOLINHA, ESPERO QUE TENHA CHEGADO AO FINAL DESEJADO!!");
            System.exit(0);
        }
        else{
            while (!escolhaCorreta) {
               escolha = plano.nextLine();
                   for(int i = 0; i < escolhas.length; i++)
                   {
                    if(escolha.equals(escolhas[i]))
                    {
                        escolhaCorreta = true;
                        opcaoEscolhida = i + 1;
                    }
                }
            if (!escolhaCorreta) {
                System.out.println("Escolha inválida, Tente novamente!");
                escolhaCorreta = false;

             return opcaoEscolhida;
                }
            }
        }
        return opcaoEscolhida;
    }
}
