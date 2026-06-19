package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoTest {

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        Configuracao a = Configuracao.getInstance();
        Configuracao b = Configuracao.getInstance();
        assertSame(a, b);
    }

    @Test
    void deveCompartilharOsDadosEntreAsReferencias() {
        Configuracao.getInstance().setNomeLoja("Burger House");
        Configuracao.getInstance().setTaxaEntrega(7.5);
        Configuracao.getInstance().setUsuarioLogado("gerente");

        assertEquals("Burger House", Configuracao.getInstance().getNomeLoja());
        assertEquals(7.5, Configuracao.getInstance().getTaxaEntrega());
        assertEquals("gerente", Configuracao.getInstance().getUsuarioLogado());
    }
}
