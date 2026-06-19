package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoAdapterTest {

    @Test
    void deveConverterReaisParaCentavosAoPagar() {
        GatewayPagamentoExterno gateway = new GatewayPagamentoExterno();
        IPagamento pagamento = new PagamentoAdapter(gateway);

        assertTrue(pagamento.pagar(25.50));
        assertEquals(2550, gateway.getUltimaCobrancaCentavos());
    }

    @Test
    void naoDevePagarValorInvalido() {
        GatewayPagamentoExterno gateway = new GatewayPagamentoExterno();
        IPagamento pagamento = new PagamentoAdapter(gateway);

        assertFalse(pagamento.pagar(0.0));
    }
}
