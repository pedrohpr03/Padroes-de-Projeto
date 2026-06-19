package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaComboTest {

    @Test
    void deveCriarComboInfantilConsistente() {
        FabricaCombo fabrica = new FabricaComboInfantil();
        Lanche lanche = fabrica.criarLanche();
        Bebida bebida = fabrica.criarBebida();

        assertTrue(lanche instanceof LancheInfantil);
        assertTrue(bebida instanceof BebidaInfantil);
        assertEquals("Mini hambúrguer", lanche.getDescricao());
        assertEquals("Suco de laranja", bebida.getDescricao());
    }

    @Test
    void deveCriarComboTradicionalConsistente() {
        FabricaCombo fabrica = new FabricaComboTradicional();
        Lanche lanche = fabrica.criarLanche();
        Bebida bebida = fabrica.criarBebida();

        assertTrue(lanche instanceof LancheTradicional);
        assertTrue(bebida instanceof BebidaTradicional);
        assertEquals("X-Salada", lanche.getDescricao());
        assertEquals("Refrigerante lata", bebida.getDescricao());
    }
}
