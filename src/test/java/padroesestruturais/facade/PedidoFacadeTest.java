package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoFacadeTest {

    @Test
    void deveRealizarPedidoComSucesso() {
        PedidoFacade facade = new PedidoFacade();
        assertTrue(facade.realizarPedido("X-Bacon", 25.0));
    }

    @Test
    void naoDeveRealizarPedidoSemIngredientes() {
        PedidoFacade facade = new PedidoFacade();
        assertFalse(facade.realizarPedido("", 25.0));
    }

    @Test
    void naoDeveRealizarPedidoComPagamentoInvalido() {
        PedidoFacade facade = new PedidoFacade();
        assertFalse(facade.realizarPedido("X-Bacon", 0.0));
    }
}
