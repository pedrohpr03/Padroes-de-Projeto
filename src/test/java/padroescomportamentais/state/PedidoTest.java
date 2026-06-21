package padroescomportamentais.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveAvancarPorTodosOsEstados() {
        Pedido pedido = new Pedido();
        assertEquals("Recebido", pedido.getNomeEstado());

        assertTrue(pedido.avancar());
        assertEquals("Em preparo", pedido.getNomeEstado());

        assertTrue(pedido.avancar());
        assertEquals("Pronto", pedido.getNomeEstado());

        assertTrue(pedido.avancar());
        assertEquals("Entregue", pedido.getNomeEstado());
    }

    @Test
    void deveCancelarPedidoRecebido() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.cancelar());
        assertEquals("Cancelado", pedido.getNomeEstado());
    }

    @Test
    void naoDeveAvancarAposEntregue() {
        Pedido pedido = new Pedido();
        pedido.avancar();
        pedido.avancar();
        pedido.avancar();

        assertFalse(pedido.avancar());
        assertEquals("Entregue", pedido.getNomeEstado());
    }

    @Test
    void naoDeveCancelarPedidoPronto() {
        Pedido pedido = new Pedido();
        pedido.avancar();
        pedido.avancar();

        assertFalse(pedido.cancelar());
        assertEquals("Pronto", pedido.getNomeEstado());
    }
}
