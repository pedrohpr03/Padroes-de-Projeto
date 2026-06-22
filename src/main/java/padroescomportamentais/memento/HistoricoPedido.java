package padroescomportamentais.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class HistoricoPedido {

    private final Deque<PedidoMemento> historico = new ArrayDeque<>();

    public void guardar(PedidoMemento memento) {
        historico.push(memento);
    }

    public PedidoMemento desfazer() {
        if (historico.isEmpty()) {
            return null;
        }
        return historico.pop();
    }
}
