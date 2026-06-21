package padroescomportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final String descricao;
    private final List<ObservadorPedido> observadores = new ArrayList<>();

    public Pedido(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarObservador(ObservadorPedido observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorPedido observador) {
        observadores.remove(observador);
    }

    public void ficarPronto() {
        for (ObservadorPedido observador : observadores) {
            observador.notificar("Pedido '" + descricao + "' está pronto!");
        }
    }
}
