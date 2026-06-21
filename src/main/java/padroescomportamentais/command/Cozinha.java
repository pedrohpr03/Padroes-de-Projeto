package padroescomportamentais.command;

public class Cozinha {

    public String prepararPedido(String item) {
        return "Preparando: " + item;
    }

    public String cancelarPedido(String item) {
        return "Cancelando: " + item;
    }
}
