package padroescomportamentais.state;

public class EstadoEmPreparo extends PedidoEstado {

    private EstadoEmPreparo() {
    }

    private static final EstadoEmPreparo instance = new EstadoEmPreparo();

    public static EstadoEmPreparo getInstance() {
        return instance;
    }

    @Override
    public String getNome() {
        return "Em preparo";
    }

    @Override
    public boolean avancar(Pedido pedido) {
        pedido.setEstado(EstadoPronto.getInstance());
        return true;
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(EstadoCancelado.getInstance());
        return true;
    }
}
