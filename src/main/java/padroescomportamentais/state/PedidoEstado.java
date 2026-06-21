package padroescomportamentais.state;

public abstract class PedidoEstado {

    public abstract String getNome();

    public boolean avancar(Pedido pedido) {
        return false;
    }

    public boolean cancelar(Pedido pedido) {
        return false;
    }
}
