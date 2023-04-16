public class Carro {
    private String modelo;
    private String fabricante;
    private int ano;
    private double preco;

    public Carro(String modelo, String fabricante, int ano, double preco) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }
}