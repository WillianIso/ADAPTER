import java.util.ArrayList;
import java.util.List;

public class CarroAdaptado implements Venda {
    private List<Carro> carrosAVenda = new ArrayList<>();

    @Override
    public void adicionarCarro(Carro carro) {
        carrosAVenda.add(carro);
    }

    @Override
    public void removerCarro(Carro carro) {
        carrosAVenda.remove(carro);
    }

    @Override
    public List<Carro> getCarrosAVenda() {
        return carrosAVenda;
    }
}