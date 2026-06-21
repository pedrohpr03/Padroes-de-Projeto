package padroescomportamentais.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CardapioIterator implements Iterator<ItemCardapio> {

    private final List<ItemCardapio> itens;
    private int posicao = 0;

    public CardapioIterator(List<ItemCardapio> itens) {
        this.itens = itens;
    }

    @Override
    public boolean hasNext() {
        return posicao < itens.size();
    }

    @Override
    public ItemCardapio next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Não há mais itens no cardápio");
        }
        return itens.get(posicao++);
    }
}
