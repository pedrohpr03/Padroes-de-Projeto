package padroescomportamentais.strategy;

public class FreteFixo implements CalculoFrete {

    private static final double VALOR_FIXO = 8.0;

    @Override
    public double calcular(double distanciaKm) {
        return VALOR_FIXO;
    }
}
