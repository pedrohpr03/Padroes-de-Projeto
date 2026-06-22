package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveDesfazerParaEstadoAnterior() {
        Pedido pedido = new Pedido();
        HistoricoPedido historico = new HistoricoPedido();

        pedido.adicionar("X-Bacon");
        historico.guardar(pedido.salvar());

        pedido.adicionar("Batata");
        assertEquals(List.of("X-Bacon", "Batata"), pedido.getItens());

        pedido.restaurar(historico.desfazer());
        assertEquals(List.of("X-Bacon"), pedido.getItens());
    }

    @Test
    void mementoDevePreservarSnapshotIndependente() {
        Pedido pedido = new Pedido();
        pedido.adicionar("X-Bacon");
        PedidoMemento memento = pedido.salvar();

        pedido.adicionar("Refrigerante");

        assertEquals(1, memento.getItens().size());
        assertEquals(2, pedido.getItens().size());
    }

    @Test
    void desfazerSemHistoricoDeveRetornarNulo() {
        HistoricoPedido historico = new HistoricoPedido();
        assertNull(historico.desfazer());
    }
}
