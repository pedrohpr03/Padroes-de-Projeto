package padroesestruturais.adapter;

public class GatewayPagamentoExterno {

    private int ultimaCobrancaCentavos;

    public boolean efetuarCobranca(int valorCentavos) {
        if (valorCentavos <= 0) {
            return false;
        }
        this.ultimaCobrancaCentavos = valorCentavos;
        return true;
    }

    public int getUltimaCobrancaCentavos() {
        return ultimaCobrancaCentavos;
    }
}
