package padroescomportamentais.visitor;

public interface VisitanteProduto {

    double visitar(Lanche lanche);

    double visitar(Bebida bebida);

    double visitar(Sobremesa sobremesa);
}
