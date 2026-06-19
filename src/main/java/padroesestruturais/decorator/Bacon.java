package padroesestruturais.decorator;

public class Bacon extends AdicionalDecorator {

    public Bacon(Lanche lanche) {
        super(lanche);
    }

    @Override
    public double getPreco() {
        return lanche.getPreco() + 4.0;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + " + Bacon";
    }
}
