package Projeto;

import Projeto.Classes.Moto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int escolherMoto(Scanner input, int quantidadeMotos) {
        int escolha;

        while (true) {

            System.out.printf("Escolha uma moto (1 a %d): ", quantidadeMotos);

            if (!input.hasNextInt()) {
                System.out.println("Digite apenas números.");
                input.next();
                continue;
            }

            escolha = input.nextInt();

            if (escolha >= 1 && escolha <= quantidadeMotos) {
                return escolha;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolhaMoto1;
        int escolhaMoto2;
        int opcao;
        String mensagem = """
                O que deseja fazer a seguir;
                1 - Exibir ficha tecnica das motos selecionadas
                2 - Comparar cilindrada
                3 - Comparar preço
                4 - Comparar peso
                5 - Trocar motos selecionadas
                6 - Sair 
                """;

        ArrayList<Moto> motos = new ArrayList<Moto>();

        Moto m1 = new Moto("CB 300F", "Honda", "street urbana / Naked", 293.5, 31990, 139);
        Moto m2 = new Moto("MT-03", "Yamaha", "Naked", 321, 34190, 169);

        motos.add(m1);
        motos.add(m2);

        System.out.println("=== SISTEMA DE COMPARAÇÃO DE MOTOS ===");
        System.out.println("Motos registradas: ");
        for (int i = 0; i < motos.size(); i++) {
            System.out.println((i+1) + " - " + motos.get(i).getMarca() + " " + motos.get(i).getModelo());
        }

        escolhaMoto1 = escolherMoto(input, motos.size());

        do {
            escolhaMoto2 = escolherMoto(input, motos.size());

            if (escolhaMoto1 == escolhaMoto2) {
                System.out.println("Erro: Escolha uma moto diferente.");
            }

        } while (escolhaMoto1 == escolhaMoto2);

        Moto motoSelecionada1 = motos.get(escolhaMoto1 - 1);
        Moto motoSelecionada2 = motos.get(escolhaMoto2 - 1);

        while (true) {
            System.out.println(mensagem);
            if (!input.hasNextInt()) {
                System.out.println("Digite apenas números.");
                input.next();
                continue;
            }
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Moto 1: ");
                    System.out.println(motoSelecionada1.exibirFicha());
                    System.out.println("Moto 2: ");
                    System.out.println(motoSelecionada2.exibirFicha());
                    break;

                case 2:
                    System.out.println(motoSelecionada1.compararCilindrada(motoSelecionada2));
                    System.out.println("");
                    break;

                case 3:
                    System.out.println(motoSelecionada1.compararPreco(motoSelecionada2));
                    System.out.println("");
                    break;

                case 4:
                    System.out.println(motoSelecionada1.compararPeso(motoSelecionada2));
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("Trocando motos...");
                    escolhaMoto1 = escolherMoto(input, motos.size());
                    do {
                        escolhaMoto2 = escolherMoto(input, motos.size());
                        if (escolhaMoto1 == escolhaMoto2) {
                            System.out.println("Erro: Escolha uma moto diferente.");
                        }
                    } while (escolhaMoto1 == escolhaMoto2);

                    motoSelecionada1 = motos.get(escolhaMoto1 - 1);
                    motoSelecionada2 = motos.get(escolhaMoto2 - 1);
                    break;

                case 6:
                    System.out.println("Saindo....");
                    System.out.println("");
                    break;

                default:
                    System.out.println("Opção Invalida!");
                    break;

            }

            if (opcao == 6) {
                break;
            }
        }
        input.close();
    }
}