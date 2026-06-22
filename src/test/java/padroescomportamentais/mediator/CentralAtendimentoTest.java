package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentralAtendimentoTest {

    @Test
    void deveEntregarMensagemAosOutrosColegas() {
        CentralAtendimento central = new CentralAtendimento();
        Cliente cliente = new Cliente(central, "Cliente");
        Cozinha cozinha = new Cozinha(central);
        Entrega entrega = new Entrega(central);
        central.adicionar(cliente);
        central.adicionar(cozinha);
        central.adicionar(entrega);

        cliente.enviar("Cadê meu pedido?");

        assertEquals("[Cliente] Cadê meu pedido?", cozinha.getUltimaMensagem());
        assertEquals("[Cliente] Cadê meu pedido?", entrega.getUltimaMensagem());
    }

    @Test
    void naoDeveEnviarMensagemParaSiMesmo() {
        CentralAtendimento central = new CentralAtendimento();
        Cliente cliente = new Cliente(central, "Cliente");
        Cozinha cozinha = new Cozinha(central);
        central.adicionar(cliente);
        central.adicionar(cozinha);

        cliente.enviar("Olá");

        assertNull(cliente.getUltimaMensagem());
    }
}
