import java.util.ArrayList;
import java.util.Scanner;

public class MonstroCombate {

    public static void main(String[] args) {
        
        Jogador jogador = new JogadorHumano(100, 20);
        ArrayList<Monstro> listaMonstros = new ArrayList<>();

        Monstro monstro = new MonstroMaldoso("Ovelha mutante", 50, 10);
        listaMonstros.add(monstro);
        Monstro monstro2 = new MonstroMaldoso("Cabra rockeira", 80, 15);
        listaMonstros.add(monstro2);
        Monstro monstro3 = new MonstroMaldoso("Cachorro quente", 120, 25);
        listaMonstros.add(monstro3);
        Monstro monstro4 = new MonstroMaldoso("Gato ninja", 150, 50);
        listaMonstros.add(monstro4);
        Monstro monstro5 = new MonstroMaldoso("(\\_/)\r\n……( ‘_’)\r\n…./”\"”\"”\"”\"”\"”\"\\======░\r\n/”\"”\"”\"”\"”\"”\"”\"”\"”\"”\\\r\n\\_@_@_@_@_@_/", 150, 30);
        listaMonstros.add(monstro5);
        Monstro mostrao = new MonstroMaldoso("Super Mega Hiper Hardcore Boss", 1000, 2000);

        System.out.println("Bem-vindo ao Jogo de Combate!");
        System.out.println("Você enfrentará vários monstros. Ataque-os para derrotá-los.");

        boolean jogoAtivo = true;
        Scanner scanner = new Scanner(System.in); 


        while(jogoAtivo) {

            System.out.println(" Escolha um monstro para atacar!");
            for(int i = 0; i < listaMonstros.size(); i++) {

                MonstroMaldoso monstroAtual = (MonstroMaldoso) listaMonstros.get(i);
                System.out.printf(" %d. %s - Vida: %d%n", (i + 1), monstroAtual.getNome(), monstroAtual.getVida());

            }

            System.out.println("Digite o número do monstro: ");

            if(!scanner.hasNextInt()) {
                System.out.println("Por favor, utilizar apenas números! Tente novamente.");
                scanner.next();
                continue;
            }

            int escolha = scanner.nextInt() - 1;

            if(escolha < 0 || escolha >= listaMonstros.size()) {
                System.out.println("Escolha inválida. Tente novamente!");
                continue;
            }

            Monstro monstroEscolhido = listaMonstros.get(escolha);
            jogador.Atacar(monstroEscolhido);

            if (monstroEscolhido.getVida() <= 0 ) {
                System.out.printf(" %s foi derrotado! Bom trabalho.", monstroEscolhido.getNome());
                listaMonstros.remove(escolha);

            } else {

                monstroEscolhido.Atacar(jogador);
                if(jogador.getVidaJ() <= 0) {

                    System.out.println(" Você foi DERROTADO!!! THE GAME IS OVER, BRO!!!!!");
                    jogoAtivo = false;

                }

            }

            //Chefão final

            if (listaMonstros.size() == 0) {

                System.out.println("Parabéns, você derrotou todos os monstros, você arrasa!");
                System.out.println("Agora, lide com o chefão. Boa sorte soldado!");
                Monstro chefao = mostrao;

                while (chefao.getVida() > 0 && jogador.getVidaJ() > 0) {

                    jogador.Atacar(chefao);
                    if (chefao.getVida() <= 0) {

                        break;

                    }

                    chefao.Atacar(jogador);
                    if (jogador.getVidaJ() <= 0) {

                        break;

                    }
                }

                if (jogador.getVidaJ() <= 0) {

                    System.out.println("Poxa, você chegou tão perto, mas não foi dessa vez. É o fim do jogo para você!");

                    jogoAtivo = false;

                } else if (chefao.getVida() <= 0) {

                    System.out.println("Parabéns, agora você enfim pode descansar, todos os monstros foram derrotados.");

                }

                break;
            }

        }

        scanner.close();

    }

}



