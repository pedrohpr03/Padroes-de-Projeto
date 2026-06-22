package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class PedidoMemento {

    private final List<String> itens;

    public PedidoMemento(List<String> itens) {
        this.itens = new ArrayList<>(itens);
    }

    public List<String> getItens() {
        return new ArrayList<>(itens);
    }
}
