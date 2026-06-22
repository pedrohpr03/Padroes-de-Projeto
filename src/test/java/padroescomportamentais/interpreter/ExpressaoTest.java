package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressaoTest {

    @Test
    void numeroDeveRetornarSeuValor() {
        assertEquals(10.0, new Numero(10.0).interpretar());
    }

    @Test
    void deveSomarDoisNumeros() {
        Expressao expressao = new Soma(new Numero(18.0), new Numero(6.0));
        assertEquals(24.0, expressao.interpretar());
    }

    @Test
    void deveMultiplicarDoisNumeros() {
        Expressao expressao = new Multiplicacao(new Numero(3.0), new Numero(5.0));
        assertEquals(15.0, expressao.interpretar());
    }

    @Test
    void deveInterpretarExpressaoComposta() {
        Expressao expressao = new Subtracao(
                new Soma(new Numero(18.0), new Numero(6.0)),
                new Numero(4.0));
        assertEquals(20.0, expressao.interpretar());
    }
}
