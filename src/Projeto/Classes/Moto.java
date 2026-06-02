package Projeto.Classes;

public class Moto {
    private String modelo;
    private String marca;
    private String tipo;
    private double cilindrada;
    private double preco;
    private double peso;

    public Moto(String modelo, String marca, String tipo, double cilindrada, double preco, double peso) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.preco = preco;
        this.peso = peso;
    }

    public String comparacaoCilindrada(Moto opcao1, Moto opcao2) {
        if (opcao1.cilindrada > opcao2.cilindrada){
            return opcao1.marca + " " + opcao1.modelo + " tem mais cilindrada: " + opcao1.cilindrada + "cc";
        } else if (opcao2.cilindrada > opcao1.cilindrada){
            return opcao2.marca + " " + opcao2.modelo + " tem mais cilindrada: " + opcao2.cilindrada + "cc";
        } else {
            return "Ambas tem a mesma cilindrada: " + opcao1.cilindrada;
        }
    }

    public String  comparacaoPeso(Moto opcao1, Moto opcao2) {
        if (opcao1.peso > opcao2.peso){
            return opcao1.marca + " " + opcao1.modelo + " é mais pesada: " + opcao1.peso + "Kg";
        } else if (opcao2.peso > opcao1.peso){
            return opcao2.marca + " " + opcao2.modelo + " é mais pesada: " + opcao2.peso + "Kg";
        } else {
            return "Ambas tem o mesma peso: " + opcao1.peso;
        }
    }

    public String comparacaoPreco(Moto opcao1, Moto opcao2) {
        if (opcao1.preco > opcao2.preco){
            return opcao1.marca + " " + opcao1.modelo + " é mais cara: " + "R$" + opcao1.preco;
        } else if (opcao2.preco > opcao1.preco){
            return opcao2.marca + " " + opcao2.modelo + " é mais cara: " + "R$" + opcao2.preco;
        } else {
            return "Ambas tem o mesmo preco: " + opcao1.preco;
        }
    }

    public String exibirFicha() {
        System.out.println("------------------------------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Cilindrada: " + this.cilindrada);
        System.out.println("Peso: " + this.peso);
        System.out.println("Preco: " + this.preco);
        System.out.println("------------------------------");
        System.out.println("");
        return "Ficheiro";
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
