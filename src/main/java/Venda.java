import java.util.List;

public interface Venda {
    void adicionarCarro(Carro carro);
    void removerCarro(Carro carro);
    List<Carro> getCarrosAVenda();
}