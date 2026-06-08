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

    public String compararPreco(Moto outraMoto) {

        if (this.preco > outraMoto.preco){
            return this.marca + " " + this.modelo + " é mais cara: R$" + this.preco;
        }
        if (this.preco < outraMoto.preco){
            return outraMoto.marca + " " + outraMoto.modelo + " é mais cara: R$" + outraMoto.preco;
        }

        return "Ambas tem o mesmo preço: " + this.preco;
    }

    public String compararPeso(Moto outraMoto) {

        if (this.peso > outraMoto.peso){
            return this.marca + " " + this.modelo + " é mais pesada: " + this.peso + " KG";
        }
        if (this.peso < outraMoto.peso){
            return outraMoto.marca + " " + outraMoto.modelo + " é mais pesada: " + outraMoto.peso + "KG";
        }

        return "Ambas tem o mesmo peso: " + this.peso;
    }

    public String compararCilindrada(Moto outraMoto) {

        if (this.cilindrada > outraMoto.cilindrada){
            return this.marca + " " + this.modelo + " é mais potente: " + this.cilindrada + "cc";
        }
        if (this.cilindrada < outraMoto.cilindrada){
            return outraMoto.marca + " " + outraMoto.modelo + " é mais potente: " + outraMoto.cilindrada + "cc";
        }

        return "Ambas tem a mesmo cilindrada: " + this.cilindrada + "cc";
    }

    public String exibirFicha() {
        return """
            ------------------------------
            Marca: %s
            Modelo: %s
            Tipo: %s
            Cilindrada: %.1f
            Peso: %.1f
            Preço: %.2f
            ------------------------------
            """.formatted(
                marca,
                modelo,
                tipo,
                cilindrada,
                peso,
                preco
        );
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
