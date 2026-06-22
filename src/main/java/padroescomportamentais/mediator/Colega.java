package padroescomportamentais.mediator;

public abstract class Colega {

    protected final Mediador mediador;
    protected final String nome;
    private String ultimaMensagem;

    protected Colega(Mediador mediador, String nome) {
        this.mediador = mediador;
        this.nome = nome;
    }

    public void enviar(String mensagem) {
        mediador.enviar(mensagem, this);
    }

    public void receber(String mensagem) {
        this.ultimaMensagem = mensagem;
    }

    public String getNome() {
        return nome;
    }

    public String getUltimaMensagem() {
        return ultimaMensagem;
    }
}
