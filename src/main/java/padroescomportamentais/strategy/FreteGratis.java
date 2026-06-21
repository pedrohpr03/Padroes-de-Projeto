package padroescomportamentais.strategy;

public class FreteGratis implements CalculoFrete {

    @Override
    public double calcular(double distanciaKm) {
        return 0.0;
    }
}
