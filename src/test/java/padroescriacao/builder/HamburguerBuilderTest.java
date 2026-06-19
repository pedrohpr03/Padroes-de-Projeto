package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerBuilderTest {

    @Test
    void deveRetornarExcecaoParaHamburguerSemPao() {
        try {
            new HamburguerBuilder()
                    .comCarne("bovina", 1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pão inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaHamburguerSemCarne() {
        try {
            new HamburguerBuilder()
                    .comPao("brioche")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Hambúrguer precisa de ao menos uma carne", e.getMessage());
        }
    }

    @Test
    void deveConstruirHamburguerCompleto() {
        Hamburguer hamburguer = new HamburguerBuilder()
                .comPao("brioche")
                .comCarne("bovina", 2)
                .comQueijo()
                .comBacon()
                .comSalada()
                .comMolho("especial")
                .build();

        assertNotNull(hamburguer);
        assertEquals("brioche", hamburguer.getPao());
        assertEquals("bovina", hamburguer.getTipoCarne());
        assertEquals(2, hamburguer.getQuantidadeCarne());
        assertTrue(hamburguer.temQueijo());
        assertTrue(hamburguer.temBacon());
        assertTrue(hamburguer.temSalada());
        assertEquals("especial", hamburguer.getMolho());
    }
}
