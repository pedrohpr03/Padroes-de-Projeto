package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveNotificarClienteQuandoPedidoFicaPronto() {
        Pedido pedido = new Pedido("X-Bacon");
        Cliente cliente = new Cliente("João");
        pedido.adicionarObservador(cliente);

        pedido.ficarPronto();

        assertEquals("Pedido 'X-Bacon' está pronto!", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarVariosClientes() {
        Pedido pedido = new Pedido("Combo");
        Cliente joao = new Cliente("João");
        Cliente maria = new Cliente("Maria");
        pedido.adicionarObservador(joao);
        pedido.adicionarObservador(maria);

        pedido.ficarPronto();

        assertEquals("Pedido 'Combo' está pronto!", joao.getUltimaNotificacao());
        assertEquals("Pedido 'Combo' está pronto!", maria.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarClienteRemovido() {
        Pedido pedido = new Pedido("Batata");
        Cliente cliente = new Cliente("João");
        pedido.adicionarObservador(cliente);
        pedido.removerObservador(cliente);

        pedido.ficarPronto();

        assertNull(cliente.getUltimaNotificacao());
    }
}
