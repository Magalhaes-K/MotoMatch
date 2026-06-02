package Projeto;

import Projeto.Classes.Moto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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

        System.out.printf("Escolha a primeira moto para comparar (digite 1 a %s): ", motos.size());
        escolhaMoto1 = input.nextInt();
        System.out.printf("Escolha a segunda moto para comparar (digite 1 a %s): ", motos.size());
        escolhaMoto2 = input.nextInt();

        while (true) {
            System.out.println(mensagem);
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Moto 1: ");
                    motos.get(escolhaMoto1-1).exibirFicha();
                    System.out.println("Moto 2: ");
                    motos.get(escolhaMoto2-1).exibirFicha();
                    break;

                case 2:
                    System.out.println(m1.comparacaoCilindrada(m1,m2));
                    break;

                case 3:
                    System.out.println(m1.comparacaoPreco(m1,m2));
                    break;

                case 4:
                    System.out.println(m1.comparacaoPeso(m1,m2));
                    break;

                case 5:
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
    }
}