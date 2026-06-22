package padroescomportamentais.interpreter;

public class Multiplicacao implements Expressao {

    private final Expressao esquerda;
    private final Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double interpretar() {
        return esquerda.interpretar() * direita.interpretar();
    }
}
