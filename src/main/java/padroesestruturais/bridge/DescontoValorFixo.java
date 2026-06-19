package padroesestruturais.bridge;

public class DescontoValorFixo implements Desconto {

    private final double valorDesconto;

    public DescontoValorFixo(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double calcular(double valor) {
        double resultado = valor - valorDesconto;
        return resultado < 0 ? 0 : resultado;
    }
}
