package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreparoLancheTest {

    @Test
    void devePrepararXBurguerSeguindoOTemplate() {
        PreparoLanche preparo = new PreparoXBurguer();
        assertEquals("Pão > Hambúrguer + queijo > Embalar", preparo.preparar());
    }

    @Test
    void devePrepararXSaladaSeguindoOTemplate() {
        PreparoLanche preparo = new PreparoXSalada();
        assertEquals("Pão > Hambúrguer + alface + tomate > Embalar", preparo.preparar());
    }
}
