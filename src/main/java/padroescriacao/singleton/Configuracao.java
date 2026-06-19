package padroescriacao.singleton;

public class Configuracao {

    private static final Configuracao instance = new Configuracao();

    private String nomeLoja;
    private double taxaEntrega;
    private String usuarioLogado;

    private Configuracao() {
    }

    public static Configuracao getInstance() {
        return instance;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
