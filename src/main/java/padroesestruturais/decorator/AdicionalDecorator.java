package padroesestruturais.decorator;

public abstract class AdicionalDecorator implements Lanche {

    protected final Lanche lanche;

    protected AdicionalDecorator(Lanche lanche) {
        this.lanche = lanche;
    }
}
