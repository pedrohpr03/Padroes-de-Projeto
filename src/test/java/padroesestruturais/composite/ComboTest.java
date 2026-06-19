package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComboTest {

    @Test
    void deveSomarOPrecoDosItensDoCombo() {
        Combo combo = new Combo("Combo Clássico");
        combo.adicionar(new Produto("Hambúrguer", 18.0));
        combo.adicionar(new Produto("Refrigerante", 6.0));

        assertEquals(24.0, combo.getPreco());
    }

    @Test
    void deveSomarPrecoComCombosAninhados() {
        Combo comboLanche = new Combo("Combo Lanche");
        comboLanche.adicionar(new Produto("Hambúrguer", 18.0));
        comboLanche.adicionar(new Produto("Batata", 10.0));

        Combo comboFamilia = new Combo("Combo Família");
        comboFamilia.adicionar(comboLanche);
        comboFamilia.adicionar(new Produto("Sobremesa", 12.0));

        assertEquals(40.0, comboFamilia.getPreco());
    }
}
