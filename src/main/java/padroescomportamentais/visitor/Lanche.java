package padroescomportamentais.visitor;

public class Lanche implements Produto {

    private final double preco;

    public Lanche(double preco) {
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
