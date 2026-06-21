package padroescomportamentais.strategy;

public class FretePorDistancia implements CalculoFrete {

    private static final double VALOR_POR_KM = 2.0;

    @Override
    public double calcular(double distanciaKm) {
        return distanciaKm * VALOR_POR_KM;
    }
}
