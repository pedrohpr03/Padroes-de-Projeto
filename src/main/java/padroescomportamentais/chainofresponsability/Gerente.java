package padroescomportamentais.chainofresponsability;

public class Gerente extends Aprovador {

    @Override
    protected double getLimite() {
        return 20.0;
    }

    @Override
    protected String getCargo() {
        return "Gerente";
    }
}
