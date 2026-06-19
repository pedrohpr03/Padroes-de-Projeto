package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Combo implements ItemCardapio {

    private final String nome;
    private final List<ItemCardapio> itens = new ArrayList<>();

    public Combo(String nome) {
        this.nome = nome;
    }

    public void adicionar(ItemCardapio item) {
        itens.add(item);
    }

    public void remover(ItemCardapio item) {
        itens.remove(item);
    }

    public List<ItemCardapio> getItens() {
        return itens;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (ItemCardapio item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}
