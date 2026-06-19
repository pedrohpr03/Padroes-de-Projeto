package padroesestruturais.bridge;

public abstract class Promocao {

    protected final Desconto desconto;

    protected Promocao(Desconto desconto) {
        this.desconto = desconto;
    }

    public abstract String getNome();

    public double precoComDesconto(double precoBase) {
        return desconto.calcular(precoBase);
    }
}
