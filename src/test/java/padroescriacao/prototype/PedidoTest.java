package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveClonarPedidoComCopiaProfunda() {
        Pedido original = new Pedido("João", new Endereco("Rua A", 100));
        original.adicionarItem("X-Bacon");
        original.adicionarItem("Refrigerante");

        Pedido copia = original.clone();

        assertNotSame(original, copia);
        assertNotSame(original.getItens(), copia.getItens());
        assertNotSame(original.getEnderecoEntrega(), copia.getEnderecoEntrega());
        assertEquals(original.getItens(), copia.getItens());
    }

    @Test
    void alterarCopiaNaoDeveAfetarOriginal() {
        Pedido original = new Pedido("João", new Endereco("Rua A", 100));
        original.adicionarItem("X-Bacon");

        Pedido copia = original.clone();
        copia.adicionarItem("Batata frita");
        copia.getEnderecoEntrega().setNumero(200);

        assertEquals(1, original.getItens().size());
        assertEquals(2, copia.getItens().size());
        assertEquals(100, original.getEnderecoEntrega().getNumero());
        assertEquals(200, copia.getEnderecoEntrega().getNumero());
    }
}
