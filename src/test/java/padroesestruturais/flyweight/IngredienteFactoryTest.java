package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredienteFactoryTest {

    @Test
    void deveReutilizarAMesmaInstanciaParaOMesmoNome() {
        IngredienteFactory factory = new IngredienteFactory();
        Ingrediente a = factory.getIngrediente("Queijo");
        Ingrediente b = factory.getIngrediente("Queijo");
        assertSame(a, b);
    }

    @Test
    void deveCriarInstanciasDiferentesParaNomesDiferentes() {
        IngredienteFactory factory = new IngredienteFactory();
        Ingrediente queijo = factory.getIngrediente("Queijo");
        Ingrediente bacon = factory.getIngrediente("Bacon");
        assertNotSame(queijo, bacon);
    }

    @Test
    void deveCriarApenasUmaInstanciaPorNomeDistinto() {
        IngredienteFactory factory = new IngredienteFactory();
        factory.getIngrediente("Queijo");
        factory.getIngrediente("Bacon");
        factory.getIngrediente("Queijo");
        factory.getIngrediente("Alface");
        factory.getIngrediente("Bacon");

        assertEquals(3, factory.getQuantidadeCriada());
    }
}
