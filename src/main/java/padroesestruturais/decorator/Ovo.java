package padroesestruturais.decorator;

public class Ovo extends AdicionalDecorator {

    public Ovo(Lanche lanche) {
        super(lanche);
    }

    @Override
    public double getPreco() {
        return lanche.getPreco() + 2.5;
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + " + Ovo";
    }
}
