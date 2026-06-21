package padroescomportamentais.observer;

public class Cliente implements ObservadorPedido {

    private final String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }

    @Override
    public void notificar(String mensagem) {
        this.ultimaNotificacao = mensagem;
    }
}
