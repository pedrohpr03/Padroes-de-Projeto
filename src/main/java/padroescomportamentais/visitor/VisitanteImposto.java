package padroescomportamentais.visitor;

public class VisitanteImposto implements VisitanteProduto {

    @Override
    public double visitar(Lanche lanche) {
        return lanche.getPreco() * 0.10;
    }

    @Override
    public double visitar(Bebida bebida) {
        return bebida.getPreco() * 0.20;
    }

    @Override
    public double visitar(Sobremesa sobremesa) {
        return sobremesa.getPreco() * 0.15;
    }
}
