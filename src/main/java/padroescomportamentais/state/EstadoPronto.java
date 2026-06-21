package padroescomportamentais.state;

public class EstadoPronto extends PedidoEstado {

    private EstadoPronto() {
    }

    private static final EstadoPronto instance = new EstadoPronto();

    public static EstadoPronto getInstance() {
        return instance;
    }

    @Override
    public String getNome() {
        return "Pronto";
    }

    @Override
    public boolean avancar(Pedido pedido) {
        pedido.setEstado(EstadoEntregue.getInstance());
        return true;
    }
}
