package padroesestruturais.proxy;

public class RelatorioVendasReal implements RelatorioVendas {

    @Override
    public double consultarTotalVendas() {
        return 15000.0;
    }
}
