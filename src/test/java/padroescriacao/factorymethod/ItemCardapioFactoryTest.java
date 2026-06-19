package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemCardapioFactoryTest {

    @Test
    void deveCriarLanche() {
        ItemCardapio item = ItemCardapioFactory.criar("lanche", "X-Bacon", 25.0);
        assertTrue(item instanceof Lanche);
        assertEquals("Lanche", item.getCategoria());
        assertEquals("X-Bacon", item.getNome());
        assertEquals(25.0, item.getPreco());
    }

    @Test
    void deveCriarBebida() {
        ItemCardapio item = ItemCardapioFactory.criar("bebida", "Refrigerante", 6.0);
        assertTrue(item instanceof Bebida);
        assertEquals("Bebida", item.getCategoria());
    }

    @Test
    void deveCriarSobremesa() {
        ItemCardapio item = ItemCardapioFactory.criar("sobremesa", "Milkshake", 12.0);
        assertTrue(item instanceof Sobremesa);
        assertEquals("Sobremesa", item.getCategoria());
    }

    @Test
    void deveRetornarExcecaoParaTipoInexistente() {
        try {
            ItemCardapioFactory.criar("brinde", "Adesivo", 0.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Item de cardápio inexistente", e.getMessage());
        }
    }
}
