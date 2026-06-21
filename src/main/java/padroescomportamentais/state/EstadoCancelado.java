package padroescomportamentais.state;

public class EstadoCancelado extends PedidoEstado {

    private EstadoCancelado() {
    }

    private static final EstadoCancelado instance = new EstadoCancelado();

    public static EstadoCancelado getInstance() {
        return instance;
    }

    @Override
    public String getNome() {
        return "Cancelado";
    }
}
