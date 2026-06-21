package padroescomportamentais.command;

public class CancelarPedidoComando implements Comando {

    private final Cozinha cozinha;
    private final String item;

    public CancelarPedidoComando(Cozinha cozinha, String item) {
        this.cozinha = cozinha;
        this.item = item;
    }

    @Override
    public String executar() {
        return cozinha.cancelarPedido(item);
    }
}
