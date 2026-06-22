package padroescomportamentais.mediator;

import java.util.ArrayList;
import java.util.List;

public class CentralAtendimento implements Mediador {

    private final List<Colega> colegas = new ArrayList<>();

    public void adicionar(Colega colega) {
        colegas.add(colega);
    }

    @Override
    public void enviar(String mensagem, Colega remetente) {
        for (Colega colega : colegas) {
            if (colega != remetente) {
                colega.receber("[" + remetente.getNome() + "] " + mensagem);
            }
        }
    }
}
