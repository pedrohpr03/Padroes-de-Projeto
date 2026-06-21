package padroescomportamentais.command;

public class PrepararPedidoComando implements Comando {

    private final Cozinha cozinha;
    private final String item;

    public PrepararPedidoComando(Cozinha cozinha, String item) {
        this.cozinha = cozinha;
        this.item = item;
    }

    @Override
    public String executar() {
        return cozinha.prepararPedido(item);
    }
}
