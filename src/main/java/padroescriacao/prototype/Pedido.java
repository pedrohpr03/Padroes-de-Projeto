package padroescriacao.prototype;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Cloneable {

    private String cliente;
    private Endereco enderecoEntrega;
    private List<String> itens;

    public Pedido(String cliente, Endereco enderecoEntrega) {
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        this.itens.add(item);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public List<String> getItens() {
        return itens;
    }

    @Override
    public Pedido clone() {
        Pedido copia = new Pedido(this.cliente, this.enderecoEntrega.clone());
        copia.itens = new ArrayList<>(this.itens);
        return copia;
    }
}
