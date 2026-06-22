package padroescomportamentais.chainofresponsability;

public abstract class Aprovador {

    protected Aprovador proximo;

    public void definirProximo(Aprovador proximo) {
        this.proximo = proximo;
    }

    public String aprovar(double percentualDesconto) {
        if (percentualDesconto <= getLimite()) {
            return "Aprovado por " + getCargo();
        }
        if (proximo != null) {
            return proximo.aprovar(percentualDesconto);
        }
        return "Desconto não autorizado";
    }

    protected abstract double getLimite();

    protected abstract String getCargo();
}
