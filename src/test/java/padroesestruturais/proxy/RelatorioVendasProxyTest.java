package padroesestruturais.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioVendasProxyTest {

    @Test
    void gerenteDeveConsultarOTotalDeVendas() {
        RelatorioVendas relatorio = new RelatorioVendasProxy(new Funcionario("Ana", "Gerente"));
        assertEquals(15000.0, relatorio.consultarTotalVendas());
    }

    @Test
    void donoDeveConsultarOTotalDeVendas() {
        RelatorioVendas relatorio = new RelatorioVendasProxy(new Funcionario("Carlos", "Dono"));
        assertEquals(15000.0, relatorio.consultarTotalVendas());
    }

    @Test
    void atendenteNaoDeveConsultarOTotalDeVendas() {
        RelatorioVendas relatorio = new RelatorioVendasProxy(new Funcionario("Beto", "Atendente"));
        try {
            relatorio.consultarTotalVendas();
            fail();
        } catch (SecurityException e) {
            assertEquals("Acesso negado ao relatório de vendas", e.getMessage());
        }
    }
}
