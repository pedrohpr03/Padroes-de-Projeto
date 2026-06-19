package padroescriacao.builder;

public class Hamburguer {

    private String pao;
    private String tipoCarne;
    private int quantidadeCarne;
    private boolean queijo;
    private boolean bacon;
    private boolean salada;
    private String molho;

    public Hamburguer() {
        this.pao = "";
        this.quantidadeCarne = 0;
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public int getQuantidadeCarne() {
        return quantidadeCarne;
    }

    public void setQuantidadeCarne(int quantidadeCarne) {
        this.quantidadeCarne = quantidadeCarne;
    }

    public boolean temQueijo() {
        return queijo;
    }

    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }

    public boolean temBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean temSalada() {
        return salada;
    }

    public void setSalada(boolean salada) {
        this.salada = salada;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }
}
