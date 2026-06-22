package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final List<String> itens = new ArrayList<>();

    public void adicionar(String item) {
        itens.add(item);
    }

    public List<String> getItens() {
        return new ArrayList<>(itens);
    }

    public PedidoMemento salvar() {
        return new PedidoMemento(itens);
    }

    public void restaurar(PedidoMemento memento) {
        itens.clear();
        itens.addAll(memento.getItens());
    }
}
