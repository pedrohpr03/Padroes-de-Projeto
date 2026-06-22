package padroescomportamentais.chainofresponsability;

public class Atendente extends Aprovador {

    @Override
    protected double getLimite() {
        return 5.0;
    }

    @Override
    protected String getCargo() {
        return "Atendente";
    }
}
