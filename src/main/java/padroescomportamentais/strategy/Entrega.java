package padroescomportamentais.strategy;

public class Entrega {

    private final double distanciaKm;

    public Entrega(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public double calcularFrete(CalculoFrete estrategia) {
        return estrategia.calcular(distanciaKm);
    }
}
