package padroescomportamentais.visitor;

public interface Produto {

    double getPreco();

    double aceitar(VisitanteProduto visitante);
}
