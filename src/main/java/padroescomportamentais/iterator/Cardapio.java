package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cardapio implements Iterable<ItemCardapio> {

    private final List<ItemCardapio> itens = new ArrayList<>();

    public void adicionar(ItemCardapio item) {
        itens.add(item);
    }

    public int getQuantidade() {
        return itens.size();
    }

    @Override
    public Iterator<ItemCardapio> iterator() {
        return new CardapioIterator(itens);
    }
}
