package padroesestruturais.facade;

public class PedidoFacade {

    private final Estoque estoque = new Estoque();
    private final Pagamento pagamento = new Pagamento();
    private final Cozinha cozinha = new Cozinha();

    public boolean realizarPedido(String lanche, double valor) {
        if (!estoque.possuiIngredientes(lanche)) {
            return false;
        }
        if (!pagamento.processar(valor)) {
            return false;
        }
        cozinha.prepararPedido(lanche);
        return true;
    }
}
