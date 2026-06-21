package padroescomportamentais.state;

public class Pedido {

    private PedidoEstado estado;

    public Pedido() {
        this.estado = EstadoRecebido.getInstance();
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public boolean avancar() {
        return estado.avancar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getNome();
    }
}
