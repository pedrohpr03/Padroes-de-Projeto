package padroescomportamentais.visitor;

public class Bebida implements Produto {

    private final double preco;

    public Bebida(double preco) {
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public double aceitar(VisitanteProduto visitante) {
        return visitante.visitar(this);
    }
}
