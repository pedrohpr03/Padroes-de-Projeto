package padroescomportamentais.command;


public class Atendente {

    public String enviar(Comando comando) {
        return comando.executar();
    }
}
