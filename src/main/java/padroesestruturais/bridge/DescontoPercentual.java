package padroesestruturais.bridge;

public class DescontoPercentual implements Desconto {

    private final double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double calcular(double valor) {
        return valor - (valor * percentual / 100.0);
    }
}
