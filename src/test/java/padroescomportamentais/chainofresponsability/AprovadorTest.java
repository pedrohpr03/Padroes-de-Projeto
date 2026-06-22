package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AprovadorTest {

    private Aprovador montarCadeia() {
        Aprovador atendente = new Atendente();
        Aprovador gerente = new Gerente();
        Aprovador dono = new Dono();
        atendente.definirProximo(gerente);
        gerente.definirProximo(dono);
        return atendente;
    }

    @Test
    void atendenteDeveAprovarDescontoPequeno() {
        assertEquals("Aprovado por Atendente", montarCadeia().aprovar(5.0));
    }

    @Test
    void gerenteDeveAprovarDescontoMedio() {
        assertEquals("Aprovado por Gerente", montarCadeia().aprovar(15.0));
    }

    @Test
    void donoDeveAprovarDescontoGrande() {
        assertEquals("Aprovado por Dono", montarCadeia().aprovar(40.0));
    }

    @Test
    void naoDeveAutorizarDescontoAcimaDoLimite() {
        assertEquals("Desconto não autorizado", montarCadeia().aprovar(80.0));
    }
}
