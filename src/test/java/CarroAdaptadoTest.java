import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CarroAdaptadoTest {
    private Carro carro = new Carro("Civic", "Honda", 2022, 100000.0);
    private Venda venda = new CarroAdaptado();

    @Test
    public void testAdicionarCarro() {
        venda.adicionarCarro(carro);
        assertEquals(1, venda.getCarrosAVenda().size());
    }

    @Test
    public void testRemoverCarro() {
        venda.adicionarCarro(carro);
        venda.removerCarro(carro);
        assertEquals(0, venda.getCarrosAVenda().size());
    }

    @Test
    public void testGetCarrosAVenda() {
        venda.adicionarCarro(carro);
        List<Carro> carros = venda.getCarrosAVenda();
        assertEquals(1, carros.size());
        assertEquals(carro, carros.get(0));
    }
}