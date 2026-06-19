package padroescriacao.prototype;

public class Endereco implements Cloneable {

    private String logradouro;
    private int numero;

    public Endereco(String logradouro, int numero) {
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public Endereco clone() {
        return new Endereco(this.logradouro, this.numero);
    }
}
