package padroescomportamentais.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendenteTest {

    @Test
    void deveExecutarComandoDePreparo() {
        Atendente atendente = new Atendente();
        Cozinha cozinha = new Cozinha();
        Comando comando = new PrepararPedidoComando(cozinha, "X-Bacon");

        assertEquals("Preparando: X-Bacon", atendente.enviar(comando));
    }

    @Test
    void deveExecutarComandoDeCancelamento() {
        Atendente atendente = new Atendente();
        Cozinha cozinha = new Cozinha();
        Comando comando = new CancelarPedidoComando(cozinha, "X-Bacon");

        assertEquals("Cancelando: X-Bacon", atendente.enviar(comando));
    }
}
