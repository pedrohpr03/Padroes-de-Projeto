package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PromocaoTest {

    @Test
    void happyHourComDescontoPercentual() {
        Promocao promocao = new PromocaoHappyHour(new DescontoPercentual(20));
        assertEquals("Happy Hour", promocao.getNome());
        assertEquals(80.0, promocao.precoComDesconto(100.0));
    }

    @Test
    void comboDoDiaComDescontoValorFixo() {
        Promocao promocao = new PromocaoComboDoDia(new DescontoValorFixo(15));
        assertEquals("Combo do Dia", promocao.getNome());
        assertEquals(85.0, promocao.precoComDesconto(100.0));
    }

    @Test
    void mesmaPromocaoDeveAceitarQualquerDesconto() {
        Promocao percentual = new PromocaoHappyHour(new DescontoPercentual(10));
        Promocao fixo = new PromocaoHappyHour(new DescontoValorFixo(10));

        assertEquals(90.0, percentual.precoComDesconto(100.0));
        assertEquals(90.0, fixo.precoComDesconto(100.0));
    }
}
