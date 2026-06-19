package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LancheTest {

    @Test
    void lancheSimplesSemAdicionais() {
        Lanche lanche = new LancheSimples();
        assertEquals(18.0, lanche.getPreco());
        assertEquals("Hambúrguer", lanche.getDescricao());
    }

    @Test
    void deveAdicionarUmAdicional() {
        Lanche lanche = new Bacon(new LancheSimples());
        assertEquals(22.0, lanche.getPreco());
        assertEquals("Hambúrguer + Bacon", lanche.getDescricao());
    }

    @Test
    void deveEmpilharVariosAdicionais() {
        Lanche lanche = new QueijoExtra(new Bacon(new LancheSimples()));
        assertEquals(25.0, lanche.getPreco());
        assertEquals("Hambúrguer + Bacon + Queijo extra", lanche.getDescricao());
    }
}
