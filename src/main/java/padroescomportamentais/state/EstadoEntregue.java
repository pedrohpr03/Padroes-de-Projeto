package padroescomportamentais.state;

public class EstadoEntregue extends PedidoEstado {

    private EstadoEntregue() {
    }

    private static final EstadoEntregue instance = new EstadoEntregue();

    public static EstadoEntregue getInstance() {
        return instance;
    }

    @Override
    public String getNome() {
        return "Entregue";
    }
}
