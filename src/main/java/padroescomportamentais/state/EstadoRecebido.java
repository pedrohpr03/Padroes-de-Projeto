package padroescomportamentais.state;

public class EstadoRecebido extends PedidoEstado {

    private EstadoRecebido() {
    }

    private static final EstadoRecebido instance = new EstadoRecebido();

    public static EstadoRecebido getInstance() {
        return instance;
    }

    @Override
    public String getNome() {
        return "Recebido";
    }

    @Override
    public boolean avancar(Pedido pedido) {
        pedido.setEstado(EstadoEmPreparo.getInstance());
        return true;
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(EstadoCancelado.getInstance());
        return true;
    }
}
