package padroescomportamentais.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardapioTest {

    @Test
    void devePercorrerTodosOsItensComForEach() {
        Cardapio cardapio = new Cardapio();
        cardapio.adicionar(new ItemCardapio("X-Bacon", 25.0));
        cardapio.adicionar(new ItemCardapio("Refrigerante", 6.0));
        cardapio.adicionar(new ItemCardapio("Milkshake", 12.0));

        int contador = 0;
        double total = 0;
        for (ItemCardapio item : cardapio) {
            contador++;
            total += item.getPreco();
        }

        assertEquals(3, contador);
        assertEquals(43.0, total);
    }

    @Test
    void iteratorDeveRetornarItensNaOrdemDeInsercao() {
        Cardapio cardapio = new Cardapio();
        cardapio.adicionar(new ItemCardapio("Primeiro", 1.0));
        cardapio.adicionar(new ItemCardapio("Segundo", 2.0));

        Iterator<ItemCardapio> it = cardapio.iterator();
        assertTrue(it.hasNext());
        assertEquals("Primeiro", it.next().getNome());
        assertEquals("Segundo", it.next().getNome());
        assertFalse(it.hasNext());
    }

    @Test
    void deveLancarExcecaoAoUltrapassarOFim() {
        Cardapio cardapio = new Cardapio();
        Iterator<ItemCardapio> it = cardapio.iterator();
        try {
            it.next();
            fail();
        } catch (NoSuchElementException e) {
            assertEquals("Não há mais itens no cardápio", e.getMessage());
        }
    }
}
