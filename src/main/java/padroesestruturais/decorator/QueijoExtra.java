package padroesestruturais.decorator;

public class QueijoExtra extends AdicionalDecorator {

    public QueijoExtra(Lanche lanche) {
        super(lanche);
    }

    @Override
    public double getPreco() {
        return lanche.getPreco() + 3.0;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + " + Queijo extra";
    }
}
