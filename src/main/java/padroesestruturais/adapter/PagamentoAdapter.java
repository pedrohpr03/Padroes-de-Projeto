package padroesestruturais.adapter;


public class PagamentoAdapter implements IPagamento {

    private final GatewayPagamentoExterno gateway;

    public PagamentoAdapter(GatewayPagamentoExterno gateway) {
        this.gateway = gateway;
    }

    @Override
    public boolean pagar(double valorReais) {
        int centavos = (int) Math.round(valorReais * 100);
        return gateway.efetuarCobranca(centavos);
    }
}
