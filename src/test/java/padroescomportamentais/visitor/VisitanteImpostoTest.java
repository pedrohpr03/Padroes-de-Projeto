package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitanteImpostoTest {

    private static final double DELTA = 0.0001;

    @Test
    void deveCalcularImpostoDoLanche() {
        Produto lanche = new Lanche(20.0);
        assertEquals(2.0, lanche.aceitar(new VisitanteImposto()), DELTA);
    }

    @Test
    void deveCalcularImpostoDaBebida() {
        Produto bebida = new Bebida(10.0);
        assertEquals(2.0, bebida.aceitar(new VisitanteImposto()), DELTA);
    }

    @Test
    void deveCalcularImpostoDaSobremesa() {
        Produto sobremesa = new Sobremesa(12.0);
        assertEquals(1.8, sobremesa.aceitar(new VisitanteImposto()), DELTA);
    }

    @Test
    void deveSomarOImpostoDeVariosProdutos() {
        Produto[] produtos = {new Lanche(20.0), new Bebida(10.0), new Sobremesa(12.0)};
        VisitanteImposto visitante = new VisitanteImposto();

        double totalImposto = 0;
        for (Produto produto : produtos) {
            totalImposto += produto.aceitar(visitante);
        }

        assertEquals(5.8, totalImposto, DELTA);
    }
}
