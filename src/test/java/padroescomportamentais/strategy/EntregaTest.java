package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaTest {

    @Test
    void deveCalcularFretePorDistancia() {
        Entrega entrega = new Entrega(5.0);
        assertEquals(10.0, entrega.calcularFrete(new FretePorDistancia()));
    }

    @Test
    void deveCalcularFreteFixo() {
        Entrega entrega = new Entrega(5.0);
        assertEquals(8.0, entrega.calcularFrete(new FreteFixo()));
    }

    @Test
    void deveCalcularFreteGratis() {
        Entrega entrega = new Entrega(5.0);
        assertEquals(0.0, entrega.calcularFrete(new FreteGratis()));
    }
}
